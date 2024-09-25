import java.nio.file.*;
import java.io.IOException;
import java.util.*;

class FileHelper {
    static String[] getLines(String path) {
        try {
            return Files.readAllLines(Paths.get(path)).toArray(String[]::new);
        }
        catch(IOException e) {
            System.err.println("Error reading file " + path + ": " + e);
            return new String[]{"Error reading file " + path + ": " + e};
        }
    }
}

class WordHunt {

   public static ArrayList<ArrayList<String>> wordsearch(String strst, String path, String id, String[] args){

        String a0 = new String(args[0]); 
        String a1 = new String(args[1]); 
        String a2 = new String(args[2]);
        String a3 = new String(args[3]);
        String a4 = new String(args[4]);
        String a5 = new String(args[5]);
        String a6 = new String(args[6]);
        String a7 = new String(args[7]);
        String a8 = new String(args[8]);
        String a9 = new String(args[9]);
        String a10 = new String(args[10]);
        String a11 = new String(args[11]);
        String a12 = new String(args[12]);
        String a13 = new String(args[13]);
        String a14 = new String(args[14]);
        String a15 = new String(args[15]);

        String[] lines = FileHelper.getLines("GrepTest.txt");
        String Largest = "";
        ArrayList<ArrayList<String>> returns = new ArrayList<>();
        ArrayList<String> stringreturns = new ArrayList<>();
        ArrayList<String> pathreturns = new ArrayList<>();
        ArrayList<String> idreturns = new ArrayList<>();
        if (id.equals("a0")){
            if (!path.contains("b1")){
                stringreturns.add(strst+a1);
                pathreturns.add(path + "b1");
                idreturns.add("b1");
            }
            if (!path.contains("e4")){
                stringreturns.add(strst+a4);
                pathreturns.add(path + "e4");
                idreturns.add("e4");
            }
            if (!path.contains("f5")){
                stringreturns.add(strst+a5);
                pathreturns.add(path + "f5");
                idreturns.add("f5");
            }   
    } 
 

    if (id.equals("b1")){
        if (!path.contains("a0")){
            stringreturns.add(strst+a0);
            pathreturns.add(path + "a0");
            idreturns.add("a0");
        }
        if (!path.contains("c2")){
            stringreturns.add(strst+a2);
            pathreturns.add(path + "c2");
            idreturns.add("c2");
        }
        if (!path.contains("e4")){
            stringreturns.add(strst+a4);
            pathreturns.add(path + "e4");
            idreturns.add("e4");
        }
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
    }

    if (id.equals("c2")){
        if (!path.contains("b1")){
            stringreturns.add(strst+a1);
            pathreturns.add(path + "b1");
            idreturns.add("b1");
        }
        if (!path.contains("d3")){
            stringreturns.add(strst+a3);
            pathreturns.add(path + "d3");
            idreturns.add("d3");
        }
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("h7")){
            stringreturns.add(strst+a7);
            pathreturns.add(path + "h7");
            idreturns.add("h7");
        }
    }

    if (id.equals("d3")){
        if (!path.contains("c2")){
            stringreturns.add(strst+a2);
            pathreturns.add(path + "c2");
            idreturns.add("c2");   
    }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("h7")){
            stringreturns.add(strst+a7);
            pathreturns.add(path + "h7");
            idreturns.add("h7");
        }
    }


    if (id.equals("e4")){
        if (!path.contains("a0")){
            stringreturns.add(strst+a0);
            pathreturns.add(path + "a0");
            idreturns.add("a0");
        }
        if (!path.contains("b1")){
            stringreturns.add(strst+a1);
            pathreturns.add(path + "b1");
            idreturns.add("b1");
        }
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("i8")){
            stringreturns.add(strst+a8);
            pathreturns.add(path + "i8");
            idreturns.add("i8");
        }
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
    }

    if(id.equals("f5")){
        if (!path.contains("a0")){
            stringreturns.add(strst+a0);
            pathreturns.add(path + "a0");
            idreturns.add("a0");
        }
        if (!path.contains("b1")){
            stringreturns.add(strst+a1);
            pathreturns.add(path + "b1");
            idreturns.add("b1");
        }
        if (!path.contains("c2")){
            stringreturns.add(strst+a2);
            pathreturns.add(path + "c2");
            idreturns.add("c2");
        }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("i8")){
            stringreturns.add(strst+a8);
            pathreturns.add(path + "i8");
            idreturns.add("i8");
        } 
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
    }

    if (id.equals("g6")){
        if (!path.contains("b1")){
            stringreturns.add(strst+a1);
            pathreturns.add(path + "b1");
            idreturns.add("b1");
        }
        if (!path.contains("c2")){
            stringreturns.add(strst+a2);
            pathreturns.add(path + "c2");
            idreturns.add("c2");
        }
        if (!path.contains("d3")){
            stringreturns.add(strst+a3);
            pathreturns.add(path + "d3");
            idreturns.add("d3");
        }
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("h7")){
            stringreturns.add(strst+a7);
            pathreturns.add(path + "h7");
            idreturns.add("h7");
        }
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("l11")){
            stringreturns.add(strst+a11);
            pathreturns.add(path + "l11");
            idreturns.add("l11");
        }
    }

    if (id.equals("h7")){
        if (!path.contains("c2")){
            stringreturns.add(strst+a2);
            pathreturns.add(path + "c2");
            idreturns.add("c2");
        }
        if (!path.contains("d3")){
            stringreturns.add(strst+a3);
            pathreturns.add(path + "d3");
            idreturns.add("d3");
        }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("l11")){
            stringreturns.add(strst+a11);
            pathreturns.add(path + "l11");
            idreturns.add("l11");
        }
    }

    if (id.equals("i8")){
        if (!path.contains("e4")){
            stringreturns.add(strst+a4);
            pathreturns.add(path + "e4");
            idreturns.add("ee4");
        }
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("m12")){
            stringreturns.add(strst+a12);
            pathreturns.add(path + "m12");
            idreturns.add("m12");
        }
        if (!path.contains("n13")){
            stringreturns.add(strst+a13);
            pathreturns.add(path + "n13");
            idreturns.add("n13");
        }
    }
    
    if (id.equals("j9")){
        if (!path.contains("e4")){
            stringreturns.add(strst+a4);
            pathreturns.add(path + "e4");
            idreturns.add("e4");
        }
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("i8")){
            stringreturns.add(strst+a8);
            pathreturns.add(path + "i8");
            idreturns.add("i8");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("m12")){
            stringreturns.add(strst+a12);
            pathreturns.add(path + "m12");
            idreturns.add("m12");
        }
        if (!path.contains("n13")){
            stringreturns.add(strst+a13);
            pathreturns.add(path + "n13");
            idreturns.add("n13");
        }
        if (!path.contains("o14")){
            stringreturns.add(strst+a14);
            pathreturns.add(path + "o14");
            idreturns.add("o14");
        }
    }

    if (id.equals("k10")){
        if (!path.contains("f5")){
            stringreturns.add(strst+a5);
            pathreturns.add(path + "f5");
            idreturns.add("f5");
        }
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("h7")){
            stringreturns.add(strst+a7);
            pathreturns.add(path + "h7");
            idreturns.add("h7");
        }
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("l11")){
            stringreturns.add(strst+a11);
            pathreturns.add(path + "l11");
            idreturns.add("l11");
        }
        if (!path.contains("n13")){
            stringreturns.add(strst+a13);
            pathreturns.add(path + "n13");
            idreturns.add("n13");
        }
        if (!path.contains("o14")){
            stringreturns.add(strst+a14);
            pathreturns.add(path + "o14");
            idreturns.add("o14");
        }
        if (!path.contains("p15")){
            stringreturns.add(strst+a15);
            pathreturns.add(path + "p15");
            idreturns.add("p15");
        }
    }

    if (id.equals("l11")){
        if (!path.contains("g6")){
            stringreturns.add(strst+a6);
            pathreturns.add(path + "g6");
            idreturns.add("g6");
        }
        if (!path.contains("h7")){
            stringreturns.add(strst+a7);
            pathreturns.add(path + "h7");
            idreturns.add("h7");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("o14")){
            stringreturns.add(strst+a14);
            pathreturns.add(path + "o14");
            idreturns.add("o14");
        }
        if (!path.contains("p15")){
            stringreturns.add(strst+a15);
            pathreturns.add(path + "p15");
            idreturns.add("p15");
        }
    }

    if (id.equals("m12")){
        if (!path.contains("i8")){
            stringreturns.add(strst+a8);
            pathreturns.add(path + "i8");
            idreturns.add("i8");
        }
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("n13")){
            stringreturns.add(strst+a13);
            pathreturns.add(path + "n13");
            idreturns.add("n13");
        }
    }

    if (id.equals("n13")){
        if (!path.contains("i8")){
            stringreturns.add(strst+a8);
            pathreturns.add(path + "i8");
            idreturns.add("i8");
        }
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("o14")){
            stringreturns.add(strst+a14);
            pathreturns.add(path + "o14");
            idreturns.add("o14");
        }
    }
    
    if (id.equals("o14")){
        if (!path.contains("j9")){
            stringreturns.add(strst+a9);
            pathreturns.add(path + "j9");
            idreturns.add("j9");
        }
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("l11")){
            stringreturns.add(strst+a1);
            pathreturns.add(path + "l11");
            idreturns.add("l11");
        }
        if (!path.contains("n13")){
            stringreturns.add(strst+a13);
            pathreturns.add(path + "n13");
            idreturns.add("n13");
        }
        if (!path.contains("p15")){
            stringreturns.add(strst+a15);
            pathreturns.add(path + "p15");
            idreturns.add("p15");
        }
    }

    if (id.equals("p15")){
        if (!path.contains("k10")){
            stringreturns.add(strst+a10);
            pathreturns.add(path + "k10");
            idreturns.add("k10");
        }
        if (!path.contains("l11")){
            stringreturns.add(strst+a11);
            pathreturns.add(path + "l11");
            idreturns.add("l11");
        }
        if (!path.contains("o14")){
            stringreturns.add(strst+a14);
            pathreturns.add(path + "o14");
            idreturns.add("o14");
        }
    }

    returns.add(stringreturns);
    returns.add(pathreturns);
    returns.add(idreturns);
    return returns;
}
    public static void main(String[] args){
        
        ArrayList<String> paths = new ArrayList<String>();
        ArrayList<String> stringstarts = new ArrayList<String>();
        paths.add("a0");paths.add("b1"); paths.add("c2"); paths.add("d3");
        paths.add("e4");paths.add("f5"); paths.add("g6"); paths.add("h7");
        paths.add("i8"); paths.add("j9"); paths.add("k10"); paths.add("i11");
        paths.add("m12"); paths.add("n13"); paths.add("o14"); paths.add("p15");
        for (String s: args){
            stringstarts.add(s);
        }
        String[] lines = FileHelper.getLines("StringGrep.txt");
        ArrayList<String> LargestStrs= new ArrayList<String>();
        ArrayList<String> allstrs = new ArrayList<String>();

        for (int a = 0; a < paths.size(); a +=1){
           ArrayList<ArrayList<String>> first = wordsearch(stringstarts.get(a), paths.get(a), paths.get(a), args);
        for (int i = 0; i < first.get(0).size(); i+=1){
            allstrs.add(first.get(0).get(i));
           ArrayList<ArrayList<String>> second = wordsearch(first.get(0).get(i), first.get(1).get(i), first.get(2).get(i),args);
            for (String s1: second.get(0)){
                allstrs.add(s1);
            }
                for (int j = 0; j < second.get(0).size(); j+=1){
                ArrayList<ArrayList<String>> third = wordsearch(second.get(0).get(j), second.get(1).get(j), second.get(2).get(j),args);
                for (String s2: third.get(0)){
                    allstrs.add(s2);
                }
                    for (int k = 0; k < third.get(0).size(); k+=1){
                    ArrayList<ArrayList<String>> fourth = wordsearch(third.get(0).get(k), third.get(1).get(k), third.get(2).get(k),args);
                    for (String s3: fourth.get(0)){
                        allstrs.add(s3);
                    } 
                      
                         for (int m = 0; m < fourth.get(0).size(); m+=1){
                        ArrayList<ArrayList<String>> fifth = wordsearch(fourth.get(0).get(m), fourth.get(1).get(m), fourth.get(2).get(m),args);
                        for (String s4: fifth.get(0)){
                            allstrs.add(s4);
                }
                            /*  for(int q = 0; q < fifth.get(0).size(); q +=1){
                                ArrayList<ArrayList<String>> sixth = wordsearch(fifth.get(0).get(q), fifth.get(1).get(q), fifth.get(2).get(q),args);
                                for(String s5: sixth.get(0)){
                                    allstrs.add(s5);
                            }
                                for (int u = 0; u < sixth.get(0).size(); u +=1){
                                ArrayList<ArrayList<String>> seventh= wordsearch(sixth.get(0).get(u), sixth.get(1).get(u), sixth.get(2).get(u),args);
                                for (String s6: seventh.get(0)){
                                    allstrs.add(s6);
                                }
                            } 
                            } */
                        } 
                } 
            }
        }
        }
    ArrayList<String> allwords = new ArrayList<>();
 for (String sp: allstrs){
            for (String se: lines){
                if (sp.equals(se)){
                    allwords.add(sp);
                }
            }
        }
        String Largest = "";
        while(LargestStrs.size() <20){
            Largest = "";
            for (String si: allwords){
                if ((si.length() >= Largest.length()) && (!LargestStrs.contains(si))){
                    Largest = si;
                }
        }
        LargestStrs.add(Largest);
        }
        for (String sf: LargestStrs){
            System.out.println(sf);
        } 
            } 
    }



