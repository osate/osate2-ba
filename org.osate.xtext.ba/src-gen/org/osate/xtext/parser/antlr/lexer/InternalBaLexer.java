package org.osate.xtext.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBaLexer extends Lexer {
    public static final int Fresh=25;
    public static final int Or=69;
    public static final int Transitions=10;
    public static final int Stop=39;
    public static final int EqualsSignGreaterThanSign=62;
    public static final int TBD_Timeout=7;
    public static final int ExclamationMarkLessThanSign=53;
    public static final int Count=24;
    public static final int False=32;
    public static final int LessThanSign=83;
    public static final int States=28;
    public static final int Otherwise=13;
    public static final int PlusSignEqualsSignGreaterThanSign=43;
    public static final int LeftParenthesis=73;
    public static final int ExclamationMark=71;
    public static final int GreaterThanSign=85;
    public static final int RULE_ID=100;
    public static final int RULE_DIGIT=92;
    public static final int Frozen=27;
    public static final int GreaterThanSignEqualsSign=63;
    public static final int ColonColon=59;
    public static final int PlusSign=76;
    public static final int TBD_TimeoutExecuteCondition=4;
    public static final int Xor=52;
    public static final int LeftSquareBracket=87;
    public static final int If=66;
    public static final int Lower_bound=9;
    public static final int In=67;
    public static final int Complete=16;
    public static final int RULE_REAL_LIT=95;
    public static final int Dispatch=18;
    public static final int Classifier=12;
    public static final int ExclamationMarkGreaterThanSign=55;
    public static final int Comma=77;
    public static final int HyphenMinus=78;
    public static final int Abs=45;
    public static final int Elsif=30;
    public static final int LessThanSignEqualsSign=61;
    public static final int Solidus=80;
    public static final int RightCurlyBracket=90;
    public static final int Final=33;
    public static final int Modes=34;
    public static final int FullStop=79;
    public static final int Reference=14;
    public static final int Semicolon=82;
    public static final int RULE_EXPONENT=93;
    public static final int Delta=29;
    public static final int QuestionMark=86;
    public static final int Else=38;
    public static final int RULE_EXTENDED_DIGIT=98;
    public static final int Rem=51;
    public static final int ExclamationMarkEqualsSign=54;
    public static final int Initial=22;
    public static final int True=40;
    public static final int RULE_INT_EXPONENT=94;
    public static final int TBD_InternalCondition=6;
    public static final int Upper_bound=11;
    public static final int FullStopFullStop=58;
    public static final int To=70;
    public static final int Applies=19;
    public static final int Forall=26;
    public static final int RULE_BASED_INTEGER=96;
    public static final int RightSquareBracket=88;
    public static final int Binding=20;
    public static final int Timeout=23;
    public static final int For=48;
    public static final int RightParenthesis=74;
    public static final int Do=65;
    public static final int ColonEqualsSign=60;
    public static final int Not=50;
    public static final int Computation=8;
    public static final int State=35;
    public static final int And=46;
    public static final int NumberSign=72;
    public static final int AsteriskAsterisk=56;
    public static final int RULE_INTEGER_LIT=97;
    public static final int AsteriskExclamationMarkGreaterThanSign=42;
    public static final int Constant=17;
    public static final int RULE_STRING=99;
    public static final int Any=47;
    public static final int RULE_SL_COMMENT=91;
    public static final int Variables=15;
    public static final int AsteriskExclamationMarkLessThanSign=41;
    public static final int EqualsSign=84;
    public static final int TBD_ExternalCondition=5;
    public static final int Colon=81;
    public static final int EOF=-1;
    public static final int Asterisk=75;
    public static final int Until=36;
    public static final int Mod=49;
    public static final int RULE_WS=101;
    public static final int Endif=31;
    public static final int HyphenMinusLeftSquareBracket=57;
    public static final int LeftCurlyBracket=89;
    public static final int While=37;
    public static final int GreaterThanSignGreaterThanSign=64;
    public static final int RightSquareBracketHyphenMinusGreaterThanSign=44;
    public static final int Compute=21;
    public static final int On=68;

    // delegates
    // delegators

    public InternalBaLexer() {;} 
    public InternalBaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g"; }

    // $ANTLR start "TBD_TimeoutExecuteCondition"
    public final void mTBD_TimeoutExecuteCondition() throws RecognitionException {
        try {
            int _type = TBD_TimeoutExecuteCondition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:19:29: ( ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:19:31: ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TBD_TimeoutExecuteCondition"

    // $ANTLR start "TBD_ExternalCondition"
    public final void mTBD_ExternalCondition() throws RecognitionException {
        try {
            int _type = TBD_ExternalCondition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:21:23: ( ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:21:25: ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TBD_ExternalCondition"

    // $ANTLR start "TBD_InternalCondition"
    public final void mTBD_InternalCondition() throws RecognitionException {
        try {
            int _type = TBD_InternalCondition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:23:23: ( ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:23:25: ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TBD_InternalCondition"

    // $ANTLR start "TBD_Timeout"
    public final void mTBD_Timeout() throws RecognitionException {
        try {
            int _type = TBD_Timeout;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:25:13: ( ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:25:15: ( 'T' | 't' ) ( 'B' | 'b' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TBD_Timeout"

    // $ANTLR start "Computation"
    public final void mComputation() throws RecognitionException {
        try {
            int _type = Computation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:27:13: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:27:15: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Computation"

    // $ANTLR start "Lower_bound"
    public final void mLower_bound() throws RecognitionException {
        try {
            int _type = Lower_bound;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:29:13: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '_' ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:29:15: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '_' ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lower_bound"

    // $ANTLR start "Transitions"
    public final void mTransitions() throws RecognitionException {
        try {
            int _type = Transitions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:31:13: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:31:15: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Transitions"

    // $ANTLR start "Upper_bound"
    public final void mUpper_bound() throws RecognitionException {
        try {
            int _type = Upper_bound;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:33:13: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '_' ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:33:15: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '_' ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Upper_bound"

    // $ANTLR start "Classifier"
    public final void mClassifier() throws RecognitionException {
        try {
            int _type = Classifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:35:12: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:35:14: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Classifier"

    // $ANTLR start "Otherwise"
    public final void mOtherwise() throws RecognitionException {
        try {
            int _type = Otherwise;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:37:11: ( ( 'O' | 'o' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:37:13: ( 'O' | 'o' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Otherwise"

    // $ANTLR start "Reference"
    public final void mReference() throws RecognitionException {
        try {
            int _type = Reference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:39:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:39:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reference"

    // $ANTLR start "Variables"
    public final void mVariables() throws RecognitionException {
        try {
            int _type = Variables;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:41:11: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:41:13: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variables"

    // $ANTLR start "Complete"
    public final void mComplete() throws RecognitionException {
        try {
            int _type = Complete;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:43:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:43:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Complete"

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:45:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:45:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constant"

    // $ANTLR start "Dispatch"
    public final void mDispatch() throws RecognitionException {
        try {
            int _type = Dispatch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:47:10: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:47:12: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dispatch"

    // $ANTLR start "Applies"
    public final void mApplies() throws RecognitionException {
        try {
            int _type = Applies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:49:9: ( ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:49:11: ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Applies"

    // $ANTLR start "Binding"
    public final void mBinding() throws RecognitionException {
        try {
            int _type = Binding;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:51:9: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:51:11: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Binding"

    // $ANTLR start "Compute"
    public final void mCompute() throws RecognitionException {
        try {
            int _type = Compute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:53:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:53:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Compute"

    // $ANTLR start "Initial"
    public final void mInitial() throws RecognitionException {
        try {
            int _type = Initial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:55:9: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:55:11: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Initial"

    // $ANTLR start "Timeout"
    public final void mTimeout() throws RecognitionException {
        try {
            int _type = Timeout;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:57:9: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:57:11: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timeout"

    // $ANTLR start "Count"
    public final void mCount() throws RecognitionException {
        try {
            int _type = Count;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:59:7: ( '\\'' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:59:9: '\\'' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            match('\''); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Count"

    // $ANTLR start "Fresh"
    public final void mFresh() throws RecognitionException {
        try {
            int _type = Fresh;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:61:7: ( '\\'' ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'H' | 'h' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:61:9: '\\'' ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'H' | 'h' )
            {
            match('\''); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fresh"

    // $ANTLR start "Forall"
    public final void mForall() throws RecognitionException {
        try {
            int _type = Forall;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:63:8: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:63:10: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Forall"

    // $ANTLR start "Frozen"
    public final void mFrozen() throws RecognitionException {
        try {
            int _type = Frozen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:65:8: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:65:10: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Frozen"

    // $ANTLR start "States"
    public final void mStates() throws RecognitionException {
        try {
            int _type = States;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:67:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:67:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "States"

    // $ANTLR start "Delta"
    public final void mDelta() throws RecognitionException {
        try {
            int _type = Delta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:69:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:69:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Delta"

    // $ANTLR start "Elsif"
    public final void mElsif() throws RecognitionException {
        try {
            int _type = Elsif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:71:7: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:71:9: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elsif"

    // $ANTLR start "Endif"
    public final void mEndif() throws RecognitionException {
        try {
            int _type = Endif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:73:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:73:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Endif"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:75:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:75:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Final"
    public final void mFinal() throws RecognitionException {
        try {
            int _type = Final;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:77:7: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:77:9: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Final"

    // $ANTLR start "Modes"
    public final void mModes() throws RecognitionException {
        try {
            int _type = Modes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:79:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:79:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modes"

    // $ANTLR start "State"
    public final void mState() throws RecognitionException {
        try {
            int _type = State;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:81:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:81:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "State"

    // $ANTLR start "Until"
    public final void mUntil() throws RecognitionException {
        try {
            int _type = Until;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:83:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:83:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Until"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:85:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:85:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:87:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:87:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Stop"
    public final void mStop() throws RecognitionException {
        try {
            int _type = Stop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:89:6: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:89:8: ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:91:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:91:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "AsteriskExclamationMarkLessThanSign"
    public final void mAsteriskExclamationMarkLessThanSign() throws RecognitionException {
        try {
            int _type = AsteriskExclamationMarkLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:93:37: ( '*' '!' '<' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:93:39: '*' '!' '<'
            {
            match('*'); 
            match('!'); 
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskExclamationMarkLessThanSign"

    // $ANTLR start "AsteriskExclamationMarkGreaterThanSign"
    public final void mAsteriskExclamationMarkGreaterThanSign() throws RecognitionException {
        try {
            int _type = AsteriskExclamationMarkGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:95:40: ( '*' '!' '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:95:42: '*' '!' '>'
            {
            match('*'); 
            match('!'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskExclamationMarkGreaterThanSign"

    // $ANTLR start "PlusSignEqualsSignGreaterThanSign"
    public final void mPlusSignEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:97:35: ( '+' '=' '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:97:37: '+' '=' '>'
            {
            match('+'); 
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSignGreaterThanSign"

    // $ANTLR start "RightSquareBracketHyphenMinusGreaterThanSign"
    public final void mRightSquareBracketHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = RightSquareBracketHyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:99:46: ( ']' '-' '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:99:48: ']' '-' '>'
            {
            match(']'); 
            match('-'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracketHyphenMinusGreaterThanSign"

    // $ANTLR start "Abs"
    public final void mAbs() throws RecognitionException {
        try {
            int _type = Abs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:101:5: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:101:7: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abs"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:103:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:103:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:105:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:105:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Any"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:107:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:107:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Mod"
    public final void mMod() throws RecognitionException {
        try {
            int _type = Mod;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:109:5: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:109:7: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mod"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:111:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:111:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Rem"
    public final void mRem() throws RecognitionException {
        try {
            int _type = Rem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:113:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:113:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rem"

    // $ANTLR start "Xor"
    public final void mXor() throws RecognitionException {
        try {
            int _type = Xor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:115:5: ( ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:115:7: ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xor"

    // $ANTLR start "ExclamationMarkLessThanSign"
    public final void mExclamationMarkLessThanSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:117:29: ( '!' '<' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:117:31: '!' '<'
            {
            match('!'); 
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkLessThanSign"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:119:27: ( '!' '=' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:119:29: '!' '='
            {
            match('!'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "ExclamationMarkGreaterThanSign"
    public final void mExclamationMarkGreaterThanSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:121:32: ( '!' '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:121:34: '!' '>'
            {
            match('!'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkGreaterThanSign"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:123:18: ( '*' '*' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:123:20: '*' '*'
            {
            match('*'); 
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "HyphenMinusLeftSquareBracket"
    public final void mHyphenMinusLeftSquareBracket() throws RecognitionException {
        try {
            int _type = HyphenMinusLeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:125:30: ( '-' '[' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:125:32: '-' '['
            {
            match('-'); 
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusLeftSquareBracket"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:127:18: ( '.' '.' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:127:20: '.' '.'
            {
            match('.'); 
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:129:12: ( ':' ':' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:129:14: ':' ':'
            {
            match(':'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "ColonEqualsSign"
    public final void mColonEqualsSign() throws RecognitionException {
        try {
            int _type = ColonEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:131:17: ( ':' '=' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:131:19: ':' '='
            {
            match(':'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonEqualsSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:133:24: ( '<' '=' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:133:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:135:27: ( '=' '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:135:29: '=' '>'
            {
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:137:27: ( '>' '=' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:137:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "GreaterThanSignGreaterThanSign"
    public final void mGreaterThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:139:32: ( '>' '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:139:34: '>' '>'
            {
            match('>'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignGreaterThanSign"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:141:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:141:6: ( 'D' | 'd' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:143:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:143:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:145:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:145:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:147:4: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:147:6: ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "On"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:149:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:149:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:151:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:151:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:153:17: ( '!' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:153:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:155:12: ( '#' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:155:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:157:17: ( '(' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:157:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:159:18: ( ')' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:159:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:161:10: ( '*' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:161:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:163:10: ( '+' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:163:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:165:7: ( ',' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:165:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:167:13: ( '-' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:167:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:169:10: ( '.' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:169:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:171:9: ( '/' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:171:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:173:7: ( ':' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:173:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:175:11: ( ';' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:175:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:177:14: ( '<' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:177:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:179:12: ( '=' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:179:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:181:17: ( '>' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:181:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:183:14: ( '?' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:183:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:185:19: ( '[' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:185:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:187:20: ( ']' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:187:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:189:18: ( '{' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:189:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:191:19: ( '}' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:191:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:195:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:197:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:197:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:197:36: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:197:47: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:197:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:199:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:199:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:199:40: ( '+' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:199:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:199:45: ( RULE_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:199:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_EXPONENT"

    // $ANTLR start "RULE_REAL_LIT"
    public final void mRULE_REAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:17: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:29: ( '_' ( RULE_DIGIT )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:34: ( RULE_DIGIT )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('.'); 
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:52: ( RULE_DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:64: ( '_' ( RULE_DIGIT )+ )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='_') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:69: ( RULE_DIGIT )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:83: ( RULE_EXPONENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='E'||LA14_0=='e') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:201:83: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LIT"

    // $ANTLR start "RULE_INTEGER_LIT"
    public final void mRULE_INTEGER_LIT() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:20: ( RULE_DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:32: ( '_' ( RULE_DIGIT )+ )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='_') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:37: ( RULE_DIGIT )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='#') ) {
                alt20=1;
            }
            else {
                alt20=2;}
            switch (alt20) {
                case 1 :
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:79: ( RULE_INT_EXPONENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:98: ( RULE_INT_EXPONENT )?
                    {
                    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:98: ( RULE_INT_EXPONENT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:203:98: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:205:21: ( '0' .. '9' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:205:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:207:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:207:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_BASED_INTEGER"
    public final void mRULE_BASED_INTEGER() throws RecognitionException {
        try {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:209:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:209:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:209:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='F')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='f')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:209:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:209:52: ( '_' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='_') ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:209:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:211:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:211:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:211:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\\') ) {
                    alt23=1;
                }
                else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:211:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:211:65: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:213:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:213:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:213:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:213:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:213:32: ( '_' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0=='_') ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:213:32: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:215:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:215:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:215:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:8: ( TBD_TimeoutExecuteCondition | TBD_ExternalCondition | TBD_InternalCondition | TBD_Timeout | Computation | Lower_bound | Transitions | Upper_bound | Classifier | Otherwise | Reference | Variables | Complete | Constant | Dispatch | Applies | Binding | Compute | Initial | Timeout | Count | Fresh | Forall | Frozen | States | Delta | Elsif | Endif | False | Final | Modes | State | Until | While | Else | Stop | True | AsteriskExclamationMarkLessThanSign | AsteriskExclamationMarkGreaterThanSign | PlusSignEqualsSignGreaterThanSign | RightSquareBracketHyphenMinusGreaterThanSign | Abs | And | Any | For | Mod | Not | Rem | Xor | ExclamationMarkLessThanSign | ExclamationMarkEqualsSign | ExclamationMarkGreaterThanSign | AsteriskAsterisk | HyphenMinusLeftSquareBracket | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | GreaterThanSignGreaterThanSign | Do | If | In | On | Or | To | ExclamationMark | NumberSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt27=93;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:10: TBD_TimeoutExecuteCondition
                {
                mTBD_TimeoutExecuteCondition(); 

                }
                break;
            case 2 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:38: TBD_ExternalCondition
                {
                mTBD_ExternalCondition(); 

                }
                break;
            case 3 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:60: TBD_InternalCondition
                {
                mTBD_InternalCondition(); 

                }
                break;
            case 4 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:82: TBD_Timeout
                {
                mTBD_Timeout(); 

                }
                break;
            case 5 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:94: Computation
                {
                mComputation(); 

                }
                break;
            case 6 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:106: Lower_bound
                {
                mLower_bound(); 

                }
                break;
            case 7 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:118: Transitions
                {
                mTransitions(); 

                }
                break;
            case 8 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:130: Upper_bound
                {
                mUpper_bound(); 

                }
                break;
            case 9 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:142: Classifier
                {
                mClassifier(); 

                }
                break;
            case 10 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:153: Otherwise
                {
                mOtherwise(); 

                }
                break;
            case 11 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:163: Reference
                {
                mReference(); 

                }
                break;
            case 12 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:173: Variables
                {
                mVariables(); 

                }
                break;
            case 13 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:183: Complete
                {
                mComplete(); 

                }
                break;
            case 14 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:192: Constant
                {
                mConstant(); 

                }
                break;
            case 15 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:201: Dispatch
                {
                mDispatch(); 

                }
                break;
            case 16 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:210: Applies
                {
                mApplies(); 

                }
                break;
            case 17 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:218: Binding
                {
                mBinding(); 

                }
                break;
            case 18 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:226: Compute
                {
                mCompute(); 

                }
                break;
            case 19 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:234: Initial
                {
                mInitial(); 

                }
                break;
            case 20 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:242: Timeout
                {
                mTimeout(); 

                }
                break;
            case 21 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:250: Count
                {
                mCount(); 

                }
                break;
            case 22 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:256: Fresh
                {
                mFresh(); 

                }
                break;
            case 23 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:262: Forall
                {
                mForall(); 

                }
                break;
            case 24 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:269: Frozen
                {
                mFrozen(); 

                }
                break;
            case 25 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:276: States
                {
                mStates(); 

                }
                break;
            case 26 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:283: Delta
                {
                mDelta(); 

                }
                break;
            case 27 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:289: Elsif
                {
                mElsif(); 

                }
                break;
            case 28 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:295: Endif
                {
                mEndif(); 

                }
                break;
            case 29 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:301: False
                {
                mFalse(); 

                }
                break;
            case 30 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:307: Final
                {
                mFinal(); 

                }
                break;
            case 31 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:313: Modes
                {
                mModes(); 

                }
                break;
            case 32 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:319: State
                {
                mState(); 

                }
                break;
            case 33 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:325: Until
                {
                mUntil(); 

                }
                break;
            case 34 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:331: While
                {
                mWhile(); 

                }
                break;
            case 35 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:337: Else
                {
                mElse(); 

                }
                break;
            case 36 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:342: Stop
                {
                mStop(); 

                }
                break;
            case 37 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:347: True
                {
                mTrue(); 

                }
                break;
            case 38 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:352: AsteriskExclamationMarkLessThanSign
                {
                mAsteriskExclamationMarkLessThanSign(); 

                }
                break;
            case 39 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:388: AsteriskExclamationMarkGreaterThanSign
                {
                mAsteriskExclamationMarkGreaterThanSign(); 

                }
                break;
            case 40 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:427: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 41 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:461: RightSquareBracketHyphenMinusGreaterThanSign
                {
                mRightSquareBracketHyphenMinusGreaterThanSign(); 

                }
                break;
            case 42 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:506: Abs
                {
                mAbs(); 

                }
                break;
            case 43 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:510: And
                {
                mAnd(); 

                }
                break;
            case 44 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:514: Any
                {
                mAny(); 

                }
                break;
            case 45 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:518: For
                {
                mFor(); 

                }
                break;
            case 46 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:522: Mod
                {
                mMod(); 

                }
                break;
            case 47 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:526: Not
                {
                mNot(); 

                }
                break;
            case 48 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:530: Rem
                {
                mRem(); 

                }
                break;
            case 49 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:534: Xor
                {
                mXor(); 

                }
                break;
            case 50 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:538: ExclamationMarkLessThanSign
                {
                mExclamationMarkLessThanSign(); 

                }
                break;
            case 51 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:566: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 52 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:592: ExclamationMarkGreaterThanSign
                {
                mExclamationMarkGreaterThanSign(); 

                }
                break;
            case 53 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:623: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 54 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:640: HyphenMinusLeftSquareBracket
                {
                mHyphenMinusLeftSquareBracket(); 

                }
                break;
            case 55 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:669: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 56 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:686: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 57 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:697: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 58 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:713: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 59 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:736: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 60 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:762: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 61 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:788: GreaterThanSignGreaterThanSign
                {
                mGreaterThanSignGreaterThanSign(); 

                }
                break;
            case 62 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:819: Do
                {
                mDo(); 

                }
                break;
            case 63 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:822: If
                {
                mIf(); 

                }
                break;
            case 64 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:825: In
                {
                mIn(); 

                }
                break;
            case 65 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:828: On
                {
                mOn(); 

                }
                break;
            case 66 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:831: Or
                {
                mOr(); 

                }
                break;
            case 67 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:834: To
                {
                mTo(); 

                }
                break;
            case 68 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:837: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 69 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:853: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 70 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:864: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 71 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:880: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 72 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:897: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 73 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:906: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 74 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:915: Comma
                {
                mComma(); 

                }
                break;
            case 75 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:921: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 76 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:933: FullStop
                {
                mFullStop(); 

                }
                break;
            case 77 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:942: Solidus
                {
                mSolidus(); 

                }
                break;
            case 78 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:950: Colon
                {
                mColon(); 

                }
                break;
            case 79 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:956: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 80 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:966: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 81 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:979: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 82 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:990: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 83 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1006: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 84 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1019: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 85 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1037: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 86 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1056: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 87 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1073: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 88 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1091: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 89 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1107: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 90 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1121: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 91 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1138: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 92 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1150: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 93 :
                // ../org.osate.xtext.ba/src-gen/org/osate/xtext/parser/antlr/lexer/InternalBaLexer.g:1:1158: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\1\uffff\13\52\1\uffff\5\52\1\120\1\122\1\124\2\52\1\132\1\135\1\137\1\142\1\144\1\146\1\151\12\uffff\1\152\3\uffff\3\52\1\161\6\52\1\171\1\172\4\52\1\u0080\4\52\1\u0087\1\u0088\2\uffff\11\52\7\uffff\2\52\26\uffff\4\52\1\uffff\7\52\2\uffff\1\52\1\u00a4\3\52\1\uffff\1\52\1\u00a9\1\u00aa\1\u00ab\2\52\2\uffff\1\u00af\7\52\1\u00b9\1\52\2\uffff\1\u00bb\1\u00bc\1\152\1\uffff\1\52\1\u00c1\11\52\1\uffff\4\52\3\uffff\3\52\1\uffff\4\52\1\u00d7\1\52\1\u00d9\2\52\1\uffff\1\52\2\uffff\4\52\1\uffff\7\52\1\u00e8\4\52\1\u00ed\5\52\1\u00f3\1\u00f4\1\u00f6\1\uffff\1\u00f7\1\uffff\1\u00f8\1\u00f9\1\u00fa\11\52\3\uffff\4\52\1\uffff\3\52\1\u010e\1\u010f\2\uffff\1\u0110\5\uffff\4\52\1\u0115\1\52\1\u0117\11\52\1\u0121\1\u0122\1\u0123\3\uffff\4\52\1\uffff\1\52\1\uffff\1\u0129\1\u012a\6\52\1\u0131\3\uffff\5\52\2\uffff\3\52\1\u013a\1\u013b\1\u013c\1\uffff\5\52\1\u0142\2\52\3\uffff\1\u0146\2\52\1\u0149\1\u014a\1\uffff\1\u014b\1\u014c\1\52\1\uffff\2\52\4\uffff\31\52\1\u0169\1\u016a\1\52\2\uffff\4\52\1\u0170\1\uffff";
    static final String DFA27_eofS =
        "\u0171\uffff";
    static final String DFA27_minS =
        "\1\11\1\102\1\114\1\117\2\116\1\105\1\101\1\105\1\102\1\111\1\106\1\103\1\101\1\124\1\114\1\117\1\110\1\41\1\75\1\55\2\117\1\74\1\55\1\56\1\72\1\75\1\76\1\75\12\uffff\1\56\3\uffff\1\104\1\101\1\115\1\60\1\115\1\101\1\127\1\120\1\124\1\110\2\60\1\106\1\122\1\123\1\114\1\60\1\120\1\123\1\104\1\116\2\60\2\uffff\1\122\1\117\1\114\1\116\1\101\1\123\2\104\1\111\1\74\6\uffff\1\124\1\122\24\uffff\1\60\1\uffff\1\137\1\116\2\105\1\uffff\1\120\2\123\2\105\1\111\1\105\2\uffff\1\105\1\60\1\111\1\120\1\124\1\uffff\1\114\3\60\1\104\1\124\2\uffff\1\60\1\132\1\123\1\101\1\124\1\120\1\105\1\111\1\60\1\114\2\uffff\2\60\1\56\1\60\1\123\1\60\1\117\1\114\1\124\1\123\2\122\1\114\2\122\1\uffff\3\101\1\111\3\uffff\2\111\1\114\1\uffff\2\105\1\114\1\105\1\60\1\106\1\60\1\106\1\123\1\uffff\1\105\2\uffff\1\111\1\130\1\116\1\111\1\uffff\1\125\1\124\1\105\1\101\1\111\2\137\1\60\1\127\1\105\1\102\1\124\1\60\1\105\1\116\1\101\1\114\1\116\3\60\1\uffff\1\60\1\uffff\3\60\1\115\4\124\1\101\1\124\1\116\1\106\2\60\1\uffff\1\111\1\116\1\114\1\103\1\uffff\1\123\1\107\1\114\2\60\2\uffff\1\60\5\uffff\3\105\1\111\1\60\1\124\1\60\1\105\1\124\1\111\2\117\1\123\1\103\1\105\1\110\3\60\3\uffff\1\117\2\122\1\117\1\uffff\1\111\1\uffff\2\60\1\105\2\125\2\105\1\123\1\60\3\uffff\1\125\3\116\1\117\2\uffff\1\122\2\116\3\60\1\uffff\1\124\2\101\1\123\1\116\1\60\2\104\3\uffff\1\60\2\114\2\60\1\uffff\2\60\1\130\1\uffff\2\103\4\uffff\1\105\2\117\1\103\2\116\1\125\2\104\1\124\2\111\1\105\2\124\1\103\2\111\3\117\3\116\1\104\2\60\1\111\2\uffff\1\124\1\111\1\117\1\116\1\60\1\uffff";
    static final String DFA27_maxS =
        "\1\175\1\162\2\157\1\160\1\164\1\145\1\141\1\157\1\160\1\151\1\156\1\146\1\162\1\164\1\156\1\157\1\150\1\52\1\75\1\55\2\157\1\76\1\133\1\56\2\75\2\76\12\uffff\1\137\3\uffff\1\144\1\165\1\155\1\172\1\156\1\141\1\167\1\160\1\164\1\150\2\172\1\155\1\162\1\163\1\154\1\172\1\160\1\163\1\171\1\156\2\172\2\uffff\1\162\1\157\1\154\1\156\1\157\1\163\2\144\1\151\1\76\6\uffff\1\164\1\162\24\uffff\1\71\1\uffff\1\137\1\156\2\145\1\uffff\1\160\2\163\2\145\1\151\1\145\2\uffff\1\145\1\172\1\151\1\160\1\164\1\uffff\1\154\3\172\1\144\1\164\2\uffff\2\172\1\163\1\141\1\164\1\160\2\151\1\172\1\154\2\uffff\2\172\1\137\1\172\1\163\1\172\1\157\1\165\1\164\1\163\2\162\1\154\2\162\1\uffff\3\141\1\151\3\uffff\2\151\1\154\1\uffff\2\145\1\154\1\145\1\172\1\146\1\172\1\146\1\163\1\uffff\1\145\2\uffff\1\151\1\170\1\156\1\151\1\uffff\1\165\1\164\1\145\1\141\1\151\2\137\1\172\1\167\1\145\1\142\1\164\1\172\1\145\1\156\1\141\1\154\1\156\3\172\1\uffff\1\172\1\uffff\3\172\1\155\4\164\1\145\1\164\1\156\1\146\2\172\1\uffff\1\151\1\156\1\154\1\143\1\uffff\1\163\1\147\1\154\2\172\2\uffff\1\172\5\uffff\3\145\1\151\1\172\1\164\1\172\1\145\1\164\1\151\2\157\1\163\1\143\1\145\1\150\3\172\3\uffff\1\157\2\162\1\157\1\uffff\1\151\1\uffff\2\172\1\145\2\165\2\145\1\163\1\172\3\uffff\1\165\3\156\1\157\2\uffff\1\162\2\156\3\172\1\uffff\1\164\2\141\1\163\1\156\1\172\2\144\3\uffff\1\172\2\154\2\172\1\uffff\2\172\1\170\1\uffff\2\143\4\uffff\1\145\2\157\1\143\2\156\1\165\2\144\1\164\2\151\1\145\2\164\1\143\2\151\3\157\3\156\1\144\2\172\1\151\2\uffff\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA27_acceptS =
        "\36\uffff\1\105\1\106\1\107\1\112\1\115\1\117\1\123\1\124\1\126\1\127\1\uffff\1\133\1\134\1\135\27\uffff\1\25\1\26\12\uffff\1\65\1\110\1\50\1\111\1\51\1\125\2\uffff\1\62\1\63\1\64\1\104\1\66\1\130\1\113\1\67\1\114\1\70\1\71\1\116\1\72\1\120\1\73\1\121\1\74\1\75\1\122\1\132\1\uffff\1\131\4\uffff\1\103\7\uffff\1\101\1\102\5\uffff\1\76\6\uffff\1\100\1\77\12\uffff\1\46\1\47\17\uffff\1\60\4\uffff\1\52\1\53\1\54\3\uffff\1\55\11\uffff\1\56\1\uffff\1\57\1\61\4\uffff\1\45\25\uffff\1\44\1\uffff\1\43\16\uffff\1\41\4\uffff\1\32\5\uffff\1\35\1\36\1\uffff\1\40\1\33\1\34\1\37\1\42\23\uffff\1\27\1\30\1\31\4\uffff\1\24\1\uffff\1\22\11\uffff\1\20\1\21\1\23\5\uffff\1\15\1\16\6\uffff\1\17\10\uffff\1\12\1\13\1\14\5\uffff\1\11\3\uffff\1\4\2\uffff\1\7\1\5\1\6\1\10\34\uffff\1\2\1\3\5\uffff\1\1";
    static final String DFA27_specialS =
        "\u0171\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\27\1\51\1\36\3\uffff\1\14\1\37\1\40\1\22\1\23\1\41\1\30\1\31\1\42\12\50\1\32\1\43\1\33\1\34\1\35\1\44\1\uffff\1\11\1\12\1\2\1\10\1\17\1\15\2\52\1\13\2\52\1\3\1\20\1\25\1\5\2\52\1\6\1\16\1\1\1\4\1\7\1\21\1\26\2\52\1\45\1\uffff\1\24\3\uffff\1\11\1\12\1\2\1\10\1\17\1\15\2\52\1\13\2\52\1\3\1\20\1\25\1\5\2\52\1\6\1\16\1\1\1\4\1\7\1\21\1\26\2\52\1\46\1\uffff\1\47",
            "\1\54\6\uffff\1\56\5\uffff\1\57\2\uffff\1\55\17\uffff\1\54\6\uffff\1\56\5\uffff\1\57\2\uffff\1\55",
            "\1\61\2\uffff\1\60\34\uffff\1\61\2\uffff\1\60",
            "\1\62\37\uffff\1\62",
            "\1\64\1\uffff\1\63\35\uffff\1\64\1\uffff\1\63",
            "\1\66\3\uffff\1\67\1\uffff\1\65\31\uffff\1\66\3\uffff\1\67\1\uffff\1\65",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\73\3\uffff\1\72\5\uffff\1\74\25\uffff\1\73\3\uffff\1\72\5\uffff\1\74",
            "\1\76\13\uffff\1\77\1\uffff\1\75\21\uffff\1\76\13\uffff\1\77\1\uffff\1\75",
            "\1\100\37\uffff\1\100",
            "\1\102\7\uffff\1\101\27\uffff\1\102\7\uffff\1\101",
            "\1\103\2\uffff\1\104\34\uffff\1\103\2\uffff\1\104",
            "\1\107\7\uffff\1\110\5\uffff\1\105\2\uffff\1\106\16\uffff\1\107\7\uffff\1\110\5\uffff\1\105\2\uffff\1\106",
            "\1\111\37\uffff\1\111",
            "\1\112\1\uffff\1\113\35\uffff\1\112\1\uffff\1\113",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\10\uffff\1\117",
            "\1\121",
            "\1\123",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\1\130\1\131",
            "\1\134\55\uffff\1\133",
            "\1\136",
            "\1\140\2\uffff\1\141",
            "\1\143",
            "\1\145",
            "\1\147\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154\1\uffff\12\50\45\uffff\1\153",
            "",
            "",
            "",
            "\1\155\37\uffff\1\155",
            "\1\156\23\uffff\1\157\13\uffff\1\156\23\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\162\1\163\36\uffff\1\162\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\173\6\uffff\1\174\30\uffff\1\173\6\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\24\uffff\1\u0084\12\uffff\1\u0083\24\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\12\52\7\uffff\10\52\1\u0086\21\52\4\uffff\1\52\1\uffff\10\52\1\u0086\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\15\uffff\1\u008e\21\uffff\1\u008d\15\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\1\uffff\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0097",
            "",
            "\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "",
            "",
            "\1\u00a3\37\uffff\1\u00a3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "",
            "\1\u00a8\37\uffff\1\u00a8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "",
            "",
            "\12\52\7\uffff\1\u00ae\31\52\4\uffff\1\52\1\uffff\1\u00ae\31\52",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b6\3\uffff\1\u00b5\33\uffff\1\u00b6\3\uffff\1\u00b5",
            "\1\u00b7\37\uffff\1\u00b7",
            "\12\52\7\uffff\4\52\1\u00b8\25\52\4\uffff\1\52\1\uffff\4\52\1\u00b8\25\52",
            "\1\u00ba\37\uffff\1\u00ba",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\154\1\uffff\12\u0097\45\uffff\1\153",
            "\12\52\7\uffff\4\52\1\u00be\3\52\1\u00bf\12\52\1\u00bd\6\52\6\uffff\4\52\1\u00be\3\52\1\u00bf\12\52\1\u00bd\6\52",
            "\1\u00c0\37\uffff\1\u00c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c4\10\uffff\1\u00c3\26\uffff\1\u00c4\10\uffff\1\u00c3",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "",
            "",
            "",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d8\37\uffff\1\u00d8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "",
            "\1\u00dc\37\uffff\1\u00dc",
            "",
            "",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\22\52\1\u00f5\7\52\4\uffff\1\52\1\uffff\22\52\1\u00f5\7\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\3\uffff\1\u0101\33\uffff\1\u0100\3\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\12\52\7\uffff\1\52\1\u0105\30\52\6\uffff\1\52\1\u0105\30\52",
            "\12\52\7\uffff\1\52\1\u0106\30\52\6\uffff\1\52\1\u0106\30\52",
            "",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0116\37\uffff\1\u0116",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "",
            "\1\u0128\37\uffff\1\u0128",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "",
            "",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "",
            "",
            "",
            "\12\52\7\uffff\4\52\1\u0145\25\52\4\uffff\1\52\1\uffff\4\52\1\u0145\25\52",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014d\37\uffff\1\u014d",
            "",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "",
            "",
            "",
            "",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016b\37\uffff\1\u016b",
            "",
            "",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TBD_TimeoutExecuteCondition | TBD_ExternalCondition | TBD_InternalCondition | TBD_Timeout | Computation | Lower_bound | Transitions | Upper_bound | Classifier | Otherwise | Reference | Variables | Complete | Constant | Dispatch | Applies | Binding | Compute | Initial | Timeout | Count | Fresh | Forall | Frozen | States | Delta | Elsif | Endif | False | Final | Modes | State | Until | While | Else | Stop | True | AsteriskExclamationMarkLessThanSign | AsteriskExclamationMarkGreaterThanSign | PlusSignEqualsSignGreaterThanSign | RightSquareBracketHyphenMinusGreaterThanSign | Abs | And | Any | For | Mod | Not | Rem | Xor | ExclamationMarkLessThanSign | ExclamationMarkEqualsSign | ExclamationMarkGreaterThanSign | AsteriskAsterisk | HyphenMinusLeftSquareBracket | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | GreaterThanSignGreaterThanSign | Do | If | In | On | Or | To | ExclamationMark | NumberSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
    }
 

}