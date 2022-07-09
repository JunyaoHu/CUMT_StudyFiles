/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class RedBlackTree extends AbstractBinaryTree {public static class __CLR4_4_17t7tl43y7qed{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0052\u0065\u0064\u0042\u006c\u0061\u0063\u006b\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593441132L,8589935092L,514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	protected enum ColorEnum {
		RED, BLACK
	};

	protected static final RedBlackNode nilNode = new RedBlackNode(null, null, null, null, ColorEnum.BLACK);

	/**
	 * @see org.AbstractBinaryTree.algos.trees.AbstractBinarySearchTree#insert(int)
	 */
	@Override
	public Node insert(int element) {try{__CLR4_4_17t7tl43y7qed.R.inc(281);
		__CLR4_4_17t7tl43y7qed.R.inc(282);Node newNode = super.insert(element);
		__CLR4_4_17t7tl43y7qed.R.inc(283);newNode.left = nilNode;
		__CLR4_4_17t7tl43y7qed.R.inc(284);newNode.right = nilNode;
		__CLR4_4_17t7tl43y7qed.R.inc(285);root.parent = nilNode;
		__CLR4_4_17t7tl43y7qed.R.inc(286);insertRBFixup((RedBlackNode) newNode);
		__CLR4_4_17t7tl43y7qed.R.inc(287);return newNode;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * Slightly modified delete routine for red-black tree.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	protected Node delete(Node deleteNode) {try{__CLR4_4_17t7tl43y7qed.R.inc(288);
		__CLR4_4_17t7tl43y7qed.R.inc(289);Node replaceNode = null; // track node that replaces removedOrMovedNode
		__CLR4_4_17t7tl43y7qed.R.inc(290);if ((((deleteNode != null && deleteNode != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(291)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(292)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(293);Node removedOrMovedNode = deleteNode; // same as deleteNode if it has only one child, and otherwise it
													// replaces deleteNode
			__CLR4_4_17t7tl43y7qed.R.inc(294);ColorEnum removedOrMovedNodeColor = ((RedBlackNode) removedOrMovedNode).color;

			__CLR4_4_17t7tl43y7qed.R.inc(295);if ((((deleteNode.left == nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(296)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(297)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(298);replaceNode = deleteNode.right;
				__CLR4_4_17t7tl43y7qed.R.inc(299);rbTreeTransplant(deleteNode, deleteNode.right);
			} }else {__CLR4_4_17t7tl43y7qed.R.inc(300);if ((((deleteNode.right == nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(301)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(302)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(303);replaceNode = deleteNode.left;
				__CLR4_4_17t7tl43y7qed.R.inc(304);rbTreeTransplant(deleteNode, deleteNode.left);
			} }else {{
				__CLR4_4_17t7tl43y7qed.R.inc(305);removedOrMovedNode = getMinimum(deleteNode.right);
				__CLR4_4_17t7tl43y7qed.R.inc(306);removedOrMovedNodeColor = ((RedBlackNode) removedOrMovedNode).color;
				__CLR4_4_17t7tl43y7qed.R.inc(307);replaceNode = removedOrMovedNode.right;
				__CLR4_4_17t7tl43y7qed.R.inc(308);if ((((removedOrMovedNode.parent == deleteNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(309)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(310)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(311);replaceNode.parent = removedOrMovedNode;
				} }else {{
					__CLR4_4_17t7tl43y7qed.R.inc(312);rbTreeTransplant(removedOrMovedNode, removedOrMovedNode.right);
					__CLR4_4_17t7tl43y7qed.R.inc(313);removedOrMovedNode.right = deleteNode.right;
					__CLR4_4_17t7tl43y7qed.R.inc(314);removedOrMovedNode.right.parent = removedOrMovedNode;
				}
				}__CLR4_4_17t7tl43y7qed.R.inc(315);rbTreeTransplant(deleteNode, removedOrMovedNode);
				__CLR4_4_17t7tl43y7qed.R.inc(316);removedOrMovedNode.left = deleteNode.left;
				__CLR4_4_17t7tl43y7qed.R.inc(317);removedOrMovedNode.left.parent = removedOrMovedNode;
				__CLR4_4_17t7tl43y7qed.R.inc(318);((RedBlackNode) removedOrMovedNode).color = ((RedBlackNode) deleteNode).color;
			}

			}}__CLR4_4_17t7tl43y7qed.R.inc(319);size--;
			__CLR4_4_17t7tl43y7qed.R.inc(320);if ((((removedOrMovedNodeColor == ColorEnum.BLACK)&&(__CLR4_4_17t7tl43y7qed.R.iget(321)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(322)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(323);deleteRBFixup((RedBlackNode) replaceNode);
			}
		}}

		}__CLR4_4_17t7tl43y7qed.R.inc(324);return replaceNode;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * @see org.AbstractBinaryTree.algos.trees.AbstractBinarySearchTree#createNode(int,
	 *      org.AbstractBinaryTree.algos.trees.AbstractBinarySearchTree.Node,
	 *      org.AbstractBinaryTree.algos.trees.AbstractBinarySearchTree.Node,
	 *      org.AbstractBinaryTree.algos.trees.AbstractBinarySearchTree.Node)
	 */
	@Override
	protected Node createNode(int value, Node parent, Node left, Node right) {try{__CLR4_4_17t7tl43y7qed.R.inc(325);
		__CLR4_4_17t7tl43y7qed.R.inc(326);return new RedBlackNode(value, parent, left, right, ColorEnum.RED);
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Node getMinimum(Node node) {try{__CLR4_4_17t7tl43y7qed.R.inc(327);
		__CLR4_4_17t7tl43y7qed.R.inc(328);while ((((node.left != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(329)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(330)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(331);node = node.left;
		}
		}__CLR4_4_17t7tl43y7qed.R.inc(332);return node;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Node getMaximum(Node node) {try{__CLR4_4_17t7tl43y7qed.R.inc(333);
		__CLR4_4_17t7tl43y7qed.R.inc(334);while ((((node.right != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(335)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(336)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(337);node = node.right;
		}
		}__CLR4_4_17t7tl43y7qed.R.inc(338);return node;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Node rotateLeft(Node node) {try{__CLR4_4_17t7tl43y7qed.R.inc(339);
		__CLR4_4_17t7tl43y7qed.R.inc(340);Node temp = node.right;
		__CLR4_4_17t7tl43y7qed.R.inc(341);temp.parent = node.parent;

		__CLR4_4_17t7tl43y7qed.R.inc(342);node.right = temp.left;
		__CLR4_4_17t7tl43y7qed.R.inc(343);if ((((node.right != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(344)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(345)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(346);node.right.parent = node;
		}

		}__CLR4_4_17t7tl43y7qed.R.inc(347);temp.left = node;
		__CLR4_4_17t7tl43y7qed.R.inc(348);node.parent = temp;

		// temp took over node's place so now its parent should point to temp
		__CLR4_4_17t7tl43y7qed.R.inc(349);if ((((temp.parent != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(350)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(351)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(352);if ((((node == temp.parent.left)&&(__CLR4_4_17t7tl43y7qed.R.iget(353)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(354)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(355);temp.parent.left = temp;
			} }else {{
				__CLR4_4_17t7tl43y7qed.R.inc(356);temp.parent.right = temp;
			}
		}} }else {{
			__CLR4_4_17t7tl43y7qed.R.inc(357);root = temp;
		}

		}__CLR4_4_17t7tl43y7qed.R.inc(358);return temp;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Node rotateRight(Node node) {try{__CLR4_4_17t7tl43y7qed.R.inc(359);
		__CLR4_4_17t7tl43y7qed.R.inc(360);Node temp = node.left;
		__CLR4_4_17t7tl43y7qed.R.inc(361);temp.parent = node.parent;

		__CLR4_4_17t7tl43y7qed.R.inc(362);node.left = temp.right;
		__CLR4_4_17t7tl43y7qed.R.inc(363);if ((((node.left != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(364)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(365)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(366);node.left.parent = node;
		}

		}__CLR4_4_17t7tl43y7qed.R.inc(367);temp.right = node;
		__CLR4_4_17t7tl43y7qed.R.inc(368);node.parent = temp;

		// temp took over node's place so now its parent should point to temp
		__CLR4_4_17t7tl43y7qed.R.inc(369);if ((((temp.parent != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(370)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(371)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(372);if ((((node == temp.parent.left)&&(__CLR4_4_17t7tl43y7qed.R.iget(373)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(374)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(375);temp.parent.left = temp;
			} }else {{
				__CLR4_4_17t7tl43y7qed.R.inc(376);temp.parent.right = temp;
			}
		}} }else {{
			__CLR4_4_17t7tl43y7qed.R.inc(377);root = temp;
		}

		}__CLR4_4_17t7tl43y7qed.R.inc(378);return temp;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * Similar to original transplant() method in BST but uses nilNode instead of
	 * null.
	 */
	private Node rbTreeTransplant(Node nodeToReplace, Node newNode) {try{__CLR4_4_17t7tl43y7qed.R.inc(379);
		__CLR4_4_17t7tl43y7qed.R.inc(380);if ((((nodeToReplace.parent == nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(381)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(382)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(383);this.root = newNode;
		} }else {__CLR4_4_17t7tl43y7qed.R.inc(384);if ((((nodeToReplace == nodeToReplace.parent.left)&&(__CLR4_4_17t7tl43y7qed.R.iget(385)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(386)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(387);nodeToReplace.parent.left = newNode;
		} }else {{
			__CLR4_4_17t7tl43y7qed.R.inc(388);nodeToReplace.parent.right = newNode;
		}
		}}__CLR4_4_17t7tl43y7qed.R.inc(389);newNode.parent = nodeToReplace.parent;
		__CLR4_4_17t7tl43y7qed.R.inc(390);return newNode;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * Restores Red-Black tree properties after delete if needed.
	 */
	private void deleteRBFixup(RedBlackNode x) {try{__CLR4_4_17t7tl43y7qed.R.inc(391);
		__CLR4_4_17t7tl43y7qed.R.inc(392);while ((((x != root && isBlack(x))&&(__CLR4_4_17t7tl43y7qed.R.iget(393)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(394)==0&false))) {{

			__CLR4_4_17t7tl43y7qed.R.inc(395);if ((((x == x.parent.left)&&(__CLR4_4_17t7tl43y7qed.R.iget(396)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(397)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(398);RedBlackNode w = (RedBlackNode) x.parent.right;
				__CLR4_4_17t7tl43y7qed.R.inc(399);if ((((isRed(w))&&(__CLR4_4_17t7tl43y7qed.R.iget(400)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(401)==0&false))) {{ // case 1 - sibling is red
					__CLR4_4_17t7tl43y7qed.R.inc(402);w.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(403);((RedBlackNode) x.parent).color = ColorEnum.RED;
					__CLR4_4_17t7tl43y7qed.R.inc(404);rotateLeft(x.parent);
					__CLR4_4_17t7tl43y7qed.R.inc(405);w = (RedBlackNode) x.parent.right; // converted to case 2, 3 or 4
				}
				// case 2 sibling is black and both of its children are black
				}__CLR4_4_17t7tl43y7qed.R.inc(406);if ((((isBlack(w.left) && isBlack(w.right))&&(__CLR4_4_17t7tl43y7qed.R.iget(407)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(408)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(409);w.color = ColorEnum.RED;
					__CLR4_4_17t7tl43y7qed.R.inc(410);x = (RedBlackNode) x.parent;
				} }else {__CLR4_4_17t7tl43y7qed.R.inc(411);if ((((w != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(412)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(413)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(414);if ((((isBlack(w.right))&&(__CLR4_4_17t7tl43y7qed.R.iget(415)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(416)==0&false))) {{ // case 3 sibling is black and its left child is red and right child is
											// black
						__CLR4_4_17t7tl43y7qed.R.inc(417);((RedBlackNode) w.left).color = ColorEnum.BLACK;
						__CLR4_4_17t7tl43y7qed.R.inc(418);w.color = ColorEnum.RED;
						__CLR4_4_17t7tl43y7qed.R.inc(419);rotateRight(w);
						__CLR4_4_17t7tl43y7qed.R.inc(420);w = (RedBlackNode) x.parent.right;
					}
					}__CLR4_4_17t7tl43y7qed.R.inc(421);w.color = ((RedBlackNode) x.parent).color; // case 4 sibling is black and right child is red
					__CLR4_4_17t7tl43y7qed.R.inc(422);((RedBlackNode) x.parent).color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(423);((RedBlackNode) w.right).color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(424);rotateLeft(x.parent);
					__CLR4_4_17t7tl43y7qed.R.inc(425);x = (RedBlackNode) root;
				} }else {{
					__CLR4_4_17t7tl43y7qed.R.inc(426);x.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(427);x = (RedBlackNode) x.parent;
				}
			}}} }else {{
				__CLR4_4_17t7tl43y7qed.R.inc(428);RedBlackNode w = (RedBlackNode) x.parent.left;
				__CLR4_4_17t7tl43y7qed.R.inc(429);if ((((isRed(w))&&(__CLR4_4_17t7tl43y7qed.R.iget(430)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(431)==0&false))) {{ // case 1 - sibling is red
					__CLR4_4_17t7tl43y7qed.R.inc(432);w.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(433);((RedBlackNode) x.parent).color = ColorEnum.RED;
					__CLR4_4_17t7tl43y7qed.R.inc(434);rotateRight(x.parent);
					__CLR4_4_17t7tl43y7qed.R.inc(435);w = (RedBlackNode) x.parent.left; // converted to case 2, 3 or 4
				}
				// case 2 sibling is black and both of its children are black
				}__CLR4_4_17t7tl43y7qed.R.inc(436);if ((((isBlack(w.left) && isBlack(w.right))&&(__CLR4_4_17t7tl43y7qed.R.iget(437)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(438)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(439);w.color = ColorEnum.RED;
					__CLR4_4_17t7tl43y7qed.R.inc(440);x = (RedBlackNode) x.parent;
				} }else {__CLR4_4_17t7tl43y7qed.R.inc(441);if ((((w != nilNode)&&(__CLR4_4_17t7tl43y7qed.R.iget(442)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(443)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(444);if ((((isBlack(w.left))&&(__CLR4_4_17t7tl43y7qed.R.iget(445)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(446)==0&false))) {{ // case 3 sibling is black and its right child is red and left child is black
						__CLR4_4_17t7tl43y7qed.R.inc(447);((RedBlackNode) w.right).color = ColorEnum.BLACK;
						__CLR4_4_17t7tl43y7qed.R.inc(448);w.color = ColorEnum.RED;
						__CLR4_4_17t7tl43y7qed.R.inc(449);rotateLeft(w);
						__CLR4_4_17t7tl43y7qed.R.inc(450);w = (RedBlackNode) x.parent.left;
					}
					}__CLR4_4_17t7tl43y7qed.R.inc(451);w.color = ((RedBlackNode) x.parent).color; // case 4 sibling is black and left child is red
					__CLR4_4_17t7tl43y7qed.R.inc(452);((RedBlackNode) x.parent).color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(453);((RedBlackNode) w.left).color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(454);rotateRight(x.parent);
					__CLR4_4_17t7tl43y7qed.R.inc(455);x = (RedBlackNode) root;
				} }else {{
					__CLR4_4_17t7tl43y7qed.R.inc(456);x.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(457);x = (RedBlackNode) x.parent;
				}
			}}}

		}}
	}}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	private boolean isBlack(Node node) {try{__CLR4_4_17t7tl43y7qed.R.inc(458);
		__CLR4_4_17t7tl43y7qed.R.inc(459);return (((node != null )&&(__CLR4_4_17t7tl43y7qed.R.iget(460)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(461)==0&false))? ((RedBlackNode) node).color == ColorEnum.BLACK : false;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	private boolean isRed(Node node) {try{__CLR4_4_17t7tl43y7qed.R.inc(462);
		__CLR4_4_17t7tl43y7qed.R.inc(463);return (((node != null )&&(__CLR4_4_17t7tl43y7qed.R.iget(464)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(465)==0&false))? ((RedBlackNode) node).color == ColorEnum.RED : false;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	/**
	 * Restores Red-Black tree properties after insert if needed. Insert can break
	 * only 2 properties: root is red or if node is red then children must be black.
	 */
	private void insertRBFixup(RedBlackNode currentNode) {try{__CLR4_4_17t7tl43y7qed.R.inc(466);
		// current node is always RED, so if its parent is red it breaks
		// Red-Black property, otherwise no fixup needed and loop can terminate
		__CLR4_4_17t7tl43y7qed.R.inc(467);while ((((currentNode.parent != root && ((RedBlackNode) currentNode.parent).color == ColorEnum.RED)&&(__CLR4_4_17t7tl43y7qed.R.iget(468)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(469)==0&false))) {{
			__CLR4_4_17t7tl43y7qed.R.inc(470);RedBlackNode parent = (RedBlackNode) currentNode.parent;
			__CLR4_4_17t7tl43y7qed.R.inc(471);RedBlackNode grandParent = (RedBlackNode) parent.parent;
			__CLR4_4_17t7tl43y7qed.R.inc(472);if ((((parent == grandParent.left)&&(__CLR4_4_17t7tl43y7qed.R.iget(473)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(474)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(475);RedBlackNode uncle = (RedBlackNode) grandParent.right;
				// case1 - uncle and parent are both red
				// re color both of them to black
				__CLR4_4_17t7tl43y7qed.R.inc(476);if ((((((RedBlackNode) uncle).color == ColorEnum.RED)&&(__CLR4_4_17t7tl43y7qed.R.iget(477)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(478)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(479);parent.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(480);uncle.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(481);grandParent.color = ColorEnum.RED;
					// grandparent was recolored to red, so in next iteration we
					// check if it does not break Red-Black property
					__CLR4_4_17t7tl43y7qed.R.inc(482);currentNode = grandParent;
				}
				// case 2/3 uncle is black - then we perform rotations
				}else {{
					__CLR4_4_17t7tl43y7qed.R.inc(483);if ((((currentNode == parent.right)&&(__CLR4_4_17t7tl43y7qed.R.iget(484)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(485)==0&false))) {{ // case 2, first rotate left
						__CLR4_4_17t7tl43y7qed.R.inc(486);currentNode = parent;
						__CLR4_4_17t7tl43y7qed.R.inc(487);rotateLeft(currentNode);
					}
					// do not use parent
					}__CLR4_4_17t7tl43y7qed.R.inc(488);parent.color = ColorEnum.BLACK; // case 3
					__CLR4_4_17t7tl43y7qed.R.inc(489);grandParent.color = ColorEnum.RED;
					__CLR4_4_17t7tl43y7qed.R.inc(490);rotateRight(grandParent);
				}
			}} }else {__CLR4_4_17t7tl43y7qed.R.inc(491);if ((((parent == grandParent.right)&&(__CLR4_4_17t7tl43y7qed.R.iget(492)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(493)==0&false))) {{
				__CLR4_4_17t7tl43y7qed.R.inc(494);RedBlackNode uncle = (RedBlackNode) grandParent.left;
				// case1 - uncle and parent are both red
				// re color both of them to black
				__CLR4_4_17t7tl43y7qed.R.inc(495);if ((((((RedBlackNode) uncle).color == ColorEnum.RED)&&(__CLR4_4_17t7tl43y7qed.R.iget(496)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(497)==0&false))) {{
					__CLR4_4_17t7tl43y7qed.R.inc(498);parent.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(499);uncle.color = ColorEnum.BLACK;
					__CLR4_4_17t7tl43y7qed.R.inc(500);grandParent.color = ColorEnum.RED;
					// grandparent was recolored to red, so in next iteration we
					// check if it does not break Red-Black property
					__CLR4_4_17t7tl43y7qed.R.inc(501);currentNode = grandParent;
				}
				// case 2/3 uncle is black - then we perform rotations
				}else {{
					__CLR4_4_17t7tl43y7qed.R.inc(502);if ((((currentNode == parent.left)&&(__CLR4_4_17t7tl43y7qed.R.iget(503)!=0|true))||(__CLR4_4_17t7tl43y7qed.R.iget(504)==0&false))) {{ // case 2, first rotate right
						__CLR4_4_17t7tl43y7qed.R.inc(505);currentNode = parent;
						__CLR4_4_17t7tl43y7qed.R.inc(506);rotateRight(currentNode);
					}
					// do not use parent
					}__CLR4_4_17t7tl43y7qed.R.inc(507);parent.color = ColorEnum.BLACK; // case 3
					__CLR4_4_17t7tl43y7qed.R.inc(508);grandParent.color = ColorEnum.RED;
					__CLR4_4_17t7tl43y7qed.R.inc(509);rotateLeft(grandParent);
				}
			}}

		}}}
		// ensure root is black in case it was colored red in fixup
		}__CLR4_4_17t7tl43y7qed.R.inc(510);((RedBlackNode) root).color = ColorEnum.BLACK;
	}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}

	protected static class RedBlackNode extends Node {
		public ColorEnum color;

		public RedBlackNode(Integer value, Node parent, Node left, Node right, ColorEnum color) {
			super(value, parent, left, right);__CLR4_4_17t7tl43y7qed.R.inc(512);try{__CLR4_4_17t7tl43y7qed.R.inc(511);
			__CLR4_4_17t7tl43y7qed.R.inc(513);this.color = color;
		}finally{__CLR4_4_17t7tl43y7qed.R.flushNeeded();}}
	}

}
