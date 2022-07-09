/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public class Trie
{public static class __CLR4_4_100l43ltswy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0036\u0032\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0054\u0072\u0069\u0065\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654572636000L,8589935092L,97,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private int SIZE = 26;
    private TrieNode root;// \u701b\u6940\u5400\u93cd\u6220\u6b91\u93cd\ufffd

    class TrieNode // \u701b\u6940\u5400\u93cd\u6223\u59ad\u9410\ufffd
    {
        private int num;// \u93c8\u590a\ue63f\u704f\u621d\u5d1f\u7487\u5d89\ufffd\u6c33\u7e43\u6769\u6b0e\u91dc\u947a\u509c\u5063,\u9357\u5d07\u6571\u93cd\u7845\u56a6\u7487\u30e8\u59ad\u9410\u572d\u7c8d\u93b4\u612e\u6b91\u701b\u6943\ue0c1\u6d93\u53c9\u0101\u5bee\u5fd3\u56ad\u941c\u626e\u6b91\u5a06\u2103\u669f
        private TrieNode[] son;// \u93b5\ufffd\u93c8\u590c\u6b91\u934e\u57ae\u74d9\u947a\u509c\u5063
        private boolean isEnd;// \u93c4\ue219\u7b09\u93c4\ue21b\u6e36\u935a\u5e9d\u7af4\u6d93\ue047\u59ad\u9410\ufffd
        private char val;// \u947a\u509c\u5063\u9428\u52eb\ufffd\ufffd

        TrieNode()
        {try{__CLR4_4_100l43ltswy.R.inc(0);
            __CLR4_4_100l43ltswy.R.inc(1);num = 1;
            __CLR4_4_100l43ltswy.R.inc(2);son = new TrieNode[SIZE];
            __CLR4_4_100l43ltswy.R.inc(3);isEnd = false;
        }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}
    }
    Trie() // \u9352\u6fc6\ue750\u9356\u6827\u74e7\u934f\u544a\u7232
    {try{__CLR4_4_100l43ltswy.R.inc(4);
        __CLR4_4_100l43ltswy.R.inc(5);root = new TrieNode();
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}
    

    // \u5be4\u8679\u73db\u701b\u6940\u5400\u93cd\ufffd
    public void insert(String str) // \u9366\u3125\u74e7\u934f\u544a\u7232\u6d93\ue15f\u5f43\u934f\u30e4\u7af4\u6d93\ue044\u5d1f\u7487\ufffd
    {try{__CLR4_4_100l43ltswy.R.inc(6);
        __CLR4_4_100l43ltswy.R.inc(7);if ((((str == null || str.length() == 0)&&(__CLR4_4_100l43ltswy.R.iget(8)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(9)==0&false)))
        {{
            __CLR4_4_100l43ltswy.R.inc(10);return;
        }
        }__CLR4_4_100l43ltswy.R.inc(11);TrieNode node = root;
        __CLR4_4_100l43ltswy.R.inc(12);char[] letters = str.toCharArray();//\u704f\u55d9\u6d30\u93cd\u56e7\u5d1f\u7487\u5d88\u6d46\u93b9\ue76d\u8d1f\u701b\u6943\ue0c1\u93c1\u626e\u7c8d
        __CLR4_4_100l43ltswy.R.inc(13);for (int i = 0, len = str.length(); (((i < len)&&(__CLR4_4_100l43ltswy.R.iget(14)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(15)==0&false)); i++)
        {{
            __CLR4_4_100l43ltswy.R.inc(16);int pos = letters[i] - 'a';
            __CLR4_4_100l43ltswy.R.inc(17);if ((((node.son[pos] == null)&&(__CLR4_4_100l43ltswy.R.iget(18)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(19)==0&false)))  //\u6fe1\u509b\u7049\u8930\u64b3\u58a0\u947a\u509c\u5063\u9428\u52eb\u52b9\u701b\u612f\u59ad\u9410\u901b\u8151\u5a0c\u2103\u6e41\u7487\u30e5\u74e7\u7ed7\ufe3c\u7d1d\u9352\u6b10\u702f\u5be4\u8f70\u7af4\u6d93\u7305rieNode\u9a9e\u8dfa\ue632\u934a\u8270\ue1da\u701b\u6943\ue0c1
            {{
                __CLR4_4_100l43ltswy.R.inc(20);node.son[pos] = new TrieNode();
                __CLR4_4_100l43ltswy.R.inc(21);node.son[pos].val = letters[i];
            } 
            }else   //\u6fe1\u509b\u7049\u5bb8\u832c\u7ca1\u701b\u6a3a\u6e6a\u951b\u5c7d\u57af\u704f\u55d9\u6571\u93cd\u7845\u56a6\u7487\u30e5\u52b9\u701b\u612f\u59ad\u9410\u572d\u7c8d\u93b4\u612e\u6b91\u701b\u6943\ue0c1\u6d93\u53c9\u0101\u5bee\u5fd3\u56ad\u941c\u626e\u6b91\u5a06\u2103\u669f+1
            {{
                __CLR4_4_100l43ltswy.R.inc(22);node.son[pos].num++;
            }
            }__CLR4_4_100l43ltswy.R.inc(23);node = node.son[pos];
        }
        }__CLR4_4_100l43ltswy.R.inc(24);node.isEnd = true;
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}

    // \u7481\uff04\u757b\u9357\u66e1\u761d\u9353\u5d87\u7d11\u9428\u52ec\u669f\u95b2\ufffd
    public int countPrefix(String prefix)
    {try{__CLR4_4_100l43ltswy.R.inc(25);
        __CLR4_4_100l43ltswy.R.inc(26);if((((prefix==null||prefix.length()==0)&&(__CLR4_4_100l43ltswy.R.iget(27)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(28)==0&false)))
        {{
            __CLR4_4_100l43ltswy.R.inc(29);return-1;
        }
        }__CLR4_4_100l43ltswy.R.inc(30);TrieNode node=root;
        __CLR4_4_100l43ltswy.R.inc(31);char[]letters=prefix.toCharArray();
        __CLR4_4_100l43ltswy.R.inc(32);for(int i=0,len=prefix.length(); (((i<len)&&(__CLR4_4_100l43ltswy.R.iget(33)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(34)==0&false)); i++)
        {{
            __CLR4_4_100l43ltswy.R.inc(35);int pos=letters[i]-'a';
            __CLR4_4_100l43ltswy.R.inc(36);if((((node.son[pos]==null)&&(__CLR4_4_100l43ltswy.R.iget(37)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(38)==0&false)))
            {{
                __CLR4_4_100l43ltswy.R.inc(39);return 0;
            }
            }else
            {{
                __CLR4_4_100l43ltswy.R.inc(40);node=node.son[pos];
            }
        }}
        }__CLR4_4_100l43ltswy.R.inc(41);return node.num;
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}

    // \u93b5\u64b3\u5d43\u93b8\u56e7\u757e\u9353\u5d87\u7d11\u9428\u52eb\u5d1f\u7487\ufffd
    public String hasPrefix(String prefix)
    {try{__CLR4_4_100l43ltswy.R.inc(42);
        __CLR4_4_100l43ltswy.R.inc(43);if ((((prefix == null || prefix.length() == 0)&&(__CLR4_4_100l43ltswy.R.iget(44)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(45)==0&false)))
        {{
            __CLR4_4_100l43ltswy.R.inc(46);return null;
        }
        }__CLR4_4_100l43ltswy.R.inc(47);TrieNode node = root;
        __CLR4_4_100l43ltswy.R.inc(48);char[] letters = prefix.toCharArray();
        __CLR4_4_100l43ltswy.R.inc(49);for (int i = 0, len = prefix.length(); (((i < len)&&(__CLR4_4_100l43ltswy.R.iget(50)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(51)==0&false)); i++)
        {{
            __CLR4_4_100l43ltswy.R.inc(52);int pos = letters[i] - 'a';
            __CLR4_4_100l43ltswy.R.inc(53);if ((((node.son[pos] == null)&&(__CLR4_4_100l43ltswy.R.iget(54)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(55)==0&false)))
            {{
                __CLR4_4_100l43ltswy.R.inc(56);return null;
            }
            }else
            {{
                __CLR4_4_100l43ltswy.R.inc(57);node = node.son[pos];
            }
        }}
        }__CLR4_4_100l43ltswy.R.inc(58);preTraverse(node, prefix);
        __CLR4_4_100l43ltswy.R.inc(59);return null;
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}

    // \u95ac\u5d85\u5dfb\u7f01\u5fda\u7e43\u59dd\u3088\u59ad\u9410\u572d\u6b91\u9357\u66e1\u761d.
    public void preTraverse(TrieNode node, String prefix)
    {try{__CLR4_4_100l43ltswy.R.inc(60);
        __CLR4_4_100l43ltswy.R.inc(61);if ((((!node.isEnd)&&(__CLR4_4_100l43ltswy.R.iget(62)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(63)==0&false)))
        {{
            __CLR4_4_100l43ltswy.R.inc(64);for (TrieNode child : node.son)
            {{
                __CLR4_4_100l43ltswy.R.inc(65);if ((((child != null)&&(__CLR4_4_100l43ltswy.R.iget(66)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(67)==0&false)))
                {{
                    __CLR4_4_100l43ltswy.R.inc(68);preTraverse(child, prefix + child.val);
                }
            }}
            }__CLR4_4_100l43ltswy.R.inc(69);return;
        }
        }__CLR4_4_100l43ltswy.R.inc(70);System.out.println(prefix);
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}

    // \u9366\u3125\u74e7\u934f\u544a\u7232\u6d93\ue15f\u7161\u93b5\u53e5\u7af4\u6d93\ue044\u756c\u934f\u3125\u5c2e\u95b0\u5d87\u6b91\u9357\u66e1\u761d.
    public boolean has(String str)
    {try{__CLR4_4_100l43ltswy.R.inc(71);
        __CLR4_4_100l43ltswy.R.inc(72);if((((str==null||str.length()==0)&&(__CLR4_4_100l43ltswy.R.iget(73)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(74)==0&false)))
        {{
            __CLR4_4_100l43ltswy.R.inc(75);return false;
        }
        }__CLR4_4_100l43ltswy.R.inc(76);TrieNode node=root;
        __CLR4_4_100l43ltswy.R.inc(77);char[]letters=str.toCharArray();
        __CLR4_4_100l43ltswy.R.inc(78);for(int i=0,len=str.length(); (((i<len)&&(__CLR4_4_100l43ltswy.R.iget(79)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(80)==0&false)); i++)
        {{
            __CLR4_4_100l43ltswy.R.inc(81);int pos=letters[i]-'a';
            __CLR4_4_100l43ltswy.R.inc(82);if((((node.son[pos]!=null)&&(__CLR4_4_100l43ltswy.R.iget(83)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(84)==0&false)))
            {{
                __CLR4_4_100l43ltswy.R.inc(85);node=node.son[pos];
            }
            }else
            {{
                __CLR4_4_100l43ltswy.R.inc(86);return false;
            }
        }}
        //\u74a7\u677f\u57cc\u6769\u6b0e\u7af4\u59dd\u30ef\u7d1d\u741b\u3126\u69d1\u9359\ue21d\u5158\u7039\u5c7d\u53cf\u9356\u5f52\u53a4\u951b\u5c7d\u5f72\u9473\u4ecb\u5134\u9352\u55d7\u5c2e\u95b0\u5d8f\u7d1d\u6fe1\u509b\u7049\u93c8\ufffd\u935a\u5e9d\u7af4\u6d93\ue044\u74e7\u7ed7\ufe41\u59ad\u9410\u901b\u8d1f\u93c8\ue0a4\ue06c\u947a\u509c\u5063\u951b\u5c7d\u57af\u93c4\ue21a\u756c\u934f\u3125\u5c2e\u95b0\u5d8f\u7d1d\u935a\ufe40\u57af\u93c4\ue21e\u5134\u9352\u55d7\u5c2e\u95b0\ufffd
        }__CLR4_4_100l43ltswy.R.inc(87);return node.isEnd;
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}

    // \u9353\u5d85\u7c2d\u95ac\u5d85\u5dfb\u701b\u6940\u5400\u93cd\ufffd.
    public void preTraverse(TrieNode node)
    {try{__CLR4_4_100l43ltswy.R.inc(88);
        __CLR4_4_100l43ltswy.R.inc(89);if((((node!=null)&&(__CLR4_4_100l43ltswy.R.iget(90)!=0|true))||(__CLR4_4_100l43ltswy.R.iget(91)==0&false)))
        {{
            __CLR4_4_100l43ltswy.R.inc(92);System.out.print(node.val+"-");
            __CLR4_4_100l43ltswy.R.inc(93);for(TrieNode child:node.son)
            {{
                __CLR4_4_100l43ltswy.R.inc(94);preTraverse(child);
            }
        }}
    }}finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}

    public TrieNode getRoot()
    {try{__CLR4_4_100l43ltswy.R.inc(95);
        __CLR4_4_100l43ltswy.R.inc(96);return this.root;
    }finally{__CLR4_4_100l43ltswy.R.flushNeeded();}}
    
}
