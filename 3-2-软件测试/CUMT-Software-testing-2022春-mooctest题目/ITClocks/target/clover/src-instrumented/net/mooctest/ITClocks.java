/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

@java.lang.SuppressWarnings({"fallthrough"}) public class ITClocks {public static class __CLR4_4_13g3gl3zcaygp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private static final int lift(Event e) {try{__CLR4_4_13g3gl3zcaygp.R.inc(124);
		__CLR4_4_13g3gl3zcaygp.R.inc(125);return (((e.isLeaf() )&&(__CLR4_4_13g3gl3zcaygp.R.iget(126)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(127)==0&false))? 0 : e.getValue();
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	private static final Event tryLeft(Event e) {try{__CLR4_4_13g3gl3zcaygp.R.inc(128);
		__CLR4_4_13g3gl3zcaygp.R.inc(129);return (((e.isLeaf() )&&(__CLR4_4_13g3gl3zcaygp.R.iget(130)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(131)==0&false))? e: e.getLeft();
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	private static final Event tryRight(Event e) {try{__CLR4_4_13g3gl3zcaygp.R.inc(132);
		__CLR4_4_13g3gl3zcaygp.R.inc(133);return (((e.isLeaf() )&&(__CLR4_4_13g3gl3zcaygp.R.iget(134)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(135)==0&false))? e : e.getRight();
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * Less than-equal operator for causality: either e1 happens before e2 or e1
	 * equals e2.
	 * 
	 * @param offset1
	 *            The accumulated lifted value for event e1.
	 * @param e1
	 *            The first event being compared.
	 * @param offset2
	 *            The accumulated lifted value for event e2
	 * @param e2
	 *            The second event being compared.
	 * @return Returns if e1 is precedes or equals e2.
	 */
	private static final boolean lessThanEquals(final int offset1,
			final Event e1, final int offset2, Event e2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(136);
		__CLR4_4_13g3gl3zcaygp.R.inc(137);final int new_a = offset1 + e1.getValue();
		__CLR4_4_13g3gl3zcaygp.R.inc(138);if ((((e1.isLeaf())&&(__CLR4_4_13g3gl3zcaygp.R.iget(139)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(140)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(141);return new_a <= offset2 + e2.getValue();
		}
		}__CLR4_4_13g3gl3zcaygp.R.inc(142);final int new_b = lift(e2) + offset2;
		__CLR4_4_13g3gl3zcaygp.R.inc(143);if ((((!lessThanEquals(new_a, e1.getLeft(), new_b, tryLeft(e2)))&&(__CLR4_4_13g3gl3zcaygp.R.iget(144)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(145)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(146);return false;
		}
		}__CLR4_4_13g3gl3zcaygp.R.inc(147);return lessThanEquals(new_a, e1.getRight(), new_b, tryRight(e2));
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * The causality between two events.
	 *
	 */
	private static enum Order {
		HAPPENS_BEFORE, HAPPENS_AFTER, EQUALS, UNCOMPARABLE;
		public boolean isUnordered() {try{__CLR4_4_13g3gl3zcaygp.R.inc(148);
			__CLR4_4_13g3gl3zcaygp.R.inc(149);return this == EQUALS || this == UNCOMPARABLE;
		}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

		/**
		 * Compose two causality events.
		 * 
		 * @param c1
		 * @param c2
		 * @return
		 */
		public static Order compose(Order c1, Order c2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(150);
			boolean __CLB4_4_1_bool0=false;__CLR4_4_13g3gl3zcaygp.R.inc(151);switch (c1) {
			case EQUALS:if (!__CLB4_4_1_bool0) {__CLR4_4_13g3gl3zcaygp.R.inc(152);__CLB4_4_1_bool0=true;}
				__CLR4_4_13g3gl3zcaygp.R.inc(153);return c2;
			case UNCOMPARABLE:if (!__CLB4_4_1_bool0) {__CLR4_4_13g3gl3zcaygp.R.inc(154);__CLB4_4_1_bool0=true;}
				__CLR4_4_13g3gl3zcaygp.R.inc(155);return Order.UNCOMPARABLE;
			case HAPPENS_BEFORE:if (!__CLB4_4_1_bool0) {__CLR4_4_13g3gl3zcaygp.R.inc(156);__CLB4_4_1_bool0=true;} {
				boolean __CLB4_4_1_bool1=false;__CLR4_4_13g3gl3zcaygp.R.inc(157);switch (c2) {
				case HAPPENS_BEFORE:if (!__CLB4_4_1_bool1) {__CLR4_4_13g3gl3zcaygp.R.inc(158);__CLB4_4_1_bool1=true;}
				case EQUALS:if (!__CLB4_4_1_bool1) {__CLR4_4_13g3gl3zcaygp.R.inc(159);__CLB4_4_1_bool1=true;}
					__CLR4_4_13g3gl3zcaygp.R.inc(160);return Order.HAPPENS_BEFORE;
				default:if (!__CLB4_4_1_bool1) {__CLR4_4_13g3gl3zcaygp.R.inc(161);__CLB4_4_1_bool1=true;}
					__CLR4_4_13g3gl3zcaygp.R.inc(162);return Order.UNCOMPARABLE;
				}
			}
			case HAPPENS_AFTER:if (!__CLB4_4_1_bool0) {__CLR4_4_13g3gl3zcaygp.R.inc(163);__CLB4_4_1_bool0=true;} {
				boolean __CLB4_4_1_bool2=false;__CLR4_4_13g3gl3zcaygp.R.inc(164);switch (c2) {
				case HAPPENS_AFTER:if (!__CLB4_4_1_bool2) {__CLR4_4_13g3gl3zcaygp.R.inc(165);__CLB4_4_1_bool2=true;}
				case EQUALS:if (!__CLB4_4_1_bool2) {__CLR4_4_13g3gl3zcaygp.R.inc(166);__CLB4_4_1_bool2=true;}
					__CLR4_4_13g3gl3zcaygp.R.inc(167);return Order.HAPPENS_AFTER;
				default:if (!__CLB4_4_1_bool2) {__CLR4_4_13g3gl3zcaygp.R.inc(168);__CLB4_4_1_bool2=true;}
					__CLR4_4_13g3gl3zcaygp.R.inc(169);return Order.UNCOMPARABLE;
				}
			}
			}
			__CLR4_4_13g3gl3zcaygp.R.inc(170);throw new IllegalStateException();
		}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}
	}

	/**
	 * Base case of comparison.
	 * 
	 * @param offset
	 * @param e1
	 * @param e2
	 * @return
	 */
	private static Order compare0(int offset, Event e1, Event e2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(171);
		__CLR4_4_13g3gl3zcaygp.R.inc(172);if ((((e1.getValue() < e2.getValue())&&(__CLR4_4_13g3gl3zcaygp.R.iget(173)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(174)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(175);return (((lessThanEquals(offset, e1, offset, e2) )&&(__CLR4_4_13g3gl3zcaygp.R.iget(176)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(177)==0&false))? Order.HAPPENS_BEFORE
					: Order.UNCOMPARABLE;
		} }else {__CLR4_4_13g3gl3zcaygp.R.inc(178);if ((((e1.getValue() > e2.getValue())&&(__CLR4_4_13g3gl3zcaygp.R.iget(179)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(180)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(181);return (((lessThanEquals(offset, e2, offset, e1) )&&(__CLR4_4_13g3gl3zcaygp.R.iget(182)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(183)==0&false))? Order.HAPPENS_AFTER
					: Order.UNCOMPARABLE;
		}
		// Since one of the events is a leaf event, then only one leq is called.
		}}__CLR4_4_13g3gl3zcaygp.R.inc(184);if ((((lessThanEquals(offset, e1, offset, e2))&&(__CLR4_4_13g3gl3zcaygp.R.iget(185)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(186)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(187);if ((((lessThanEquals(offset, e2, offset, e1))&&(__CLR4_4_13g3gl3zcaygp.R.iget(188)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(189)==0&false))) {{
				__CLR4_4_13g3gl3zcaygp.R.inc(190);return Order.EQUALS;
			}
			}__CLR4_4_13g3gl3zcaygp.R.inc(191);return Order.HAPPENS_BEFORE;
		}
		}__CLR4_4_13g3gl3zcaygp.R.inc(192);if ((((lessThanEquals(offset, e2, offset, e1))&&(__CLR4_4_13g3gl3zcaygp.R.iget(193)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(194)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(195);return Order.HAPPENS_AFTER;
		}
		}__CLR4_4_13g3gl3zcaygp.R.inc(196);return Order.UNCOMPARABLE;
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * Checks if a given event happens-before (LT), happens-after (GT), equals,
	 * or is undefined
	 * 
	 * @param offset
	 * @param e1
	 * @param e2
	 * @return
	 */
	private static Order compare(int offset, Event e1, Event e2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(197);
		__CLR4_4_13g3gl3zcaygp.R.inc(198);if ((((e1.getValue() != e2.getValue() || e1.isLeaf() || e2.isLeaf())&&(__CLR4_4_13g3gl3zcaygp.R.iget(199)!=0|true))||(__CLR4_4_13g3gl3zcaygp.R.iget(200)==0&false))) {{
			__CLR4_4_13g3gl3zcaygp.R.inc(201);return compare0(offset, e1, e2);
		}
		}__CLR4_4_13g3gl3zcaygp.R.inc(202);int newOffset = offset + e1.getValue();
		__CLR4_4_13g3gl3zcaygp.R.inc(203);return Order.compose(compare(newOffset, e1.getLeft(), e2.getLeft()),
				compare(newOffset, e1.getRight(), e2.getRight()));
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * Check if timestamp <code>s1</code> happens before or equals to timestamp <code>s2</code>
	 * 
	 * @param e2
	 * @return
	 */
	public static boolean lessThanEquals(Stamp s1, Stamp s2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(204);
		__CLR4_4_13g3gl3zcaygp.R.inc(205);return lessThanEquals(s1.getEvent(), s2.getEvent());
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * Check if event <code>e1</code> precedes or equals event <code>e2</code>
	 * 
	 * @param e2
	 * @return
	 */
	public static boolean lessThanEquals(Event e1, Event e2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(206);
		__CLR4_4_13g3gl3zcaygp.R.inc(207);return lessThanEquals(0, e1, 0, e2);
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * Checks if this event is concurrent with <code>e</code>. If
	 * <code>e1.isConcurrent(e2)</code>, then <code>e2.isConcurrent(e1)</code>.
	 * 
	 * @param other
	 *            The event this object is being compared against.
	 * @return
	 */
	public static boolean isConcurrent(Event e1, Event e2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(208);
		__CLR4_4_13g3gl3zcaygp.R.inc(209);return compare(0, e1, e2).isUnordered();
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}

	/**
	 * Checks if this event happened before the other. If neither event happened
	 * before the other, we say that they are concurrent.
	 * 
	 * @param e
	 * @return
	 */
	public static boolean happensBefore(Stamp s1, Stamp s2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(210);
		__CLR4_4_13g3gl3zcaygp.R.inc(211);return happensBefore(s1.getEvent(), s2.getEvent());
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}
	/**
	 * Checks if this event happened before the other. If neither event happened
	 * before the other, we say that they are concurrent.
	 * 
	 * @param e
	 * @return
	 */
	public static boolean happensBefore(Event e1, Event e2) {try{__CLR4_4_13g3gl3zcaygp.R.inc(212);
		__CLR4_4_13g3gl3zcaygp.R.inc(213);return compare(0, e1, e2) == Order.HAPPENS_BEFORE;
	}finally{__CLR4_4_13g3gl3zcaygp.R.flushNeeded();}}
}
