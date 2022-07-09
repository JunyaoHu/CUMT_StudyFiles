/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//**
 * Use Gaussian elimination on an augmented matrix to
 * find the inverse of a matrix.
 *
 * Time Complexity: O(n^3)
 *  
 **/
package net.mooctest;

class MatrixInverse {public static class __CLR4_4_100l43y7w7o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004d\u0061\u0074\u0072\u0069\u0078\u0049\u006e\u0076\u0065\u0072\u0073\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593448841L,8589935092L,97,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  // Define a small value of epsilon to compare double values
  static final double EPS = 0.00000001;

  // Invert the specified matrix. Assumes invertibility. Time Complexity: O(r\u864fc)
  static double[][] inverse(double[][] matrix) {try{__CLR4_4_100l43y7w7o.R.inc(0);
    __CLR4_4_100l43y7w7o.R.inc(1);if ((((matrix.length != matrix[0].length)&&(__CLR4_4_100l43y7w7o.R.iget(2)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(3)==0&false))) {__CLR4_4_100l43y7w7o.R.inc(4);return null;
    }__CLR4_4_100l43y7w7o.R.inc(5);int n = matrix.length;
    __CLR4_4_100l43y7w7o.R.inc(6);double[][] augmented = new double[n][n * 2];
    __CLR4_4_100l43y7w7o.R.inc(7);for (int i = 0; (((i < n)&&(__CLR4_4_100l43y7w7o.R.iget(8)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(9)==0&false)); i++) {{
      __CLR4_4_100l43y7w7o.R.inc(10);for (int j = 0; (((j < n)&&(__CLR4_4_100l43y7w7o.R.iget(11)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(12)==0&false)); j++)
        {__CLR4_4_100l43y7w7o.R.inc(13);augmented[i][j] = matrix[i][j];
      }__CLR4_4_100l43y7w7o.R.inc(14);augmented[i][i + n] = 1;
    }
    }__CLR4_4_100l43y7w7o.R.inc(15);solve(augmented);
    __CLR4_4_100l43y7w7o.R.inc(16);double[][] inv = new double[n][n];
    __CLR4_4_100l43y7w7o.R.inc(17);for (int i = 0; (((i < n)&&(__CLR4_4_100l43y7w7o.R.iget(18)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(19)==0&false)); i++)
      {__CLR4_4_100l43y7w7o.R.inc(20);for (int j = 0; (((j < n)&&(__CLR4_4_100l43y7w7o.R.iget(21)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(22)==0&false)); j++)
        {__CLR4_4_100l43y7w7o.R.inc(23);inv[i][j] = augmented[i][j + n];
    }}__CLR4_4_100l43y7w7o.R.inc(24);return inv;
  }finally{__CLR4_4_100l43y7w7o.R.flushNeeded();}}

  // Solves a system of linear equations as an augmented matrix
  // with the rightmost column containing the constants. The answers
  // will be stored on the rightmost column after the algorithm is done.
  // NOTE: make sure your matrix is consistent and does not have multiple
  // solutions before you solve the system if you want a unique valid answer.
  // Time Complexity: O(r\u864fc)
  static void solve(double[][] augmentedMatrix) {try{__CLR4_4_100l43y7w7o.R.inc(25);
    __CLR4_4_100l43y7w7o.R.inc(26);int nRows = augmentedMatrix.length, nCols = augmentedMatrix[0].length, lead = 0;
    __CLR4_4_100l43y7w7o.R.inc(27);for (int r = 0; (((r < nRows)&&(__CLR4_4_100l43y7w7o.R.iget(28)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(29)==0&false)); r++) {{
      __CLR4_4_100l43y7w7o.R.inc(30);if ((((lead >= nCols)&&(__CLR4_4_100l43y7w7o.R.iget(31)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(32)==0&false))) {__CLR4_4_100l43y7w7o.R.inc(33);break;
      }__CLR4_4_100l43y7w7o.R.inc(34);int i = r;
      __CLR4_4_100l43y7w7o.R.inc(35);while ((((Math.abs(augmentedMatrix[i][lead]) < EPS)&&(__CLR4_4_100l43y7w7o.R.iget(36)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(37)==0&false))) {{
        __CLR4_4_100l43y7w7o.R.inc(38);if ((((++i == nRows)&&(__CLR4_4_100l43y7w7o.R.iget(39)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(40)==0&false))) {{
          __CLR4_4_100l43y7w7o.R.inc(41);i = r;
          __CLR4_4_100l43y7w7o.R.inc(42);if ((((++lead == nCols)&&(__CLR4_4_100l43y7w7o.R.iget(43)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(44)==0&false))) {__CLR4_4_100l43y7w7o.R.inc(45);return;
        }}
      }}
      }__CLR4_4_100l43y7w7o.R.inc(46);double[] temp = augmentedMatrix[r];
      __CLR4_4_100l43y7w7o.R.inc(47);augmentedMatrix[r] = augmentedMatrix[i];
      __CLR4_4_100l43y7w7o.R.inc(48);augmentedMatrix[i] = temp;
      __CLR4_4_100l43y7w7o.R.inc(49);double lv = augmentedMatrix[r][lead];
      __CLR4_4_100l43y7w7o.R.inc(50);for (int j = 0; (((j < nCols)&&(__CLR4_4_100l43y7w7o.R.iget(51)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(52)==0&false)); j++) {__CLR4_4_100l43y7w7o.R.inc(53);augmentedMatrix[r][j] /= lv;
      }__CLR4_4_100l43y7w7o.R.inc(54);for (i = 0; (((i < nRows)&&(__CLR4_4_100l43y7w7o.R.iget(55)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(56)==0&false)); i++) {{
        __CLR4_4_100l43y7w7o.R.inc(57);if ((((i != r)&&(__CLR4_4_100l43y7w7o.R.iget(58)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(59)==0&false))) {{
          __CLR4_4_100l43y7w7o.R.inc(60);lv = augmentedMatrix[i][lead];
          __CLR4_4_100l43y7w7o.R.inc(61);for (int j = 0; (((j < nCols)&&(__CLR4_4_100l43y7w7o.R.iget(62)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(63)==0&false)); j++) {__CLR4_4_100l43y7w7o.R.inc(64);augmentedMatrix[i][j] -= lv * augmentedMatrix[r][j];
        }}
      }}
      }__CLR4_4_100l43y7w7o.R.inc(65);lead++;
    }
  }}finally{__CLR4_4_100l43y7w7o.R.flushNeeded();}}

  // Checks if the matrix is inconsistent
  static boolean isInconsistent(double[][] arr) {try{__CLR4_4_100l43y7w7o.R.inc(66);
    __CLR4_4_100l43y7w7o.R.inc(67);int nCols = arr[0].length;
    __CLR4_4_100l43y7w7o.R.inc(68);outer: for (int y = 0; (((y < arr.length)&&(__CLR4_4_100l43y7w7o.R.iget(69)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(70)==0&false)); y++) {{
      __CLR4_4_100l43y7w7o.R.inc(71);if ((((Math.abs(arr[y][nCols - 1]) > EPS)&&(__CLR4_4_100l43y7w7o.R.iget(72)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(73)==0&false))) {{
        __CLR4_4_100l43y7w7o.R.inc(74);for (int x = 0; (((x < nCols - 1)&&(__CLR4_4_100l43y7w7o.R.iget(75)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(76)==0&false)); x++)
          {__CLR4_4_100l43y7w7o.R.inc(77);if ((((Math.abs(arr[y][x]) > EPS)&&(__CLR4_4_100l43y7w7o.R.iget(78)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(79)==0&false))) {__CLR4_4_100l43y7w7o.R.inc(80);continue outer;
        }}__CLR4_4_100l43y7w7o.R.inc(81);return true;
      }
    }}
    }__CLR4_4_100l43y7w7o.R.inc(82);return false;
  }finally{__CLR4_4_100l43y7w7o.R.flushNeeded();}}

  // Make sure your matrix is consistent as well
  static boolean hasMultipleSolutions(double[][] arr) {try{__CLR4_4_100l43y7w7o.R.inc(83);
    __CLR4_4_100l43y7w7o.R.inc(84);int nCols = arr[0].length, nEmptyRows = 0;
    __CLR4_4_100l43y7w7o.R.inc(85);outer: for (int y = 0; (((y < arr.length)&&(__CLR4_4_100l43y7w7o.R.iget(86)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(87)==0&false)); y++) {{
      __CLR4_4_100l43y7w7o.R.inc(88);for (int x = 0; (((x < nCols)&&(__CLR4_4_100l43y7w7o.R.iget(89)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(90)==0&false)); x++)
        {__CLR4_4_100l43y7w7o.R.inc(91);if ((((Math.abs(arr[y][x]) > EPS)&&(__CLR4_4_100l43y7w7o.R.iget(92)!=0|true))||(__CLR4_4_100l43y7w7o.R.iget(93)==0&false))) {__CLR4_4_100l43y7w7o.R.inc(94);continue outer;
      }}__CLR4_4_100l43y7w7o.R.inc(95);nEmptyRows++;
    }
    }__CLR4_4_100l43y7w7o.R.inc(96);return nCols - 1 > arr.length - nEmptyRows;
  }finally{__CLR4_4_100l43y7w7o.R.flushNeeded();}}
}










