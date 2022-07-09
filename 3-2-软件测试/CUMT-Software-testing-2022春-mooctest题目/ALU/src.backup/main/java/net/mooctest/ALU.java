package net.mooctest;
public class ALU {

	/**
	 * 生成十进制整数的二进制补码表示�?? 例：integerRepresentation("9", 8)
	 *
	 * @param number
	 *            十进制整数�?�若为负数；则第�?位为�?-”；若为正数�? 0，则无符号位
	 * @param length
	 *            二进制补码表示的长度
	 * @return number的二进制补码表示，长度为length
	 */
	public String integerRepresentation(String number, int length) {
		StringBuilder result = new StringBuilder();
		String tmpNum;
		boolean isMinus;
		if (number.charAt(0) == '-') {
			isMinus = true;
			tmpNum = number.substring(1);
		} else {
			isMinus = false;
			tmpNum = number;
		}
		// 下面对绝对�?�进行处�?
		int n = Integer.valueOf(tmpNum);
		while (n >= 1) {
			result.insert(0, String.valueOf(n % 2));
			n = (n - n % 2) / 2;
		}
		// 若是负数,取反加一
		if (isMinus) {
			result = new StringBuilder(oneAdder(negation(result.toString())).substring(1, result.length() + 1));
		}
		// 补全�? length �?
		while (result.length() < length) {
			if (isMinus) {
				result.insert(0, "1");
			} else {
				result.insert(0, "0");
			}
		}
		return result.toString();
	}

	/**
	 * 生成十进制浮点数的二进制表示�? �?要�?�虑 0、反规格化�?�正负无穷（�?+Inf”和�?-Inf”）�? NaN等因素，具体借鉴 IEEE 754�?
	 * 舍入策略为向0舍入�? 例：floatRepresentation("11.375", 8, 11)
	 *
	 * @param number
	 *            十进制浮点数，包含小数点。若为负数；则第�?位为�?-”；若为正数�? 0，则无符号位
	 * @param eLength
	 *            指数的长度，取�?�大于等�? 4
	 * @param sLength
	 *            尾数的长度，取�?�大于等�? 4
	 * @return number的二进制表示，长度为 1+eLength+sLength。从左向右，依次为符号�?�指数（移码表示）�?�尾数（首位隐藏�?
	 */
	public String floatRepresentation(String number, int eLength, int sLength) {
		StringBuilder result = new StringBuilder();
		int n;
		// 注意:以小数点分隔,必须加双右斜�?
		String strs[] = number.split("\\.");
		if (strs[0].charAt(0) != '-') {
			result.insert(0, "0");
			n = Integer.valueOf(strs[0]);
		} else {
			result.insert(0, "1");
			n = Integer.valueOf(strs[0].substring(1));
		}
		// 判断是否�?0?若是零直接返�?
		boolean isZero = true;
		for (String str : strs) {
			if (Integer.valueOf(str) != 0) {
				isZero = false;
				break;
			}
		}
		if (isZero) {
			while (result.length() < 1 + eLength + sLength) {
				result.append("0");
			}
			return result.toString();
		}
		// 生成整数部分的二进制表示
		StringBuilder beforeDot = new StringBuilder();
		if (n != 0) {
			while (n >= 1) {
				beforeDot.insert(0, String.valueOf(n % 2));
				n = (n - n % 2) / 2;
			}
		}
		// 生成小数部分的二进制表示(若有)
		StringBuilder afterDot = new StringBuilder();
		if (strs.length > 1) {
			float m = (float) (Integer.valueOf(strs[1])) * (float) Math.pow(10, -strs[1].length());
			if (m == 0) {
				afterDot = new StringBuilder(allZeroWithLength(eLength + sLength + 1));
			} else {
				// �?后一�?1是为了能�?后向0舍入
				do {
					if ((m *= 2) >= 1) {
						m -= 1;
						afterDot.append("1");
					} else {
						afterDot.append("0");
					}
				} while (m != 1 && beforeDot.length() + afterDot.length() <= eLength + sLength + 1 + 1);
			}
		}
		// 是否要规格化?
		// 拼接整数和小�?,且算出指�?
		int e;
		String exponent;
		int bias = (int) Math.pow(2, eLength - 1) - 1;
		if (beforeDot.toString().equals("")) {
			e = normalize(afterDot.toString());
			if (bias - e < 0) {
				// 反规格化
				System.out.println(bias - e);
				System.out.println(afterDot);
				afterDot = new StringBuilder(afterDot.substring(normalize(afterDot.toString()) - 1));
				while (afterDot.length() < sLength) {
					afterDot.append("0");
				}
				return result + allZeroWithLength(eLength) + afterDot;
			}
			exponent = integerRepresentation((bias - e) + "", eLength);
		} else {
			e = beforeDot.length() - 1;
			exponent = integerRepresentation((bias + e) + "", eLength);
		}
		if (strs.length > 1) {
			if (beforeDot.toString().equals("")) {
				afterDot = new StringBuilder(leftShift(afterDot.toString(), e));
				result.append(exponent).append(afterDot);
			} else {
				result.append(exponent).append(beforeDot.substring(1)).append(afterDot);
			}
		} else {
			result.append(exponent).append(beforeDot.toString().equals("") ? "" : beforeDot.substring(1));
		}
		if (result.length() > 1 + eLength + sLength) {
			result = new StringBuilder(result.substring(0, 1 + eLength + sLength));
		}
		// +-Inf,NaN
		if (exponent.equals(allOneWithLength(exponent.length()))) {
			if (result.substring(1 + eLength, result.length()).equals(allZeroWithLength(1 + eLength + sLength))) {
				return result.charAt(0) == '0' ? "+Inf" : "-Inf";
			} else {
				return "NaN";
			}
		}
		return result.toString();
	}

	/**
	 * 生成十进制浮点数的IEEE 754表示，要求调用floatRepresentation(String, int, int)实现�?
	 * 例：ieee754("11.375", 32)
	 *
	 * @param number
	 *            十进制浮点数，包含小数点。若为负数；则第�?位为�?-”；若为正数�? 0，则无符号位
	 * @param length
	 *            二进制表示的长度，为32�?64
	 * @return number的IEEE 754表示，长度为length。从左向右，依次为符号�?�指数（移码表示）�?�尾数（首位隐藏�?
	 */
	public String ieee754(String number, int length) {
		if (length == 32) {
			return floatRepresentation(number, 8, 23);
		} else if (length == 64) {
			return floatRepresentation(number, 11, 52);
		} else {
			return "";
		}
	}

	/**
	 * 计算二进制补码表示的整数的真值�?? 例：integerTrueValue("00001001")
	 *
	 * @param operand
	 *            二进制补码表示的操作�?
	 * @return operand的真值�?�若为负数；则第�?位为�?-”；若为正数�? 0，则无符号位
	 */
	public String integerTrueValue(String operand) {
		int num = 0;
		for (int i = 0; i < operand.length(); i++) {
			if (i == 0) {
				num -= (operand.charAt(i) - 48) * Math.pow(2, operand.length() - 1);
			} else {
				num += (operand.charAt(i) - 48) * Math.pow(2, operand.length() - 1 - i);
			}
		}
		return String.valueOf(num);
	}

	/**
	 * 计算二进制原码表示的浮点数的真�?��?? 例：floatTrueValue("01000001001101100000", 8, 11)
	 *
	 * @param operand
	 *            二进制表示的操作�?
	 * @param eLength
	 *            指数的长度，取�?�大于等�? 4
	 * @param sLength
	 *            尾数的长度，取�?�大于等�? 4
	 * @return operand的真值�?�若为负数；则第�?位为�?-”；若为正数�? 0，则无符号位。正负无穷分别表示为�?+Inf”和�?-Inf”，
	 *         NaN表示为�?�NaN�?
	 */
	public String floatTrueValue(String operand, int eLength, int sLength) {
		// 先记录是否为负数
		boolean isMinus = false;
		if (operand.charAt(0) == '1') {
			isMinus = true;
		}
		String exponent = operand.substring(1, 1 + eLength);
		String tailNum = operand.substring(1 + eLength);
		// System.out.println(exponent);
		// System.out.println(tailNum);
		// 正负无穷�?/NaN
		if (exponent.equals(allOneWithLength(eLength))) {
			if (tailNum.equals(allZeroWithLength(sLength))) {
				if (operand.charAt(0) == '0') {
					return "+Inf";
				} else {
					return "-Inf";
				}
			} else {
				return "NaN";
			}
		}
		String bias = integerRepresentation(String.valueOf((int) Math.pow(2, eLength - 1) - 1), eLength);
		// �?,反规格化�?
		if (exponent.equals(allZeroWithLength(eLength))) {
			// 0
			if (tailNum.equals(allZeroWithLength(sLength))) {
				return "0";
			} else {
				// 反规格化
				String exp = integerSubtraction(allZeroWithLength(eLength - 1) + "1", bias, eLength).substring(1);
				tailNum = "0" + tailNum;
				double result = 0;
				int dotPos = tailNum.length();
				for (int i = dotPos - 1; i >= 0; i--) {
					result += (Math.pow(2, -i) * (tailNum.charAt(i) - 48));
				}
				result *= Math.pow(2.0, Integer.valueOf(integerTrueValue(exp)));
				return isMinus ? "-" + String.valueOf(result) : String.valueOf(result);
			}
		}
		// 其他情况
		// 算出指数(先是0+�?1�?,计算时�?�减�?)
		exponent = adder(exponent, negation(bias), '1', eLength).substring(1);
		// 补上尾数前面�?1
		tailNum = "1" + tailNum;
		int dotPos = 1;
		if (exponent.charAt(0) == '0') {
			dotPos += Integer.valueOf(integerTrueValue(exponent));
		}
		// �?始计算结�?
		float result = 0;
		while (tailNum.length() < dotPos) {
			tailNum = tailNum + "0";
		}
		for (int i = dotPos - 1; i >= 0; i--) {
			result += (float) (Math.pow(2, dotPos - 1 - i) * (tailNum.charAt(i) - 48));
		}
		for (int i = dotPos; i < sLength; i++) {
			result += (float) (Math.pow(2, dotPos - 1 - i) * (tailNum.charAt(i) - 48));
		}
		return isMinus ? "-" + String.valueOf(result) : String.valueOf(result);
	}

	/**
	 * 左移操作�? 例：leftShift("00001001", 2)
	 *
	 * @param operand
	 *            二进制表示的操作�?
	 * @param n
	 *            左移的位�?
	 * @return operand左移n位的结果
	 */
	public String leftShift(String operand, int n) {
		StringBuilder result = new StringBuilder(operand.substring(n, operand.length()));
		while (result.length() < operand.length()) {
			result.append("0");
		}
		return result.toString();
	}

	/**
	 * 按位取反操作�? 例：negation("00001001")
	 *
	 * @param operand
	 *            二进制表示的操作�?
	 * @return operand按位取反的结�?
	 */
	public String negation(String operand) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < operand.length(); i++) {
			if (operand.charAt(i) == '0') {
				result.append("1");
			} else {
				result.append("0");
			}
		}
		return result.toString();
	}

	/**
	 * 加一�?,实现操作数加 1 的运算�?? �?要采用与门�?�或门�?�异或门等模�?,不可以直接调�?
	 * fullAdder、claAdder、adder、integerAddition 方法�? 例：oneAdder("00001001")
	 *
	 * @param operand
	 *            二进制补码表示的操作�?
	 * @return operand�?1的结果，长度为operand的长度加1，其中第1位指示是否溢出（溢出�?1，否则为0），其余位为相加结果
	 */
	public String oneAdder(String operand) {
		StringBuilder result = new StringBuilder();
		char si;
		char ci = '1';
		for (int i = 0; i < operand.length(); i++) {
			si = xorGate(operand.charAt(operand.length() - i - 1), ci);
			result.insert(0, si);
			ci = andGate(ci, operand.charAt(operand.length() - i - 1));
		}
		// 判断是否溢出
		if (ci == '1') {
			result.insert(0, "1");
		} else {
			result.insert(0, "0");
		}
		return result.toString();
	}

	/**
	 * 加法器，要求调用claAdder(String, String, char)方法实现�? 例：adder("0100", "0011", �?0�?, 8)
	 *
	 * @param operand1
	 *            二进制补码表示的被加�?
	 * @param operand2
	 *            二进制补码表示的加数
	 * @param c
	 *            �?低位进位
	 * @param length
	 *            存放操作数的寄存器的长度，为4的�?�数。length不小于操作数的长度，当某个操作数的长度小于length时，�?要在高位补符号位
	 * @return 长度为length+1的字符串表示的计算结果，其中�?1位指示是否溢出（溢出�?1，否则为0），后length位是相加结果
	 */
	public String adder(String operand1, String operand2, char c, int length) {
		// 扩展两个操作数到 length 长度
		StringBuilder tmpO1 = new StringBuilder(operand1);
		StringBuilder tmpO2 = new StringBuilder(operand2);
		while (tmpO1.length() < length) {
			if (tmpO1.charAt(0) == '1') {
				tmpO1.insert(0, "1");
			} else {
				tmpO1.insert(0, "0");
			}
		}
		while (tmpO2.length() < length) {
			if (tmpO2.charAt(0) == '1') {
				tmpO2.insert(0, "1");
			} else {
				tmpO2.insert(0, "0");
			}
		}
		// 计算结果
		StringBuilder result = new StringBuilder();
		char ci = c;
		int i = 0;
		do {
			String ts = claAdder(tmpO1.substring(length - i - 4, length - i),
					tmpO2.substring(length - i - 4, length - i), ci);
			result.insert(0, ts.substring(1, 5));
			ci = ts.charAt(0);
			i += 4;
		} while (i <= length - 4);
		while (result.length() < length) {
			if (result.charAt(0) == '1') {
				result.insert(0, "1");
			} else {
				result.insert(0, "0");
			}
		}
		// 判断是否溢出
		boolean isOverflow = false;
		if (result.charAt(0) != tmpO1.charAt(0) && result.charAt(0) != tmpO2.charAt(0)
				&& tmpO1.charAt(0) == tmpO2.charAt(0)) {
			isOverflow = true;
		}
		if (isOverflow) {
			result.insert(0, "1");
		} else {
			result.insert(0, "0");
		}
		return result.toString();
	}

	/**
	 * 全加器，对两位以及进位进行加法运算�?? 例：fullAdder('1', '1', '0')
	 *
	 * @param x
	 *            被加数的某一位，�?0�?1
	 * @param y
	 *            加数的某�?位，�?0�?1
	 * @param c
	 *            低位对当前位的进位，�?0�?1
	 * @return 相加的结果，用长度为2的字符串表示，第1位表示进位，�?2位表示和
	 */
	public String fullAdder(char x, char y, char c) {
		char si = xorGate(xorGate(x, y), c);
		char ci = orGate(orGate(andGate(x, c), andGate(y, c)), andGate(x, y));
		return ci + "" + si;
	}

	/**
	 * 4位先行进位加法器�? 要求采用 fullAdder 来实�? 例：claAdder("1001", "0001", '1')
	 *
	 * @param operand1
	 *            4位二进制表示的被加数
	 * @param operand2
	 *            4位二进制表示的加�?
	 * @param c
	 *            低位对当前位的进位，�?0�?1
	 * @return 长度�?5的字符串表示的计算结果，其中�?1位是�?高位进位，后4位是相加结果，其中进位不可以由循环获�?
	 */
	public String claAdder(String operand1, String operand2, char c) {
		char[] p = new char[5];
		char[] g = new char[5];
		// 获得Pi,Gi
		for (int i = 1; i <= 4; i++) {
			p[i] = orGate(operand1.charAt(4 - i), operand2.charAt(4 - i));
			g[i] = andGate(operand1.charAt(4 - i), operand2.charAt(4 - i));
		}
		// 获得Ci
		char[] ci = new char[5];
		ci[0] = c;
		ci[1] = orGate(g[1], andGate(p[1], c));
		ci[2] = orGate(orGate(g[2], andGate(p[2], g[1])), andGate(c, andGate(p[2], p[1])));
		ci[3] = orGate(orGate(orGate(g[3], andGate(p[3], g[2])), andGate(g[1], andGate(p[3], p[2]))),
				andGate(c, andGate(p[3], andGate(p[2], p[1]))));
		ci[4] = orGate(
				orGate(orGate(orGate(g[4], andGate(p[4], g[3])), andGate(g[2], andGate(p[4], p[3]))),
						andGate(g[1], andGate(p[4], andGate(p[3], p[2])))),
				andGate(c, andGate(p[4], andGate(p[3], andGate(p[2], p[1])))));
		// 获得Si
		String result = "";
		for (int i = 1; i <= 4; i++) {
			result = fullAdder(operand1.charAt(4 - i), operand2.charAt(4 - i), ci[i - 1]).charAt(1) + result;
		}
		return ci[4] + result;
	}

	/**
	 * 整数减法，要求调�? adder 方法实现�? 例：integerSubtraction("0100", "0011", 8)
	 *
	 * @param operand1
	 *            二进制补码表示的被减�?
	 * @param operand2
	 *            二进制补码表示的减数
	 * @param length
	 *            存放操作数的寄存器的长度，为4的�?�数。length不小于操作数的长度，当某个操作数的长度小于length时，�?要在高位补符号位
	 * @return 长度为length+1的字符串表示的计算结果，其中�?1位指示是否溢出（溢出�?1，否则为0），后length位是相减结果
	 */
	public String integerSubtraction(String operand1, String operand2, int length) {
		// 把第二个数取�?,并把进位设为1
		return adder(operand1, negation(operand2), '1', length);
	}

	// 与门
	public char andGate(char a, char b) {
		if (a == '1' && b == '1') {
			return '1';
		} else {
			return '0';
		}
	}

	// 异或�?
	public char xorGate(char a, char b) {
		if (a - b == 0) {
			return '0';
		} else {
			return '1';
		}
	}

	// 返回长为n的全0�?
	private String allZeroWithLength(int n) {
		StringBuilder result = new StringBuilder();
		while (result.length() < n) {
			result.append("0");
		}
		return result.toString();
	}

	// 返回长为n的全1�?
	private String allOneWithLength(int n) {
		StringBuilder result = new StringBuilder();
		while (result.length() < n) {
			result.append("1");
		}
		return result.toString();
	}

	// 或门
	private char orGate(char a, char b) {
		if (a == '1' || b == '1') {
			return '1';
		} else {
			return '0';
		}
	}

	// 规格化一个数,返回值为�?要在指数上加的数�?(可正可负)
	public int normalize(String num) {
		int i = 0;
		char c = '0';
		while (i < num.length()) {
			if (num.charAt(i) == c) {
				c = num.charAt(i);
				i++;
			} else {
				i++;
				break;
			}
		}
		return i;
	}
}
