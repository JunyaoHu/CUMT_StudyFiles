
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison's Yacc-like parsers in C
   
      Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005, 2006
   Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* C LALR(1) parser skeleton written by Richard Stallman, by
   simplifying the original so-called "semantic" parser.  */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output.  */
#define YYBISON 1

/* Bison version.  */
#define YYBISON_VERSION "2.4.1"

/* Skeleton name.  */
#define YYSKELETON_NAME "yacc.c"

/* Pure parsers.  */
#define YYPURE 0

/* Push parsers.  */
#define YYPUSH 0

/* Pull parsers.  */
#define YYPULL 1

/* Using locations.  */
#define YYLSP_NEEDED 0



/* Copy the first part of user declarations.  */

/* Line 189 of yacc.c  */
#line 3 ".\\cgrammar-new.y"


#include "parser.h"

extern int column;
extern int row;
extern char yytext[];

extern int yylineno;
extern int root;

extern int yylex();
extern void addchild( Node * node1, Node * node2 );
Node * link(int tid, Node * rExp, ... );

struct Node * parse_tree;


/* Line 189 of yacc.c  */
#line 88 "cgrammar-new.tab.c"

/* Enabling traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif

/* Enabling verbose error messages.  */
#ifdef YYERROR_VERBOSE
# undef YYERROR_VERBOSE
# define YYERROR_VERBOSE 1
#else
# define YYERROR_VERBOSE 0
#endif

/* Enabling the token table.  */
#ifndef YYTOKEN_TABLE
# define YYTOKEN_TABLE 0
#endif


/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     LOWER_THAN_ELSE = 258,
     ELSE = 259,
     COLON = 260,
     OR_OP = 261,
     AND_OP = 262,
     NE_OP = 263,
     EQ_OP = 264,
     GE_OP = 265,
     LE_OP = 266,
     RIGHT_OP = 267,
     LEFT_OP = 268,
     IDENTIFIER = 269,
     CONSTANT = 270,
     STRING_LITERAL = 271,
     SIZEOF = 272,
     PTR_OP = 273,
     INC_OP = 274,
     DEC_OP = 275,
     MUL_ASSIGN = 276,
     DIV_ASSIGN = 277,
     MOD_ASSIGN = 278,
     ADD_ASSIGN = 279,
     SUB_ASSIGN = 280,
     LEFT_ASSIGN = 281,
     RIGHT_ASSIGN = 282,
     AND_ASSIGN = 283,
     XOR_ASSIGN = 284,
     OR_ASSIGN = 285,
     TYPE_NAME = 286,
     TYPEDEF = 287,
     EXTERN = 288,
     STATIC = 289,
     AUTO = 290,
     REGISTER = 291,
     CHAR = 292,
     SHORT = 293,
     INT = 294,
     LONG = 295,
     SIGNED = 296,
     UNSIGNED = 297,
     FLOAT = 298,
     DOUBLE = 299,
     CONST = 300,
     VOLATILE = 301,
     VOID = 302,
     STRUCT = 303,
     UNION = 304,
     ENUM = 305,
     ELLIPSIS = 306,
     CASE = 307,
     DEFAULT = 308,
     IF = 309,
     SWITCH = 310,
     WHILE = 311,
     DO = 312,
     FOR = 313,
     GOTO = 314,
     CONTINUE = 315,
     BREAK = 316,
     RETURN = 317
   };
#endif



#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
{

/* Line 214 of yacc.c  */
#line 17 ".\\cgrammar-new.y"

  struct Node * node;



/* Line 214 of yacc.c  */
#line 192 "cgrammar-new.tab.c"
} YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif


/* Copy the second part of user declarations.  */


/* Line 264 of yacc.c  */
#line 204 "cgrammar-new.tab.c"

#ifdef short
# undef short
#endif

#ifdef YYTYPE_UINT8
typedef YYTYPE_UINT8 yytype_uint8;
#else
typedef unsigned char yytype_uint8;
#endif

#ifdef YYTYPE_INT8
typedef YYTYPE_INT8 yytype_int8;
#elif (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
typedef signed char yytype_int8;
#else
typedef short int yytype_int8;
#endif

#ifdef YYTYPE_UINT16
typedef YYTYPE_UINT16 yytype_uint16;
#else
typedef unsigned short int yytype_uint16;
#endif

#ifdef YYTYPE_INT16
typedef YYTYPE_INT16 yytype_int16;
#else
typedef short int yytype_int16;
#endif

#ifndef YYSIZE_T
# ifdef __SIZE_TYPE__
#  define YYSIZE_T __SIZE_TYPE__
# elif defined size_t
#  define YYSIZE_T size_t
# elif ! defined YYSIZE_T && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
#  include <stddef.h> /* INFRINGES ON USER NAME SPACE */
#  define YYSIZE_T size_t
# else
#  define YYSIZE_T unsigned int
# endif
#endif

#define YYSIZE_MAXIMUM ((YYSIZE_T) -1)

#ifndef YY_
# if YYENABLE_NLS
#  if ENABLE_NLS
#   include <libintl.h> /* INFRINGES ON USER NAME SPACE */
#   define YY_(msgid) dgettext ("bison-runtime", msgid)
#  endif
# endif
# ifndef YY_
#  define YY_(msgid) msgid
# endif
#endif

/* Suppress unused-variable warnings by "using" E.  */
#if ! defined lint || defined __GNUC__
# define YYUSE(e) ((void) (e))
#else
# define YYUSE(e) /* empty */
#endif

/* Identity function, used to suppress warnings about constant conditions.  */
#ifndef lint
# define YYID(n) (n)
#else
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static int
YYID (int yyi)
#else
static int
YYID (yyi)
    int yyi;
#endif
{
  return yyi;
}
#endif

#if ! defined yyoverflow || YYERROR_VERBOSE

/* The parser invokes alloca or malloc; define the necessary symbols.  */

# ifdef YYSTACK_USE_ALLOCA
#  if YYSTACK_USE_ALLOCA
#   ifdef __GNUC__
#    define YYSTACK_ALLOC __builtin_alloca
#   elif defined __BUILTIN_VA_ARG_INCR
#    include <alloca.h> /* INFRINGES ON USER NAME SPACE */
#   elif defined _AIX
#    define YYSTACK_ALLOC __alloca
#   elif defined _MSC_VER
#    include <malloc.h> /* INFRINGES ON USER NAME SPACE */
#    define alloca _alloca
#   else
#    define YYSTACK_ALLOC alloca
#    if ! defined _ALLOCA_H && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
#     include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#     ifndef _STDLIB_H
#      define _STDLIB_H 1
#     endif
#    endif
#   endif
#  endif
# endif

# ifdef YYSTACK_ALLOC
   /* Pacify GCC's `empty if-body' warning.  */
#  define YYSTACK_FREE(Ptr) do { /* empty */; } while (YYID (0))
#  ifndef YYSTACK_ALLOC_MAXIMUM
    /* The OS might guarantee only one guard page at the bottom of the stack,
       and a page size can be as small as 4096 bytes.  So we cannot safely
       invoke alloca (N) if N exceeds 4096.  Use a slightly smaller number
       to allow for a few compiler-allocated temporary stack slots.  */
#   define YYSTACK_ALLOC_MAXIMUM 4032 /* reasonable circa 2006 */
#  endif
# else
#  define YYSTACK_ALLOC YYMALLOC
#  define YYSTACK_FREE YYFREE
#  ifndef YYSTACK_ALLOC_MAXIMUM
#   define YYSTACK_ALLOC_MAXIMUM YYSIZE_MAXIMUM
#  endif
#  if (defined __cplusplus && ! defined _STDLIB_H \
       && ! ((defined YYMALLOC || defined malloc) \
	     && (defined YYFREE || defined free)))
#   include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#   ifndef _STDLIB_H
#    define _STDLIB_H 1
#   endif
#  endif
#  ifndef YYMALLOC
#   define YYMALLOC malloc
#   if ! defined malloc && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
void *malloc (YYSIZE_T); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
#  ifndef YYFREE
#   define YYFREE free
#   if ! defined free && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
void free (void *); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
# endif
#endif /* ! defined yyoverflow || YYERROR_VERBOSE */


#if (! defined yyoverflow \
     && (! defined __cplusplus \
	 || (defined YYSTYPE_IS_TRIVIAL && YYSTYPE_IS_TRIVIAL)))

/* A type that is properly aligned for any stack member.  */
union yyalloc
{
  yytype_int16 yyss_alloc;
  YYSTYPE yyvs_alloc;
};

/* The size of the maximum gap between one aligned stack and the next.  */
# define YYSTACK_GAP_MAXIMUM (sizeof (union yyalloc) - 1)

/* The size of an array large to enough to hold all stacks, each with
   N elements.  */
# define YYSTACK_BYTES(N) \
     ((N) * (sizeof (yytype_int16) + sizeof (YYSTYPE)) \
      + YYSTACK_GAP_MAXIMUM)

/* Copy COUNT objects from FROM to TO.  The source and destination do
   not overlap.  */
# ifndef YYCOPY
#  if defined __GNUC__ && 1 < __GNUC__
#   define YYCOPY(To, From, Count) \
      __builtin_memcpy (To, From, (Count) * sizeof (*(From)))
#  else
#   define YYCOPY(To, From, Count)		\
      do					\
	{					\
	  YYSIZE_T yyi;				\
	  for (yyi = 0; yyi < (Count); yyi++)	\
	    (To)[yyi] = (From)[yyi];		\
	}					\
      while (YYID (0))
#  endif
# endif

/* Relocate STACK from its old location to the new one.  The
   local variables YYSIZE and YYSTACKSIZE give the old and new number of
   elements in the stack, and YYPTR gives the new location of the
   stack.  Advance YYPTR to a properly aligned location for the next
   stack.  */
# define YYSTACK_RELOCATE(Stack_alloc, Stack)				\
    do									\
      {									\
	YYSIZE_T yynewbytes;						\
	YYCOPY (&yyptr->Stack_alloc, Stack, yysize);			\
	Stack = &yyptr->Stack_alloc;					\
	yynewbytes = yystacksize * sizeof (*Stack) + YYSTACK_GAP_MAXIMUM; \
	yyptr += yynewbytes / sizeof (*yyptr);				\
      }									\
    while (YYID (0))

#endif

/* YYFINAL -- State number of the termination state.  */
#define YYFINAL  61
/* YYLAST -- Last index in YYTABLE.  */
#define YYLAST   1430

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  87
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  51
/* YYNRULES -- Number of rules.  */
#define YYNRULES  203
/* YYNRULES -- Number of states.  */
#define YYNSTATES  356

/* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
#define YYUNDEFTOK  2
#define YYMAXUTOK   317

#define YYTRANSLATE(YYX)						\
  ((unsigned int) (YYX) <= YYMAXUTOK ? yytranslate[YYX] : YYUNDEFTOK)

/* YYTRANSLATE[YYLEX] -- Bison symbol number corresponding to YYLEX.  */
static const yytype_uint8 yytranslate[] =
{
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    81,     2,     2,     2,    24,    11,     2,
      74,    75,    22,    20,    79,    21,    78,    23,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    82,    84,
      14,    83,    15,     5,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,    76,     2,    77,    10,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    85,     9,    86,    80,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       6,     7,     8,    12,    13,    16,    17,    18,    19,    25,
      26,    27,    28,    29,    30,    31,    32,    33,    34,    35,
      36,    37,    38,    39,    40,    41,    42,    43,    44,    45,
      46,    47,    48,    49,    50,    51,    52,    53,    54,    55,
      56,    57,    58,    59,    60,    61,    62,    63,    64,    65,
      66,    67,    68,    69,    70,    71,    72,    73
};

#if YYDEBUG
/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static const yytype_uint16 yyprhs[] =
{
       0,     0,     3,     5,     7,     9,    13,    15,    20,    24,
      29,    33,    37,    40,    43,    45,    49,    51,    54,    57,
      60,    63,    66,    69,    72,    75,    78,    83,    85,    90,
      92,    98,   102,   106,   110,   114,   118,   122,   126,   130,
     134,   138,   142,   146,   150,   154,   158,   162,   166,   170,
     172,   176,   180,   184,   188,   192,   196,   200,   204,   208,
     212,   216,   218,   222,   224,   227,   231,   233,   236,   238,
     241,   243,   246,   248,   252,   254,   258,   260,   262,   264,
     266,   268,   270,   272,   274,   276,   278,   280,   282,   284,
     286,   288,   290,   292,   294,   296,   298,   301,   307,   312,
     315,   321,   326,   329,   331,   334,   338,   341,   343,   346,
     348,   350,   354,   356,   359,   363,   368,   374,   377,   379,
     383,   385,   389,   392,   394,   396,   400,   405,   409,   414,
     419,   423,   425,   428,   431,   435,   437,   441,   443,   447,
     450,   453,   455,   457,   461,   463,   466,   468,   470,   473,
     477,   480,   484,   488,   493,   496,   500,   504,   509,   511,
     515,   520,   522,   526,   530,   535,   539,   541,   543,   546,
     552,   560,   566,   572,   580,   590,   594,   597,   600,   603,
     607,   608,   610,   611,   613,   614,   616,   619,   623,   627,
     632,   634,   637,   639,   642,   644,   647,   649,   651,   654,
     658,   661,   664,   666
};

/* YYRHS -- A `-1'-separated list of the rules' RHS.  */
static const yytype_int16 yyrhs[] =
{
     133,     0,    -1,    25,    -1,    26,    -1,    27,    -1,    74,
      95,    75,    -1,    88,    -1,    89,    76,    95,    77,    -1,
      89,    74,    75,    -1,    89,    74,    90,    75,    -1,    89,
      78,    25,    -1,    89,    29,    25,    -1,    89,    30,    -1,
      89,    31,    -1,    94,    -1,    90,    79,    94,    -1,    89,
      -1,    30,    91,    -1,    31,    91,    -1,    11,    92,    -1,
      22,    92,    -1,    20,    92,    -1,    21,    92,    -1,    80,
      92,    -1,    81,    92,    -1,    28,    91,    -1,    28,    74,
     121,    75,    -1,    91,    -1,    74,   121,    75,    92,    -1,
      92,    -1,    93,     5,    95,    82,    93,    -1,    93,     7,
      93,    -1,    93,     8,    93,    -1,    93,     9,    93,    -1,
      93,    10,    93,    -1,    93,    11,    93,    -1,    93,    13,
      93,    -1,    93,    12,    93,    -1,    93,    14,    93,    -1,
      93,    15,    93,    -1,    93,    17,    93,    -1,    93,    16,
      93,    -1,    93,    19,    93,    -1,    93,    18,    93,    -1,
      93,    20,    93,    -1,    93,    21,    93,    -1,    93,    22,
      93,    -1,    93,    23,    93,    -1,    93,    24,    93,    -1,
      93,    -1,    91,    83,    94,    -1,    91,    32,    94,    -1,
      91,    33,    94,    -1,    91,    34,    94,    -1,    91,    35,
      94,    -1,    91,    36,    94,    -1,    91,    37,    94,    -1,
      91,    38,    94,    -1,    91,    39,    94,    -1,    91,    40,
      94,    -1,    91,    41,    94,    -1,    94,    -1,    95,    79,
      94,    -1,    93,    -1,    98,    84,    -1,    98,    99,    84,
      -1,   101,    -1,   101,    98,    -1,   102,    -1,   102,    98,
      -1,   103,    -1,   103,    98,    -1,   100,    -1,    99,    79,
     100,    -1,   114,    -1,   114,    83,   124,    -1,    43,    -1,
      44,    -1,    45,    -1,    46,    -1,    47,    -1,    58,    -1,
      48,    -1,    49,    -1,    50,    -1,    51,    -1,    54,    -1,
      55,    -1,    52,    -1,    53,    -1,   105,    -1,   111,    -1,
      42,    -1,    56,    -1,    57,    -1,   103,    -1,   104,   103,
      -1,    59,    25,    85,   106,    86,    -1,    59,    85,   106,
      86,    -1,    59,    25,    -1,    60,    25,    85,   106,    86,
      -1,    60,    85,   106,    86,    -1,    60,    25,    -1,   107,
      -1,   106,   107,    -1,   108,   109,    84,    -1,   102,   108,
      -1,   102,    -1,   103,   108,    -1,   103,    -1,   110,    -1,
     109,    79,   110,    -1,   114,    -1,    82,    96,    -1,   114,
      82,    96,    -1,    61,    85,   112,    86,    -1,    61,    25,
      85,   112,    86,    -1,    61,    25,    -1,   113,    -1,   112,
      79,   113,    -1,    25,    -1,    25,    83,    96,    -1,   116,
     115,    -1,   115,    -1,    25,    -1,    74,   114,    75,    -1,
     115,    76,    96,    77,    -1,   115,    76,    77,    -1,   115,
      74,   117,    75,    -1,   115,    74,   120,    75,    -1,   115,
      74,    75,    -1,    22,    -1,    22,   104,    -1,    22,   116,
      -1,    22,   104,   116,    -1,   118,    -1,   118,    79,    62,
      -1,   119,    -1,   118,    79,   119,    -1,    98,   114,    -1,
      98,   122,    -1,    98,    -1,    25,    -1,   120,    79,    25,
      -1,   108,    -1,   108,   122,    -1,   116,    -1,   123,    -1,
     116,   123,    -1,    74,   122,    75,    -1,    76,    77,    -1,
      76,    96,    77,    -1,   123,    76,    77,    -1,   123,    76,
      96,    77,    -1,    74,    75,    -1,    74,   117,    75,    -1,
     123,    74,    75,    -1,   123,    74,   117,    75,    -1,    94,
      -1,    85,   125,    86,    -1,    85,   125,    79,    86,    -1,
     124,    -1,   125,    79,   124,    -1,    25,    82,   126,    -1,
      63,    96,    82,   126,    -1,    64,    82,   126,    -1,   130,
      -1,    84,    -1,    95,    84,    -1,    65,    74,    95,    75,
     126,    -1,    65,    74,    95,    75,   126,     4,   126,    -1,
      66,    74,    95,    75,   126,    -1,    67,    74,    95,    75,
     126,    -1,    68,   126,    67,    74,    95,    75,    84,    -1,
      69,    74,   127,    84,   128,    84,   129,    75,   126,    -1,
      70,    25,    84,    -1,    71,    84,    -1,    72,    84,    -1,
      73,    84,    -1,    73,    95,    84,    -1,    -1,    95,    -1,
      -1,    95,    -1,    -1,    95,    -1,    85,    86,    -1,    85,
     132,    86,    -1,    85,   131,    86,    -1,    85,   131,   132,
      86,    -1,    97,    -1,   131,    97,    -1,   126,    -1,   132,
     126,    -1,   134,    -1,   133,   134,    -1,   135,    -1,    97,
      -1,   136,   137,    -1,    98,   114,   131,    -1,    98,   114,
      -1,   114,   131,    -1,   114,    -1,   130,    -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static const yytype_uint16 yyrline[] =
{
       0,    68,    68,    69,    70,    71,    75,    76,    77,    78,
      79,    80,    81,    82,    86,    87,    91,    92,    93,    94,
      95,    96,    97,    98,    99,   100,   101,   105,   106,   110,
     111,   112,   113,   114,   115,   116,   117,   118,   119,   120,
     121,   122,   123,   124,   125,   126,   127,   128,   129,   133,
     134,   135,   136,   137,   138,   139,   140,   141,   142,   143,
     144,   148,   149,   153,   157,   158,   162,   163,   164,   165,
     166,   167,   171,   172,   176,   177,   181,   182,   183,   184,
     185,   189,   190,   191,   192,   193,   194,   195,   196,   197,
     198,   199,   200,   204,   205,   209,   210,   214,   215,   216,
     217,   218,   219,   224,   225,   229,   233,   234,   235,   236,
     240,   241,   245,   246,   247,   251,   252,   253,   257,   258,
     262,   263,   267,   268,   272,   273,   274,   275,   276,   277,
     278,   282,   283,   284,   285,   289,   290,   294,   295,   299,
     300,   301,   305,   306,   310,   311,   315,   316,   317,   321,
     322,   323,   324,   325,   326,   327,   328,   329,   333,   334,
     335,   339,   340,   344,   345,   346,   348,   349,   350,   352,
     353,   354,   356,   357,   358,   360,   361,   362,   363,   364,
     368,   369,   373,   374,   378,   379,   383,   384,   385,   386,
     390,   391,   395,   396,   400,   401,   405,   406,   410,   414,
     415,   416,   417,   421
};
#endif

#if YYDEBUG || YYERROR_VERBOSE || YYTOKEN_TABLE
/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "$end", "error", "$undefined", "LOWER_THAN_ELSE", "ELSE", "'?'",
  "COLON", "OR_OP", "AND_OP", "'|'", "'^'", "'&'", "NE_OP", "EQ_OP", "'<'",
  "'>'", "GE_OP", "LE_OP", "RIGHT_OP", "LEFT_OP", "'+'", "'-'", "'*'",
  "'/'", "'%'", "IDENTIFIER", "CONSTANT", "STRING_LITERAL", "SIZEOF",
  "PTR_OP", "INC_OP", "DEC_OP", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN",
  "ADD_ASSIGN", "SUB_ASSIGN", "LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN",
  "XOR_ASSIGN", "OR_ASSIGN", "TYPE_NAME", "TYPEDEF", "EXTERN", "STATIC",
  "AUTO", "REGISTER", "CHAR", "SHORT", "INT", "LONG", "SIGNED", "UNSIGNED",
  "FLOAT", "DOUBLE", "CONST", "VOLATILE", "VOID", "STRUCT", "UNION",
  "ENUM", "ELLIPSIS", "CASE", "DEFAULT", "IF", "SWITCH", "WHILE", "DO",
  "FOR", "GOTO", "CONTINUE", "BREAK", "RETURN", "'('", "')'", "'['", "']'",
  "'.'", "','", "'~'", "'!'", "':'", "'='", "';'", "'{'", "'}'", "$accept",
  "PrimaryExp", "PostfixExp", "ArgExpList", "UnaryExp", "CastExp",
  "CondExp", "AssignExp", "Exp", "ConstExp", "Declaration",
  "Declaration_Spec", "init_decl_s", "init_decl", "StorageSpec",
  "TypeSpec", "TypeQua", "TypeQua_s", "StructUnionSpec",
  "struct_Declaration_s", "struct_Declaration", "SpecQua_s",
  "struct_decl_s", "struct_decl", "EnumSpec", "Enum_s", "Enum",
  "declarator", "direct_decl", "pointer", "ParamType_s", "Param_s",
  "Param_Declaration", "Ident_s", "type_name", "abs_decl",
  "direct_abs_decl", "Init", "Init_s", "Stmt", "Exp1", "Exp2", "Exp3",
  "Block", "Declaration_s", "Stmt_s", "TransUnit", "ExternalDef",
  "FunctionDef", "FunctionDecl", "FunctionBody", 0
};
#endif

# ifdef YYPRINT
/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static const yytype_uint16 yytoknum[] =
{
       0,   256,   257,   258,   259,    63,   260,   261,   262,   124,
      94,    38,   263,   264,    60,    62,   265,   266,   267,   268,
      43,    45,    42,    47,    37,   269,   270,   271,   272,   273,
     274,   275,   276,   277,   278,   279,   280,   281,   282,   283,
     284,   285,   286,   287,   288,   289,   290,   291,   292,   293,
     294,   295,   296,   297,   298,   299,   300,   301,   302,   303,
     304,   305,   306,   307,   308,   309,   310,   311,   312,   313,
     314,   315,   316,   317,    40,    41,    91,    93,    46,    44,
     126,    33,    58,    61,    59,   123,   125
};
# endif

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static const yytype_uint8 yyr1[] =
{
       0,    87,    88,    88,    88,    88,    89,    89,    89,    89,
      89,    89,    89,    89,    90,    90,    91,    91,    91,    91,
      91,    91,    91,    91,    91,    91,    91,    92,    92,    93,
      93,    93,    93,    93,    93,    93,    93,    93,    93,    93,
      93,    93,    93,    93,    93,    93,    93,    93,    93,    94,
      94,    94,    94,    94,    94,    94,    94,    94,    94,    94,
      94,    95,    95,    96,    97,    97,    98,    98,    98,    98,
      98,    98,    99,    99,   100,   100,   101,   101,   101,   101,
     101,   102,   102,   102,   102,   102,   102,   102,   102,   102,
     102,   102,   102,   103,   103,   104,   104,   105,   105,   105,
     105,   105,   105,   106,   106,   107,   108,   108,   108,   108,
     109,   109,   110,   110,   110,   111,   111,   111,   112,   112,
     113,   113,   114,   114,   115,   115,   115,   115,   115,   115,
     115,   116,   116,   116,   116,   117,   117,   118,   118,   119,
     119,   119,   120,   120,   121,   121,   122,   122,   122,   123,
     123,   123,   123,   123,   123,   123,   123,   123,   124,   124,
     124,   125,   125,   126,   126,   126,   126,   126,   126,   126,
     126,   126,   126,   126,   126,   126,   126,   126,   126,   126,
     127,   127,   128,   128,   129,   129,   130,   130,   130,   130,
     131,   131,   132,   132,   133,   133,   134,   134,   135,   136,
     136,   136,   136,   137
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static const yytype_uint8 yyr2[] =
{
       0,     2,     1,     1,     1,     3,     1,     4,     3,     4,
       3,     3,     2,     2,     1,     3,     1,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     4,     1,     4,     1,
       5,     3,     3,     3,     3,     3,     3,     3,     3,     3,
       3,     3,     3,     3,     3,     3,     3,     3,     3,     1,
       3,     3,     3,     3,     3,     3,     3,     3,     3,     3,
       3,     1,     3,     1,     2,     3,     1,     2,     1,     2,
       1,     2,     1,     3,     1,     3,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     2,     5,     4,     2,
       5,     4,     2,     1,     2,     3,     2,     1,     2,     1,
       1,     3,     1,     2,     3,     4,     5,     2,     1,     3,
       1,     3,     2,     1,     1,     3,     4,     3,     4,     4,
       3,     1,     2,     2,     3,     1,     3,     1,     3,     2,
       2,     1,     1,     3,     1,     2,     1,     1,     2,     3,
       2,     3,     3,     4,     2,     3,     3,     4,     1,     3,
       4,     1,     3,     3,     4,     3,     1,     1,     2,     5,
       7,     5,     5,     7,     9,     3,     2,     2,     2,     3,
       0,     1,     0,     1,     0,     1,     2,     3,     3,     4,
       1,     2,     1,     2,     1,     2,     1,     1,     2,     3,
       2,     2,     1,     1
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static const yytype_uint8 yydefact[] =
{
       0,   131,   124,    92,    76,    77,    78,    79,    80,    82,
      83,    84,    85,    88,    89,    86,    87,    93,    94,    81,
       0,     0,     0,     0,   197,     0,    66,    68,    70,    90,
      91,   202,   123,     0,     0,   194,   196,     0,    95,   132,
     133,    99,     0,   102,     0,   117,     0,     0,    64,     0,
      72,    74,    67,    69,    71,   190,     0,   201,     0,     0,
     122,     1,   195,     0,   203,   198,    96,   134,     0,   107,
     109,     0,   103,     0,     0,     0,     0,   120,     0,   118,
     125,     0,    65,     0,   199,    74,   191,   142,   130,   141,
       0,   135,   137,     0,     0,     0,     0,     0,     2,     3,
       4,     0,     0,     0,     0,   127,     0,     0,     6,    16,
      27,    29,    63,     0,     2,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,   167,   186,    27,    49,
      61,     0,   192,   166,     0,     0,     0,   106,   108,    98,
     104,     0,     0,   110,   112,     0,   101,     0,     0,     0,
     115,    73,     0,   158,    75,     0,     0,   139,   146,   140,
     147,   128,     0,   129,     0,    19,    21,    22,    20,     0,
      25,     0,    17,    18,     0,   144,     0,    23,    24,     0,
      12,    13,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   126,     0,     0,     0,     0,     0,
       0,     0,   180,     0,   176,   177,   178,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     168,   188,     0,   187,   193,    97,   113,     0,   105,     0,
     100,   116,   121,   119,   161,     0,   154,     0,     0,   150,
       0,   148,     0,     0,   136,   138,   143,     0,     5,     0,
     146,   145,     0,    11,     8,     0,    14,     0,    10,     0,
      31,    32,    33,    34,    35,    37,    36,    38,    39,    41,
      40,    43,    42,    44,    45,    46,    47,    48,   163,     0,
     165,     0,     0,     0,     0,   181,     0,   175,   179,    51,
      52,    53,    54,    55,    56,    57,    58,    59,    60,    50,
      62,   189,   111,   114,     0,   159,   155,   149,   151,   156,
       0,   152,     0,    26,    28,     9,     0,     7,     0,   164,
       0,     0,     0,     0,   182,   160,   162,   157,   153,    15,
      30,   169,   171,   172,     0,   183,     0,     0,     0,   184,
     170,   173,   185,     0,     0,   174
};

/* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int16 yydefgoto[] =
{
      -1,   108,   109,   265,   128,   111,   129,   130,   131,   113,
      55,    56,    49,    50,    26,    27,    28,    39,    29,    71,
      72,    73,   142,   143,    30,    78,    79,    31,    32,    33,
     247,    91,    92,    93,   176,   248,   160,   154,   245,   132,
     296,   346,   353,   133,    57,   135,    34,    35,    36,    37,
      65
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
#define YYPACT_NINF -156
static const yytype_int16 yypact[] =
{
    1011,    36,  -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,
    -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,
     -19,   -12,   -10,   151,  -156,     2,  1256,  1256,  1256,  -156,
    -156,  1256,    42,     4,   641,  -156,  -156,   -68,  -156,    36,
    -156,   -64,  1276,   -54,  1276,   -53,    20,   -22,  -156,    19,
    -156,  1181,  -156,  -156,  -156,  -156,     2,  1256,  1048,   600,
      42,  -156,  -156,   339,  -156,  -156,  -156,  -156,  1276,  1276,
    1276,  1076,  -156,    39,  1276,  1096,    20,    21,   -45,  -156,
    -156,   151,  -156,   692,  1256,    41,  -156,  -156,  -156,    98,
      50,    87,  -156,   -16,   857,   857,   857,   857,  -156,  -156,
    -156,   869,   931,   931,   770,  -156,   857,   857,  -156,   236,
    -156,  -156,  1196,   105,   166,   857,   201,   196,   210,   211,
     588,   212,   263,   177,   205,   705,  -156,  -156,   181,  1196,
    -156,    35,  -156,  -156,   406,   473,  1116,  -156,  -156,  -156,
    -156,   857,   100,  -156,   208,  1136,  -156,   -24,   857,    20,
    -156,  -156,   692,  -156,  -156,   922,   728,  -156,     3,  -156,
     125,  -156,  1235,  -156,   266,  -156,  -156,  -156,  -156,   770,
    -156,   857,  -156,  -156,    47,    -6,   218,  -156,  -156,   272,
    -156,  -156,   827,   857,   273,   857,   857,   857,   857,   857,
     857,   857,   857,   857,   857,   857,   857,   857,   857,   857,
     857,   857,   857,   857,  -156,   588,   217,   588,   857,   857,
     857,   237,   857,   221,  -156,  -156,  -156,   102,   857,   857,
     857,   857,   857,   857,   857,   857,   857,   857,   857,   857,
    -156,  -156,   497,  -156,  -156,  -156,  -156,    39,  -156,   857,
    -156,  -156,  -156,  -156,  -156,     9,  -156,   233,   234,  -156,
     238,   125,  1201,   845,  -156,  -156,  -156,   241,  -156,   971,
     155,  -156,   857,  -156,  -156,   108,  -156,   194,  -156,   144,
    1348,  1364,  1379,  1393,  1406,  1060,  1060,   187,   187,   187,
     187,   257,   257,   168,   168,  -156,  -156,  -156,  -156,   588,
    -156,   118,   149,   175,   239,   240,   242,  -156,  -156,  -156,
    -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,  -156,
    -156,  -156,  -156,  -156,   564,  -156,  -156,  -156,  -156,  -156,
     245,  -156,   244,  -156,  -156,  -156,   857,  -156,   857,  -156,
     588,   588,   588,   857,   857,  -156,  -156,  -156,  -156,  -156,
    1331,   313,  -156,  -156,   176,   240,   243,   588,   246,   857,
    -156,  -156,   240,   247,   588,  -156
};

/* YYPGOTO[NTERM-NUM].  */
static const yytype_int16 yypgoto[] =
{
    -156,  -156,  -156,  -156,   -59,   -87,   -41,    18,  -100,   -76,
      33,    23,  -156,   248,  -156,   232,   188,  -156,  -156,   -14,
     -49,   -58,  -156,    86,  -156,   249,   182,   179,     7,    13,
     -57,  -156,   173,  -156,   159,   -84,  -155,  -150,  -156,   -36,
    -156,  -156,  -156,   300,    43,   204,  -156,   305,  -156,  -156,
    -156
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
#define YYTABLE_NINF -201
static const yytype_int16 yytable[] =
{
     110,    90,   244,   251,   174,   159,    41,   165,   166,   167,
     168,   137,   138,    43,    40,    45,     1,    63,   112,   177,
     178,    68,   140,    25,     1,   217,   140,     2,     2,     2,
      75,    74,    76,    24,   149,   110,   110,   110,   110,   206,
      60,   150,   170,   172,   173,    77,   175,   110,   110,    52,
      53,    54,    67,    80,   136,   149,   110,    25,     1,   163,
     145,     1,   241,   164,     2,   236,    42,    24,   259,   174,
     156,   174,   242,    44,   112,    46,    23,   155,    23,   156,
     250,    89,   110,   267,   211,   269,    48,   140,   314,   110,
      86,   261,    17,    18,    84,   315,   140,   110,    81,   234,
     112,   153,   158,    82,   148,   251,   134,   112,   291,   292,
     293,   175,   295,    23,   229,   112,    58,    86,    59,   230,
       1,   141,   258,     2,    83,   161,   229,   110,   110,   110,
     110,   110,   110,   110,   110,   110,   110,   110,   110,   110,
     110,   110,   110,   110,   110,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   313,   336,    60,   162,    86,   158,   288,
     153,   290,   155,     1,   156,   324,     2,   322,    89,   237,
     110,   229,   204,   325,   238,    89,   298,   326,   260,    38,
     201,   202,   203,   330,   110,   320,   234,   229,   112,   252,
     266,   253,    47,   110,    51,   197,   198,   199,   200,   201,
     202,   203,   112,   218,   219,   220,   221,   222,   223,   224,
     225,   226,   227,   229,   331,    23,   328,    66,   229,   259,
      70,   156,    70,   344,   345,    85,   299,   300,   301,   302,
     303,   304,   305,   306,   307,   308,   309,   310,   205,   352,
     332,   348,   144,   329,   229,   229,    70,    70,    70,    70,
      85,   214,    70,    70,   228,   179,   180,   181,   157,   110,
     208,   327,   260,   229,    69,    89,    69,   199,   200,   201,
     202,   203,    89,   207,   209,   210,   212,   340,   213,   215,
     239,   256,    70,   262,   341,   342,   343,   263,   268,   289,
      69,    69,    69,    69,   294,   297,    69,    69,   316,   317,
     182,   350,   183,   333,   184,   318,   323,   347,   355,   229,
     337,   338,   354,   312,    70,   147,   334,   349,   257,   151,
     351,   243,   153,    70,    47,   255,    69,    64,   232,    62,
       0,     0,     0,     0,   339,     0,     0,     0,     0,     0,
      94,     0,     0,     0,     0,     0,     0,    70,     0,    95,
      96,    97,     0,     0,   114,    99,   100,   101,    69,   102,
     103,     0,     0,     0,     0,     0,     0,    69,     0,     0,
       0,     3,     4,     5,     6,     7,     8,     9,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    21,
      22,    69,   115,   116,   117,   118,   119,   120,   121,   122,
     123,   124,   125,   104,     0,     0,   144,    94,     0,   106,
     107,     0,     0,   126,    63,   127,    95,    96,    97,     0,
       0,   114,    99,   100,   101,     0,   102,   103,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     0,   115,
     116,   117,   118,   119,   120,   121,   122,   123,   124,   125,
     104,     0,     0,     0,    94,     0,   106,   107,     0,     0,
     126,    63,   231,    95,    96,    97,     0,     0,   114,    99,
     100,   101,     0,   102,   103,     0,     0,     0,    94,     0,
       0,     0,     0,     0,     0,     0,     0,    95,    96,    97,
       0,     0,   114,    99,   100,   101,     0,   102,   103,     0,
       0,     0,     0,     0,     0,     0,   115,   116,   117,   118,
     119,   120,   121,   122,   123,   124,   125,   104,     0,     0,
       0,     0,     0,   106,   107,     0,     0,   126,    63,   233,
     115,   116,   117,   118,   119,   120,   121,   122,   123,   124,
     125,   104,     0,     0,     0,    94,     0,   106,   107,     0,
       0,   126,    63,   311,    95,    96,    97,     0,     0,    98,
      99,   100,   101,     0,   102,   103,     0,     0,     0,    94,
       0,     0,     0,     0,     0,     0,     0,     0,    95,    96,
      97,    94,     0,   114,    99,   100,   101,     0,   102,   103,
      95,    96,    97,     0,     0,    98,    99,   100,   101,     0,
     102,   103,     0,     0,     0,     0,     0,     0,   104,     0,
       0,    61,     0,     0,   106,   107,     0,     0,     0,   152,
     335,   115,   116,   117,   118,   119,   120,   121,   122,   123,
     124,   125,   104,     1,     0,     0,     2,     0,   106,   107,
       0,     0,   126,    63,   104,     0,     0,   105,     0,     0,
     106,   107,     0,     3,     4,     5,     6,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,    94,     0,     0,     0,     0,     0,     0,
       0,     0,    95,    96,    97,    23,    94,    98,    99,   100,
     101,     0,   102,   103,     0,    95,    96,    97,     0,     0,
      98,    99,   100,   101,     0,   102,   103,     0,     0,    94,
       0,     0,     0,     0,     0,     0,     0,     0,    95,    96,
      97,     0,     0,    98,    99,   100,   101,     0,   102,   103,
       0,     0,     0,     0,     0,     0,   104,     0,     0,     0,
       0,     0,   106,   107,     0,     0,     0,   152,     0,   104,
       0,    94,     0,     0,     0,   106,   107,     0,     0,   216,
      95,    96,    97,     0,     0,    98,    99,   100,   101,     0,
     102,   103,   104,     0,     0,   249,     0,     0,   106,   107,
       0,     0,     3,     0,     0,     0,     0,     0,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,     0,     0,     0,     0,     0,     0,    94,     0,
       0,     0,     0,     0,   104,     0,     0,    95,    96,    97,
     106,   107,    98,    99,   100,   101,    94,   102,   103,     0,
       0,     0,     0,     0,     0,    95,    96,    97,    94,     0,
      98,    99,   100,   101,     0,   102,   103,    95,    96,    97,
      94,     0,    98,    99,   100,   101,     0,   102,   103,    95,
      96,    97,     0,     0,    98,    99,   100,   101,     0,   102,
     103,   104,   264,     0,     0,     0,     0,   106,   107,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   104,
       0,     0,   321,     0,     0,   106,   107,     0,     0,     0,
       0,   104,     0,     0,     0,     0,     0,   106,   107,     0,
       0,     0,    94,   169,     1,     0,     0,     2,     0,   106,
     107,    95,    96,    97,     0,     0,    98,    99,   100,   101,
       0,   102,   103,     0,     3,     4,     5,     6,     7,     8,
       9,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    21,    22,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     1,     0,     0,   155,   246,   156,     0,
       0,     0,     0,     0,     0,   171,     0,     0,     0,     0,
       0,   106,   107,     3,     4,     5,     6,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,     1,     0,     0,     2,     0,     0,     0,
       0,     0,     0,     0,     0,   259,   246,   156,     0,     0,
       0,     0,     0,     3,     4,     5,     6,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,    87,   193,   194,   195,   196,   197,   198,
     199,   200,   201,   202,   203,    23,     0,     0,     0,     0,
       3,     4,     5,     6,     7,     8,     9,    10,    11,    12,
      13,    14,    15,    16,    17,    18,    19,    20,    21,    22,
       0,     0,     0,     0,     0,     0,     0,     0,     3,     0,
       0,     0,     0,    88,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     3,     0,
       0,     0,     0,     0,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     3,     0,
       0,     0,   139,     0,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     3,     0,
       0,     0,   146,     0,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     0,     0,
       0,   185,   235,   186,   187,   188,   189,   190,   191,   192,
     193,   194,   195,   196,   197,   198,   199,   200,   201,   202,
     203,     0,   240,     3,     4,     5,     6,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,     3,     4,     5,     6,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,     0,    83,     0,  -200,     0,     0,     0,
       0,     0,     0,     0,     0,     0,   319,     3,     4,     5,
       6,     7,     8,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,   254,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     3,     0,
       0,     0,     0,     0,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,   186,   187,
     188,   189,   190,   191,   192,   193,   194,   195,   196,   197,
     198,   199,   200,   201,   202,   203,   187,   188,   189,   190,
     191,   192,   193,   194,   195,   196,   197,   198,   199,   200,
     201,   202,   203,   188,   189,   190,   191,   192,   193,   194,
     195,   196,   197,   198,   199,   200,   201,   202,   203,   189,
     190,   191,   192,   193,   194,   195,   196,   197,   198,   199,
     200,   201,   202,   203,   190,   191,   192,   193,   194,   195,
     196,   197,   198,   199,   200,   201,   202,   203,   191,   192,
     193,   194,   195,   196,   197,   198,   199,   200,   201,   202,
     203
};

static const yytype_int16 yycheck[] =
{
      59,    58,   152,   158,   104,    89,    25,    94,    95,    96,
      97,    69,    70,    25,     1,    25,    22,    85,    59,   106,
     107,    85,    71,     0,    22,   125,    75,    25,    25,    25,
      44,    85,    85,     0,    79,    94,    95,    96,    97,   115,
      33,    86,   101,   102,   103,    25,   104,   106,   107,    26,
      27,    28,    39,    75,    68,    79,   115,    34,    22,    75,
      74,    22,    86,    79,    25,   141,    85,    34,    74,   169,
      76,   171,   148,    85,   115,    85,    74,    74,    74,    76,
     156,    58,   141,   183,   120,   185,    84,   136,    79,   148,
      57,   175,    56,    57,    51,    86,   145,   156,    79,   135,
     141,    83,    89,    84,    83,   260,    63,   148,   208,   209,
     210,   169,   212,    74,    79,   156,    74,    84,    76,    84,
      22,    82,    75,    25,    83,    75,    79,   186,   187,   188,
     189,   190,   191,   192,   193,   194,   195,   196,   197,   198,
     199,   200,   201,   202,   203,   186,   187,   188,   189,   190,
     191,   192,   193,   194,   195,   196,   197,   198,   199,   200,
     201,   202,   203,   239,   314,   158,    79,   134,   155,   205,
     152,   207,    74,    22,    76,   262,    25,   253,   155,    79,
     239,    79,    77,    75,    84,   162,    84,    79,   175,     1,
      22,    23,    24,    75,   253,   252,   232,    79,   239,    74,
     182,    76,    23,   262,    25,    18,    19,    20,    21,    22,
      23,    24,   253,    32,    33,    34,    35,    36,    37,    38,
      39,    40,    41,    79,    75,    74,    82,    39,    79,    74,
      42,    76,    44,   333,   334,    56,   218,   219,   220,   221,
     222,   223,   224,   225,   226,   227,   228,   229,    82,   349,
      75,    75,    73,   289,    79,    79,    68,    69,    70,    71,
      81,    84,    74,    75,    83,    29,    30,    31,    89,   328,
      74,    77,   259,    79,    42,   252,    44,    20,    21,    22,
      23,    24,   259,    82,    74,    74,    74,   328,    25,    84,
      82,    25,   104,    75,   330,   331,   332,    25,    25,    82,
      68,    69,    70,    71,    67,    84,    74,    75,    75,    75,
      74,   347,    76,    74,    78,    77,    75,     4,   354,    79,
      75,    77,    75,   237,   136,    76,    84,    84,   169,    81,
      84,   149,   314,   145,   155,   162,   104,    37,   134,    34,
      -1,    -1,    -1,    -1,   326,    -1,    -1,    -1,    -1,    -1,
      11,    -1,    -1,    -1,    -1,    -1,    -1,   169,    -1,    20,
      21,    22,    -1,    -1,    25,    26,    27,    28,   136,    30,
      31,    -1,    -1,    -1,    -1,    -1,    -1,   145,    -1,    -1,
      -1,    42,    43,    44,    45,    46,    47,    48,    49,    50,
      51,    52,    53,    54,    55,    56,    57,    58,    59,    60,
      61,   169,    63,    64,    65,    66,    67,    68,    69,    70,
      71,    72,    73,    74,    -1,    -1,   237,    11,    -1,    80,
      81,    -1,    -1,    84,    85,    86,    20,    21,    22,    -1,
      -1,    25,    26,    27,    28,    -1,    30,    31,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    42,    43,
      44,    45,    46,    47,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    -1,    63,
      64,    65,    66,    67,    68,    69,    70,    71,    72,    73,
      74,    -1,    -1,    -1,    11,    -1,    80,    81,    -1,    -1,
      84,    85,    86,    20,    21,    22,    -1,    -1,    25,    26,
      27,    28,    -1,    30,    31,    -1,    -1,    -1,    11,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    20,    21,    22,
      -1,    -1,    25,    26,    27,    28,    -1,    30,    31,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    63,    64,    65,    66,
      67,    68,    69,    70,    71,    72,    73,    74,    -1,    -1,
      -1,    -1,    -1,    80,    81,    -1,    -1,    84,    85,    86,
      63,    64,    65,    66,    67,    68,    69,    70,    71,    72,
      73,    74,    -1,    -1,    -1,    11,    -1,    80,    81,    -1,
      -1,    84,    85,    86,    20,    21,    22,    -1,    -1,    25,
      26,    27,    28,    -1,    30,    31,    -1,    -1,    -1,    11,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    20,    21,
      22,    11,    -1,    25,    26,    27,    28,    -1,    30,    31,
      20,    21,    22,    -1,    -1,    25,    26,    27,    28,    -1,
      30,    31,    -1,    -1,    -1,    -1,    -1,    -1,    74,    -1,
      -1,     0,    -1,    -1,    80,    81,    -1,    -1,    -1,    85,
      86,    63,    64,    65,    66,    67,    68,    69,    70,    71,
      72,    73,    74,    22,    -1,    -1,    25,    -1,    80,    81,
      -1,    -1,    84,    85,    74,    -1,    -1,    77,    -1,    -1,
      80,    81,    -1,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    60,    61,    11,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    20,    21,    22,    74,    11,    25,    26,    27,
      28,    -1,    30,    31,    -1,    20,    21,    22,    -1,    -1,
      25,    26,    27,    28,    -1,    30,    31,    -1,    -1,    11,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    20,    21,
      22,    -1,    -1,    25,    26,    27,    28,    -1,    30,    31,
      -1,    -1,    -1,    -1,    -1,    -1,    74,    -1,    -1,    -1,
      -1,    -1,    80,    81,    -1,    -1,    -1,    85,    -1,    74,
      -1,    11,    -1,    -1,    -1,    80,    81,    -1,    -1,    84,
      20,    21,    22,    -1,    -1,    25,    26,    27,    28,    -1,
      30,    31,    74,    -1,    -1,    77,    -1,    -1,    80,    81,
      -1,    -1,    42,    -1,    -1,    -1,    -1,    -1,    48,    49,
      50,    51,    52,    53,    54,    55,    56,    57,    58,    59,
      60,    61,    -1,    -1,    -1,    -1,    -1,    -1,    11,    -1,
      -1,    -1,    -1,    -1,    74,    -1,    -1,    20,    21,    22,
      80,    81,    25,    26,    27,    28,    11,    30,    31,    -1,
      -1,    -1,    -1,    -1,    -1,    20,    21,    22,    11,    -1,
      25,    26,    27,    28,    -1,    30,    31,    20,    21,    22,
      11,    -1,    25,    26,    27,    28,    -1,    30,    31,    20,
      21,    22,    -1,    -1,    25,    26,    27,    28,    -1,    30,
      31,    74,    75,    -1,    -1,    -1,    -1,    80,    81,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    74,
      -1,    -1,    77,    -1,    -1,    80,    81,    -1,    -1,    -1,
      -1,    74,    -1,    -1,    -1,    -1,    -1,    80,    81,    -1,
      -1,    -1,    11,    74,    22,    -1,    -1,    25,    -1,    80,
      81,    20,    21,    22,    -1,    -1,    25,    26,    27,    28,
      -1,    30,    31,    -1,    42,    43,    44,    45,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    55,    56,    57,
      58,    59,    60,    61,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    22,    -1,    -1,    74,    75,    76,    -1,
      -1,    -1,    -1,    -1,    -1,    74,    -1,    -1,    -1,    -1,
      -1,    80,    81,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    60,    61,    22,    -1,    -1,    25,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    74,    75,    76,    -1,    -1,
      -1,    -1,    -1,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    60,    61,    25,    14,    15,    16,    17,    18,    19,
      20,    21,    22,    23,    24,    74,    -1,    -1,    -1,    -1,
      42,    43,    44,    45,    46,    47,    48,    49,    50,    51,
      52,    53,    54,    55,    56,    57,    58,    59,    60,    61,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    42,    -1,
      -1,    -1,    -1,    75,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    42,    -1,
      -1,    -1,    -1,    -1,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    42,    -1,
      -1,    -1,    86,    -1,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    42,    -1,
      -1,    -1,    86,    -1,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    -1,    -1,
      -1,     5,    86,     7,     8,     9,    10,    11,    12,    13,
      14,    15,    16,    17,    18,    19,    20,    21,    22,    23,
      24,    -1,    86,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    60,    61,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    60,    61,    -1,    83,    -1,    85,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    75,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    42,    43,
      44,    45,    46,    47,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    42,    -1,
      -1,    -1,    -1,    -1,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,     7,     8,
       9,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    21,    22,    23,    24,     8,     9,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    21,
      22,    23,    24,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,    23,    24,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,    23,    24,    11,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    21,    22,    23,    24,    12,    13,
      14,    15,    16,    17,    18,    19,    20,    21,    22,    23,
      24
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static const yytype_uint8 yystos[] =
{
       0,    22,    25,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    60,    61,    74,    97,    98,   101,   102,   103,   105,
     111,   114,   115,   116,   133,   134,   135,   136,   103,   104,
     116,    25,    85,    25,    85,    25,    85,   114,    84,    99,
     100,   114,    98,    98,    98,    97,    98,   131,    74,    76,
     115,     0,   134,    85,   130,   137,   103,   116,    85,   102,
     103,   106,   107,   108,    85,   106,    85,    25,   112,   113,
      75,    79,    84,    83,   131,   114,    97,    25,    75,    98,
     117,   118,   119,   120,    11,    20,    21,    22,    25,    26,
      27,    28,    30,    31,    74,    77,    80,    81,    88,    89,
      91,    92,    93,    96,    25,    63,    64,    65,    66,    67,
      68,    69,    70,    71,    72,    73,    84,    86,    91,    93,
      94,    95,   126,   130,   131,   132,   106,   108,   108,    86,
     107,    82,   109,   110,   114,   106,    86,   112,    83,    79,
      86,   100,    85,    94,   124,    74,    76,   114,   116,   122,
     123,    75,    79,    75,    79,    92,    92,    92,    92,    74,
      91,    74,    91,    91,    95,   108,   121,    92,    92,    29,
      30,    31,    74,    76,    78,     5,     7,     8,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,    23,    24,    77,    82,    96,    82,    74,    74,
      74,   126,    74,    25,    84,    84,    84,    95,    32,    33,
      34,    35,    36,    37,    38,    39,    40,    41,    83,    79,
      84,    86,   132,    86,   126,    86,    96,    79,    84,    82,
      86,    86,    96,   113,   124,   125,    75,   117,   122,    77,
      96,   123,    74,    76,    62,   119,    25,   121,    75,    74,
     116,   122,    75,    25,    75,    90,    94,    95,    25,    95,
      93,    93,    93,    93,    93,    93,    93,    93,    93,    93,
      93,    93,    93,    93,    93,    93,    93,    93,   126,    82,
     126,    95,    95,    95,    67,    95,   127,    84,    84,    94,
      94,    94,    94,    94,    94,    94,    94,    94,    94,    94,
      94,    86,   110,    96,    79,    86,    75,    75,    77,    75,
     117,    77,    96,    75,    92,    75,    79,    77,    82,   126,
      75,    75,    75,    74,    84,    86,   124,    75,    77,    94,
      93,   126,   126,   126,    95,    95,   128,     4,    75,    84,
     126,    84,    95,   129,    75,   126
};

#define yyerrok		(yyerrstatus = 0)
#define yyclearin	(yychar = YYEMPTY)
#define YYEMPTY		(-2)
#define YYEOF		0

#define YYACCEPT	goto yyacceptlab
#define YYABORT		goto yyabortlab
#define YYERROR		goto yyerrorlab


/* Like YYERROR except do call yyerror.  This remains here temporarily
   to ease the transition to the new meaning of YYERROR, for GCC.
   Once GCC version 2 has supplanted version 1, this can go.  */

#define YYFAIL		goto yyerrlab

#define YYRECOVERING()  (!!yyerrstatus)

#define YYBACKUP(Token, Value)					\
do								\
  if (yychar == YYEMPTY && yylen == 1)				\
    {								\
      yychar = (Token);						\
      yylval = (Value);						\
      yytoken = YYTRANSLATE (yychar);				\
      YYPOPSTACK (1);						\
      goto yybackup;						\
    }								\
  else								\
    {								\
      yyerror (YY_("syntax error: cannot back up")); \
      YYERROR;							\
    }								\
while (YYID (0))


#define YYTERROR	1
#define YYERRCODE	256


/* YYLLOC_DEFAULT -- Set CURRENT to span from RHS[1] to RHS[N].
   If N is 0, then set CURRENT to the empty location which ends
   the previous symbol: RHS[0] (always defined).  */

#define YYRHSLOC(Rhs, K) ((Rhs)[K])
#ifndef YYLLOC_DEFAULT
# define YYLLOC_DEFAULT(Current, Rhs, N)				\
    do									\
      if (YYID (N))                                                    \
	{								\
	  (Current).first_line   = YYRHSLOC (Rhs, 1).first_line;	\
	  (Current).first_column = YYRHSLOC (Rhs, 1).first_column;	\
	  (Current).last_line    = YYRHSLOC (Rhs, N).last_line;		\
	  (Current).last_column  = YYRHSLOC (Rhs, N).last_column;	\
	}								\
      else								\
	{								\
	  (Current).first_line   = (Current).last_line   =		\
	    YYRHSLOC (Rhs, 0).last_line;				\
	  (Current).first_column = (Current).last_column =		\
	    YYRHSLOC (Rhs, 0).last_column;				\
	}								\
    while (YYID (0))
#endif


/* YY_LOCATION_PRINT -- Print the location on the stream.
   This macro was not mandated originally: define only if we know
   we won't break user code: when these are the locations we know.  */

#ifndef YY_LOCATION_PRINT
# if YYLTYPE_IS_TRIVIAL
#  define YY_LOCATION_PRINT(File, Loc)			\
     fprintf (File, "%d.%d-%d.%d",			\
	      (Loc).first_line, (Loc).first_column,	\
	      (Loc).last_line,  (Loc).last_column)
# else
#  define YY_LOCATION_PRINT(File, Loc) ((void) 0)
# endif
#endif


/* YYLEX -- calling `yylex' with the right arguments.  */

#ifdef YYLEX_PARAM
# define YYLEX yylex (YYLEX_PARAM)
#else
# define YYLEX yylex ()
#endif

/* Enable debugging if requested.  */
#if YYDEBUG

# ifndef YYFPRINTF
#  include <stdio.h> /* INFRINGES ON USER NAME SPACE */
#  define YYFPRINTF fprintf
# endif

# define YYDPRINTF(Args)			\
do {						\
  if (yydebug)					\
    YYFPRINTF Args;				\
} while (YYID (0))

# define YY_SYMBOL_PRINT(Title, Type, Value, Location)			  \
do {									  \
  if (yydebug)								  \
    {									  \
      YYFPRINTF (stderr, "%s ", Title);					  \
      yy_symbol_print (stderr,						  \
		  Type, Value); \
      YYFPRINTF (stderr, "\n");						  \
    }									  \
} while (YYID (0))


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

/*ARGSUSED*/
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_symbol_value_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
#else
static void
yy_symbol_value_print (yyoutput, yytype, yyvaluep)
    FILE *yyoutput;
    int yytype;
    YYSTYPE const * const yyvaluep;
#endif
{
  if (!yyvaluep)
    return;
# ifdef YYPRINT
  if (yytype < YYNTOKENS)
    YYPRINT (yyoutput, yytoknum[yytype], *yyvaluep);
# else
  YYUSE (yyoutput);
# endif
  switch (yytype)
    {
      default:
	break;
    }
}


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_symbol_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
#else
static void
yy_symbol_print (yyoutput, yytype, yyvaluep)
    FILE *yyoutput;
    int yytype;
    YYSTYPE const * const yyvaluep;
#endif
{
  if (yytype < YYNTOKENS)
    YYFPRINTF (yyoutput, "token %s (", yytname[yytype]);
  else
    YYFPRINTF (yyoutput, "nterm %s (", yytname[yytype]);

  yy_symbol_value_print (yyoutput, yytype, yyvaluep);
  YYFPRINTF (yyoutput, ")");
}

/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_stack_print (yytype_int16 *yybottom, yytype_int16 *yytop)
#else
static void
yy_stack_print (yybottom, yytop)
    yytype_int16 *yybottom;
    yytype_int16 *yytop;
#endif
{
  YYFPRINTF (stderr, "Stack now");
  for (; yybottom <= yytop; yybottom++)
    {
      int yybot = *yybottom;
      YYFPRINTF (stderr, " %d", yybot);
    }
  YYFPRINTF (stderr, "\n");
}

# define YY_STACK_PRINT(Bottom, Top)				\
do {								\
  if (yydebug)							\
    yy_stack_print ((Bottom), (Top));				\
} while (YYID (0))


/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_reduce_print (YYSTYPE *yyvsp, int yyrule)
#else
static void
yy_reduce_print (yyvsp, yyrule)
    YYSTYPE *yyvsp;
    int yyrule;
#endif
{
  int yynrhs = yyr2[yyrule];
  int yyi;
  unsigned long int yylno = yyrline[yyrule];
  YYFPRINTF (stderr, "Reducing stack by rule %d (line %lu):\n",
	     yyrule - 1, yylno);
  /* The symbols being reduced.  */
  for (yyi = 0; yyi < yynrhs; yyi++)
    {
      YYFPRINTF (stderr, "   $%d = ", yyi + 1);
      yy_symbol_print (stderr, yyrhs[yyprhs[yyrule] + yyi],
		       &(yyvsp[(yyi + 1) - (yynrhs)])
		       		       );
      YYFPRINTF (stderr, "\n");
    }
}

# define YY_REDUCE_PRINT(Rule)		\
do {					\
  if (yydebug)				\
    yy_reduce_print (yyvsp, Rule); \
} while (YYID (0))

/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
#else /* !YYDEBUG */
# define YYDPRINTF(Args)
# define YY_SYMBOL_PRINT(Title, Type, Value, Location)
# define YY_STACK_PRINT(Bottom, Top)
# define YY_REDUCE_PRINT(Rule)
#endif /* !YYDEBUG */


/* YYINITDEPTH -- initial size of the parser's stacks.  */
#ifndef	YYINITDEPTH
# define YYINITDEPTH 200
#endif

/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   YYSTACK_ALLOC_MAXIMUM < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */

#ifndef YYMAXDEPTH
# define YYMAXDEPTH 10000
#endif



#if YYERROR_VERBOSE

# ifndef yystrlen
#  if defined __GLIBC__ && defined _STRING_H
#   define yystrlen strlen
#  else
/* Return the length of YYSTR.  */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static YYSIZE_T
yystrlen (const char *yystr)
#else
static YYSIZE_T
yystrlen (yystr)
    const char *yystr;
#endif
{
  YYSIZE_T yylen;
  for (yylen = 0; yystr[yylen]; yylen++)
    continue;
  return yylen;
}
#  endif
# endif

# ifndef yystpcpy
#  if defined __GLIBC__ && defined _STRING_H && defined _GNU_SOURCE
#   define yystpcpy stpcpy
#  else
/* Copy YYSRC to YYDEST, returning the address of the terminating '\0' in
   YYDEST.  */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static char *
yystpcpy (char *yydest, const char *yysrc)
#else
static char *
yystpcpy (yydest, yysrc)
    char *yydest;
    const char *yysrc;
#endif
{
  char *yyd = yydest;
  const char *yys = yysrc;

  while ((*yyd++ = *yys++) != '\0')
    continue;

  return yyd - 1;
}
#  endif
# endif

# ifndef yytnamerr
/* Copy to YYRES the contents of YYSTR after stripping away unnecessary
   quotes and backslashes, so that it's suitable for yyerror.  The
   heuristic is that double-quoting is unnecessary unless the string
   contains an apostrophe, a comma, or backslash (other than
   backslash-backslash).  YYSTR is taken from yytname.  If YYRES is
   null, do not copy; instead, return the length of what the result
   would have been.  */
static YYSIZE_T
yytnamerr (char *yyres, const char *yystr)
{
  if (*yystr == '"')
    {
      YYSIZE_T yyn = 0;
      char const *yyp = yystr;

      for (;;)
	switch (*++yyp)
	  {
	  case '\'':
	  case ',':
	    goto do_not_strip_quotes;

	  case '\\':
	    if (*++yyp != '\\')
	      goto do_not_strip_quotes;
	    /* Fall through.  */
	  default:
	    if (yyres)
	      yyres[yyn] = *yyp;
	    yyn++;
	    break;

	  case '"':
	    if (yyres)
	      yyres[yyn] = '\0';
	    return yyn;
	  }
    do_not_strip_quotes: ;
    }

  if (! yyres)
    return yystrlen (yystr);

  return yystpcpy (yyres, yystr) - yyres;
}
# endif

/* Copy into YYRESULT an error message about the unexpected token
   YYCHAR while in state YYSTATE.  Return the number of bytes copied,
   including the terminating null byte.  If YYRESULT is null, do not
   copy anything; just return the number of bytes that would be
   copied.  As a special case, return 0 if an ordinary "syntax error"
   message will do.  Return YYSIZE_MAXIMUM if overflow occurs during
   size calculation.  */
static YYSIZE_T
yysyntax_error (char *yyresult, int yystate, int yychar)
{
  int yyn = yypact[yystate];

  if (! (YYPACT_NINF < yyn && yyn <= YYLAST))
    return 0;
  else
    {
      int yytype = YYTRANSLATE (yychar);
      YYSIZE_T yysize0 = yytnamerr (0, yytname[yytype]);
      YYSIZE_T yysize = yysize0;
      YYSIZE_T yysize1;
      int yysize_overflow = 0;
      enum { YYERROR_VERBOSE_ARGS_MAXIMUM = 5 };
      char const *yyarg[YYERROR_VERBOSE_ARGS_MAXIMUM];
      int yyx;

# if 0
      /* This is so xgettext sees the translatable formats that are
	 constructed on the fly.  */
      YY_("syntax error, unexpected %s");
      YY_("syntax error, unexpected %s, expecting %s");
      YY_("syntax error, unexpected %s, expecting %s or %s");
      YY_("syntax error, unexpected %s, expecting %s or %s or %s");
      YY_("syntax error, unexpected %s, expecting %s or %s or %s or %s");
# endif
      char *yyfmt;
      char const *yyf;
      static char const yyunexpected[] = "syntax error, unexpected %s";
      static char const yyexpecting[] = ", expecting %s";
      static char const yyor[] = " or %s";
      char yyformat[sizeof yyunexpected
		    + sizeof yyexpecting - 1
		    + ((YYERROR_VERBOSE_ARGS_MAXIMUM - 2)
		       * (sizeof yyor - 1))];
      char const *yyprefix = yyexpecting;

      /* Start YYX at -YYN if negative to avoid negative indexes in
	 YYCHECK.  */
      int yyxbegin = yyn < 0 ? -yyn : 0;

      /* Stay within bounds of both yycheck and yytname.  */
      int yychecklim = YYLAST - yyn + 1;
      int yyxend = yychecklim < YYNTOKENS ? yychecklim : YYNTOKENS;
      int yycount = 1;

      yyarg[0] = yytname[yytype];
      yyfmt = yystpcpy (yyformat, yyunexpected);

      for (yyx = yyxbegin; yyx < yyxend; ++yyx)
	if (yycheck[yyx + yyn] == yyx && yyx != YYTERROR)
	  {
	    if (yycount == YYERROR_VERBOSE_ARGS_MAXIMUM)
	      {
		yycount = 1;
		yysize = yysize0;
		yyformat[sizeof yyunexpected - 1] = '\0';
		break;
	      }
	    yyarg[yycount++] = yytname[yyx];
	    yysize1 = yysize + yytnamerr (0, yytname[yyx]);
	    yysize_overflow |= (yysize1 < yysize);
	    yysize = yysize1;
	    yyfmt = yystpcpy (yyfmt, yyprefix);
	    yyprefix = yyor;
	  }

      yyf = YY_(yyformat);
      yysize1 = yysize + yystrlen (yyf);
      yysize_overflow |= (yysize1 < yysize);
      yysize = yysize1;

      if (yysize_overflow)
	return YYSIZE_MAXIMUM;

      if (yyresult)
	{
	  /* Avoid sprintf, as that infringes on the user's name space.
	     Don't have undefined behavior even if the translation
	     produced a string with the wrong number of "%s"s.  */
	  char *yyp = yyresult;
	  int yyi = 0;
	  while ((*yyp = *yyf) != '\0')
	    {
	      if (*yyp == '%' && yyf[1] == 's' && yyi < yycount)
		{
		  yyp += yytnamerr (yyp, yyarg[yyi++]);
		  yyf += 2;
		}
	      else
		{
		  yyp++;
		  yyf++;
		}
	    }
	}
      return yysize;
    }
}
#endif /* YYERROR_VERBOSE */


/*-----------------------------------------------.
| Release the memory associated to this symbol.  |
`-----------------------------------------------*/

/*ARGSUSED*/
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yydestruct (const char *yymsg, int yytype, YYSTYPE *yyvaluep)
#else
static void
yydestruct (yymsg, yytype, yyvaluep)
    const char *yymsg;
    int yytype;
    YYSTYPE *yyvaluep;
#endif
{
  YYUSE (yyvaluep);

  if (!yymsg)
    yymsg = "Deleting";
  YY_SYMBOL_PRINT (yymsg, yytype, yyvaluep, yylocationp);

  switch (yytype)
    {

      default:
	break;
    }
}

/* Prevent warnings from -Wmissing-prototypes.  */
#ifdef YYPARSE_PARAM
#if defined __STDC__ || defined __cplusplus
int yyparse (void *YYPARSE_PARAM);
#else
int yyparse ();
#endif
#else /* ! YYPARSE_PARAM */
#if defined __STDC__ || defined __cplusplus
int yyparse (void);
#else
int yyparse ();
#endif
#endif /* ! YYPARSE_PARAM */


/* The lookahead symbol.  */
int yychar;

/* The semantic value of the lookahead symbol.  */
YYSTYPE yylval;

/* Number of syntax errors so far.  */
int yynerrs;



/*-------------------------.
| yyparse or yypush_parse.  |
`-------------------------*/

#ifdef YYPARSE_PARAM
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
int
yyparse (void *YYPARSE_PARAM)
#else
int
yyparse (YYPARSE_PARAM)
    void *YYPARSE_PARAM;
#endif
#else /* ! YYPARSE_PARAM */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
int
yyparse (void)
#else
int
yyparse ()

#endif
#endif
{


    int yystate;
    /* Number of tokens to shift before error messages enabled.  */
    int yyerrstatus;

    /* The stacks and their tools:
       `yyss': related to states.
       `yyvs': related to semantic values.

       Refer to the stacks thru separate pointers, to allow yyoverflow
       to reallocate them elsewhere.  */

    /* The state stack.  */
    yytype_int16 yyssa[YYINITDEPTH];
    yytype_int16 *yyss;
    yytype_int16 *yyssp;

    /* The semantic value stack.  */
    YYSTYPE yyvsa[YYINITDEPTH];
    YYSTYPE *yyvs;
    YYSTYPE *yyvsp;

    YYSIZE_T yystacksize;

  int yyn;
  int yyresult;
  /* Lookahead token as an internal (translated) token number.  */
  int yytoken;
  /* The variables used to return semantic value and location from the
     action routines.  */
  YYSTYPE yyval;

#if YYERROR_VERBOSE
  /* Buffer for error messages, and its allocated size.  */
  char yymsgbuf[128];
  char *yymsg = yymsgbuf;
  YYSIZE_T yymsg_alloc = sizeof yymsgbuf;
#endif

#define YYPOPSTACK(N)   (yyvsp -= (N), yyssp -= (N))

  /* The number of symbols on the RHS of the reduced rule.
     Keep to zero when no symbol should be popped.  */
  int yylen = 0;

  yytoken = 0;
  yyss = yyssa;
  yyvs = yyvsa;
  yystacksize = YYINITDEPTH;

  YYDPRINTF ((stderr, "Starting parse\n"));

  yystate = 0;
  yyerrstatus = 0;
  yynerrs = 0;
  yychar = YYEMPTY; /* Cause a token to be read.  */

  /* Initialize stack pointers.
     Waste one element of value and location stack
     so that they stay on the same level as the state stack.
     The wasted elements are never initialized.  */
  yyssp = yyss;
  yyvsp = yyvs;

  goto yysetstate;

/*------------------------------------------------------------.
| yynewstate -- Push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
 yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed.  So pushing a state here evens the stacks.  */
  yyssp++;

 yysetstate:
  *yyssp = yystate;

  if (yyss + yystacksize - 1 <= yyssp)
    {
      /* Get the current used size of the three stacks, in elements.  */
      YYSIZE_T yysize = yyssp - yyss + 1;

#ifdef yyoverflow
      {
	/* Give user a chance to reallocate the stack.  Use copies of
	   these so that the &'s don't force the real ones into
	   memory.  */
	YYSTYPE *yyvs1 = yyvs;
	yytype_int16 *yyss1 = yyss;

	/* Each stack pointer address is followed by the size of the
	   data in use in that stack, in bytes.  This used to be a
	   conditional around just the two extra args, but that might
	   be undefined if yyoverflow is a macro.  */
	yyoverflow (YY_("memory exhausted"),
		    &yyss1, yysize * sizeof (*yyssp),
		    &yyvs1, yysize * sizeof (*yyvsp),
		    &yystacksize);

	yyss = yyss1;
	yyvs = yyvs1;
      }
#else /* no yyoverflow */
# ifndef YYSTACK_RELOCATE
      goto yyexhaustedlab;
# else
      /* Extend the stack our own way.  */
      if (YYMAXDEPTH <= yystacksize)
	goto yyexhaustedlab;
      yystacksize *= 2;
      if (YYMAXDEPTH < yystacksize)
	yystacksize = YYMAXDEPTH;

      {
	yytype_int16 *yyss1 = yyss;
	union yyalloc *yyptr =
	  (union yyalloc *) YYSTACK_ALLOC (YYSTACK_BYTES (yystacksize));
	if (! yyptr)
	  goto yyexhaustedlab;
	YYSTACK_RELOCATE (yyss_alloc, yyss);
	YYSTACK_RELOCATE (yyvs_alloc, yyvs);
#  undef YYSTACK_RELOCATE
	if (yyss1 != yyssa)
	  YYSTACK_FREE (yyss1);
      }
# endif
#endif /* no yyoverflow */

      yyssp = yyss + yysize - 1;
      yyvsp = yyvs + yysize - 1;

      YYDPRINTF ((stderr, "Stack size increased to %lu\n",
		  (unsigned long int) yystacksize));

      if (yyss + yystacksize - 1 <= yyssp)
	YYABORT;
    }

  YYDPRINTF ((stderr, "Entering state %d\n", yystate));

  if (yystate == YYFINAL)
    YYACCEPT;

  goto yybackup;

/*-----------.
| yybackup.  |
`-----------*/
yybackup:

  /* Do appropriate processing given the current state.  Read a
     lookahead token if we need one and don't already have one.  */

  /* First try to decide what to do without reference to lookahead token.  */
  yyn = yypact[yystate];
  if (yyn == YYPACT_NINF)
    goto yydefault;

  /* Not known => get a lookahead token if don't already have one.  */

  /* YYCHAR is either YYEMPTY or YYEOF or a valid lookahead symbol.  */
  if (yychar == YYEMPTY)
    {
      YYDPRINTF ((stderr, "Reading a token: "));
      yychar = YYLEX;
    }

  if (yychar <= YYEOF)
    {
      yychar = yytoken = YYEOF;
      YYDPRINTF ((stderr, "Now at end of input.\n"));
    }
  else
    {
      yytoken = YYTRANSLATE (yychar);
      YY_SYMBOL_PRINT ("Next token is", yytoken, &yylval, &yylloc);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || YYLAST < yyn || yycheck[yyn] != yytoken)
    goto yydefault;
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == YYTABLE_NINF)
	goto yyerrlab;
      yyn = -yyn;
      goto yyreduce;
    }

  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus)
    yyerrstatus--;

  /* Shift the lookahead token.  */
  YY_SYMBOL_PRINT ("Shifting", yytoken, &yylval, &yylloc);

  /* Discard the shifted token.  */
  yychar = YYEMPTY;

  yystate = yyn;
  *++yyvsp = yylval;

  goto yynewstate;


/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    goto yyerrlab;
  goto yyreduce;


/*-----------------------------.
| yyreduce -- Do a reduction.  |
`-----------------------------*/
yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];

  /* If YYLEN is nonzero, implement the default value of the action:
     `$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsp[1-yylen];


  YY_REDUCE_PRINT (yyn);
  switch (yyn)
    {
        case 2:

/* Line 1455 of yacc.c  */
#line 68 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 3:

/* Line 1455 of yacc.c  */
#line 69 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 4:

/* Line 1455 of yacc.c  */
#line 70 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 5:

/* Line 1455 of yacc.c  */
#line 71 ".\\cgrammar-new.y"
    { (yyval.node) = link(exp_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 6:

/* Line 1455 of yacc.c  */
#line 75 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 7:

/* Line 1455 of yacc.c  */
#line 76 ".\\cgrammar-new.y"
    { (yyval.node) = link(array_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 8:

/* Line 1455 of yacc.c  */
#line 77 ".\\cgrammar-new.y"
    { (yyval.node) = link(funccall_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 9:

/* Line 1455 of yacc.c  */
#line 78 ".\\cgrammar-new.y"
    { (yyval.node) = link(funccall_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 10:

/* Line 1455 of yacc.c  */
#line 79 ".\\cgrammar-new.y"
    { (yyval.node) = link(member_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 11:

/* Line 1455 of yacc.c  */
#line 80 ".\\cgrammar-new.y"
    { (yyval.node) = link(ptrto_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 12:

/* Line 1455 of yacc.c  */
#line 81 ".\\cgrammar-new.y"
    { (yyval.node) = link(postinc_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 13:

/* Line 1455 of yacc.c  */
#line 82 ".\\cgrammar-new.y"
    { (yyval.node) = link(postdec_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 14:

/* Line 1455 of yacc.c  */
#line 86 ".\\cgrammar-new.y"
    { (yyval.node) = link(arguments_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 15:

/* Line 1455 of yacc.c  */
#line 87 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 16:

/* Line 1455 of yacc.c  */
#line 91 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 17:

/* Line 1455 of yacc.c  */
#line 92 ".\\cgrammar-new.y"
    { (yyval.node) = link(preinc_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 18:

/* Line 1455 of yacc.c  */
#line 93 ".\\cgrammar-new.y"
    { (yyval.node) = link(predec_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 19:

/* Line 1455 of yacc.c  */
#line 94 ".\\cgrammar-new.y"
    { (yyval.node) = link(addressof_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 20:

/* Line 1455 of yacc.c  */
#line 95 ".\\cgrammar-new.y"
    { (yyval.node) = link(contentsof_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 21:

/* Line 1455 of yacc.c  */
#line 96 ".\\cgrammar-new.y"
    { (yyval.node) = link(positive_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 22:

/* Line 1455 of yacc.c  */
#line 97 ".\\cgrammar-new.y"
    { (yyval.node) = link(negative_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 23:

/* Line 1455 of yacc.c  */
#line 98 ".\\cgrammar-new.y"
    { (yyval.node) = link(complement_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 24:

/* Line 1455 of yacc.c  */
#line 99 ".\\cgrammar-new.y"
    { (yyval.node) = link(not_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 25:

/* Line 1455 of yacc.c  */
#line 100 ".\\cgrammar-new.y"
    { (yyval.node) = link(sizeof_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 26:

/* Line 1455 of yacc.c  */
#line 101 ".\\cgrammar-new.y"
    { (yyval.node) = link(sizeof_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 27:

/* Line 1455 of yacc.c  */
#line 105 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 28:

/* Line 1455 of yacc.c  */
#line 106 ".\\cgrammar-new.y"
    { (yyval.node) = link(cast_, (yyvsp[(2) - (4)].node), (yyvsp[(4) - (4)].node), 0); ;}
    break;

  case 29:

/* Line 1455 of yacc.c  */
#line 110 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 30:

/* Line 1455 of yacc.c  */
#line 111 ".\\cgrammar-new.y"
    { (yyval.node) = link(question_, (yyvsp[(1) - (5)].node), (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0); ;}
    break;

  case 31:

/* Line 1455 of yacc.c  */
#line 112 ".\\cgrammar-new.y"
    { (yyval.node) = link(or_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 32:

/* Line 1455 of yacc.c  */
#line 113 ".\\cgrammar-new.y"
    { (yyval.node) = link(and_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 33:

/* Line 1455 of yacc.c  */
#line 114 ".\\cgrammar-new.y"
    { (yyval.node) = link(bitor_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 34:

/* Line 1455 of yacc.c  */
#line 115 ".\\cgrammar-new.y"
    { (yyval.node) = link(bitxor_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 35:

/* Line 1455 of yacc.c  */
#line 116 ".\\cgrammar-new.y"
    { (yyval.node) = link(bitand_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 36:

/* Line 1455 of yacc.c  */
#line 117 ".\\cgrammar-new.y"
    { (yyval.node) = link(eq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 37:

/* Line 1455 of yacc.c  */
#line 118 ".\\cgrammar-new.y"
    { (yyval.node) = link(ne_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 38:

/* Line 1455 of yacc.c  */
#line 119 ".\\cgrammar-new.y"
    { (yyval.node) = link(lt_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 39:

/* Line 1455 of yacc.c  */
#line 120 ".\\cgrammar-new.y"
    { (yyval.node) = link(gt_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 40:

/* Line 1455 of yacc.c  */
#line 121 ".\\cgrammar-new.y"
    { (yyval.node) = link(le_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 41:

/* Line 1455 of yacc.c  */
#line 122 ".\\cgrammar-new.y"
    { (yyval.node) = link(ge_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 42:

/* Line 1455 of yacc.c  */
#line 123 ".\\cgrammar-new.y"
    { (yyval.node) = link(shl_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 43:

/* Line 1455 of yacc.c  */
#line 124 ".\\cgrammar-new.y"
    { (yyval.node) = link(shr_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 44:

/* Line 1455 of yacc.c  */
#line 125 ".\\cgrammar-new.y"
    { (yyval.node) = link(add_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 45:

/* Line 1455 of yacc.c  */
#line 126 ".\\cgrammar-new.y"
    { (yyval.node) = link(sub_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 46:

/* Line 1455 of yacc.c  */
#line 127 ".\\cgrammar-new.y"
    { (yyval.node) = link(mul_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 47:

/* Line 1455 of yacc.c  */
#line 128 ".\\cgrammar-new.y"
    { (yyval.node) = link(div_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 48:

/* Line 1455 of yacc.c  */
#line 129 ".\\cgrammar-new.y"
    { (yyval.node) = link(mod_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 49:

/* Line 1455 of yacc.c  */
#line 133 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 50:

/* Line 1455 of yacc.c  */
#line 134 ".\\cgrammar-new.y"
    { (yyval.node) = link(equals_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 51:

/* Line 1455 of yacc.c  */
#line 135 ".\\cgrammar-new.y"
    { (yyval.node) = link(muleq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 52:

/* Line 1455 of yacc.c  */
#line 136 ".\\cgrammar-new.y"
    { (yyval.node) = link(diveq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 53:

/* Line 1455 of yacc.c  */
#line 137 ".\\cgrammar-new.y"
    { (yyval.node) = link(modeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 54:

/* Line 1455 of yacc.c  */
#line 138 ".\\cgrammar-new.y"
    { (yyval.node) = link(addeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 55:

/* Line 1455 of yacc.c  */
#line 139 ".\\cgrammar-new.y"
    { (yyval.node) = link(subeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 56:

/* Line 1455 of yacc.c  */
#line 140 ".\\cgrammar-new.y"
    { (yyval.node) = link(shleq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 57:

/* Line 1455 of yacc.c  */
#line 141 ".\\cgrammar-new.y"
    { (yyval.node) = link(shreq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 58:

/* Line 1455 of yacc.c  */
#line 142 ".\\cgrammar-new.y"
    { (yyval.node) = link(andeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 59:

/* Line 1455 of yacc.c  */
#line 143 ".\\cgrammar-new.y"
    { (yyval.node) = link(xoreq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 60:

/* Line 1455 of yacc.c  */
#line 144 ".\\cgrammar-new.y"
    { (yyval.node) = link(oreq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 61:

/* Line 1455 of yacc.c  */
#line 148 ".\\cgrammar-new.y"
    { (yyval.node) = link(assignment_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 62:

/* Line 1455 of yacc.c  */
#line 149 ".\\cgrammar-new.y"
    { (yyval.node) = link(comma_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 63:

/* Line 1455 of yacc.c  */
#line 153 ".\\cgrammar-new.y"
    { (yyval.node) = link(condexp_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 64:

/* Line 1455 of yacc.c  */
#line 157 ".\\cgrammar-new.y"
    { (yyval.node) = link(decl_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 65:

/* Line 1455 of yacc.c  */
#line 158 ".\\cgrammar-new.y"
    { (yyval.node) = link(decl_init_, (yyvsp[(1) - (3)].node), (yyvsp[(2) - (3)].node), 0); adjust_term((yyval.node), 4); ;}
    break;

  case 66:

/* Line 1455 of yacc.c  */
#line 162 ".\\cgrammar-new.y"
    { (yyval.node) = link(decl_spec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 67:

/* Line 1455 of yacc.c  */
#line 163 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 68:

/* Line 1455 of yacc.c  */
#line 164 ".\\cgrammar-new.y"
    { (yyval.node) = link(decl_spec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 69:

/* Line 1455 of yacc.c  */
#line 165 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 70:

/* Line 1455 of yacc.c  */
#line 166 ".\\cgrammar-new.y"
    { (yyval.node) = link(decl_spec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 71:

/* Line 1455 of yacc.c  */
#line 167 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 72:

/* Line 1455 of yacc.c  */
#line 171 ".\\cgrammar-new.y"
    { (yyval.node) = link(init_declarators_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 73:

/* Line 1455 of yacc.c  */
#line 172 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 74:

/* Line 1455 of yacc.c  */
#line 176 ".\\cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 75:

/* Line 1455 of yacc.c  */
#line 177 ".\\cgrammar-new.y"
    { (yyval.node) = link(declaratorinit_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 76:

/* Line 1455 of yacc.c  */
#line 181 ".\\cgrammar-new.y"
    { (yyval.node) = link(typedef_, 0); ;}
    break;

  case 77:

/* Line 1455 of yacc.c  */
#line 182 ".\\cgrammar-new.y"
    { (yyval.node) = link(extern_, 0); ;}
    break;

  case 78:

/* Line 1455 of yacc.c  */
#line 183 ".\\cgrammar-new.y"
    { (yyval.node) = link(static_, 0); ;}
    break;

  case 79:

/* Line 1455 of yacc.c  */
#line 184 ".\\cgrammar-new.y"
    { (yyval.node) = link(auto_, 0); ;}
    break;

  case 80:

/* Line 1455 of yacc.c  */
#line 185 ".\\cgrammar-new.y"
    { (yyval.node) = link(register_, 0); ;}
    break;

  case 81:

/* Line 1455 of yacc.c  */
#line 189 ".\\cgrammar-new.y"
    { (yyval.node) = link(void_, 0); ;}
    break;

  case 82:

/* Line 1455 of yacc.c  */
#line 190 ".\\cgrammar-new.y"
    { (yyval.node) = link(char_, 0); ;}
    break;

  case 83:

/* Line 1455 of yacc.c  */
#line 191 ".\\cgrammar-new.y"
    { (yyval.node) = link(short_, 0); ;}
    break;

  case 84:

/* Line 1455 of yacc.c  */
#line 192 ".\\cgrammar-new.y"
    { (yyval.node) = link(int_, 0); ;}
    break;

  case 85:

/* Line 1455 of yacc.c  */
#line 193 ".\\cgrammar-new.y"
    { (yyval.node) = link(long_, 0); ;}
    break;

  case 86:

/* Line 1455 of yacc.c  */
#line 194 ".\\cgrammar-new.y"
    { (yyval.node) = link(float_, 0); ;}
    break;

  case 87:

/* Line 1455 of yacc.c  */
#line 195 ".\\cgrammar-new.y"
    { (yyval.node) = link(double_, 0); ;}
    break;

  case 88:

/* Line 1455 of yacc.c  */
#line 196 ".\\cgrammar-new.y"
    { (yyval.node) = link(signed_, 0); ;}
    break;

  case 89:

/* Line 1455 of yacc.c  */
#line 197 ".\\cgrammar-new.y"
    { (yyval.node) = link(unsigned_, 0); ;}
    break;

  case 90:

/* Line 1455 of yacc.c  */
#line 198 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_or_union_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 91:

/* Line 1455 of yacc.c  */
#line 199 ".\\cgrammar-new.y"
    { (yyval.node) = link(enum_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 92:

/* Line 1455 of yacc.c  */
#line 200 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 93:

/* Line 1455 of yacc.c  */
#line 204 ".\\cgrammar-new.y"
    { (yyval.node) = link(const_, 0); ;}
    break;

  case 94:

/* Line 1455 of yacc.c  */
#line 205 ".\\cgrammar-new.y"
    { (yyval.node) = link(volatile_, 0); ;}
    break;

  case 95:

/* Line 1455 of yacc.c  */
#line 209 ".\\cgrammar-new.y"
    { (yyval.node) = link(type_qualifiers_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 96:

/* Line 1455 of yacc.c  */
#line 210 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 97:

/* Line 1455 of yacc.c  */
#line 214 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_, (yyvsp[(2) - (5)].node), (yyvsp[(4) - (5)].node), 0); ;}
    break;

  case 98:

/* Line 1455 of yacc.c  */
#line 215 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 99:

/* Line 1455 of yacc.c  */
#line 216 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 100:

/* Line 1455 of yacc.c  */
#line 217 ".\\cgrammar-new.y"
    { (yyval.node) = link(union_, (yyvsp[(2) - (5)].node), (yyvsp[(4) - (5)].node), 0); ;}
    break;

  case 101:

/* Line 1455 of yacc.c  */
#line 218 ".\\cgrammar-new.y"
    { (yyval.node) = link(union_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 102:

/* Line 1455 of yacc.c  */
#line 219 ".\\cgrammar-new.y"
    { (yyval.node) = link(union_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 103:

/* Line 1455 of yacc.c  */
#line 224 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_declarations_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 104:

/* Line 1455 of yacc.c  */
#line 225 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 105:

/* Line 1455 of yacc.c  */
#line 229 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_declaration_, (yyvsp[(1) - (3)].node), (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 106:

/* Line 1455 of yacc.c  */
#line 233 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 107:

/* Line 1455 of yacc.c  */
#line 234 ".\\cgrammar-new.y"
    { (yyval.node) = link(spec_qua_s_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 108:

/* Line 1455 of yacc.c  */
#line 235 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 109:

/* Line 1455 of yacc.c  */
#line 236 ".\\cgrammar-new.y"
    { (yyval.node) = link(spec_qua_s_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 110:

/* Line 1455 of yacc.c  */
#line 240 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_declarators_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 111:

/* Line 1455 of yacc.c  */
#line 241 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 112:

/* Line 1455 of yacc.c  */
#line 245 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 113:

/* Line 1455 of yacc.c  */
#line 246 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_declarator_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 114:

/* Line 1455 of yacc.c  */
#line 247 ".\\cgrammar-new.y"
    { (yyval.node) = link(struct_declarator_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 115:

/* Line 1455 of yacc.c  */
#line 251 ".\\cgrammar-new.y"
    { (yyval.node) = link(enum_spec_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 116:

/* Line 1455 of yacc.c  */
#line 252 ".\\cgrammar-new.y"
    { (yyval.node) = link(enum_spec_, (yyvsp[(2) - (5)].node), (yyvsp[(4) - (5)].node), 0); ;}
    break;

  case 117:

/* Line 1455 of yacc.c  */
#line 253 ".\\cgrammar-new.y"
    { (yyval.node) = link(enum_spec_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 118:

/* Line 1455 of yacc.c  */
#line 257 ".\\cgrammar-new.y"
    { (yyval.node) = link(enumerators_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 119:

/* Line 1455 of yacc.c  */
#line 258 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 120:

/* Line 1455 of yacc.c  */
#line 262 ".\\cgrammar-new.y"
    { (yyval.node) = link(enumident_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 121:

/* Line 1455 of yacc.c  */
#line 263 ".\\cgrammar-new.y"
    { (yyval.node) = link(enumequals_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 122:

/* Line 1455 of yacc.c  */
#line 267 ".\\cgrammar-new.y"
    { (yyval.node) = link(direct_decl_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 123:

/* Line 1455 of yacc.c  */
#line 268 ".\\cgrammar-new.y"
    { (yyval.node) = link(direct_decl_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 124:

/* Line 1455 of yacc.c  */
#line 272 ".\\cgrammar-new.y"
    { (yyval.node) = link(ident_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 125:

/* Line 1455 of yacc.c  */
#line 273 ".\\cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 126:

/* Line 1455 of yacc.c  */
#line 274 ".\\cgrammar-new.y"
    { (yyval.node) = link(arraydecl_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 127:

/* Line 1455 of yacc.c  */
#line 275 ".\\cgrammar-new.y"
    { (yyval.node) = link(arraydecl_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 128:

/* Line 1455 of yacc.c  */
#line 276 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 129:

/* Line 1455 of yacc.c  */
#line 277 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 130:

/* Line 1455 of yacc.c  */
#line 278 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 131:

/* Line 1455 of yacc.c  */
#line 282 ".\\cgrammar-new.y"
    {(yyval.node) = link(pointer_, 0); ;}
    break;

  case 132:

/* Line 1455 of yacc.c  */
#line 283 ".\\cgrammar-new.y"
    { (yyval.node) = link(pointer_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 133:

/* Line 1455 of yacc.c  */
#line 284 ".\\cgrammar-new.y"
    { (yyval.node) = link(pointer_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 134:

/* Line 1455 of yacc.c  */
#line 285 ".\\cgrammar-new.y"
    { (yyval.node) = link(pointer_, (yyvsp[(2) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 135:

/* Line 1455 of yacc.c  */
#line 289 ".\\cgrammar-new.y"
    { (yyval.node) = link(param_types_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 136:

/* Line 1455 of yacc.c  */
#line 290 ".\\cgrammar-new.y"
    { (yyval.node) = link(param_types_ellipsis_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 137:

/* Line 1455 of yacc.c  */
#line 294 ".\\cgrammar-new.y"
    { (yyval.node) = link(param_declarations_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 138:

/* Line 1455 of yacc.c  */
#line 295 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 139:

/* Line 1455 of yacc.c  */
#line 299 ".\\cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 140:

/* Line 1455 of yacc.c  */
#line 300 ".\\cgrammar-new.y"
    { (yyval.node) = link(absarg_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 141:

/* Line 1455 of yacc.c  */
#line 301 ".\\cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 142:

/* Line 1455 of yacc.c  */
#line 305 ".\\cgrammar-new.y"
    { (yyval.node) = link(idents_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 143:

/* Line 1455 of yacc.c  */
#line 306 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 144:

/* Line 1455 of yacc.c  */
#line 310 ".\\cgrammar-new.y"
    { (yyval.node) = link(typespec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 145:

/* Line 1455 of yacc.c  */
#line 311 ".\\cgrammar-new.y"
    { (yyval.node) = link(typespec_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 146:

/* Line 1455 of yacc.c  */
#line 315 ".\\cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 147:

/* Line 1455 of yacc.c  */
#line 316 ".\\cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 148:

/* Line 1455 of yacc.c  */
#line 317 ".\\cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 149:

/* Line 1455 of yacc.c  */
#line 321 ".\\cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 150:

/* Line 1455 of yacc.c  */
#line 322 ".\\cgrammar-new.y"
    { (yyval.node) = link(constexp_, 0); ;}
    break;

  case 151:

/* Line 1455 of yacc.c  */
#line 323 ".\\cgrammar-new.y"
    { (yyval.node) = link(constexp_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 152:

/* Line 1455 of yacc.c  */
#line 324 ".\\cgrammar-new.y"
    { (yyval.node) = link(absarray_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 153:

/* Line 1455 of yacc.c  */
#line 325 ".\\cgrammar-new.y"
    { (yyval.node) = link(absarray_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 154:

/* Line 1455 of yacc.c  */
#line 326 ".\\cgrammar-new.y"
    { (yyval.node) = link(absfunc_, 0); ;}
    break;

  case 155:

/* Line 1455 of yacc.c  */
#line 327 ".\\cgrammar-new.y"
    { (yyval.node) = link(absfunc_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 156:

/* Line 1455 of yacc.c  */
#line 328 ".\\cgrammar-new.y"
    { (yyval.node) = link(absfunc_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 157:

/* Line 1455 of yacc.c  */
#line 329 ".\\cgrammar-new.y"
    { (yyval.node) = link(absfunc_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 158:

/* Line 1455 of yacc.c  */
#line 333 ".\\cgrammar-new.y"
    { (yyval.node) = link(assign_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 159:

/* Line 1455 of yacc.c  */
#line 334 ".\\cgrammar-new.y"
    { (yyval.node) = link(Init_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 160:

/* Line 1455 of yacc.c  */
#line 335 ".\\cgrammar-new.y"
    { (yyval.node) = link(Init_comma_, (yyvsp[(2) - (4)].node), 0); ;}
    break;

  case 161:

/* Line 1455 of yacc.c  */
#line 339 ".\\cgrammar-new.y"
    { (yyval.node) = link(init_s_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 162:

/* Line 1455 of yacc.c  */
#line 340 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 163:

/* Line 1455 of yacc.c  */
#line 344 ".\\cgrammar-new.y"
    { (yyval.node) = link(labeledstmt_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 164:

/* Line 1455 of yacc.c  */
#line 345 ".\\cgrammar-new.y"
    { (yyval.node) = link(case_, (yyvsp[(2) - (4)].node), (yyvsp[(4) - (4)].node), 0); ;}
    break;

  case 165:

/* Line 1455 of yacc.c  */
#line 346 ".\\cgrammar-new.y"
    { (yyval.node) = link(default_, (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 166:

/* Line 1455 of yacc.c  */
#line 348 ".\\cgrammar-new.y"
    { (yyval.node) = link(block_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 167:

/* Line 1455 of yacc.c  */
#line 349 ".\\cgrammar-new.y"
    { (yyval.node) = link(empty_stmt_, 0); ;}
    break;

  case 168:

/* Line 1455 of yacc.c  */
#line 350 ".\\cgrammar-new.y"
    { (yyval.node) = link(exp_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 169:

/* Line 1455 of yacc.c  */
#line 352 ".\\cgrammar-new.y"
    { (yyval.node) = link(if_, (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0); ;}
    break;

  case 170:

/* Line 1455 of yacc.c  */
#line 353 ".\\cgrammar-new.y"
    { (yyval.node) = link(ifelse_, (yyvsp[(3) - (7)].node), (yyvsp[(5) - (7)].node), (yyvsp[(7) - (7)].node), 0); ;}
    break;

  case 171:

/* Line 1455 of yacc.c  */
#line 354 ".\\cgrammar-new.y"
    { (yyval.node) = link(switch_, (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0);;}
    break;

  case 172:

/* Line 1455 of yacc.c  */
#line 356 ".\\cgrammar-new.y"
    { (yyval.node) = link(while_, (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0); ;}
    break;

  case 173:

/* Line 1455 of yacc.c  */
#line 357 ".\\cgrammar-new.y"
    { (yyval.node) = link(do_, (yyvsp[(2) - (7)].node), (yyvsp[(5) - (7)].node), 0); ;}
    break;

  case 174:

/* Line 1455 of yacc.c  */
#line 358 ".\\cgrammar-new.y"
    { (yyval.node) = link(for_, (yyvsp[(3) - (9)].node), (yyvsp[(5) - (9)].node), (yyvsp[(7) - (9)].node), (yyvsp[(9) - (9)].node), 0); ;}
    break;

  case 175:

/* Line 1455 of yacc.c  */
#line 360 ".\\cgrammar-new.y"
    { (yyval.node) = link(goto_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 176:

/* Line 1455 of yacc.c  */
#line 361 ".\\cgrammar-new.y"
    { (yyval.node) = link(continue_, 0); ;}
    break;

  case 177:

/* Line 1455 of yacc.c  */
#line 362 ".\\cgrammar-new.y"
    { (yyval.node) = link(break_, 0); ;}
    break;

  case 178:

/* Line 1455 of yacc.c  */
#line 363 ".\\cgrammar-new.y"
    { (yyval.node) = link(return_, 0); ;}
    break;

  case 179:

/* Line 1455 of yacc.c  */
#line 364 ".\\cgrammar-new.y"
    { (yyval.node) = link(return_exp_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 180:

/* Line 1455 of yacc.c  */
#line 368 ".\\cgrammar-new.y"
    { (yyval.node) = link(no_stmt_, 0); ;}
    break;

  case 181:

/* Line 1455 of yacc.c  */
#line 369 ".\\cgrammar-new.y"
    { (yyval.node) = link(exp1_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 182:

/* Line 1455 of yacc.c  */
#line 373 ".\\cgrammar-new.y"
    { (yyval.node) = link(no_stmt_, 0); ;}
    break;

  case 183:

/* Line 1455 of yacc.c  */
#line 374 ".\\cgrammar-new.y"
    { (yyval.node) = link(exp2_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 184:

/* Line 1455 of yacc.c  */
#line 378 ".\\cgrammar-new.y"
    { (yyval.node) = link(no_stmt_, 0); ;}
    break;

  case 185:

/* Line 1455 of yacc.c  */
#line 379 ".\\cgrammar-new.y"
    { (yyval.node) = link(exp3_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 186:

/* Line 1455 of yacc.c  */
#line 383 ".\\cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, 0); ;}
    break;

  case 187:

/* Line 1455 of yacc.c  */
#line 384 ".\\cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 188:

/* Line 1455 of yacc.c  */
#line 385 ".\\cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 189:

/* Line 1455 of yacc.c  */
#line 386 ".\\cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, (yyvsp[(2) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 190:

/* Line 1455 of yacc.c  */
#line 390 ".\\cgrammar-new.y"
    { (yyval.node) = link(declarations_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 191:

/* Line 1455 of yacc.c  */
#line 391 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 192:

/* Line 1455 of yacc.c  */
#line 395 ".\\cgrammar-new.y"
    { (yyval.node) = link(statements_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 193:

/* Line 1455 of yacc.c  */
#line 396 ".\\cgrammar-new.y"
    {(yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 194:

/* Line 1455 of yacc.c  */
#line 400 ".\\cgrammar-new.y"
    { (yyval.node) = link(goal_, (yyvsp[(1) - (1)].node), 0); parse_tree = (yyval.node); root = (yyval.node)->node_index; ;}
    break;

  case 195:

/* Line 1455 of yacc.c  */
#line 401 ".\\cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); parse_tree = (yyval.node); root = (yyval.node)->node_index; ;}
    break;

  case 196:

/* Line 1455 of yacc.c  */
#line 405 ".\\cgrammar-new.y"
    { (yyval.node) = link(extdef_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 197:

/* Line 1455 of yacc.c  */
#line 406 ".\\cgrammar-new.y"
    { (yyval.node) = link(extdef_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 198:

/* Line 1455 of yacc.c  */
#line 410 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdef_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 199:

/* Line 1455 of yacc.c  */
#line 414 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (3)].node), (yyvsp[(2) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 200:

/* Line 1455 of yacc.c  */
#line 415 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 201:

/* Line 1455 of yacc.c  */
#line 416 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 202:

/* Line 1455 of yacc.c  */
#line 417 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 203:

/* Line 1455 of yacc.c  */
#line 421 ".\\cgrammar-new.y"
    { (yyval.node) = link(funcbody_, (yyvsp[(1) - (1)].node), 0); ;}
    break;



/* Line 1455 of yacc.c  */
#line 3377 "cgrammar-new.tab.c"
      default: break;
    }
  YY_SYMBOL_PRINT ("-> $$ =", yyr1[yyn], &yyval, &yyloc);

  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);

  *++yyvsp = yyval;

  /* Now `shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */

  yyn = yyr1[yyn];

  yystate = yypgoto[yyn - YYNTOKENS] + *yyssp;
  if (0 <= yystate && yystate <= YYLAST && yycheck[yystate] == *yyssp)
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - YYNTOKENS];

  goto yynewstate;


/*------------------------------------.
| yyerrlab -- here on detecting error |
`------------------------------------*/
yyerrlab:
  /* If not already recovering from an error, report this error.  */
  if (!yyerrstatus)
    {
      ++yynerrs;
#if  !YYERROR_VERBOSE55
      printf("syntax error, row : %d，column: %d, text: %s", row, column, yytext);
#else
      {
	YYSIZE_T yysize = yysyntax_error (0, yystate, yychar);
	if (yymsg_alloc < yysize && yymsg_alloc < YYSTACK_ALLOC_MAXIMUM)
	  {
	    YYSIZE_T yyalloc = 2 * yysize;
	    if (! (yysize <= yyalloc && yyalloc <= YYSTACK_ALLOC_MAXIMUM))
	      yyalloc = YYSTACK_ALLOC_MAXIMUM;
	    if (yymsg != yymsgbuf)
	      YYSTACK_FREE (yymsg);
	    yymsg = (char *) YYSTACK_ALLOC (yyalloc);
	    if (yymsg)
	      yymsg_alloc = yyalloc;
	    else
	      {
		yymsg = yymsgbuf;
		yymsg_alloc = sizeof yymsgbuf;
	      }
	  }

	if (0 < yysize && yysize <= yymsg_alloc)
	  {
	    (void) yysyntax_error (yymsg, yystate, yychar);
	    yyerror (yymsg);
	  }
	else
	  {
	    yyerror (YY_("syntax error"));
	    if (yysize != 0)
	      goto yyexhaustedlab;
	  }
      }
#endif
    }



  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse lookahead token after an
	 error, discard it.  */

      if (yychar <= YYEOF)
	{
	  /* Return failure if at end of input.  */
	  if (yychar == YYEOF)
	    YYABORT;
	}
      else
	{
	  yydestruct ("Error: discarding",
		      yytoken, &yylval);
	  yychar = YYEMPTY;
	}
    }

  /* Else will try to reuse lookahead token after shifting the error
     token.  */
  goto yyerrlab1;


/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
yyerrorlab:

  /* Pacify compilers like GCC when the user code never invokes
     YYERROR and the label yyerrorlab therefore never appears in user
     code.  */
  if (/*CONSTCOND*/ 0)
     goto yyerrorlab;

  /* Do not reclaim the symbols of the rule which action triggered
     this YYERROR.  */
  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);
  yystate = *yyssp;
  goto yyerrlab1;


/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
yyerrlab1:
  yyerrstatus = 3;	/* Each real token shifted decrements this.  */

  for (;;)
    {
      yyn = yypact[yystate];
      if (yyn != YYPACT_NINF)
	{
	  yyn += YYTERROR;
	  if (0 <= yyn && yyn <= YYLAST && yycheck[yyn] == YYTERROR)
	    {
	      yyn = yytable[yyn];
	      if (0 < yyn)
		break;
	    }
	}

      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
	YYABORT;


      yydestruct ("Error: popping",
		  yystos[yystate], yyvsp);
      YYPOPSTACK (1);
      yystate = *yyssp;
      YY_STACK_PRINT (yyss, yyssp);
    }

  *++yyvsp = yylval;


  /* Shift the error token.  */
  YY_SYMBOL_PRINT ("Shifting", yystos[yyn], yyvsp, yylsp);

  yystate = yyn;
  goto yynewstate;


/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
yyacceptlab:
  yyresult = 0;
  goto yyreturn;

/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
yyabortlab:
  yyresult = 1;
  goto yyreturn;

#if !defined(yyoverflow) || YYERROR_VERBOSE
/*-------------------------------------------------.
| yyexhaustedlab -- memory exhaustion comes here.  |
`-------------------------------------------------*/
yyexhaustedlab:
  yyerror (YY_("memory exhausted"));
  yyresult = 2;
  /* Fall through.  */
#endif

yyreturn:
  if (yychar != YYEMPTY)
     yydestruct ("Cleanup: discarding lookahead",
		 yytoken, &yylval);
  /* Do not reclaim the symbols of the rule which action triggered
     this YYABORT or YYACCEPT.  */
  YYPOPSTACK (yylen);
  YY_STACK_PRINT (yyss, yyssp);
  while (yyssp != yyss)
    {
      yydestruct ("Cleanup: popping",
		  yystos[*yyssp], yyvsp);
      YYPOPSTACK (1);
    }
#ifndef yyoverflow
  if (yyss != yyssa)
    YYSTACK_FREE (yyss);
#endif
#if YYERROR_VERBOSE
  if (yymsg != yymsgbuf)
    YYSTACK_FREE (yymsg);
#endif
  /* Make sure YYID is used.  */
  return YYID (yyresult);
}



/* Line 1675 of yacc.c  */
#line 424 ".\\cgrammar-new.y"

#include <stdio.h>



Node * link(int tid, Node * rExp, ... )
{
	Node * node1;
	Node * node2;
	va_list exps;
  Node * parent_node = new_node();
  
	parent_node->id = tid; 
	parent_node->line = yylineno;

	if( rExp == NULL ) return parent_node;

	va_start(exps,rExp);
	node1 = rExp;  //第一个子节点
	parent_node->child = node1->node_index; 
	node1->parent = parent_node->node_index;

	node2=va_arg(exps,Node *);

	while(node2!=NULL){
		node1->next = node2->node_index; 
		node2->prev = node1->node_index;

		node1 = node2; 
		node2=va_arg(exps,Node *);
	}

	va_end( exps ); 
  
  return parent_node;
  
}


