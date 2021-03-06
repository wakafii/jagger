/* Jagger.java */
/* Generated By:JavaCC: Do not edit this line. Jagger.java */
import java.util.Vector;
public class Jagger implements JaggerConstants {
    public static void main(String args[]) throws ParseException
    {
                                if(args.length < 1)
                                {
                                        Jagger parser = new Jagger(System.in);
                      parser.mainloop();
                                }
                                else
                                {
                                        String fichier = args[0];
                                        try{
                                                java.io.FileReader file = new java.io.FileReader(fichier);
                                                Jagger parser = new Jagger(file);
                                                parser.mainloop();
                                        }
                                        catch(Exception e){
                                        }
                                }
    }

// Main lopp: read expressions on a line until end of file.
//     mainloop → (expression <EOL>)* <EOF>
  static final public void mainloop() throws ParseException {Exp a;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMBER:
      case STRING:
      case VAR:
      case 20:
      case 23:
      case 25:
      case 26:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      a = let();
      jj_consume_token(EOL);
System.out.println(new PPrinter(a)); System.out.println(new Evaluator(a));
    }
    jj_consume_token(0);
  }

  static final public Exp let() throws ParseException {Token t;Exp a,b;/* Vector<Exp> vecExp = new Vector<Exp>(); Vector<Var> vecVar = new Vector<Var>(); */
    a = expressionComp();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case KEYLET:{
      jj_consume_token(KEYLET);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case VAR:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        t = jj_consume_token(VAR);
        jj_consume_token(13);
        b = expressionComp();
        jj_consume_token(EOL);
b = new Var(t.toString(),b); /*vecVar.add(b);*/
      }
      jj_consume_token(KEYIN);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NUMBER:
        case STRING:
        case VAR:
        case 20:
        case 23:
        case 25:
        case 26:{
          ;
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        b = let();
        jj_consume_token(EOL);

      }
      jj_consume_token(KEYEND);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      ;
    }
/*vecVar.clear(); vecExp.clear(); */{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public Exp expressionComp() throws ParseException {Exp a,b;
    a = expression();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 14:{
        jj_consume_token(14);
        b = expression();
a = new Inf(a,b);
        break;
        }
      case 15:{
        jj_consume_token(15);
        b = expression();
a = new Sup(a,b);
        break;
        }
      case 16:{
        jj_consume_token(16);
        b = expression();
a = new Equal(a,b);
        break;
        }
      case 17:{
        jj_consume_token(17);
        b = expression();
a = new InfEqual(a,b);
        break;
        }
      case 18:{
        jj_consume_token(18);
        b = expression();
a = new SupEqual(a,b);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
  }

// Expression (the axiom).
// E -> T ('+'T | '-'T)*
  static final public Exp expression() throws ParseException {Exp a,b;
    a = term();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 19:
    case 20:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 19:{
        jj_consume_token(19);
        b = expression();
a = new Add(a,b);
        break;
        }
      case 20:{
        jj_consume_token(20);
        b = expression();
a = new Sub(a,b);
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      ;
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
  }

// Term.
// T -> F ('*'F | '/'F)*
  static final public Exp term() throws ParseException {Exp a,b;
    a = factor();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 21:
      case 22:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 21:{
        jj_consume_token(21);
        b = factor();
a = new Mult(a,b);
        break;
        }
      case 22:{
        jj_consume_token(22);
        b = factor();
a = new Div(a,b);
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
  }

// Factor of an expression.
// F -> <NUMBER> | "(" E ")"
  static final public Exp factor() throws ParseException {Token t; Exp e,a,b;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMBER:{
      t = jj_consume_token(NUMBER);
{if ("" != null) return new Num(Integer.parseInt(t.image));}
      break;
      }
    case STRING:{
      t = jj_consume_token(STRING);
{if ("" != null) return new ExpString(t.toString());}
      break;
      }
    case 23:{
      jj_consume_token(23);
      e = expression();
      jj_consume_token(24);
{if ("" != null) return e;}
      break;
      }
    case 20:{
      jj_consume_token(20);
      e = expression();
{if ("" != null) return new Neg(e);}
      break;
      }
    case 25:{
      jj_consume_token(25);
      e = expression();
      jj_consume_token(24);
{if ("" != null) return new Print(e);}
      break;
      }
    case 26:{
      jj_consume_token(26);
      e = expressionComp();
      jj_consume_token(27);
      a = expression();
      jj_consume_token(28);
      b = expression();
{if ("" != null) return new IfThenElse(e,a,b);}
      break;
      }
    case VAR:{
      t = jj_consume_token(VAR);
      jj_consume_token(13);
      e = expressionComp();
{if ("" != null) return new Var(t.toString(), e);}
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public JaggerTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[11];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x6900850,0x800,0x6900850,0x100,0x7c000,0x7c000,0x180000,0x180000,0x600000,0x600000,0x6900850,};
   }

  /** Constructor with InputStream. */
  public Jagger(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Jagger(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new JaggerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Jagger(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new JaggerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Jagger(JaggerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(JaggerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[29];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 11; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 29; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
