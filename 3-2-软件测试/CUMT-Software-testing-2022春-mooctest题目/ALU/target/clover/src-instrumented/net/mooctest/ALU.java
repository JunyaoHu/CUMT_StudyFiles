/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public class ALU {public static class __CLR4_4_100l43y830t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u004c\u0055\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593457593L,8589935092L,369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * \u9422\u71b8\u579a\u9357\u4f7d\u7e58\u9352\u8235\u66a3\u93c1\u626e\u6b91\u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u6052\ufffd\ufffd \u6e1a\u5b36\u7d30integerRepresentation("9", 8)
	 *
	 * @param number
	 *            \u9357\u4f7d\u7e58\u9352\u8235\u66a3\u93c1\u822c\ufffd\u509d\u5ae2\u6d93\u9e3f\u790b\u93c1\u5e2e\u7d31\u9352\u6b11\ue0c7\u6d93\ufffd\u6d63\u5d84\u8d1f\u9225\ufffd-\u9225\u6fd3\u7d31\u947b\u30e4\u8d1f\u59dd\uff46\u669f\u93b4\ufffd 0\u951b\u5c7d\u57af\u93c3\u72b5\ue0c1\u9359\u8702\u7d85
	 * @param length
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u95c0\u57ae\u5bb3
	 * @return number\u9428\u52ea\u7c29\u6769\u6d98\u57d7\u741b\u30e7\u721c\u741b\u3127\u305a\u951b\u5c84\u66b1\u6434\ufe3f\u8d1flength
	 */
	public String integerRepresentation(String number, int length) {try{__CLR4_4_100l43y830t.R.inc(0);
		__CLR4_4_100l43y830t.R.inc(1);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(2);String tmpNum;
		__CLR4_4_100l43y830t.R.inc(3);boolean isMinus;
		__CLR4_4_100l43y830t.R.inc(4);if ((((number.charAt(0) == '-')&&(__CLR4_4_100l43y830t.R.iget(5)!=0|true))||(__CLR4_4_100l43y830t.R.iget(6)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(7);isMinus = true;
			__CLR4_4_100l43y830t.R.inc(8);tmpNum = number.substring(1);
		} }else {{
			__CLR4_4_100l43y830t.R.inc(9);isMinus = false;
			__CLR4_4_100l43y830t.R.inc(10);tmpNum = number;
		}
		// \u6d93\u5b2e\u6f70\u7035\u572d\u7cb7\u7035\u7470\ufffd\u8270\u7e58\u741b\u5c7d\ue629\u941e\ufffd
		}__CLR4_4_100l43y830t.R.inc(11);int n = Integer.valueOf(tmpNum);
		__CLR4_4_100l43y830t.R.inc(12);while ((((n >= 1)&&(__CLR4_4_100l43y830t.R.iget(13)!=0|true))||(__CLR4_4_100l43y830t.R.iget(14)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(15);result.insert(0, String.valueOf(n % 2));
			__CLR4_4_100l43y830t.R.inc(16);n = (n - n % 2) / 2;
		}
		// \u947b\u30e6\u69f8\u7490\u71b8\u669f,\u9359\u6827\u5f3d\u9354\u72b1\u7af4
		}__CLR4_4_100l43y830t.R.inc(17);if ((((isMinus)&&(__CLR4_4_100l43y830t.R.iget(18)!=0|true))||(__CLR4_4_100l43y830t.R.iget(19)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(20);result = new StringBuilder(oneAdder(negation(result.toString())).substring(1, result.length() + 1));
		}
		// \u741b\u30e5\u53cf\u9352\ufffd length \u6d63\ufffd
		}__CLR4_4_100l43y830t.R.inc(21);while ((((result.length() < length)&&(__CLR4_4_100l43y830t.R.iget(22)!=0|true))||(__CLR4_4_100l43y830t.R.iget(23)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(24);if ((((isMinus)&&(__CLR4_4_100l43y830t.R.iget(25)!=0|true))||(__CLR4_4_100l43y830t.R.iget(26)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(27);result.insert(0, "1");
			} }else {{
				__CLR4_4_100l43y830t.R.inc(28);result.insert(0, "0");
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(29);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u9422\u71b8\u579a\u9357\u4f7d\u7e58\u9352\u8235\u8bde\u9410\u89c4\u669f\u9428\u52ea\u7c29\u6769\u6d98\u57d7\u741b\u3127\u305a\u9286\ufffd \u95c7\ufffd\u7455\u4f7d\ufffd\u51ad\u6abb 0\u9286\u4f78\u5f3d\u7459\u52ec\u7278\u9356\u6825\ufffd\u4f79\ue11c\u7490\u71b8\u68e4\u7ecc\u51e4\u7d19\u9225\ufffd+Inf\u9225\u6fc6\u62f0\u9225\ufffd-Inf\u9225\u6fd3\u7d1a\u9286\ufffd NaN\u7edb\u590a\u6d1c\u7ef1\u72c5\u7d1d\u934f\u8702\u7d8b\u934a\u71bc\u58cc IEEE 754\u9286\ufffd
	 * \u9478\u5d85\u53c6\u7edb\u682b\u6690\u6d93\u54c4\u609c0\u9478\u5d85\u53c6\u9286\ufffd \u6e1a\u5b36\u7d30floatRepresentation("11.375", 8, 11)
	 *
	 * @param number
	 *            \u9357\u4f7d\u7e58\u9352\u8235\u8bde\u9410\u89c4\u669f\u951b\u5c7d\u5bd8\u935a\ue0a2\u76ac\u93c1\u626e\u5063\u9286\u509d\u5ae2\u6d93\u9e3f\u790b\u93c1\u5e2e\u7d31\u9352\u6b11\ue0c7\u6d93\ufffd\u6d63\u5d84\u8d1f\u9225\ufffd-\u9225\u6fd3\u7d31\u947b\u30e4\u8d1f\u59dd\uff46\u669f\u93b4\ufffd 0\u951b\u5c7d\u57af\u93c3\u72b5\ue0c1\u9359\u8702\u7d85
	 * @param eLength
	 *            \u93b8\u56e8\u669f\u9428\u52ef\u66b1\u6434\ufe3c\u7d1d\u9359\u6827\ufffd\u714e\u3047\u6d5c\u5ea3\u74d1\u6d5c\ufffd 4
	 * @param sLength
	 *            \u704f\u70ac\u669f\u9428\u52ef\u66b1\u6434\ufe3c\u7d1d\u9359\u6827\ufffd\u714e\u3047\u6d5c\u5ea3\u74d1\u6d5c\ufffd 4
	 * @return number\u9428\u52ea\u7c29\u6769\u6d98\u57d7\u741b\u3127\u305a\u951b\u5c84\u66b1\u6434\ufe3f\u8d1f 1+eLength+sLength\u9286\u5099\u7ca0\u5bb8\ufe40\u609c\u9359\u7b79\u7d1d\u6e1a\u6fc7\ue0bc\u6d93\u8679\ue0c1\u9359\u67ab\ufffd\u4f79\u5bda\u93c1\u5e2e\u7d19\u7ec9\u8364\u721c\u741b\u3127\u305a\u951b\u5908\ufffd\u4f78\u71ac\u93c1\u5e2e\u7d19\u68e3\u6826\u7d85\u95c5\u612f\u68cc\u951b\ufffd
	 */
	public String floatRepresentation(String number, int eLength, int sLength) {try{__CLR4_4_100l43y830t.R.inc(30);
		__CLR4_4_100l43y830t.R.inc(31);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(32);int n;
		// \u5a09\u3126\u5270:\u6d60\u30e5\u76ac\u93c1\u626e\u5063\u9352\u55db\u6ba7,\u8e47\u5474\u300f\u9354\u72b2\u5f3b\u9359\u866b\u67a9\u93c9\ufffd
		__CLR4_4_100l43y830t.R.inc(33);String strs[] = number.split("\\.");
		__CLR4_4_100l43y830t.R.inc(34);if ((((strs[0].charAt(0) != '-')&&(__CLR4_4_100l43y830t.R.iget(35)!=0|true))||(__CLR4_4_100l43y830t.R.iget(36)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(37);result.insert(0, "0");
			__CLR4_4_100l43y830t.R.inc(38);n = Integer.valueOf(strs[0]);
		} }else {{
			__CLR4_4_100l43y830t.R.inc(39);result.insert(0, "1");
			__CLR4_4_100l43y830t.R.inc(40);n = Integer.valueOf(strs[0].substring(1));
		}
		// \u9352\u3086\u67c7\u93c4\ue21a\u60c1\u93c4\ufffd0?\u947b\u30e6\u69f8\u95c6\u5241\u6d3f\u93ba\u30e8\u7e51\u9365\ufffd
		}__CLR4_4_100l43y830t.R.inc(41);boolean isZero = true;
		__CLR4_4_100l43y830t.R.inc(42);for (String str : strs) {{
			__CLR4_4_100l43y830t.R.inc(43);if ((((Integer.valueOf(str) != 0)&&(__CLR4_4_100l43y830t.R.iget(44)!=0|true))||(__CLR4_4_100l43y830t.R.iget(45)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(46);isZero = false;
				__CLR4_4_100l43y830t.R.inc(47);break;
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(48);if ((((isZero)&&(__CLR4_4_100l43y830t.R.iget(49)!=0|true))||(__CLR4_4_100l43y830t.R.iget(50)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(51);while ((((result.length() < 1 + eLength + sLength)&&(__CLR4_4_100l43y830t.R.iget(52)!=0|true))||(__CLR4_4_100l43y830t.R.iget(53)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(54);result.append("0");
			}
			}__CLR4_4_100l43y830t.R.inc(55);return result.toString();
		}
		// \u9422\u71b8\u579a\u93c1\u5b58\u669f\u95ae\u3125\u578e\u9428\u52ea\u7c29\u6769\u6d98\u57d7\u741b\u3127\u305a
		}__CLR4_4_100l43y830t.R.inc(56);StringBuilder beforeDot = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(57);if ((((n != 0)&&(__CLR4_4_100l43y830t.R.iget(58)!=0|true))||(__CLR4_4_100l43y830t.R.iget(59)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(60);while ((((n >= 1)&&(__CLR4_4_100l43y830t.R.iget(61)!=0|true))||(__CLR4_4_100l43y830t.R.iget(62)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(63);beforeDot.insert(0, String.valueOf(n % 2));
				__CLR4_4_100l43y830t.R.inc(64);n = (n - n % 2) / 2;
			}
		}}
		// \u9422\u71b8\u579a\u704f\u5fd4\u669f\u95ae\u3125\u578e\u9428\u52ea\u7c29\u6769\u6d98\u57d7\u741b\u3127\u305a(\u947b\u30e6\u6e41)
		}__CLR4_4_100l43y830t.R.inc(65);StringBuilder afterDot = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(66);if ((((strs.length > 1)&&(__CLR4_4_100l43y830t.R.iget(67)!=0|true))||(__CLR4_4_100l43y830t.R.iget(68)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(69);float m = (float) (Integer.valueOf(strs[1])) * (float) Math.pow(10, -strs[1].length());
			__CLR4_4_100l43y830t.R.inc(70);if ((((m == 0)&&(__CLR4_4_100l43y830t.R.iget(71)!=0|true))||(__CLR4_4_100l43y830t.R.iget(72)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(73);afterDot = new StringBuilder(allZeroWithLength(eLength + sLength + 1));
			} }else {{
				// \u93c8\ufffd\u935a\u5e9d\u7af4\u6d93\ufffd1\u93c4\ue219\u8d1f\u6d5c\u55da\u5158\u93c8\ufffd\u935a\u5ea1\u609c0\u9478\u5d85\u53c6
				__CLR4_4_100l43y830t.R.inc(74);do {{
					__CLR4_4_100l43y830t.R.inc(75);if (((((m *= 2) >= 1)&&(__CLR4_4_100l43y830t.R.iget(76)!=0|true))||(__CLR4_4_100l43y830t.R.iget(77)==0&false))) {{
						__CLR4_4_100l43y830t.R.inc(78);m -= 1;
						__CLR4_4_100l43y830t.R.inc(79);afterDot.append("1");
					} }else {{
						__CLR4_4_100l43y830t.R.inc(80);afterDot.append("0");
					}
				}} }while ((((m != 1 && beforeDot.length() + afterDot.length() <= eLength + sLength + 1 + 1)&&(__CLR4_4_100l43y830t.R.iget(81)!=0|true))||(__CLR4_4_100l43y830t.R.iget(82)==0&false)));
			}
		}}
		// \u93c4\ue21a\u60c1\u7455\u4f7d\ue749\u93cd\u714e\u5bf2?
		// \u93b7\u517c\u5e34\u93c1\u5b58\u669f\u935c\u5c7d\u76ac\u93c1\ufffd,\u6d93\u65c2\u757b\u9351\u70d8\u5bda\u93c1\ufffd
		}__CLR4_4_100l43y830t.R.inc(83);int e;
		__CLR4_4_100l43y830t.R.inc(84);String exponent;
		__CLR4_4_100l43y830t.R.inc(85);int bias = (int) Math.pow(2, eLength - 1) - 1;
		__CLR4_4_100l43y830t.R.inc(86);if ((((beforeDot.toString().equals(""))&&(__CLR4_4_100l43y830t.R.iget(87)!=0|true))||(__CLR4_4_100l43y830t.R.iget(88)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(89);e = normalize(afterDot.toString());
			__CLR4_4_100l43y830t.R.inc(90);if ((((bias - e < 0)&&(__CLR4_4_100l43y830t.R.iget(91)!=0|true))||(__CLR4_4_100l43y830t.R.iget(92)==0&false))) {{
				// \u9359\u5d88\ue749\u93cd\u714e\u5bf2
				__CLR4_4_100l43y830t.R.inc(93);System.out.println(bias - e);
				__CLR4_4_100l43y830t.R.inc(94);System.out.println(afterDot);
				__CLR4_4_100l43y830t.R.inc(95);afterDot = new StringBuilder(afterDot.substring(normalize(afterDot.toString()) - 1));
				__CLR4_4_100l43y830t.R.inc(96);while ((((afterDot.length() < sLength)&&(__CLR4_4_100l43y830t.R.iget(97)!=0|true))||(__CLR4_4_100l43y830t.R.iget(98)==0&false))) {{
					__CLR4_4_100l43y830t.R.inc(99);afterDot.append("0");
				}
				}__CLR4_4_100l43y830t.R.inc(100);return result + allZeroWithLength(eLength) + afterDot;
			}
			}__CLR4_4_100l43y830t.R.inc(101);exponent = integerRepresentation((bias - e) + "", eLength);
		} }else {{
			__CLR4_4_100l43y830t.R.inc(102);e = beforeDot.length() - 1;
			__CLR4_4_100l43y830t.R.inc(103);exponent = integerRepresentation((bias + e) + "", eLength);
		}
		}__CLR4_4_100l43y830t.R.inc(104);if ((((strs.length > 1)&&(__CLR4_4_100l43y830t.R.iget(105)!=0|true))||(__CLR4_4_100l43y830t.R.iget(106)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(107);if ((((beforeDot.toString().equals(""))&&(__CLR4_4_100l43y830t.R.iget(108)!=0|true))||(__CLR4_4_100l43y830t.R.iget(109)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(110);afterDot = new StringBuilder(leftShift(afterDot.toString(), e));
				__CLR4_4_100l43y830t.R.inc(111);result.append(exponent).append(afterDot);
			} }else {{
				__CLR4_4_100l43y830t.R.inc(112);result.append(exponent).append(beforeDot.substring(1)).append(afterDot);
			}
		}} }else {{
			__CLR4_4_100l43y830t.R.inc(113);result.append(exponent).append((((beforeDot.toString().equals("") )&&(__CLR4_4_100l43y830t.R.iget(114)!=0|true))||(__CLR4_4_100l43y830t.R.iget(115)==0&false))? "" : beforeDot.substring(1));
		}
		}__CLR4_4_100l43y830t.R.inc(116);if ((((result.length() > 1 + eLength + sLength)&&(__CLR4_4_100l43y830t.R.iget(117)!=0|true))||(__CLR4_4_100l43y830t.R.iget(118)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(119);result = new StringBuilder(result.substring(0, 1 + eLength + sLength));
		}
		// +-Inf,NaN
		}__CLR4_4_100l43y830t.R.inc(120);if ((((exponent.equals(allOneWithLength(exponent.length())))&&(__CLR4_4_100l43y830t.R.iget(121)!=0|true))||(__CLR4_4_100l43y830t.R.iget(122)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(123);if ((((result.substring(1 + eLength, result.length()).equals(allZeroWithLength(1 + eLength + sLength)))&&(__CLR4_4_100l43y830t.R.iget(124)!=0|true))||(__CLR4_4_100l43y830t.R.iget(125)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(126);return (((result.charAt(0) == '0' )&&(__CLR4_4_100l43y830t.R.iget(127)!=0|true))||(__CLR4_4_100l43y830t.R.iget(128)==0&false))? "+Inf" : "-Inf";
			} }else {{
				__CLR4_4_100l43y830t.R.inc(129);return "NaN";
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(130);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u9422\u71b8\u579a\u9357\u4f7d\u7e58\u9352\u8235\u8bde\u9410\u89c4\u669f\u9428\u51e6EEE 754\u741b\u3127\u305a\u951b\u5c83\ue6e6\u59f9\u509d\u769f\u9422\u2562loatRepresentation(String, int, int)\u7039\u70b5\u5e47\u9286\ufffd
	 * \u6e1a\u5b36\u7d30ieee754("11.375", 32)
	 *
	 * @param number
	 *            \u9357\u4f7d\u7e58\u9352\u8235\u8bde\u9410\u89c4\u669f\u951b\u5c7d\u5bd8\u935a\ue0a2\u76ac\u93c1\u626e\u5063\u9286\u509d\u5ae2\u6d93\u9e3f\u790b\u93c1\u5e2e\u7d31\u9352\u6b11\ue0c7\u6d93\ufffd\u6d63\u5d84\u8d1f\u9225\ufffd-\u9225\u6fd3\u7d31\u947b\u30e4\u8d1f\u59dd\uff46\u669f\u93b4\ufffd 0\u951b\u5c7d\u57af\u93c3\u72b5\ue0c1\u9359\u8702\u7d85
	 * @param length
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u3003\u7ec0\u8679\u6b91\u95c0\u57ae\u5bb3\u951b\u5c7c\u8d1f32\u93b4\ufffd64
	 * @return number\u9428\u51e6EEE 754\u741b\u3127\u305a\u951b\u5c84\u66b1\u6434\ufe3f\u8d1flength\u9286\u5099\u7ca0\u5bb8\ufe40\u609c\u9359\u7b79\u7d1d\u6e1a\u6fc7\ue0bc\u6d93\u8679\ue0c1\u9359\u67ab\ufffd\u4f79\u5bda\u93c1\u5e2e\u7d19\u7ec9\u8364\u721c\u741b\u3127\u305a\u951b\u5908\ufffd\u4f78\u71ac\u93c1\u5e2e\u7d19\u68e3\u6826\u7d85\u95c5\u612f\u68cc\u951b\ufffd
	 */
	public String ieee754(String number, int length) {try{__CLR4_4_100l43y830t.R.inc(131);
		__CLR4_4_100l43y830t.R.inc(132);if ((((length == 32)&&(__CLR4_4_100l43y830t.R.iget(133)!=0|true))||(__CLR4_4_100l43y830t.R.iget(134)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(135);return floatRepresentation(number, 8, 23);
		} }else {__CLR4_4_100l43y830t.R.inc(136);if ((((length == 64)&&(__CLR4_4_100l43y830t.R.iget(137)!=0|true))||(__CLR4_4_100l43y830t.R.iget(138)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(139);return floatRepresentation(number, 11, 52);
		} }else {{
			__CLR4_4_100l43y830t.R.inc(140);return "";
		}
	}}}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u7481\uff04\u757b\u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u93c1\u5b58\u669f\u9428\u52ed\u6e61\u934a\u7b3a\ufffd\ufffd \u6e1a\u5b36\u7d30integerTrueValue("00001001")
	 *
	 * @param operand
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u93bf\u5d84\u7d94\u93c1\ufffd
	 * @return operand\u9428\u52ed\u6e61\u934a\u7b3a\ufffd\u509d\u5ae2\u6d93\u9e3f\u790b\u93c1\u5e2e\u7d31\u9352\u6b11\ue0c7\u6d93\ufffd\u6d63\u5d84\u8d1f\u9225\ufffd-\u9225\u6fd3\u7d31\u947b\u30e4\u8d1f\u59dd\uff46\u669f\u93b4\ufffd 0\u951b\u5c7d\u57af\u93c3\u72b5\ue0c1\u9359\u8702\u7d85
	 */
	public String integerTrueValue(String operand) {try{__CLR4_4_100l43y830t.R.inc(141);
		__CLR4_4_100l43y830t.R.inc(142);int num = 0;
		__CLR4_4_100l43y830t.R.inc(143);for (int i = 0; (((i < operand.length())&&(__CLR4_4_100l43y830t.R.iget(144)!=0|true))||(__CLR4_4_100l43y830t.R.iget(145)==0&false)); i++) {{
			__CLR4_4_100l43y830t.R.inc(146);if ((((i == 0)&&(__CLR4_4_100l43y830t.R.iget(147)!=0|true))||(__CLR4_4_100l43y830t.R.iget(148)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(149);num -= (operand.charAt(i) - 48) * Math.pow(2, operand.length() - 1);
			} }else {{
				__CLR4_4_100l43y830t.R.inc(150);num += (operand.charAt(i) - 48) * Math.pow(2, operand.length() - 1 - i);
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(151);return String.valueOf(num);
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u7481\uff04\u757b\u6d5c\u5c83\u7e58\u9352\u8dfa\u5e2b\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u5a34\ue1be\u5063\u93c1\u626e\u6b91\u942a\u71b7\ufffd\u7b3a\ufffd\ufffd \u6e1a\u5b36\u7d30floatTrueValue("01000001001101100000", 8, 11)
	 *
	 * @param operand
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u3003\u7ec0\u8679\u6b91\u93bf\u5d84\u7d94\u93c1\ufffd
	 * @param eLength
	 *            \u93b8\u56e8\u669f\u9428\u52ef\u66b1\u6434\ufe3c\u7d1d\u9359\u6827\ufffd\u714e\u3047\u6d5c\u5ea3\u74d1\u6d5c\ufffd 4
	 * @param sLength
	 *            \u704f\u70ac\u669f\u9428\u52ef\u66b1\u6434\ufe3c\u7d1d\u9359\u6827\ufffd\u714e\u3047\u6d5c\u5ea3\u74d1\u6d5c\ufffd 4
	 * @return operand\u9428\u52ed\u6e61\u934a\u7b3a\ufffd\u509d\u5ae2\u6d93\u9e3f\u790b\u93c1\u5e2e\u7d31\u9352\u6b11\ue0c7\u6d93\ufffd\u6d63\u5d84\u8d1f\u9225\ufffd-\u9225\u6fd3\u7d31\u947b\u30e4\u8d1f\u59dd\uff46\u669f\u93b4\ufffd 0\u951b\u5c7d\u57af\u93c3\u72b5\ue0c1\u9359\u8702\u7d85\u9286\u509b\ue11c\u7490\u71b8\u68e4\u7ecc\u5cf0\u578e\u9352\ue0a5\u3003\u7ec0\u8f70\u8d1f\u9225\ufffd+Inf\u9225\u6fc6\u62f0\u9225\ufffd-Inf\u9225\u6fd3\u7d1d
	 *         NaN\u741b\u3127\u305a\u6d93\u8861\ufffd\u6de3aN\u9225\ufffd
	 */
	public String floatTrueValue(String operand, int eLength, int sLength) {try{__CLR4_4_100l43y830t.R.inc(152);
		// \u934f\u5823\ue187\u8930\u66df\u69f8\u935a\ufe3f\u8d1f\u7490\u71b8\u669f
		__CLR4_4_100l43y830t.R.inc(153);boolean isMinus = false;
		__CLR4_4_100l43y830t.R.inc(154);if ((((operand.charAt(0) == '1')&&(__CLR4_4_100l43y830t.R.iget(155)!=0|true))||(__CLR4_4_100l43y830t.R.iget(156)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(157);isMinus = true;
		}
		}__CLR4_4_100l43y830t.R.inc(158);String exponent = operand.substring(1, 1 + eLength);
		__CLR4_4_100l43y830t.R.inc(159);String tailNum = operand.substring(1 + eLength);
		// System.out.println(exponent);
		// System.out.println(tailNum);
		// \u59dd\uff48\u790b\u93c3\u72b5\u2513\u6fb6\ufffd/NaN
		__CLR4_4_100l43y830t.R.inc(160);if ((((exponent.equals(allOneWithLength(eLength)))&&(__CLR4_4_100l43y830t.R.iget(161)!=0|true))||(__CLR4_4_100l43y830t.R.iget(162)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(163);if ((((tailNum.equals(allZeroWithLength(sLength)))&&(__CLR4_4_100l43y830t.R.iget(164)!=0|true))||(__CLR4_4_100l43y830t.R.iget(165)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(166);if ((((operand.charAt(0) == '0')&&(__CLR4_4_100l43y830t.R.iget(167)!=0|true))||(__CLR4_4_100l43y830t.R.iget(168)==0&false))) {{
					__CLR4_4_100l43y830t.R.inc(169);return "+Inf";
				} }else {{
					__CLR4_4_100l43y830t.R.inc(170);return "-Inf";
				}
			}} }else {{
				__CLR4_4_100l43y830t.R.inc(171);return "NaN";
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(172);String bias = integerRepresentation(String.valueOf((int) Math.pow(2, eLength - 1) - 1), eLength);
		// \u95c6\ufffd,\u9359\u5d88\ue749\u93cd\u714e\u5bf2\u93c1\ufffd
		__CLR4_4_100l43y830t.R.inc(173);if ((((exponent.equals(allZeroWithLength(eLength)))&&(__CLR4_4_100l43y830t.R.iget(174)!=0|true))||(__CLR4_4_100l43y830t.R.iget(175)==0&false))) {{
			// 0
			__CLR4_4_100l43y830t.R.inc(176);if ((((tailNum.equals(allZeroWithLength(sLength)))&&(__CLR4_4_100l43y830t.R.iget(177)!=0|true))||(__CLR4_4_100l43y830t.R.iget(178)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(179);return "0";
			} }else {{
				// \u9359\u5d88\ue749\u93cd\u714e\u5bf2
				__CLR4_4_100l43y830t.R.inc(180);String exp = integerSubtraction(allZeroWithLength(eLength - 1) + "1", bias, eLength).substring(1);
				__CLR4_4_100l43y830t.R.inc(181);tailNum = "0" + tailNum;
				__CLR4_4_100l43y830t.R.inc(182);double result = 0;
				__CLR4_4_100l43y830t.R.inc(183);int dotPos = tailNum.length();
				__CLR4_4_100l43y830t.R.inc(184);for (int i = dotPos - 1; (((i >= 0)&&(__CLR4_4_100l43y830t.R.iget(185)!=0|true))||(__CLR4_4_100l43y830t.R.iget(186)==0&false)); i--) {{
					__CLR4_4_100l43y830t.R.inc(187);result += (Math.pow(2, -i) * (tailNum.charAt(i) - 48));
				}
				}__CLR4_4_100l43y830t.R.inc(188);result *= Math.pow(2.0, Integer.valueOf(integerTrueValue(exp)));
				__CLR4_4_100l43y830t.R.inc(189);return (((isMinus )&&(__CLR4_4_100l43y830t.R.iget(190)!=0|true))||(__CLR4_4_100l43y830t.R.iget(191)==0&false))? "-" + String.valueOf(result) : String.valueOf(result);
			}
		}}
		// \u934f\u6735\u7cac\u93af\u546d\u558c
		// \u7ee0\u6940\u56ad\u93b8\u56e8\u669f(\u934f\u581f\u69f80+\u934f\ufffd1\u6d93\ufffd,\u7481\uff04\u757b\u93c3\u8dfa\ufffd\u6b0f\u567a\u9358\ufffd)
		}__CLR4_4_100l43y830t.R.inc(192);exponent = adder(exponent, negation(bias), '1', eLength).substring(1);
		// \u741b\u30e4\u7b02\u704f\u70ac\u669f\u9353\u5d89\u6f70\u9428\ufffd1
		__CLR4_4_100l43y830t.R.inc(193);tailNum = "1" + tailNum;
		__CLR4_4_100l43y830t.R.inc(194);int dotPos = 1;
		__CLR4_4_100l43y830t.R.inc(195);if ((((exponent.charAt(0) == '0')&&(__CLR4_4_100l43y830t.R.iget(196)!=0|true))||(__CLR4_4_100l43y830t.R.iget(197)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(198);dotPos += Integer.valueOf(integerTrueValue(exponent));
		}
		// \u5bee\ufffd\u6fee\u5b2d\ue178\u7ee0\u6943\u7ca8\u93cb\ufffd
		}__CLR4_4_100l43y830t.R.inc(199);float result = 0;
		__CLR4_4_100l43y830t.R.inc(200);while ((((tailNum.length() < dotPos)&&(__CLR4_4_100l43y830t.R.iget(201)!=0|true))||(__CLR4_4_100l43y830t.R.iget(202)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(203);tailNum = tailNum + "0";
		}
		}__CLR4_4_100l43y830t.R.inc(204);for (int i = dotPos - 1; (((i >= 0)&&(__CLR4_4_100l43y830t.R.iget(205)!=0|true))||(__CLR4_4_100l43y830t.R.iget(206)==0&false)); i--) {{
			__CLR4_4_100l43y830t.R.inc(207);result += (float) (Math.pow(2, dotPos - 1 - i) * (tailNum.charAt(i) - 48));
		}
		}__CLR4_4_100l43y830t.R.inc(208);for (int i = dotPos; (((i < sLength)&&(__CLR4_4_100l43y830t.R.iget(209)!=0|true))||(__CLR4_4_100l43y830t.R.iget(210)==0&false)); i++) {{
			__CLR4_4_100l43y830t.R.inc(211);result += (float) (Math.pow(2, dotPos - 1 - i) * (tailNum.charAt(i) - 48));
		}
		}__CLR4_4_100l43y830t.R.inc(212);return (((isMinus )&&(__CLR4_4_100l43y830t.R.iget(213)!=0|true))||(__CLR4_4_100l43y830t.R.iget(214)==0&false))? "-" + String.valueOf(result) : String.valueOf(result);
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u5bb8\ufe3e\u0429\u93bf\u5d84\u7d94\u9286\ufffd \u6e1a\u5b36\u7d30leftShift("00001001", 2)
	 *
	 * @param operand
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u3003\u7ec0\u8679\u6b91\u93bf\u5d84\u7d94\u93c1\ufffd
	 * @param n
	 *            \u5bb8\ufe3e\u0429\u9428\u52ea\u7d85\u93c1\ufffd
	 * @return operand\u5bb8\ufe3e\u0429n\u6d63\u5d87\u6b91\u7f01\u64b4\u7049
	 */
	public String leftShift(String operand, int n) {try{__CLR4_4_100l43y830t.R.inc(215);
		__CLR4_4_100l43y830t.R.inc(216);StringBuilder result = new StringBuilder(operand.substring(n, operand.length()));
		__CLR4_4_100l43y830t.R.inc(217);while ((((result.length() < operand.length())&&(__CLR4_4_100l43y830t.R.iget(218)!=0|true))||(__CLR4_4_100l43y830t.R.iget(219)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(220);result.append("0");
		}
		}__CLR4_4_100l43y830t.R.inc(221);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u93b8\u5909\u7d85\u9359\u6827\u5f3d\u93bf\u5d84\u7d94\u9286\ufffd \u6e1a\u5b36\u7d30negation("00001001")
	 *
	 * @param operand
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u3003\u7ec0\u8679\u6b91\u93bf\u5d84\u7d94\u93c1\ufffd
	 * @return operand\u93b8\u5909\u7d85\u9359\u6827\u5f3d\u9428\u52ed\u7ca8\u93cb\ufffd
	 */
	public String negation(String operand) {try{__CLR4_4_100l43y830t.R.inc(222);
		__CLR4_4_100l43y830t.R.inc(223);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(224);for (int i = 0; (((i < operand.length())&&(__CLR4_4_100l43y830t.R.iget(225)!=0|true))||(__CLR4_4_100l43y830t.R.iget(226)==0&false)); i++) {{
			__CLR4_4_100l43y830t.R.inc(227);if ((((operand.charAt(i) == '0')&&(__CLR4_4_100l43y830t.R.iget(228)!=0|true))||(__CLR4_4_100l43y830t.R.iget(229)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(230);result.append("1");
			} }else {{
				__CLR4_4_100l43y830t.R.inc(231);result.append("0");
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(232);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u9354\u72b1\u7af4\u9363\ufffd,\u7039\u70b5\u5e47\u93bf\u5d84\u7d94\u93c1\u677f\u59de 1 \u9428\u52ee\u7e4d\u7ee0\u693c\ufffd\ufffd \u95c7\ufffd\u7455\u4f80\u5670\u9422\u3124\u7b0c\u95c2\u3123\ufffd\u4f79\u57a8\u95c2\u3123\ufffd\u4f78\u7d13\u93b4\u682d\u68ec\u7edb\u590b\u0101\u93b7\ufffd,\u6d93\u5d85\u5f72\u6d60\u30e7\u6d3f\u93ba\u30e8\u769f\u9422\ufffd
	 * fullAdder\u9286\u4e67laAdder\u9286\u4e64dder\u9286\u4e6entegerAddition \u93c2\u89c4\u7876\u9286\ufffd \u6e1a\u5b36\u7d30oneAdder("00001001")
	 *
	 * @param operand
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u93bf\u5d84\u7d94\u93c1\ufffd
	 * @return operand\u9354\ufffd1\u9428\u52ed\u7ca8\u93cb\u6ed0\u7d1d\u95c0\u57ae\u5bb3\u6d93\u7c05perand\u9428\u52ef\u66b1\u6434\ufe40\u59de1\u951b\u5c7d\u53fe\u6d93\ue160\ue0c71\u6d63\u5d86\u5bda\u7ec0\u70d8\u69f8\u935a\ufe3d\u5b69\u9351\u7334\u7d19\u5a67\u3220\u56ad\u6d93\ufffd1\u951b\u5c7d\u60c1\u9352\u6b0e\u8d1f0\u951b\u591b\u7d1d\u934f\u6735\u7d91\u6d63\u5d84\u8d1f\u9429\u7a3f\u59de\u7f01\u64b4\u7049
	 */
	public String oneAdder(String operand) {try{__CLR4_4_100l43y830t.R.inc(233);
		__CLR4_4_100l43y830t.R.inc(234);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(235);char si;
		__CLR4_4_100l43y830t.R.inc(236);char ci = '1';
		__CLR4_4_100l43y830t.R.inc(237);for (int i = 0; (((i < operand.length())&&(__CLR4_4_100l43y830t.R.iget(238)!=0|true))||(__CLR4_4_100l43y830t.R.iget(239)==0&false)); i++) {{
			__CLR4_4_100l43y830t.R.inc(240);si = xorGate(operand.charAt(operand.length() - i - 1), ci);
			__CLR4_4_100l43y830t.R.inc(241);result.insert(0, si);
			__CLR4_4_100l43y830t.R.inc(242);ci = andGate(ci, operand.charAt(operand.length() - i - 1));
		}
		// \u9352\u3086\u67c7\u93c4\ue21a\u60c1\u5a67\u3220\u56ad
		}__CLR4_4_100l43y830t.R.inc(243);if ((((ci == '1')&&(__CLR4_4_100l43y830t.R.iget(244)!=0|true))||(__CLR4_4_100l43y830t.R.iget(245)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(246);result.insert(0, "1");
		} }else {{
			__CLR4_4_100l43y830t.R.inc(247);result.insert(0, "0");
		}
		}__CLR4_4_100l43y830t.R.inc(248);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u9354\u72b3\u7876\u9363\ue7d2\u7d1d\u7455\u4f79\u7730\u748b\u51aa\u6564claAdder(String, String, char)\u93c2\u89c4\u7876\u7039\u70b5\u5e47\u9286\ufffd \u6e1a\u5b36\u7d30adder("0100", "0011", \u9225\ufffd0\u9225\ufffd, 8)
	 *
	 * @param operand1
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u741a\ue0a2\u59de\u93c1\ufffd
	 * @param operand2
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u9354\u72b3\u669f
	 * @param c
	 *            \u93c8\ufffd\u6d63\u5e9d\u7d85\u6769\u6d97\u7d85
	 * @param length
	 *            \u701b\u6a3b\u6581\u93bf\u5d84\u7d94\u93c1\u626e\u6b91\u7035\u52eb\u74e8\u9363\u3127\u6b91\u95c0\u57ae\u5bb3\u951b\u5c7c\u8d1f4\u9428\u52eb\ufffd\u5d86\u669f\u9286\u4ff5ength\u6d93\u5d85\u76ac\u6d5c\u5ea2\u6437\u6d63\u6ec4\u669f\u9428\u52ef\u66b1\u6434\ufe3c\u7d1d\u8930\u64b4\u7147\u6d93\ue045\u6437\u6d63\u6ec4\u669f\u9428\u52ef\u66b1\u6434\ufe40\u76ac\u6d5c\u5dd0ength\u93c3\u8bb9\u7d1d\u95c7\ufffd\u7455\u4f78\u6e6a\u6942\u6a39\u7d85\u741b\u30e7\ue0c1\u9359\u8702\u7d85
	 * @return \u95c0\u57ae\u5bb3\u6d93\u7c02ength+1\u9428\u52eb\u74e7\u7ed7\ufe3f\u8986\u741b\u3127\u305a\u9428\u52ee\ue178\u7ee0\u6943\u7ca8\u93cb\u6ed0\u7d1d\u934f\u6735\u8151\u7ed7\ufffd1\u6d63\u5d86\u5bda\u7ec0\u70d8\u69f8\u935a\ufe3d\u5b69\u9351\u7334\u7d19\u5a67\u3220\u56ad\u6d93\ufffd1\u951b\u5c7d\u60c1\u9352\u6b0e\u8d1f0\u951b\u591b\u7d1d\u935a\u5dd0ength\u6d63\u5d86\u69f8\u9429\u7a3f\u59de\u7f01\u64b4\u7049
	 */
	public String adder(String operand1, String operand2, char c, int length) {try{__CLR4_4_100l43y830t.R.inc(249);
		// \u93b5\u2541\u774d\u6d93\u3084\u91dc\u93bf\u5d84\u7d94\u93c1\u677f\u57cc length \u95c0\u57ae\u5bb3
		__CLR4_4_100l43y830t.R.inc(250);StringBuilder tmpO1 = new StringBuilder(operand1);
		__CLR4_4_100l43y830t.R.inc(251);StringBuilder tmpO2 = new StringBuilder(operand2);
		__CLR4_4_100l43y830t.R.inc(252);while ((((tmpO1.length() < length)&&(__CLR4_4_100l43y830t.R.iget(253)!=0|true))||(__CLR4_4_100l43y830t.R.iget(254)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(255);if ((((tmpO1.charAt(0) == '1')&&(__CLR4_4_100l43y830t.R.iget(256)!=0|true))||(__CLR4_4_100l43y830t.R.iget(257)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(258);tmpO1.insert(0, "1");
			} }else {{
				__CLR4_4_100l43y830t.R.inc(259);tmpO1.insert(0, "0");
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(260);while ((((tmpO2.length() < length)&&(__CLR4_4_100l43y830t.R.iget(261)!=0|true))||(__CLR4_4_100l43y830t.R.iget(262)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(263);if ((((tmpO2.charAt(0) == '1')&&(__CLR4_4_100l43y830t.R.iget(264)!=0|true))||(__CLR4_4_100l43y830t.R.iget(265)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(266);tmpO2.insert(0, "1");
			} }else {{
				__CLR4_4_100l43y830t.R.inc(267);tmpO2.insert(0, "0");
			}
		}}
		// \u7481\uff04\u757b\u7f01\u64b4\u7049
		}__CLR4_4_100l43y830t.R.inc(268);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(269);char ci = c;
		__CLR4_4_100l43y830t.R.inc(270);int i = 0;
		__CLR4_4_100l43y830t.R.inc(271);do {{
			__CLR4_4_100l43y830t.R.inc(272);String ts = claAdder(tmpO1.substring(length - i - 4, length - i),
					tmpO2.substring(length - i - 4, length - i), ci);
			__CLR4_4_100l43y830t.R.inc(273);result.insert(0, ts.substring(1, 5));
			__CLR4_4_100l43y830t.R.inc(274);ci = ts.charAt(0);
			__CLR4_4_100l43y830t.R.inc(275);i += 4;
		} }while ((((i <= length - 4)&&(__CLR4_4_100l43y830t.R.iget(276)!=0|true))||(__CLR4_4_100l43y830t.R.iget(277)==0&false)));
		__CLR4_4_100l43y830t.R.inc(278);while ((((result.length() < length)&&(__CLR4_4_100l43y830t.R.iget(279)!=0|true))||(__CLR4_4_100l43y830t.R.iget(280)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(281);if ((((result.charAt(0) == '1')&&(__CLR4_4_100l43y830t.R.iget(282)!=0|true))||(__CLR4_4_100l43y830t.R.iget(283)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(284);result.insert(0, "1");
			} }else {{
				__CLR4_4_100l43y830t.R.inc(285);result.insert(0, "0");
			}
		}}
		// \u9352\u3086\u67c7\u93c4\ue21a\u60c1\u5a67\u3220\u56ad
		}__CLR4_4_100l43y830t.R.inc(286);boolean isOverflow = false;
		__CLR4_4_100l43y830t.R.inc(287);if ((((result.charAt(0) != tmpO1.charAt(0) && result.charAt(0) != tmpO2.charAt(0)
				&& tmpO1.charAt(0) == tmpO2.charAt(0))&&(__CLR4_4_100l43y830t.R.iget(288)!=0|true))||(__CLR4_4_100l43y830t.R.iget(289)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(290);isOverflow = true;
		}
		}__CLR4_4_100l43y830t.R.inc(291);if ((((isOverflow)&&(__CLR4_4_100l43y830t.R.iget(292)!=0|true))||(__CLR4_4_100l43y830t.R.iget(293)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(294);result.insert(0, "1");
		} }else {{
			__CLR4_4_100l43y830t.R.inc(295);result.insert(0, "0");
		}
		}__CLR4_4_100l43y830t.R.inc(296);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u934f\u3125\u59de\u9363\ue7d2\u7d1d\u7035\u901b\u88b1\u6d63\u5d84\u4e92\u9359\u5a45\u7e58\u6d63\u5d88\u7e58\u741b\u5c7d\u59de\u5a09\u66e1\u7e4d\u7ee0\u693c\ufffd\ufffd \u6e1a\u5b36\u7d30fullAdder('1', '1', '0')
	 *
	 * @param x
	 *            \u741a\ue0a2\u59de\u93c1\u626e\u6b91\u93cc\u612a\u7af4\u6d63\u5d8f\u7d1d\u9359\ufffd0\u93b4\ufffd1
	 * @param y
	 *            \u9354\u72b3\u669f\u9428\u52ec\u7147\u6d93\ufffd\u6d63\u5d8f\u7d1d\u9359\ufffd0\u93b4\ufffd1
	 * @param c
	 *            \u6d63\u5e9d\u7d85\u7035\u7470\u7d8b\u9353\u5d84\u7d85\u9428\u52ee\u7e58\u6d63\u5d8f\u7d1d\u9359\ufffd0\u93b4\ufffd1
	 * @return \u9429\u7a3f\u59de\u9428\u52ed\u7ca8\u93cb\u6ed0\u7d1d\u9422\u3129\u66b1\u6434\ufe3f\u8d1f2\u9428\u52eb\u74e7\u7ed7\ufe3f\u8986\u741b\u3127\u305a\u951b\u5c80\ue0c71\u6d63\u5d88\u3003\u7ec0\u9e3f\u7e58\u6d63\u5d8f\u7d1d\u7ed7\ufffd2\u6d63\u5d88\u3003\u7ec0\u54c4\u62f0
	 */
	public String fullAdder(char x, char y, char c) {try{__CLR4_4_100l43y830t.R.inc(297);
		__CLR4_4_100l43y830t.R.inc(298);char si = xorGate(xorGate(x, y), c);
		__CLR4_4_100l43y830t.R.inc(299);char ci = orGate(orGate(andGate(x, c), andGate(y, c)), andGate(x, y));
		__CLR4_4_100l43y830t.R.inc(300);return ci + "" + si;
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * 4\u6d63\u5d85\u539b\u741b\u5c83\u7e58\u6d63\u5d85\u59de\u5a09\u66de\u6ad2\u9286\ufffd \u7455\u4f79\u7730\u95b2\u56e9\u6564 fullAdder \u93c9\u30e5\u7584\u941c\ufffd \u6e1a\u5b36\u7d30claAdder("1001", "0001", '1')
	 *
	 * @param operand1
	 *            4\u6d63\u5d84\u7c29\u6769\u6d98\u57d7\u741b\u3127\u305a\u9428\u52ee\ue766\u9354\u72b3\u669f
	 * @param operand2
	 *            4\u6d63\u5d84\u7c29\u6769\u6d98\u57d7\u741b\u3127\u305a\u9428\u52eb\u59de\u93c1\ufffd
	 * @param c
	 *            \u6d63\u5e9d\u7d85\u7035\u7470\u7d8b\u9353\u5d84\u7d85\u9428\u52ee\u7e58\u6d63\u5d8f\u7d1d\u9359\ufffd0\u93b4\ufffd1
	 * @return \u95c0\u57ae\u5bb3\u6d93\ufffd5\u9428\u52eb\u74e7\u7ed7\ufe3f\u8986\u741b\u3127\u305a\u9428\u52ee\ue178\u7ee0\u6943\u7ca8\u93cb\u6ed0\u7d1d\u934f\u6735\u8151\u7ed7\ufffd1\u6d63\u5d86\u69f8\u93c8\ufffd\u6942\u6a39\u7d85\u6769\u6d97\u7d85\u951b\u5c7d\u60974\u6d63\u5d86\u69f8\u9429\u7a3f\u59de\u7f01\u64b4\u7049\u951b\u5c7d\u53fe\u6d93\ue161\u7e58\u6d63\u5d84\u7b09\u9359\ue219\u4e92\u9422\u535e\u60ca\u941c\ue21d\u5e4f\u5bf0\ufffd
	 */
	public String claAdder(String operand1, String operand2, char c) {try{__CLR4_4_100l43y830t.R.inc(301);
		__CLR4_4_100l43y830t.R.inc(302);char[] p = new char[5];
		__CLR4_4_100l43y830t.R.inc(303);char[] g = new char[5];
		// \u947e\u5cf0\u7df1Pi,Gi
		__CLR4_4_100l43y830t.R.inc(304);for (int i = 1; (((i <= 4)&&(__CLR4_4_100l43y830t.R.iget(305)!=0|true))||(__CLR4_4_100l43y830t.R.iget(306)==0&false)); i++) {{
			__CLR4_4_100l43y830t.R.inc(307);p[i] = orGate(operand1.charAt(4 - i), operand2.charAt(4 - i));
			__CLR4_4_100l43y830t.R.inc(308);g[i] = andGate(operand1.charAt(4 - i), operand2.charAt(4 - i));
		}
		// \u947e\u5cf0\u7df1Ci
		}__CLR4_4_100l43y830t.R.inc(309);char[] ci = new char[5];
		__CLR4_4_100l43y830t.R.inc(310);ci[0] = c;
		__CLR4_4_100l43y830t.R.inc(311);ci[1] = orGate(g[1], andGate(p[1], c));
		__CLR4_4_100l43y830t.R.inc(312);ci[2] = orGate(orGate(g[2], andGate(p[2], g[1])), andGate(c, andGate(p[2], p[1])));
		__CLR4_4_100l43y830t.R.inc(313);ci[3] = orGate(orGate(orGate(g[3], andGate(p[3], g[2])), andGate(g[1], andGate(p[3], p[2]))),
				andGate(c, andGate(p[3], andGate(p[2], p[1]))));
		__CLR4_4_100l43y830t.R.inc(314);ci[4] = orGate(
				orGate(orGate(orGate(g[4], andGate(p[4], g[3])), andGate(g[2], andGate(p[4], p[3]))),
						andGate(g[1], andGate(p[4], andGate(p[3], p[2])))),
				andGate(c, andGate(p[4], andGate(p[3], andGate(p[2], p[1])))));
		// \u947e\u5cf0\u7df1Si
		__CLR4_4_100l43y830t.R.inc(315);String result = "";
		__CLR4_4_100l43y830t.R.inc(316);for (int i = 1; (((i <= 4)&&(__CLR4_4_100l43y830t.R.iget(317)!=0|true))||(__CLR4_4_100l43y830t.R.iget(318)==0&false)); i++) {{
			__CLR4_4_100l43y830t.R.inc(319);result = fullAdder(operand1.charAt(4 - i), operand2.charAt(4 - i), ci[i - 1]).charAt(1) + result;
		}
		}__CLR4_4_100l43y830t.R.inc(320);return ci[4] + result;
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	/**
	 * \u93c1\u5b58\u669f\u9351\u5fd4\u7876\u951b\u5c83\ue6e6\u59f9\u509d\u769f\u9422\ufffd adder \u93c2\u89c4\u7876\u7039\u70b5\u5e47\u9286\ufffd \u6e1a\u5b36\u7d30integerSubtraction("0100", "0011", 8)
	 *
	 * @param operand1
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u741a\ue0a2\u567a\u93c1\ufffd
	 * @param operand2
	 *            \u6d5c\u5c83\u7e58\u9352\u60f0\u02c9\u942e\u4f7d\u3003\u7ec0\u8679\u6b91\u9351\u5fd4\u669f
	 * @param length
	 *            \u701b\u6a3b\u6581\u93bf\u5d84\u7d94\u93c1\u626e\u6b91\u7035\u52eb\u74e8\u9363\u3127\u6b91\u95c0\u57ae\u5bb3\u951b\u5c7c\u8d1f4\u9428\u52eb\ufffd\u5d86\u669f\u9286\u4ff5ength\u6d93\u5d85\u76ac\u6d5c\u5ea2\u6437\u6d63\u6ec4\u669f\u9428\u52ef\u66b1\u6434\ufe3c\u7d1d\u8930\u64b4\u7147\u6d93\ue045\u6437\u6d63\u6ec4\u669f\u9428\u52ef\u66b1\u6434\ufe40\u76ac\u6d5c\u5dd0ength\u93c3\u8bb9\u7d1d\u95c7\ufffd\u7455\u4f78\u6e6a\u6942\u6a39\u7d85\u741b\u30e7\ue0c1\u9359\u8702\u7d85
	 * @return \u95c0\u57ae\u5bb3\u6d93\u7c02ength+1\u9428\u52eb\u74e7\u7ed7\ufe3f\u8986\u741b\u3127\u305a\u9428\u52ee\ue178\u7ee0\u6943\u7ca8\u93cb\u6ed0\u7d1d\u934f\u6735\u8151\u7ed7\ufffd1\u6d63\u5d86\u5bda\u7ec0\u70d8\u69f8\u935a\ufe3d\u5b69\u9351\u7334\u7d19\u5a67\u3220\u56ad\u6d93\ufffd1\u951b\u5c7d\u60c1\u9352\u6b0e\u8d1f0\u951b\u591b\u7d1d\u935a\u5dd0ength\u6d63\u5d86\u69f8\u9429\u7a3f\u567a\u7f01\u64b4\u7049
	 */
	public String integerSubtraction(String operand1, String operand2, int length) {try{__CLR4_4_100l43y830t.R.inc(321);
		// \u93b6\u5a44\ue0c7\u6d5c\u5c7c\u91dc\u93c1\u677f\u5f47\u9359\ufffd,\u9a9e\u8235\u59b8\u6769\u6d97\u7d85\u7481\u53e5\u8d1f1
		__CLR4_4_100l43y830t.R.inc(322);return adder(operand1, negation(operand2), '1', length);
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	// \u6d93\u5ea8\u68ec
	public char andGate(char a, char b) {try{__CLR4_4_100l43y830t.R.inc(323);
		__CLR4_4_100l43y830t.R.inc(324);if ((((a == '1' && b == '1')&&(__CLR4_4_100l43y830t.R.iget(325)!=0|true))||(__CLR4_4_100l43y830t.R.iget(326)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(327);return '1';
		} }else {{
			__CLR4_4_100l43y830t.R.inc(328);return '0';
		}
	}}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	// \u5bee\u509b\u57a8\u95c2\ufffd
	public char xorGate(char a, char b) {try{__CLR4_4_100l43y830t.R.inc(329);
		__CLR4_4_100l43y830t.R.inc(330);if ((((a - b == 0)&&(__CLR4_4_100l43y830t.R.iget(331)!=0|true))||(__CLR4_4_100l43y830t.R.iget(332)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(333);return '0';
		} }else {{
			__CLR4_4_100l43y830t.R.inc(334);return '1';
		}
	}}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	// \u6769\u65bf\u6d16\u95c0\u5938\u8d1fn\u9428\u52eb\u53cf0\u6d93\ufffd
	private String allZeroWithLength(int n) {try{__CLR4_4_100l43y830t.R.inc(335);
		__CLR4_4_100l43y830t.R.inc(336);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(337);while ((((result.length() < n)&&(__CLR4_4_100l43y830t.R.iget(338)!=0|true))||(__CLR4_4_100l43y830t.R.iget(339)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(340);result.append("0");
		}
		}__CLR4_4_100l43y830t.R.inc(341);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	// \u6769\u65bf\u6d16\u95c0\u5938\u8d1fn\u9428\u52eb\u53cf1\u6d93\ufffd
	private String allOneWithLength(int n) {try{__CLR4_4_100l43y830t.R.inc(342);
		__CLR4_4_100l43y830t.R.inc(343);StringBuilder result = new StringBuilder();
		__CLR4_4_100l43y830t.R.inc(344);while ((((result.length() < n)&&(__CLR4_4_100l43y830t.R.iget(345)!=0|true))||(__CLR4_4_100l43y830t.R.iget(346)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(347);result.append("1");
		}
		}__CLR4_4_100l43y830t.R.inc(348);return result.toString();
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	// \u93b4\u682d\u68ec
	private char orGate(char a, char b) {try{__CLR4_4_100l43y830t.R.inc(349);
		__CLR4_4_100l43y830t.R.inc(350);if ((((a == '1' || b == '1')&&(__CLR4_4_100l43y830t.R.iget(351)!=0|true))||(__CLR4_4_100l43y830t.R.iget(352)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(353);return '1';
		} }else {{
			__CLR4_4_100l43y830t.R.inc(354);return '0';
		}
	}}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}

	// \u7459\u52ec\u7278\u9356\u6826\u7af4\u6d93\ue045\u669f,\u6769\u65bf\u6d16\u934a\u95f4\u8d1f\u95c7\ufffd\u7455\u4f78\u6e6a\u93b8\u56e8\u669f\u6d93\u5a42\u59de\u9428\u52ec\u669f\u934a\ufffd(\u9359\ue21b\ue11c\u9359\ue21d\u790b)
	public int normalize(String num) {try{__CLR4_4_100l43y830t.R.inc(355);
		__CLR4_4_100l43y830t.R.inc(356);int i = 0;
		__CLR4_4_100l43y830t.R.inc(357);char c = '0';
		__CLR4_4_100l43y830t.R.inc(358);while ((((i < num.length())&&(__CLR4_4_100l43y830t.R.iget(359)!=0|true))||(__CLR4_4_100l43y830t.R.iget(360)==0&false))) {{
			__CLR4_4_100l43y830t.R.inc(361);if ((((num.charAt(i) == c)&&(__CLR4_4_100l43y830t.R.iget(362)!=0|true))||(__CLR4_4_100l43y830t.R.iget(363)==0&false))) {{
				__CLR4_4_100l43y830t.R.inc(364);c = num.charAt(i);
				__CLR4_4_100l43y830t.R.inc(365);i++;
			} }else {{
				__CLR4_4_100l43y830t.R.inc(366);i++;
				__CLR4_4_100l43y830t.R.inc(367);break;
			}
		}}
		}__CLR4_4_100l43y830t.R.inc(368);return i;
	}finally{__CLR4_4_100l43y830t.R.flushNeeded();}}
}