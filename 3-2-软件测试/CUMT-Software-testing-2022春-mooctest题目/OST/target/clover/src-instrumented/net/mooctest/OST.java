/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/**
 * \u9369\u8f70\u7c2cAVL\u93cd\u621e\u58bf\u705e\u66e0\u6b91\u6924\u54c4\u7c2d\u7f01\u71bb\ue178\u93cd\ufffd
 */
public class OST<T extends Comparable<? super T>> 
implements OSS<T> {public static class __CLR4_4_100l43ltk1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0036\u0032\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004f\u0053\u0054\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654572624482L,8589935092L,556,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public Iterator<T> iterator() {try{__CLR4_4_100l43ltk1q.R.inc(0);
        __CLR4_4_100l43ltk1q.R.inc(1);return new TreeIterator();
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private final class TreeIterator implements Iterator<T> {

        private Node<T> previousNode;
        private Node<T> nextNode;
        private int expectedModCount = modCount;
        
        TreeIterator() {try{__CLR4_4_100l43ltk1q.R.inc(2);
            __CLR4_4_100l43ltk1q.R.inc(3);if ((((root == null)&&(__CLR4_4_100l43ltk1q.R.iget(4)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(5)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(6);nextNode = null;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(7);nextNode = minimumNode(root);
            }
        }}finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
        
        @Override
        public boolean hasNext() {try{__CLR4_4_100l43ltk1q.R.inc(8);
            __CLR4_4_100l43ltk1q.R.inc(9);return nextNode != null;
        }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

        @Override
        public T next() {try{__CLR4_4_100l43ltk1q.R.inc(10);
            __CLR4_4_100l43ltk1q.R.inc(11);if ((((nextNode == null)&&(__CLR4_4_100l43ltk1q.R.iget(12)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(13)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(14);throw new NoSuchElementException("Iteration exceeded.");
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(15);checkConcurrentModification();
            __CLR4_4_100l43ltk1q.R.inc(16);T datum = nextNode.key;
            __CLR4_4_100l43ltk1q.R.inc(17);previousNode = nextNode;
            __CLR4_4_100l43ltk1q.R.inc(18);nextNode = successorOf(nextNode);
            __CLR4_4_100l43ltk1q.R.inc(19);return datum;
        }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
        
        @Override
        public void remove() {try{__CLR4_4_100l43ltk1q.R.inc(20);
            __CLR4_4_100l43ltk1q.R.inc(21);if ((((previousNode == null)&&(__CLR4_4_100l43ltk1q.R.iget(22)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(23)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(24);throw new IllegalStateException(
                        (((nextNode == null )&&(__CLR4_4_100l43ltk1q.R.iget(25)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(26)==0&false))? 
                            "Not a single call to next(); nothing to remove." :
                            "Removing the same element twice."
                );
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(27);checkConcurrentModification();
            
            __CLR4_4_100l43ltk1q.R.inc(28);Node<T> x = deleteNode(previousNode);
            __CLR4_4_100l43ltk1q.R.inc(29);fixAfterModification(x, false);
            
            __CLR4_4_100l43ltk1q.R.inc(30);if ((((x == nextNode)&&(__CLR4_4_100l43ltk1q.R.iget(31)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(32)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(33);nextNode = previousNode;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(34);modCount += decrementSize();
            __CLR4_4_100l43ltk1q.R.inc(35);expectedModCount = modCount;
            __CLR4_4_100l43ltk1q.R.inc(36);previousNode = null;
        }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
        
        private void checkConcurrentModification() {try{__CLR4_4_100l43ltk1q.R.inc(37);
            __CLR4_4_100l43ltk1q.R.inc(38);if ((((expectedModCount != modCount)&&(__CLR4_4_100l43ltk1q.R.iget(39)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(40)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(41);throw new ConcurrentModificationException(
                        "The set was modified while iterating.");
            }
        }}finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    }

    @Override
    public Object[] toArray() {try{__CLR4_4_100l43ltk1q.R.inc(42);
        __CLR4_4_100l43ltk1q.R.inc(43);Object[] array = new Object[size];
        __CLR4_4_100l43ltk1q.R.inc(44);Iterator<T> iterator = iterator();
        __CLR4_4_100l43ltk1q.R.inc(45);int index = 0;
        
        __CLR4_4_100l43ltk1q.R.inc(46);while ((((iterator.hasNext())&&(__CLR4_4_100l43ltk1q.R.iget(47)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(48)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(49);array[index++] = iterator.next();
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(50);return array;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    @Override
    public <T> T[] toArray(T[] a) {try{__CLR4_4_100l43ltk1q.R.inc(51);
        __CLR4_4_100l43ltk1q.R.inc(52);Iterator iterator = iterator();
        
        __CLR4_4_100l43ltk1q.R.inc(53);if ((((size > a.length)&&(__CLR4_4_100l43ltk1q.R.iget(54)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(55)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(56);a = Arrays.copyOf(a, size);
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(57);int index = 0; 

        __CLR4_4_100l43ltk1q.R.inc(58);for (; (((index < size)&&(__CLR4_4_100l43ltk1q.R.iget(59)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(60)==0&false)); ++index) {{
            __CLR4_4_100l43ltk1q.R.inc(61);a[index] = (T) iterator.next();
        }

        }__CLR4_4_100l43ltk1q.R.inc(62);if ((((index < a.length)&&(__CLR4_4_100l43ltk1q.R.iget(63)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(64)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(65);a[index] = null;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(66);return a;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    @Override
    public boolean containsAll(Collection<?> c) {try{__CLR4_4_100l43ltk1q.R.inc(67);
        __CLR4_4_100l43ltk1q.R.inc(68);for (Object element : c) {{
            __CLR4_4_100l43ltk1q.R.inc(69);if ((((!contains((T) element))&&(__CLR4_4_100l43ltk1q.R.iget(70)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(71)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(72);return false;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(73);return true;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    @Override
    public boolean addAll(Collection<? extends T> c) {try{__CLR4_4_100l43ltk1q.R.inc(74);
        __CLR4_4_100l43ltk1q.R.inc(75);boolean modified = false;
        
        __CLR4_4_100l43ltk1q.R.inc(76);for (T element : c) {{
            __CLR4_4_100l43ltk1q.R.inc(77);if ((((add(element))&&(__CLR4_4_100l43ltk1q.R.iget(78)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(79)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(80);modified = true;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(81);return modified;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    @Override
    public boolean retainAll(Collection<?> c) {try{__CLR4_4_100l43ltk1q.R.inc(82);
        __CLR4_4_100l43ltk1q.R.inc(83);if ((((!c.getClass().equals(HashSet.class.getClass()))&&(__CLR4_4_100l43ltk1q.R.iget(84)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(85)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(86);c = new HashSet<>(c);
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(87);Iterator<T> iterator = iterator();
        __CLR4_4_100l43ltk1q.R.inc(88);boolean modified = false;
        
        __CLR4_4_100l43ltk1q.R.inc(89);while ((((iterator.hasNext())&&(__CLR4_4_100l43ltk1q.R.iget(90)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(91)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(92);T element = iterator.next();
            
            __CLR4_4_100l43ltk1q.R.inc(93);if ((((!c.contains(element))&&(__CLR4_4_100l43ltk1q.R.iget(94)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(95)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(96);iterator.remove();
                __CLR4_4_100l43ltk1q.R.inc(97);modified = true;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(98);return modified;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    @Override
    public boolean removeAll(Collection<?> c) {try{__CLR4_4_100l43ltk1q.R.inc(99);
        __CLR4_4_100l43ltk1q.R.inc(100);boolean modified = false;
        
        __CLR4_4_100l43ltk1q.R.inc(101);for (Object element : c) {{
            __CLR4_4_100l43ltk1q.R.inc(102);if ((((remove((T) element))&&(__CLR4_4_100l43ltk1q.R.iget(103)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(104)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(105);modified = true;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(106);return modified;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    private static final class Node<T> {
        T key;
        
        Node<T> parent;
        Node<T> left;
        Node<T> right;
        
        int height;
        int count;
        
        Node(T key) {try{__CLR4_4_100l43ltk1q.R.inc(107);
            __CLR4_4_100l43ltk1q.R.inc(108);this.key = key;
        }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    }
    
    private Node<T> root;
    private int size;
    private int modCount;
    
    @Override
    public boolean add(T element) {try{__CLR4_4_100l43ltk1q.R.inc(109);
        __CLR4_4_100l43ltk1q.R.inc(110);Objects.requireNonNull(element, "The input element is null.");
        
        __CLR4_4_100l43ltk1q.R.inc(111);if ((((root == null)&&(__CLR4_4_100l43ltk1q.R.iget(112)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(113)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(114);root = new Node<>(element);
            __CLR4_4_100l43ltk1q.R.inc(115);size = 1;
            __CLR4_4_100l43ltk1q.R.inc(116);modCount++;
            __CLR4_4_100l43ltk1q.R.inc(117);return true;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(118);Node<T> parent = null;
        __CLR4_4_100l43ltk1q.R.inc(119);Node<T> node = root;
        __CLR4_4_100l43ltk1q.R.inc(120);int cmp;
        
        __CLR4_4_100l43ltk1q.R.inc(121);while ((((node != null)&&(__CLR4_4_100l43ltk1q.R.iget(122)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(123)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(124);cmp = element.compareTo(node.key);
            
            __CLR4_4_100l43ltk1q.R.inc(125);if ((((cmp == 0)&&(__CLR4_4_100l43ltk1q.R.iget(126)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(127)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(128);return false;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(129);parent = node;
            
            __CLR4_4_100l43ltk1q.R.inc(130);if ((((cmp < 0)&&(__CLR4_4_100l43ltk1q.R.iget(131)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(132)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(133);node = node.left;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(134);node = node.right;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(135);Node<T> newnode = new Node<>(element);
        
        __CLR4_4_100l43ltk1q.R.inc(136);if ((((element.compareTo(parent.key) < 0)&&(__CLR4_4_100l43ltk1q.R.iget(137)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(138)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(139);parent.left = newnode;
        } }else {{
            __CLR4_4_100l43ltk1q.R.inc(140);parent.right = newnode;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(141);newnode.parent = parent;
        __CLR4_4_100l43ltk1q.R.inc(142);size++;
        __CLR4_4_100l43ltk1q.R.inc(143);modCount++;
        __CLR4_4_100l43ltk1q.R.inc(144);Node<T> hi = parent;
        __CLR4_4_100l43ltk1q.R.inc(145);Node<T> lo = newnode;
        
        __CLR4_4_100l43ltk1q.R.inc(146);while ((((hi != null)&&(__CLR4_4_100l43ltk1q.R.iget(147)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(148)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(149);if ((((hi.left == lo)&&(__CLR4_4_100l43ltk1q.R.iget(150)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(151)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(152);hi.count++;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(153);lo = hi;
            __CLR4_4_100l43ltk1q.R.inc(154);hi = hi.parent;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(155);fixAfterModification(newnode, true);
        __CLR4_4_100l43ltk1q.R.inc(156);return true;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public boolean contains(Object o) {try{__CLR4_4_100l43ltk1q.R.inc(157);
        __CLR4_4_100l43ltk1q.R.inc(158);T element = (T) o;
        __CLR4_4_100l43ltk1q.R.inc(159);Node<T> x = root;
        __CLR4_4_100l43ltk1q.R.inc(160);int cmp;
        
        __CLR4_4_100l43ltk1q.R.inc(161);while (x != null && (cmp = element.compareTo(x.key)) != 0) {{
            __CLR4_4_100l43ltk1q.R.inc(164);if ((((cmp < 0)&&(__CLR4_4_100l43ltk1q.R.iget(165)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(166)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(167);x = x.left;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(168);x = x.right;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(169);return x != null;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public boolean remove(Object o) {try{__CLR4_4_100l43ltk1q.R.inc(170);
        __CLR4_4_100l43ltk1q.R.inc(171);T element = (T) o;
        __CLR4_4_100l43ltk1q.R.inc(172);Node<T> x = root;
        __CLR4_4_100l43ltk1q.R.inc(173);int cmp;
        
        __CLR4_4_100l43ltk1q.R.inc(174);while (x != null && (cmp = element.compareTo(x.key)) != 0) {{
            __CLR4_4_100l43ltk1q.R.inc(177);if ((((cmp < 0)&&(__CLR4_4_100l43ltk1q.R.iget(178)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(179)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(180);x = x.left;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(181);x = x.right;
            }
        }}
        
        }__CLR4_4_100l43ltk1q.R.inc(182);if ((((x == null)&&(__CLR4_4_100l43ltk1q.R.iget(183)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(184)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(185);return false;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(186);x = deleteNode(x);
        __CLR4_4_100l43ltk1q.R.inc(187);fixAfterModification(x, false);
        __CLR4_4_100l43ltk1q.R.inc(188);modCount += decrementSize();
        __CLR4_4_100l43ltk1q.R.inc(189);return true;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public T get(int index) {try{__CLR4_4_100l43ltk1q.R.inc(190);
        __CLR4_4_100l43ltk1q.R.inc(191);checkIndex(index);
        __CLR4_4_100l43ltk1q.R.inc(192);Node<T> node = root;
        
        __CLR4_4_100l43ltk1q.R.inc(193);while (true) {{
            __CLR4_4_100l43ltk1q.R.inc(194);if ((((index > node.count)&&(__CLR4_4_100l43ltk1q.R.iget(195)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(196)==0&false))) {{ 
                __CLR4_4_100l43ltk1q.R.inc(197);index -= node.count + 1;
                __CLR4_4_100l43ltk1q.R.inc(198);node = node.right;
            } }else {__CLR4_4_100l43ltk1q.R.inc(199);if ((((index < node.count)&&(__CLR4_4_100l43ltk1q.R.iget(200)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(201)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(202);node = node.left;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(203);return node.key;
            }
        }}}
    }}finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public int indexOf(T element) {try{__CLR4_4_100l43ltk1q.R.inc(204);
        __CLR4_4_100l43ltk1q.R.inc(205);Node<T> node = root;
        
        __CLR4_4_100l43ltk1q.R.inc(206);if ((((root == null)&&(__CLR4_4_100l43ltk1q.R.iget(207)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(208)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(209);return -1;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(210);int rank = root.count;
        __CLR4_4_100l43ltk1q.R.inc(211);int cmp;
        
        __CLR4_4_100l43ltk1q.R.inc(212);while ((((node != null)&&(__CLR4_4_100l43ltk1q.R.iget(213)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(214)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(215);if ((cmp = element.compareTo(node.key)) < 0) {{
                __CLR4_4_100l43ltk1q.R.inc(218);if ((((node.left == null)&&(__CLR4_4_100l43ltk1q.R.iget(219)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(220)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(221);return -1;
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(222);rank -= (node.count - node.left.count);
                __CLR4_4_100l43ltk1q.R.inc(223);node = node.left;
            } }else {__CLR4_4_100l43ltk1q.R.inc(224);if ((((cmp > 0)&&(__CLR4_4_100l43ltk1q.R.iget(225)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(226)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(227);if ((((node.right == null)&&(__CLR4_4_100l43ltk1q.R.iget(228)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(229)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(230);return -1;
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(231);rank += 1 + node.right.count;
                __CLR4_4_100l43ltk1q.R.inc(232);node = node.right;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(233);break;
            }
        }}}
        
        }__CLR4_4_100l43ltk1q.R.inc(234);return (((node == null )&&(__CLR4_4_100l43ltk1q.R.iget(235)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(236)==0&false))? -1 : rank;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public int size() {try{__CLR4_4_100l43ltk1q.R.inc(237);
        __CLR4_4_100l43ltk1q.R.inc(238);return size;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public boolean isEmpty() {try{__CLR4_4_100l43ltk1q.R.inc(239);
        __CLR4_4_100l43ltk1q.R.inc(240);return size == 0;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    @Override
    public void clear() {try{__CLR4_4_100l43ltk1q.R.inc(241);
        __CLR4_4_100l43ltk1q.R.inc(242);modCount += size;
        __CLR4_4_100l43ltk1q.R.inc(243);root = null;
        __CLR4_4_100l43ltk1q.R.inc(244);size = 0; 
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private Node<T> successorOf(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(245);
        __CLR4_4_100l43ltk1q.R.inc(246);if ((((node.right != null)&&(__CLR4_4_100l43ltk1q.R.iget(247)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(248)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(249);node = node.right;
            
            __CLR4_4_100l43ltk1q.R.inc(250);while ((((node.left != null)&&(__CLR4_4_100l43ltk1q.R.iget(251)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(252)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(253);node = node.left;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(254);return node;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(255);Node<T> parent = node.parent;
        
        __CLR4_4_100l43ltk1q.R.inc(256);while ((((parent != null && parent.right == node)&&(__CLR4_4_100l43ltk1q.R.iget(257)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(258)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(259);node = parent;
            __CLR4_4_100l43ltk1q.R.inc(260);parent = parent.parent;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(261);return parent;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private void checkIndex(int index) {try{__CLR4_4_100l43ltk1q.R.inc(262);
        __CLR4_4_100l43ltk1q.R.inc(263);if ((((index < 0)&&(__CLR4_4_100l43ltk1q.R.iget(264)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(265)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(266);throw new IndexOutOfBoundsException(
                    "The input index is negative: " + index);
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(267);if ((((index >= size)&&(__CLR4_4_100l43ltk1q.R.iget(268)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(269)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(270);throw new IndexOutOfBoundsException(
                    "The input index is too large: " + index +
                    ", the size of this tree is " + size);
        }
    }}finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private Node<T> deleteNode(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(271);
        __CLR4_4_100l43ltk1q.R.inc(272);if ((((node.left == null && node.right == null)&&(__CLR4_4_100l43ltk1q.R.iget(273)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(274)==0&false))) {{
            // node\u93c3\u72b2\u74d9\u947a\u509c\u5063
            __CLR4_4_100l43ltk1q.R.inc(275);Node<T> parent = node.parent;
            
            __CLR4_4_100l43ltk1q.R.inc(276);if ((((parent == null)&&(__CLR4_4_100l43ltk1q.R.iget(277)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(278)==0&false))) {{
                // node\u6d93\u70d8\u7274\u947a\u509c\u5063
                __CLR4_4_100l43ltk1q.R.inc(279);root = null;
                __CLR4_4_100l43ltk1q.R.inc(280);size = 0;
                __CLR4_4_100l43ltk1q.R.inc(281);++modCount;
                __CLR4_4_100l43ltk1q.R.inc(282);return node;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(283);Node<T> lo = node;
            __CLR4_4_100l43ltk1q.R.inc(284);Node<T> hi = parent;
            
            __CLR4_4_100l43ltk1q.R.inc(285);while ((((hi != null)&&(__CLR4_4_100l43ltk1q.R.iget(286)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(287)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(288);if ((((hi.left == lo)&&(__CLR4_4_100l43ltk1q.R.iget(289)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(290)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(291);hi.count--;
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(292);lo = hi;
                __CLR4_4_100l43ltk1q.R.inc(293);hi = hi.parent;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(294);if ((((node == parent.left)&&(__CLR4_4_100l43ltk1q.R.iget(295)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(296)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(297);parent.left = null;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(298);parent.right = null;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(299);return node;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(300);if ((((node.left == null || node.right == null)&&(__CLR4_4_100l43ltk1q.R.iget(301)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(302)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(303);Node<T> child;
            
            // node\u9359\ue045\u6e41\u6d93\ufffd\u6d93\ue044\u74d9\u947a\u509c\u5063
            __CLR4_4_100l43ltk1q.R.inc(304);if ((((node.left != null)&&(__CLR4_4_100l43ltk1q.R.iget(305)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(306)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(307);child = node.left;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(308);child = node.right;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(309);Node<T> parent = node.parent;
            __CLR4_4_100l43ltk1q.R.inc(310);child.parent = parent;
            
            __CLR4_4_100l43ltk1q.R.inc(311);if ((((parent == null)&&(__CLR4_4_100l43ltk1q.R.iget(312)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(313)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(314);root = child;
                __CLR4_4_100l43ltk1q.R.inc(315);return node;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(316);if ((((node == parent.left)&&(__CLR4_4_100l43ltk1q.R.iget(317)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(318)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(319);parent.left = child;
            } }else {{
                __CLR4_4_100l43ltk1q.R.inc(320);parent.right = child;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(321);Node<T> hi = parent;
            __CLR4_4_100l43ltk1q.R.inc(322);Node<T> lo = child;
            
            __CLR4_4_100l43ltk1q.R.inc(323);while ((((hi != null)&&(__CLR4_4_100l43ltk1q.R.iget(324)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(325)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(326);if ((((hi.left == lo)&&(__CLR4_4_100l43ltk1q.R.iget(327)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(328)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(329);hi.count--;
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(330);lo = hi;
                __CLR4_4_100l43ltk1q.R.inc(331);hi = hi.parent;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(332);return node;
        }
        
        // node\u93c8\ufffd2\u6d93\ue044\u74d9\u947a\u509c\u5063
        }__CLR4_4_100l43ltk1q.R.inc(333);T tmpKey = node.key;
        __CLR4_4_100l43ltk1q.R.inc(334);Node<T> successor = minimumNode(node.right);
        __CLR4_4_100l43ltk1q.R.inc(335);node.key = successor.key;
        __CLR4_4_100l43ltk1q.R.inc(336);Node<T> child = successor.right;
        __CLR4_4_100l43ltk1q.R.inc(337);Node<T> parent = successor.parent;
        
        __CLR4_4_100l43ltk1q.R.inc(338);if ((((parent.left == successor)&&(__CLR4_4_100l43ltk1q.R.iget(339)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(340)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(341);parent.left = child;
        } }else {{
            __CLR4_4_100l43ltk1q.R.inc(342);parent.right = child;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(343);if ((((child != null)&&(__CLR4_4_100l43ltk1q.R.iget(344)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(345)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(346);child.parent = parent;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(347);Node<T> lo = child;
        __CLR4_4_100l43ltk1q.R.inc(348);Node<T> hi = parent;
        
        __CLR4_4_100l43ltk1q.R.inc(349);while ((((hi != null)&&(__CLR4_4_100l43ltk1q.R.iget(350)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(351)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(352);if ((((hi.left == lo)&&(__CLR4_4_100l43ltk1q.R.iget(353)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(354)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(355);hi.count--;
            }
            
            }__CLR4_4_100l43ltk1q.R.inc(356);lo = hi;
            __CLR4_4_100l43ltk1q.R.inc(357);hi = hi.parent;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(358);successor.key = tmpKey;
        __CLR4_4_100l43ltk1q.R.inc(359);return successor;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    private int decrementSize() {try{__CLR4_4_100l43ltk1q.R.inc(360);
        __CLR4_4_100l43ltk1q.R.inc(361);if ((((size > 0)&&(__CLR4_4_100l43ltk1q.R.iget(362)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(363)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(364);size--;
            __CLR4_4_100l43ltk1q.R.inc(365);return 1;
        }
        }__CLR4_4_100l43ltk1q.R.inc(366);return 0;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}

    private Node<T> minimumNode(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(367);
        __CLR4_4_100l43ltk1q.R.inc(368);while ((((node.left != null)&&(__CLR4_4_100l43ltk1q.R.iget(369)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(370)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(371);node = node.left;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(372);return node;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
     
    private int height(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(373);
        __CLR4_4_100l43ltk1q.R.inc(374);return (((node == null )&&(__CLR4_4_100l43ltk1q.R.iget(375)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(376)==0&false))? -1 : node.height;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private Node<T> leftRotate(Node<T> node1) {try{__CLR4_4_100l43ltk1q.R.inc(377);
        __CLR4_4_100l43ltk1q.R.inc(378);Node<T> node2 = node1.right;
        __CLR4_4_100l43ltk1q.R.inc(379);node2.parent = node1.parent;
        __CLR4_4_100l43ltk1q.R.inc(380);node1.parent = node2;
        __CLR4_4_100l43ltk1q.R.inc(381);node1.right = node2.left;
        __CLR4_4_100l43ltk1q.R.inc(382);node2.left = node1;
        
        __CLR4_4_100l43ltk1q.R.inc(383);if ((((node1.right != null)&&(__CLR4_4_100l43ltk1q.R.iget(384)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(385)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(386);node1.right.parent = node1;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(387);node1.height = Math.max(height(node1.left), height(node1.right)) + 1;
        __CLR4_4_100l43ltk1q.R.inc(388);node2.height = Math.max(height(node2.left), height(node2.right)) + 1;
        __CLR4_4_100l43ltk1q.R.inc(389);node2.count += node1.count + 1;
        __CLR4_4_100l43ltk1q.R.inc(390);return node2;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private Node<T> rightRotate(Node<T> node1) {try{__CLR4_4_100l43ltk1q.R.inc(391);
        __CLR4_4_100l43ltk1q.R.inc(392);Node<T> node2 = node1.left;
        __CLR4_4_100l43ltk1q.R.inc(393);node2.parent = node1.parent;
        __CLR4_4_100l43ltk1q.R.inc(394);node1.parent = node2;
        __CLR4_4_100l43ltk1q.R.inc(395);node1.left = node2.right;
        __CLR4_4_100l43ltk1q.R.inc(396);node2.right = node1;
        
        __CLR4_4_100l43ltk1q.R.inc(397);if ((((node1.left != null)&&(__CLR4_4_100l43ltk1q.R.iget(398)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(399)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(400);node1.left.parent = node1;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(401);node1.height = Math.max(height(node1.left), height(node1.right)) + 1;
        __CLR4_4_100l43ltk1q.R.inc(402);node2.height = Math.max(height(node2.left), height(node2.right)) + 1;
        __CLR4_4_100l43ltk1q.R.inc(403);node1.count -= node2.count + 1;
        __CLR4_4_100l43ltk1q.R.inc(404);return node2;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private Node<T> rightLeftRotate(Node<T> node1) {try{__CLR4_4_100l43ltk1q.R.inc(405);
        __CLR4_4_100l43ltk1q.R.inc(406);Node<T> node2 = node1.right;
        __CLR4_4_100l43ltk1q.R.inc(407);node1.right = rightRotate(node2);
        __CLR4_4_100l43ltk1q.R.inc(408);return leftRotate(node1);
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private Node<T> leftRightRotate(Node<T> node1) {try{__CLR4_4_100l43ltk1q.R.inc(409);
        __CLR4_4_100l43ltk1q.R.inc(410);Node<T> node2 = node1.left;
        __CLR4_4_100l43ltk1q.R.inc(411);node1.left = leftRotate(node2);
        __CLR4_4_100l43ltk1q.R.inc(412);return rightRotate(node1);
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private void fixAfterModification(Node<T> node, boolean insertionMode) {try{__CLR4_4_100l43ltk1q.R.inc(413);
        __CLR4_4_100l43ltk1q.R.inc(414);Node<T> parent = node.parent;
        __CLR4_4_100l43ltk1q.R.inc(415);Node<T> grandParent;
        __CLR4_4_100l43ltk1q.R.inc(416);Node<T> subTree;
        
        __CLR4_4_100l43ltk1q.R.inc(417);while ((((parent != null)&&(__CLR4_4_100l43ltk1q.R.iget(418)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(419)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(420);if ((((height(parent.left) == height(parent.right) + 2)&&(__CLR4_4_100l43ltk1q.R.iget(421)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(422)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(423);grandParent = parent.parent;
                
                __CLR4_4_100l43ltk1q.R.inc(424);if ((((height(parent.left.left) >= height(parent.left.right))&&(__CLR4_4_100l43ltk1q.R.iget(425)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(426)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(427);subTree = rightRotate(parent);
                } }else {{
                    __CLR4_4_100l43ltk1q.R.inc(428);subTree = leftRightRotate(parent);
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(429);if ((((grandParent == null)&&(__CLR4_4_100l43ltk1q.R.iget(430)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(431)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(432);root = subTree;
                } }else {__CLR4_4_100l43ltk1q.R.inc(433);if ((((grandParent.left == parent)&&(__CLR4_4_100l43ltk1q.R.iget(434)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(435)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(436);grandParent.left = subTree;
                } }else {{
                    __CLR4_4_100l43ltk1q.R.inc(437);grandParent.right = subTree;
                }
                
                }}__CLR4_4_100l43ltk1q.R.inc(438);if ((((grandParent != null)&&(__CLR4_4_100l43ltk1q.R.iget(439)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(440)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(441);grandParent.height = Math.max(
                            height(grandParent.left),
                            height(grandParent.right)) + 1;
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(442);if ((((insertionMode)&&(__CLR4_4_100l43ltk1q.R.iget(443)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(444)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(445);return;
                }
            }} }else {__CLR4_4_100l43ltk1q.R.inc(446);if ((((height(parent.right) == height(parent.left) + 2)&&(__CLR4_4_100l43ltk1q.R.iget(447)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(448)==0&false))) {{
                __CLR4_4_100l43ltk1q.R.inc(449);grandParent = parent.parent;
                
                __CLR4_4_100l43ltk1q.R.inc(450);if ((((height(parent.right.right) >= height(parent.right.left))&&(__CLR4_4_100l43ltk1q.R.iget(451)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(452)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(453);subTree = leftRotate(parent);
                } }else {{
                    __CLR4_4_100l43ltk1q.R.inc(454);subTree = rightLeftRotate(parent);
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(455);if ((((grandParent == null)&&(__CLR4_4_100l43ltk1q.R.iget(456)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(457)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(458);root = subTree;
                } }else {__CLR4_4_100l43ltk1q.R.inc(459);if ((((grandParent.left == parent)&&(__CLR4_4_100l43ltk1q.R.iget(460)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(461)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(462);grandParent.left = subTree;
                } }else {{
                    __CLR4_4_100l43ltk1q.R.inc(463);grandParent.right = subTree;
                }
                
                }}__CLR4_4_100l43ltk1q.R.inc(464);if ((((grandParent != null)&&(__CLR4_4_100l43ltk1q.R.iget(465)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(466)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(467);grandParent.height =
                            Math.max(height(grandParent.left),
                                     height(grandParent.right)) + 1;
                }
                
                }__CLR4_4_100l43ltk1q.R.inc(468);if ((((insertionMode)&&(__CLR4_4_100l43ltk1q.R.iget(469)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(470)==0&false))) {{
                    __CLR4_4_100l43ltk1q.R.inc(471);return;
                }
            }}
            
            }}__CLR4_4_100l43ltk1q.R.inc(472);parent.height = Math.max(height(parent.left), 
                                     height(parent.right)) + 1;
            __CLR4_4_100l43ltk1q.R.inc(473);parent = parent.parent;
        }
    }}finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    public boolean isHealthy() {try{__CLR4_4_100l43ltk1q.R.inc(474);
        __CLR4_4_100l43ltk1q.R.inc(475);if ((((root == null)&&(__CLR4_4_100l43ltk1q.R.iget(476)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(477)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(478);return true;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(479);return !containsCycles() 
                && heightsAreCorrect() 
                && isBalanced()
                && isWellIndexed();
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private boolean containsCycles() {try{__CLR4_4_100l43ltk1q.R.inc(480);
        __CLR4_4_100l43ltk1q.R.inc(481);Set<Node<T>> visitedNodes = new HashSet<>();
        __CLR4_4_100l43ltk1q.R.inc(482);return containsCycles(root, visitedNodes);
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private boolean containsCycles(Node<T> current, Set<Node<T>> visitedNodes) {try{__CLR4_4_100l43ltk1q.R.inc(483);
        __CLR4_4_100l43ltk1q.R.inc(484);if ((((current == null)&&(__CLR4_4_100l43ltk1q.R.iget(485)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(486)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(487);return false;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(488);if ((((visitedNodes.contains(current))&&(__CLR4_4_100l43ltk1q.R.iget(489)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(490)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(491);return true;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(492);visitedNodes.add(current);
        
        __CLR4_4_100l43ltk1q.R.inc(493);return containsCycles(current.left, visitedNodes) 
                || containsCycles(current.right, visitedNodes);
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private boolean heightsAreCorrect() {try{__CLR4_4_100l43ltk1q.R.inc(494);
        __CLR4_4_100l43ltk1q.R.inc(495);return getHeight(root) == root.height;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private int getHeight(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(496);
        __CLR4_4_100l43ltk1q.R.inc(497);if ((((node == null)&&(__CLR4_4_100l43ltk1q.R.iget(498)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(499)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(500);return -1;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(501);int leftTreeHeight = getHeight(node.left);
        
        __CLR4_4_100l43ltk1q.R.inc(502);if ((((leftTreeHeight == Integer.MIN_VALUE)&&(__CLR4_4_100l43ltk1q.R.iget(503)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(504)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(505);return Integer.MIN_VALUE;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(506);int rightTreeHeight = getHeight(node.right);
        
        __CLR4_4_100l43ltk1q.R.inc(507);if ((((rightTreeHeight == Integer.MIN_VALUE)&&(__CLR4_4_100l43ltk1q.R.iget(508)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(509)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(510);return Integer.MIN_VALUE;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(511);if ((((node.height == Math.max(leftTreeHeight, rightTreeHeight) + 1)&&(__CLR4_4_100l43ltk1q.R.iget(512)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(513)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(514);return node.height;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(515);return Integer.MIN_VALUE;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private boolean isBalanced() {try{__CLR4_4_100l43ltk1q.R.inc(516);
        __CLR4_4_100l43ltk1q.R.inc(517);return isBalanced(root);
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private boolean isBalanced(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(518);
        __CLR4_4_100l43ltk1q.R.inc(519);if ((((node == null)&&(__CLR4_4_100l43ltk1q.R.iget(520)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(521)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(522);return true;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(523);if ((((!isBalanced(node.left))&&(__CLR4_4_100l43ltk1q.R.iget(524)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(525)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(526);return false;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(527);if ((((!isBalanced(node.right))&&(__CLR4_4_100l43ltk1q.R.iget(528)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(529)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(530);return false;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(531);int leftHeight  = height(node.left);
        __CLR4_4_100l43ltk1q.R.inc(532);int rightHeight = height(node.right);
        
        __CLR4_4_100l43ltk1q.R.inc(533);return Math.abs(leftHeight - rightHeight) < 2;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private boolean isWellIndexed() {try{__CLR4_4_100l43ltk1q.R.inc(534);
        __CLR4_4_100l43ltk1q.R.inc(535);return size == count(root);
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
    
    private int count(Node<T> node) {try{__CLR4_4_100l43ltk1q.R.inc(536);
        __CLR4_4_100l43ltk1q.R.inc(537);if ((((node == null)&&(__CLR4_4_100l43ltk1q.R.iget(538)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(539)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(540);return 0;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(541);int leftTreeSize = count(node.left);
        
        __CLR4_4_100l43ltk1q.R.inc(542);if ((((leftTreeSize == Integer.MIN_VALUE)&&(__CLR4_4_100l43ltk1q.R.iget(543)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(544)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(545);return Integer.MIN_VALUE;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(546);if ((((node.count != leftTreeSize)&&(__CLR4_4_100l43ltk1q.R.iget(547)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(548)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(549);return Integer.MIN_VALUE;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(550);int rightTreeSize = count(node.right);
        
        __CLR4_4_100l43ltk1q.R.inc(551);if ((((rightTreeSize == Integer.MIN_VALUE)&&(__CLR4_4_100l43ltk1q.R.iget(552)!=0|true))||(__CLR4_4_100l43ltk1q.R.iget(553)==0&false))) {{
            __CLR4_4_100l43ltk1q.R.inc(554);return Integer.MIN_VALUE;
        }
        
        }__CLR4_4_100l43ltk1q.R.inc(555);return leftTreeSize + 1 + rightTreeSize;
    }finally{__CLR4_4_100l43ltk1q.R.flushNeeded();}}
}
