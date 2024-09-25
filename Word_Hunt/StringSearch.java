import java.nio.file.*;
import java.io.IOException;
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



interface Query{
    boolean matches(String s);
}

interface Transform{
    String transform(String t);
}


class ContainsQuery implements Query{
    String s;
    ContainsQuery(String s){
        this.s = s;
    }
   public boolean matches(String s){
    return s.contains(this.s);

}
}

class GreaterQuery implements Query{
    int g;
    GreaterQuery(int g){
        this.g = g;
    }
    public boolean matches(String s){
        int total = 0;
        String[] s_array = s.split(" ");
        for (String word: s_array){
            total = total + word.length();
        }
    if (total > this.g){
        return true;
    }
    else{
        return false;
    }
    }
}

class LesserQuery implements Query {
    int l;
    LesserQuery(int l){
        this.l = l;
    }
    public boolean matches(String s){
        int total = 0;
        String[] s_array = s.split(" ");
        for (String word: s_array){
            total = total + word.length();
        }
        if (total < this.l){
            return true;
        }
        else{
            return false;
        }
    }
}

class LengthQuery implements Query{
    int n;
    LengthQuery(int n){
        this.n = n;
    } 
    public boolean matches(String s){
        int total = 0;
        String[] s_array = s.split(" ");
        for (String word: s_array){
            total = total + word.length();
        }
        if (total == this.n){
            return true;
        }
        else{
            return false;
        }

    }
}

class StartsQuery implements Query{
    String st;
    StartsQuery(String st){
        this.st = st;
    }
    public boolean matches(String s){
        String[] s_array = s.split(" ");
        String sub = s_array[0].substring(0,st.length());
        if (sub.equals(this.st)){
            return true;
        }
        else return false;
        
        
    }
}

class EndsQuery implements Query{
    String es;
    EndsQuery(String es){
        this.es = es;
    }
    public boolean matches(String s){
        String[] s_array = s.split(" ");
        String subpart = s_array[(s_array.length-1)];
        String subfull = subpart.substring((subpart.length()-(this.es).length()),subpart.length());
        if (subfull.equals(this.es)){
            return true;
        }
        else return false;
    }
}

class NotContainsQuery implements Query{
    String s;
    NotContainsQuery(String s){
        this.s = s;
    }
   public boolean matches(String s){
    return !(s.contains(this.s));

}
}

class NotGreaterQuery implements Query {
    int g;
    NotGreaterQuery(int g){
        this.g = g;
    }
    public boolean matches(String s){
        int total = 0;
        String[] s_array = s.split(" ");
        for (String word: s_array){
            total = total + word.length();
        }
    if (total > this.g){
        return false;
    }
    else{
        return true;
    }
    }
}

class NotLesserQuery implements Query {
    int l;
    NotLesserQuery(int l){
        this.l = l;
    }
    public boolean matches(String s){
        int total = 0;
        String[] s_array = s.split(" ");
        for (String word: s_array){
            total = total + word.length();
        }
        if (total < this.l){
            return false;
        }
        else{
            return true;
        }
    }
}

class NotLengthQuery implements Query {
    int n;
    NotLengthQuery(int n){
        this.n = n;
    } 
    public boolean matches(String s){
        int total = 0;
        String[] s_array = s.split(" ");
        for (String word: s_array){
            total = total + word.length();
        }
        if (total == this.n){
            return false;
        }
        else{
            return true;
        }

    }
}

class NotStartsQuery implements Query {
    String st;
    NotStartsQuery(String st){
        this.st = st;
    }
    public boolean matches(String s){
        String[] s_array = s.split(" ");
        String sub = s_array[0].substring(0,st.length());
        if (sub.equals(this.st)){
            return false;
        }
        else return true;
    
    }
}

class NotEndsQuery implements Query {
    String es;
    NotEndsQuery(String es){
        this.es = es;
    }
    public boolean matches(String s){
        String[] s_array = s.split(" ");
        String subpart = s_array[(s_array.length-1)];
        String subfull = subpart.substring((subpart.length()-(this.es).length()),subpart.length());
        if (subfull.equals(this.es)){
            return false;
        }
        else return true;
    }
}



class UpperTransform implements Transform{
    String u;
    UpperTransform(String u){
        this.u = u;
    }
   public String transform(String t){
        return t.toUpperCase();
    }
}

class LowerTransform implements Transform{
    String l;
    LowerTransform(String l){
        this.l = l;
    }
    public String transform(String t){
        return t.toLowerCase();
    }
}

class FirstTransform implements Transform{
    int number;
    FirstTransform(int number){
        this.number = number;
    }
    public String transform(String t){
        return t.substring(0,this.number);
    }
}

class LastTransform implements Transform{
    int number;
    LastTransform(int number){
        this.number = number;
    }
    public String transform(String t){
        return t.substring((t.length()-number),t.length());
    }
}

class ReplaceTransform implements Transform{
    String toReplace;
    String ReplaceWith;
    ReplaceTransform(String toReplace, String ReplaceWith){
        this.toReplace = toReplace; this.ReplaceWith = ReplaceWith;
    }

    public String transform(String t){
        return t.replaceAll(toReplace, ReplaceWith);
          }   
            }

    



class StringSearch{

    static Query readQuery(String q){
        int indexQuery = q.indexOf("=");
        
        String queryType = q.substring(0,indexQuery);
        
        if (queryType.equals("contains") || (queryType.equals("not(contains"))){
            if (queryType.equals("contains")){
            String queryString = q.substring((indexQuery + 2),(q.length()-1));
        ContainsQuery query = new ContainsQuery(queryString);
        return query;}
        else {
            String queryString = q.substring((indexQuery+2),(q.length()-2));
            NotContainsQuery query =  new NotContainsQuery(queryString);
            return query;
        }
        }


        else if (queryType.equals("greater") || (queryType.equals("not(greater"))){
            if (queryType.equals("greater")){
            int queryNumber = Integer.parseInt(q.substring((indexQuery + 1),(q.length())));
            GreaterQuery query = new GreaterQuery(queryNumber);
            return query;
        }
        else{
            int queryNumber = Integer.parseInt(q.substring((indexQuery+1),(q.length()-1)));
            NotGreaterQuery query = new NotGreaterQuery(queryNumber);
            return query;

        }}


        else if (queryType.equals("less") || (queryType.equals("not(less"))){
            if (queryType.equals("less")){
            int queryNumber = Integer.parseInt(q.substring((indexQuery + 1),(q.length())));
            LesserQuery query = new LesserQuery(queryNumber);
            return query;
        }   else {
            int queryNumber = Integer.parseInt(q.substring((indexQuery+1),(q.length()-1)));
            NotLesserQuery query = new NotLesserQuery(queryNumber);
            return query;

        }
        }

        else if (queryType.equals("length") || (queryType.equals("not(length"))){
            if (queryType.equals("length")){
            int queryNumber = Integer.parseInt(q.substring((indexQuery+1),(q.length())));
            LengthQuery query = new LengthQuery(queryNumber);
            return query;
        }
        else{
            int queryNumber = Integer.parseInt(q.substring((indexQuery+1),(q.length()-1)));
            NotLengthQuery query = new NotLengthQuery(queryNumber);
            return query;

        }
    }

        else if (queryType.equals("starts") || (queryType.equals("not(starts"))){
            if (queryType.equals("starts")){
            String queryString = q.substring((indexQuery+2),(q.length()-1));
            StartsQuery query = new StartsQuery(queryString);
            return query;}
            else {
                String queryString = q.substring((indexQuery+2),(q.length()-2));
                NotStartsQuery query = new NotStartsQuery(queryString);
                return query;
            }
        }
        else if (queryType.equals("ends") || (queryType.equals("not(ends"))){
            if (queryType.equals("ends")){
            String queryString = q.substring((indexQuery+2),(q.length()-1));
            EndsQuery query = new EndsQuery(queryString);
            return query;
        }
        else{
            String queryString = q.substring((indexQuery+2),(q.length()-2));
                NotEndsQuery query = new NotEndsQuery(queryString);
                return query;
        }
    }
            else return new ContainsQuery("placeholder");
    }
    static Transform readTransform(String t){
        int IndexTransform = t.indexOf("=");
        if (IndexTransform == -1){
            if (t.equals("upper")){
                return new UpperTransform(t);
            }
            if (t.equals("lower")){
                return new LowerTransform(t);
            }
        }
        String TransformName = t.substring(0,IndexTransform);
        if (TransformName.equals("first")){
            int NumberTransform = Integer.parseInt(t.substring(IndexTransform+1));
            return new FirstTransform(NumberTransform);
        }
        if (TransformName.equals("last")){
            int NumberTransform = Integer.parseInt(t.substring(IndexTransform+1));
            return new LastTransform(NumberTransform);
        }
        if (TransformName.equals("replace")){
            String StringTransform = t.substring(IndexTransform+1);
            int IndexSemi = StringTransform.indexOf(";");
            String s1 = StringTransform.substring(1,IndexSemi-1);
            String s2 = StringTransform.substring(IndexSemi+2,(StringTransform.length()-1));
            return new ReplaceTransform(s1,s2);
        }
        return new UpperTransform(t);
    }

    static boolean matchesAll(Query[] qs, String s){
        for (Query q: qs){
            if(q.matches(s) == false){
                return false;
            }
            }
            return true;
            }
    
    static String applyAll(Transform[] ts, String s){
        for (Transform t: ts){
            s = t.transform(s);
        }
        return s;
    }
    
    public static void main(String[] args) throws IOException{
        
        String[] lines = FileHelper.getLines(args[0]);
        if(args.length == 1){
        for (String s:lines){
            System.out.println(s);
        }}
        else if(args.length == 2){
        String[] qunread = args[1].split("&");
        Query[] queries = new Query[qunread.length];
        int i = 0;
        for (String s: qunread){
            queries[i] = readQuery(s);
            i = i +1;            
        }
         for (String s: lines){
            if (matchesAll(queries,s)) {
             System.out.println(s);
            }}}

        else{
            String[] qunread = args[1].split("&");
            Query[] queries = new Query[qunread.length];
            int i = 0;
            for (String s: qunread){
                queries[i] = readQuery(s);
                i = i + 1;            
            }
            String[] transunread = args[2].split("&");
            Transform[] transforms = new Transform[transunread.length];
            int a = 0;
            for (String c: transunread){
                transforms[a] = readTransform(c);
                a = a + 1;
            }
             for (String s: lines){
                if (matchesAll(queries,s)) {
                String s2 = applyAll(transforms,s);
                 System.out.println(s2);
                }}}}}
        

    


