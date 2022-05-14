
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
#line 3 "cgrammar-new.y"


#include "parser.h"

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

#define  YYERROR_VERBOSE
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
     COLON = 258,
     OR_OP = 259,
     AND_OP = 260,
     NE_OP = 261,
     EQ_OP = 262,
     GE_OP = 263,
     LE_OP = 264,
     RIGHT_OP = 265,
     LEFT_OP = 266,
     IDENTIFIER = 267,
     CONSTANT = 268,
     STRING_LITERAL = 269,
     SIZEOF = 270,
     PTR_OP = 271,
     INC_OP = 272,
     DEC_OP = 273,
     MUL_ASSIGN = 274,
     DIV_ASSIGN = 275,
     MOD_ASSIGN = 276,
     ADD_ASSIGN = 277,
     SUB_ASSIGN = 278,
     LEFT_ASSIGN = 279,
     RIGHT_ASSIGN = 280,
     AND_ASSIGN = 281,
     XOR_ASSIGN = 282,
     OR_ASSIGN = 283,
     TYPE_NAME = 284,
     TYPEDEF = 285,
     EXTERN = 286,
     STATIC = 287,
     AUTO = 288,
     REGISTER = 289,
     CHAR = 290,
     SHORT = 291,
     INT = 292,
     LONG = 293,
     SIGNED = 294,
     UNSIGNED = 295,
     FLOAT = 296,
     DOUBLE = 297,
     CONST = 298,
     VOLATILE = 299,
     VOID = 300,
     STRUCT = 301,
     UNION = 302,
     ENUM = 303,
     ELLIPSIS = 304,
     CASE = 305,
     DEFAULT = 306,
     IF = 307,
     ELSE = 308,
     SWITCH = 309,
     WHILE = 310,
     DO = 311,
     FOR = 312,
     GOTO = 313,
     CONTINUE = 314,
     BREAK = 315,
     RETURN = 316,
     LOWER_THAN_ELSE = 317
   };
#endif



#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
{

/* Line 214 of yacc.c  */
#line 17 "cgrammar-new.y"

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
#define YYLAST   1516

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  87
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  51
/* YYNRULES -- Number of rules.  */
#define YYNRULES  204
/* YYNRULES -- Number of states.  */
#define YYNSTATES  359

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
       2,     2,     2,    81,     2,     2,     2,    22,     9,     2,
      74,    75,    20,    18,    79,    19,    78,    21,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    82,    84,
      12,    83,    13,     3,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,    76,     2,    77,     8,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    85,     7,    86,    80,     2,     2,     2,
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
       2,     2,     2,     2,     2,     2,     1,     2,     4,     5,
       6,    10,    11,    14,    15,    16,    17,    23,    24,    25,
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
     553,   561,   567,   573,   581,   591,   595,   598,   601,   604,
     608,   611,   612,   614,   615,   617,   618,   620,   623,   627,
     631,   636,   638,   641,   643,   646,   648,   651,   653,   655,
     658,   662,   665,   668,   670
};

/* YYRHS -- A `-1'-separated list of the rules' RHS.  */
static const yytype_int16 yyrhs[] =
{
     133,     0,    -1,    23,    -1,    24,    -1,    25,    -1,    74,
      95,    75,    -1,    88,    -1,    89,    76,    95,    77,    -1,
      89,    74,    75,    -1,    89,    74,    90,    75,    -1,    89,
      78,    23,    -1,    89,    27,    23,    -1,    89,    28,    -1,
      89,    29,    -1,    94,    -1,    90,    79,    94,    -1,    89,
      -1,    28,    91,    -1,    29,    91,    -1,     9,    92,    -1,
      20,    92,    -1,    18,    92,    -1,    19,    92,    -1,    80,
      92,    -1,    81,    92,    -1,    26,    91,    -1,    26,    74,
     121,    75,    -1,    91,    -1,    74,   121,    75,    92,    -1,
      92,    -1,    93,     3,    95,    82,    93,    -1,    93,     5,
      93,    -1,    93,     6,    93,    -1,    93,     7,    93,    -1,
      93,     8,    93,    -1,    93,     9,    93,    -1,    93,    11,
      93,    -1,    93,    10,    93,    -1,    93,    12,    93,    -1,
      93,    13,    93,    -1,    93,    15,    93,    -1,    93,    14,
      93,    -1,    93,    17,    93,    -1,    93,    16,    93,    -1,
      93,    18,    93,    -1,    93,    19,    93,    -1,    93,    20,
      93,    -1,    93,    21,    93,    -1,    93,    22,    93,    -1,
      93,    -1,    91,    83,    94,    -1,    91,    30,    94,    -1,
      91,    31,    94,    -1,    91,    32,    94,    -1,    91,    33,
      94,    -1,    91,    34,    94,    -1,    91,    35,    94,    -1,
      91,    36,    94,    -1,    91,    37,    94,    -1,    91,    38,
      94,    -1,    91,    39,    94,    -1,    94,    -1,    95,    79,
      94,    -1,    93,    -1,    98,    84,    -1,    98,    99,    84,
      -1,   101,    -1,   101,    98,    -1,   102,    -1,   102,    98,
      -1,   103,    -1,   103,    98,    -1,   100,    -1,    99,    79,
     100,    -1,   114,    -1,   114,    83,   124,    -1,    41,    -1,
      42,    -1,    43,    -1,    44,    -1,    45,    -1,    56,    -1,
      46,    -1,    47,    -1,    48,    -1,    49,    -1,    52,    -1,
      53,    -1,    50,    -1,    51,    -1,   105,    -1,   111,    -1,
      40,    -1,    54,    -1,    55,    -1,   103,    -1,   104,   103,
      -1,    57,    23,    85,   106,    86,    -1,    57,    85,   106,
      86,    -1,    57,    23,    -1,    58,    23,    85,   106,    86,
      -1,    58,    85,   106,    86,    -1,    58,    23,    -1,   107,
      -1,   106,   107,    -1,   108,   109,    84,    -1,   102,   108,
      -1,   102,    -1,   103,   108,    -1,   103,    -1,   110,    -1,
     109,    79,   110,    -1,   114,    -1,    82,    96,    -1,   114,
      82,    96,    -1,    59,    85,   112,    86,    -1,    59,    23,
      85,   112,    86,    -1,    59,    23,    -1,   113,    -1,   112,
      79,   113,    -1,    23,    -1,    23,    83,    96,    -1,   116,
     115,    -1,   115,    -1,    23,    -1,    74,   114,    75,    -1,
     115,    76,    96,    77,    -1,   115,    76,    77,    -1,   115,
      74,   117,    75,    -1,   115,    74,   120,    75,    -1,   115,
      74,    75,    -1,    20,    -1,    20,   104,    -1,    20,   116,
      -1,    20,   104,   116,    -1,   118,    -1,   118,    79,    60,
      -1,   119,    -1,   118,    79,   119,    -1,    98,   114,    -1,
      98,   122,    -1,    98,    -1,    23,    -1,   120,    79,    23,
      -1,   108,    -1,   108,   122,    -1,   116,    -1,   123,    -1,
     116,   123,    -1,    74,   122,    75,    -1,    76,    77,    -1,
      76,    96,    77,    -1,   123,    76,    77,    -1,   123,    76,
      96,    77,    -1,    74,    75,    -1,    74,   117,    75,    -1,
     123,    74,    75,    -1,   123,    74,   117,    75,    -1,    94,
      -1,    85,   125,    86,    -1,    85,   125,    79,    86,    -1,
     124,    -1,   125,    79,   124,    -1,    23,    82,   126,    -1,
      61,    96,    82,   126,    -1,    62,    82,   126,    -1,   130,
      -1,    84,    -1,    95,    84,    -1,    63,    74,    95,    75,
     126,   126,    -1,    63,    74,    95,    75,   126,    64,   126,
      -1,    65,    74,    95,    75,   126,    -1,    66,    74,    95,
      75,   126,    -1,    67,   126,    66,    74,    95,    75,    84,
      -1,    68,    74,   127,    84,   128,    84,   129,    75,   126,
      -1,    69,    23,    84,    -1,    70,    84,    -1,    71,    84,
      -1,    72,    84,    -1,    72,    95,    84,    -1,     1,    84,
      -1,    -1,    95,    -1,    -1,    95,    -1,    -1,    95,    -1,
      85,    86,    -1,    85,   132,    86,    -1,    85,   131,    86,
      -1,    85,   131,   132,    86,    -1,    97,    -1,   131,    97,
      -1,   126,    -1,   132,   126,    -1,   134,    -1,   133,   134,
      -1,   135,    -1,    97,    -1,   136,   137,    -1,    98,   114,
     131,    -1,    98,   114,    -1,   114,   131,    -1,   114,    -1,
     130,    -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static const yytype_uint16 yyrline[] =
{
       0,    70,    70,    71,    72,    73,    77,    78,    79,    80,
      81,    82,    83,    84,    88,    89,    93,    94,    95,    96,
      97,    98,    99,   100,   101,   102,   103,   107,   108,   112,
     113,   114,   115,   116,   117,   118,   119,   120,   121,   122,
     123,   124,   125,   126,   127,   128,   129,   130,   131,   135,
     136,   137,   138,   139,   140,   141,   142,   143,   144,   145,
     146,   150,   151,   155,   159,   160,   164,   165,   166,   167,
     168,   169,   173,   174,   178,   179,   183,   184,   185,   186,
     187,   191,   192,   193,   194,   195,   196,   197,   198,   199,
     200,   201,   202,   206,   207,   211,   212,   216,   217,   218,
     219,   220,   221,   226,   227,   231,   235,   236,   237,   238,
     242,   243,   247,   248,   249,   253,   254,   255,   259,   260,
     264,   265,   269,   270,   274,   275,   276,   277,   278,   279,
     280,   284,   285,   286,   287,   291,   292,   296,   297,   301,
     302,   303,   307,   308,   312,   313,   317,   318,   319,   323,
     324,   325,   326,   327,   328,   329,   330,   331,   335,   336,
     337,   341,   342,   346,   347,   348,   350,   351,   352,   354,
     355,   356,   358,   359,   360,   362,   363,   364,   365,   366,
     367,   371,   372,   376,   377,   381,   382,   386,   387,   388,
     389,   393,   394,   398,   399,   403,   404,   408,   409,   413,
     417,   418,   419,   420,   424
};
#endif

#if YYDEBUG || YYERROR_VERBOSE || YYTOKEN_TABLE
/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "$end", "error", "$undefined", "'?'", "COLON", "OR_OP", "AND_OP", "'|'",
  "'^'", "'&'", "NE_OP", "EQ_OP", "'<'", "'>'", "GE_OP", "LE_OP",
  "RIGHT_OP", "LEFT_OP", "'+'", "'-'", "'*'", "'/'", "'%'", "IDENTIFIER",
  "CONSTANT", "STRING_LITERAL", "SIZEOF", "PTR_OP", "INC_OP", "DEC_OP",
  "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN",
  "LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN",
  "TYPE_NAME", "TYPEDEF", "EXTERN", "STATIC", "AUTO", "REGISTER", "CHAR",
  "SHORT", "INT", "LONG", "SIGNED", "UNSIGNED", "FLOAT", "DOUBLE", "CONST",
  "VOLATILE", "VOID", "STRUCT", "UNION", "ENUM", "ELLIPSIS", "CASE",
  "DEFAULT", "IF", "ELSE", "SWITCH", "WHILE", "DO", "FOR", "GOTO",
  "CONTINUE", "BREAK", "RETURN", "LOWER_THAN_ELSE", "'('", "')'", "'['",
  "']'", "'.'", "','", "'~'", "'!'", "':'", "'='", "';'", "'{'", "'}'",
  "$accept", "PrimaryExp", "PostfixExp", "ArgExpList", "UnaryExp",
  "CastExp", "CondExp", "AssignExp", "Exp", "ConstExp", "Declaration",
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
       0,   256,   257,    63,   258,   259,   260,   124,    94,    38,
     261,   262,    60,    62,   263,   264,   265,   266,    43,    45,
      42,    47,    37,   267,   268,   269,   270,   271,   272,   273,
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
     126,   127,   127,   128,   128,   129,   129,   130,   130,   130,
     130,   131,   131,   132,   132,   133,   133,   134,   134,   135,
     136,   136,   136,   136,   137
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
       4,     1,     3,     3,     4,     3,     1,     1,     2,     6,
       7,     5,     5,     7,     9,     3,     2,     2,     2,     3,
       2,     0,     1,     0,     1,     0,     1,     2,     3,     3,
       4,     1,     2,     1,     2,     1,     2,     1,     1,     2,
       3,     2,     2,     1,     1
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static const yytype_uint8 yydefact[] =
{
       0,   131,   124,    92,    76,    77,    78,    79,    80,    82,
      83,    84,    85,    88,    89,    86,    87,    93,    94,    81,
       0,     0,     0,     0,   198,     0,    66,    68,    70,    90,
      91,   203,   123,     0,     0,   195,   197,     0,    95,   132,
     133,    99,     0,   102,     0,   117,     0,     0,    64,     0,
      72,    74,    67,    69,    71,   191,     0,   202,     0,     0,
     122,     1,   196,     0,   204,   199,    96,   134,     0,   107,
     109,     0,   103,     0,     0,     0,     0,   120,     0,   118,
     125,     0,    65,     0,   200,    74,   192,   142,   130,   141,
       0,   135,   137,     0,     0,     0,     0,     0,     2,     3,
       4,     0,     0,     0,     0,   127,     0,     0,     6,    16,
      27,    29,    63,     0,     0,     2,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   167,   187,    27,
      49,    61,     0,   193,   166,     0,     0,     0,   106,   108,
      98,   104,     0,     0,   110,   112,     0,   101,     0,     0,
       0,   115,    73,     0,   158,    75,     0,     0,   139,   146,
     140,   147,   128,     0,   129,     0,    19,    21,    22,    20,
       0,    25,     0,    17,    18,     0,   144,     0,    23,    24,
       0,    12,    13,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   126,   180,     0,     0,     0,
       0,     0,     0,     0,   181,     0,   176,   177,   178,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,   168,   189,     0,   188,   194,    97,   113,     0,
     105,     0,   100,   116,   121,   119,   161,     0,   154,     0,
       0,   150,     0,   148,     0,     0,   136,   138,   143,     0,
       5,     0,   146,   145,     0,    11,     8,     0,    14,     0,
      10,     0,    31,    32,    33,    34,    35,    37,    36,    38,
      39,    41,    40,    43,    42,    44,    45,    46,    47,    48,
     163,     0,   165,     0,     0,     0,     0,   182,     0,   175,
     179,    51,    52,    53,    54,    55,    56,    57,    58,    59,
      60,    50,    62,   190,   111,   114,     0,   159,   155,   149,
     151,   156,     0,   152,     0,    26,    28,     9,     0,     7,
       0,   164,     0,     0,     0,     0,   183,   160,   162,   157,
     153,    15,    30,     0,   171,   172,     0,   184,     0,     0,
     169,     0,   185,   170,   173,   186,     0,     0,   174
};

/* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int16 yydefgoto[] =
{
      -1,   108,   109,   267,   129,   111,   130,   131,   132,   113,
      55,    56,    49,    50,    26,    27,    28,    39,    29,    71,
      72,    73,   143,   144,    30,    78,    79,    31,    32,    33,
     249,    91,    92,    93,   177,   250,   161,   155,   247,   133,
     298,   348,   356,   134,    57,   136,    34,    35,    36,    37,
      65
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
#define YYPACT_NINF -157
static const yytype_int16 yypact[] =
{
    1125,   153,  -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,
    -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,
     -17,    -7,     0,    26,  -157,    39,  1337,  1337,  1337,  -157,
    -157,  1337,   130,   -11,   761,  -157,  -157,   -30,  -157,   153,
    -157,   -25,  1377,   -19,  1377,    -8,    53,    16,  -157,   -51,
    -157,  1259,  -157,  -157,  -157,  -157,    39,  1337,  1162,   872,
     130,  -157,  -157,   347,  -157,  -157,  -157,  -157,  1377,  1377,
    1377,   989,  -157,    -9,  1377,  1192,    53,    21,   -54,  -157,
    -157,    26,  -157,   702,  1337,    36,  -157,  -157,  -157,    41,
      32,    85,  -157,    30,   978,   978,   978,   978,  -157,  -157,
    -157,   990,  1002,  1002,   813,  -157,   978,   978,  -157,   190,
    -157,  -157,  1394,   115,    92,   121,   978,   133,   154,   164,
     179,   621,   180,   197,   138,   175,   714,  -157,  -157,   716,
    1394,  -157,    10,  -157,  -157,   421,   495,  1212,  -157,  -157,
    -157,  -157,   978,    42,  -157,   178,  1233,  -157,   -45,   978,
      53,  -157,  -157,   702,  -157,  -157,  1045,   890,  -157,    44,
    -157,   189,  -157,  1316,  -157,   247,  -157,  -157,  -157,  -157,
     813,  -157,   978,  -157,  -157,   110,    51,   198,  -157,  -157,
     249,  -157,  -157,   902,   978,   251,   978,   978,   978,   978,
     978,   978,   978,   978,   978,   978,   978,   978,   978,   978,
     978,   978,   978,   978,   978,  -157,  -157,   621,   194,   621,
     978,   978,   978,   211,   978,   196,  -157,  -157,  -157,    99,
     978,   978,   978,   978,   978,   978,   978,   978,   978,   978,
     978,   978,  -157,  -157,   521,  -157,  -157,  -157,  -157,    -9,
    -157,   978,  -157,  -157,  -157,  -157,  -157,    95,  -157,   207,
     208,  -157,   209,   189,  1280,   914,  -157,  -157,  -157,   212,
    -157,  1085,   193,  -157,   978,  -157,  -157,   116,  -157,   107,
    -157,   119,  1449,  1465,  1480,  1494,  1096,  1174,  1174,   309,
     309,   309,   309,   191,   191,     9,     9,  -157,  -157,  -157,
    -157,   621,  -157,   146,   148,   155,   210,   216,   204,  -157,
    -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,  -157,
    -157,  -157,  -157,  -157,  -157,  -157,   689,  -157,  -157,  -157,
    -157,  -157,   215,  -157,   219,  -157,  -157,  -157,   978,  -157,
     978,  -157,   621,   621,   621,   978,   978,  -157,  -157,  -157,
    -157,  -157,  1432,   595,  -157,  -157,   158,   216,   213,   621,
    -157,   214,   978,  -157,  -157,   216,   225,   621,  -157
};

/* YYPGOTO[NTERM-NUM].  */
static const yytype_int16 yypgoto[] =
{
    -157,  -157,  -157,  -157,   -59,   -87,   -41,    19,  -100,   -62,
      40,    24,  -157,   220,  -157,   237,   187,  -157,  -157,    25,
     -58,   -48,  -157,    63,  -157,   228,   160,   143,    12,    14,
     -57,  -157,   150,  -157,   144,   -84,  -156,  -151,  -157,   -40,
    -157,  -157,  -157,   278,   -24,   181,  -157,   284,  -157,  -157,
    -157
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
#define YYTABLE_NINF -202
static const yytype_int16 yytable[] =
{
     110,    90,   246,   253,   175,   160,    41,   166,   167,   168,
     169,     1,     2,   141,     2,    40,    43,   141,   112,   178,
     179,   138,   139,    45,    25,   150,   219,    84,    81,   202,
     203,   204,   151,    82,   150,   110,   110,   110,   110,   135,
      24,   243,   171,   173,   174,    60,     1,   110,   110,     2,
      52,    53,    54,    67,   208,    63,   176,   110,    25,     1,
      68,     1,     2,    23,     2,    23,    74,     2,    42,    75,
     175,     1,   175,   142,    24,   112,    77,    76,    44,   141,
     238,   213,    89,   110,   269,    46,   271,   244,   141,   231,
     110,    80,   263,   137,   232,   252,   236,    86,   110,   146,
      23,   112,   154,   159,   149,   164,   253,   162,   112,   165,
     293,   294,   295,    23,   297,   156,   112,   157,   156,    83,
     157,   239,   176,    48,    86,   261,   240,   157,   110,   110,
     110,   110,   110,   110,   110,   110,   110,   110,   110,   110,
     110,   110,   110,   110,   110,   110,   272,   273,   274,   275,
     276,   277,   278,   279,   280,   281,   282,   283,   284,   285,
     286,   287,   288,   289,   163,   338,    47,   290,    51,   292,
     159,    60,   154,     1,   316,    86,   206,   326,   231,   315,
      89,   317,   110,   300,   329,   260,   231,    89,    38,   231,
     262,   327,   205,   324,   236,   328,   110,   322,   231,    85,
     112,   330,   268,   207,    58,   110,    59,    17,    18,   200,
     201,   202,   203,   204,   112,   209,   145,   180,   181,   182,
     215,   332,   216,   333,    85,   231,    66,   231,   210,    70,
     334,    70,   158,   351,   231,   346,   347,   231,   211,   301,
     302,   303,   304,   305,   306,   307,   308,   309,   310,   311,
     312,   331,   355,   212,   214,    70,    70,    70,    70,   217,
     241,    70,    70,   254,   183,   255,   184,   261,   185,   157,
     258,   110,   265,   264,   270,   262,   291,   296,    89,    69,
     299,    69,   318,   319,   335,    89,   320,   325,   336,   342,
     339,    70,   343,   344,   345,   231,   340,   352,   354,    47,
     357,   152,   314,   350,   148,    69,    69,    69,    69,   353,
     245,    69,    69,   257,   259,    64,   234,   358,    62,     0,
       0,     0,     0,     0,    70,   198,   199,   200,   201,   202,
     203,   204,     0,    70,     0,   154,     0,     0,     0,     0,
       0,    69,     0,     0,     0,     0,     0,   341,   114,     0,
       0,     0,     0,     0,     0,     0,    94,    70,     0,     0,
       0,     0,     0,     0,     0,    95,    96,    97,     0,     0,
     115,    99,   100,   101,    69,   102,   103,     0,     0,     0,
       0,     0,   145,    69,     0,     0,     0,     3,     4,     5,
       6,     7,     8,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,    69,   116,   117,
     118,     0,   119,   120,   121,   122,   123,   124,   125,   126,
       0,   104,   114,     0,     0,     0,     0,   106,   107,     0,
      94,   127,    63,   128,     0,     0,     0,     0,     0,    95,
      96,    97,     0,     0,   115,    99,   100,   101,     0,   102,
     103,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     3,     4,     5,     6,     7,     8,     9,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    21,
      22,     0,   116,   117,   118,     0,   119,   120,   121,   122,
     123,   124,   125,   126,     0,   104,   114,     0,     0,     0,
       0,   106,   107,     0,    94,   127,    63,   233,     0,     0,
       0,     0,     0,    95,    96,    97,     0,     0,   115,    99,
     100,   101,   114,   102,   103,     0,     0,     0,     0,     0,
      94,     0,     0,     0,     0,     0,     0,     0,     0,    95,
      96,    97,     0,     0,   115,    99,   100,   101,     0,   102,
     103,     0,     0,     0,     0,     0,   116,   117,   118,     0,
     119,   120,   121,   122,   123,   124,   125,   126,     0,   104,
       0,     0,     0,     0,     0,   106,   107,     0,     0,   127,
      63,   235,   116,   117,   118,     0,   119,   120,   121,   122,
     123,   124,   125,   126,     0,   104,   114,     0,     0,     0,
       0,   106,   107,     0,    94,   127,    63,   313,     0,     0,
       0,     0,     0,    95,    96,    97,     0,     0,   115,    99,
     100,   101,   114,   102,   103,     0,     0,     0,     0,     0,
      94,     0,     0,     0,     0,     0,     0,     0,     0,    95,
      96,    97,     0,     0,   115,    99,   100,   101,     0,   102,
     103,     0,     0,     0,     0,     0,   116,   117,   118,   349,
     119,   120,   121,   122,   123,   124,   125,   126,     0,   104,
       0,     0,     0,     0,     0,   106,   107,     0,     0,   127,
      63,     0,   116,   117,   118,     0,   119,   120,   121,   122,
     123,   124,   125,   126,     0,   104,     0,     0,    94,     0,
       0,   106,   107,     0,     0,   127,    63,    95,    96,    97,
       0,    94,    98,    99,   100,   101,     0,   102,   103,     0,
      95,    96,    97,    94,     0,    98,    99,   100,   101,     0,
     102,   103,    95,    96,    97,     0,     0,    98,    99,   100,
     101,     0,   102,   103,     0,     0,   220,   221,   222,   223,
     224,   225,   226,   227,   228,   229,     0,     0,     0,     0,
       0,    61,     0,   104,     0,     0,     0,     0,     0,   106,
     107,     0,     0,     0,   153,   337,   104,     0,     0,     0,
       0,     1,   106,   107,     2,     0,     0,   153,   104,     0,
       0,     0,     0,     0,   106,   107,     0,     0,   218,   230,
       0,     3,     4,     5,     6,     7,     8,     9,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    21,
      22,     0,    94,     0,     0,     0,     0,     0,     0,     0,
       0,    95,    96,    97,     0,    23,    98,    99,   100,   101,
       0,   102,   103,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     3,     0,     0,     0,     0,     0,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,     0,     0,     0,     0,     0,     0,     0,
       0,    94,     0,     0,     0,     0,     0,   104,     0,     0,
      95,    96,    97,   106,   107,    98,    99,   100,   101,    94,
     102,   103,     0,     0,     0,     0,     0,     0,    95,    96,
      97,    94,     0,    98,    99,   100,   101,     0,   102,   103,
      95,    96,    97,    94,     0,    98,    99,   100,   101,     0,
     102,   103,    95,    96,    97,     0,     0,    98,    99,   100,
     101,     0,   102,   103,     0,     0,   104,     0,     0,   105,
       0,     0,   106,   107,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   104,     0,     0,   251,     0,     0,
     106,   107,     0,     0,     0,     0,   104,   266,     0,     0,
       0,     0,   106,   107,     0,     0,     0,    94,   104,     0,
       0,   323,     0,     0,   106,   107,    95,    96,    97,    94,
       0,    98,    99,   100,   101,     0,   102,   103,    95,    96,
      97,    94,     0,    98,    99,   100,   101,     0,   102,   103,
      95,    96,    97,     0,     0,    98,    99,   100,   101,     3,
     102,   103,     0,     0,     0,     9,    10,    11,    12,    13,
      14,    15,    16,    17,    18,    19,    20,    21,    22,     0,
       0,     0,   104,     0,     0,     0,     0,     0,   106,   107,
       0,     0,     0,     0,   170,     1,     0,     0,     2,     0,
     106,   107,     0,     0,     0,   140,   172,     0,     0,     0,
       0,     0,   106,   107,     0,     3,     4,     5,     6,     7,
       8,     9,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    21,    22,     1,   192,   193,   194,   195,
     196,   197,   198,   199,   200,   201,   202,   203,   204,   156,
     248,   157,     0,     0,     0,     3,     4,     5,     6,     7,
       8,     9,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    21,    22,     1,     0,     0,     2,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   261,
     248,   157,     0,     0,     0,     3,     4,     5,     6,     7,
       8,     9,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    21,    22,    87,   194,   195,   196,   197,
     198,   199,   200,   201,   202,   203,   204,     0,     0,    23,
       0,     0,     3,     4,     5,     6,     7,     8,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     3,     0,     0,     0,     0,    88,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,     3,     0,     0,     0,     0,     0,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,     0,     3,     0,     0,     0,     0,   147,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,     0,     0,     0,     0,     0,   237,     3,
       4,     5,     6,     7,     8,     9,    10,    11,    12,    13,
      14,    15,    16,    17,    18,    19,    20,    21,    22,   242,
       3,     4,     5,     6,     7,     8,     9,    10,    11,    12,
      13,    14,    15,    16,    17,    18,    19,    20,    21,    22,
       0,     0,    83,     0,  -201,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   321,     3,     4,     5,     6,
       7,     8,     9,    10,    11,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    21,    22,   256,     3,     4,     5,
       6,     7,     8,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,   186,     0,   187,
     188,   189,   190,   191,   192,   193,   194,   195,   196,   197,
     198,   199,   200,   201,   202,   203,   204,     3,     0,     0,
       0,     0,     0,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,   187,   188,   189,
     190,   191,   192,   193,   194,   195,   196,   197,   198,   199,
     200,   201,   202,   203,   204,   188,   189,   190,   191,   192,
     193,   194,   195,   196,   197,   198,   199,   200,   201,   202,
     203,   204,   189,   190,   191,   192,   193,   194,   195,   196,
     197,   198,   199,   200,   201,   202,   203,   204,   190,   191,
     192,   193,   194,   195,   196,   197,   198,   199,   200,   201,
     202,   203,   204,   191,   192,   193,   194,   195,   196,   197,
     198,   199,   200,   201,   202,   203,   204
};

static const yytype_int16 yycheck[] =
{
      59,    58,   153,   159,   104,    89,    23,    94,    95,    96,
      97,    20,    23,    71,    23,     1,    23,    75,    59,   106,
     107,    69,    70,    23,     0,    79,   126,    51,    79,    20,
      21,    22,    86,    84,    79,    94,    95,    96,    97,    63,
       0,    86,   101,   102,   103,    33,    20,   106,   107,    23,
      26,    27,    28,    39,   116,    85,   104,   116,    34,    20,
      85,    20,    23,    74,    23,    74,    85,    23,    85,    44,
     170,    20,   172,    82,    34,   116,    23,    85,    85,   137,
     142,   121,    58,   142,   184,    85,   186,   149,   146,    79,
     149,    75,   176,    68,    84,   157,   136,    57,   157,    74,
      74,   142,    83,    89,    83,    75,   262,    75,   149,    79,
     210,   211,   212,    74,   214,    74,   157,    76,    74,    83,
      76,    79,   170,    84,    84,    74,    84,    76,   187,   188,
     189,   190,   191,   192,   193,   194,   195,   196,   197,   198,
     199,   200,   201,   202,   203,   204,   187,   188,   189,   190,
     191,   192,   193,   194,   195,   196,   197,   198,   199,   200,
     201,   202,   203,   204,    79,   316,    23,   207,    25,   209,
     156,   159,   153,    20,    79,   135,    84,   264,    79,   241,
     156,    86,   241,    84,    77,    75,    79,   163,     1,    79,
     176,    75,    77,   255,   234,    79,   255,   254,    79,    56,
     241,    82,   183,    82,    74,   264,    76,    54,    55,    18,
      19,    20,    21,    22,   255,    82,    73,    27,    28,    29,
      23,    75,    84,    75,    81,    79,    39,    79,    74,    42,
      75,    44,    89,    75,    79,   335,   336,    79,    74,   220,
     221,   222,   223,   224,   225,   226,   227,   228,   229,   230,
     231,   291,   352,    74,    74,    68,    69,    70,    71,    84,
      82,    74,    75,    74,    74,    76,    76,    74,    78,    76,
      23,   330,    23,    75,    23,   261,    82,    66,   254,    42,
      84,    44,    75,    75,    74,   261,    77,    75,    84,   330,
      75,   104,   332,   333,   334,    79,    77,    84,    84,   156,
      75,    81,   239,   343,    76,    68,    69,    70,    71,   349,
     150,    74,    75,   163,   170,    37,   135,   357,    34,    -1,
      -1,    -1,    -1,    -1,   137,    16,    17,    18,    19,    20,
      21,    22,    -1,   146,    -1,   316,    -1,    -1,    -1,    -1,
      -1,   104,    -1,    -1,    -1,    -1,    -1,   328,     1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,     9,   170,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    18,    19,    20,    -1,    -1,
      23,    24,    25,    26,   137,    28,    29,    -1,    -1,    -1,
      -1,    -1,   239,   146,    -1,    -1,    -1,    40,    41,    42,
      43,    44,    45,    46,    47,    48,    49,    50,    51,    52,
      53,    54,    55,    56,    57,    58,    59,   170,    61,    62,
      63,    -1,    65,    66,    67,    68,    69,    70,    71,    72,
      -1,    74,     1,    -1,    -1,    -1,    -1,    80,    81,    -1,
       9,    84,    85,    86,    -1,    -1,    -1,    -1,    -1,    18,
      19,    20,    -1,    -1,    23,    24,    25,    26,    -1,    28,
      29,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    40,    41,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    -1,    61,    62,    63,    -1,    65,    66,    67,    68,
      69,    70,    71,    72,    -1,    74,     1,    -1,    -1,    -1,
      -1,    80,    81,    -1,     9,    84,    85,    86,    -1,    -1,
      -1,    -1,    -1,    18,    19,    20,    -1,    -1,    23,    24,
      25,    26,     1,    28,    29,    -1,    -1,    -1,    -1,    -1,
       9,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    18,
      19,    20,    -1,    -1,    23,    24,    25,    26,    -1,    28,
      29,    -1,    -1,    -1,    -1,    -1,    61,    62,    63,    -1,
      65,    66,    67,    68,    69,    70,    71,    72,    -1,    74,
      -1,    -1,    -1,    -1,    -1,    80,    81,    -1,    -1,    84,
      85,    86,    61,    62,    63,    -1,    65,    66,    67,    68,
      69,    70,    71,    72,    -1,    74,     1,    -1,    -1,    -1,
      -1,    80,    81,    -1,     9,    84,    85,    86,    -1,    -1,
      -1,    -1,    -1,    18,    19,    20,    -1,    -1,    23,    24,
      25,    26,     1,    28,    29,    -1,    -1,    -1,    -1,    -1,
       9,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    18,
      19,    20,    -1,    -1,    23,    24,    25,    26,    -1,    28,
      29,    -1,    -1,    -1,    -1,    -1,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    -1,    74,
      -1,    -1,    -1,    -1,    -1,    80,    81,    -1,    -1,    84,
      85,    -1,    61,    62,    63,    -1,    65,    66,    67,    68,
      69,    70,    71,    72,    -1,    74,    -1,    -1,     9,    -1,
      -1,    80,    81,    -1,    -1,    84,    85,    18,    19,    20,
      -1,     9,    23,    24,    25,    26,    -1,    28,    29,    -1,
      18,    19,    20,     9,    -1,    23,    24,    25,    26,    -1,
      28,    29,    18,    19,    20,    -1,    -1,    23,    24,    25,
      26,    -1,    28,    29,    -1,    -1,    30,    31,    32,    33,
      34,    35,    36,    37,    38,    39,    -1,    -1,    -1,    -1,
      -1,     0,    -1,    74,    -1,    -1,    -1,    -1,    -1,    80,
      81,    -1,    -1,    -1,    85,    86,    74,    -1,    -1,    -1,
      -1,    20,    80,    81,    23,    -1,    -1,    85,    74,    -1,
      -1,    -1,    -1,    -1,    80,    81,    -1,    -1,    84,    83,
      -1,    40,    41,    42,    43,    44,    45,    46,    47,    48,
      49,    50,    51,    52,    53,    54,    55,    56,    57,    58,
      59,    -1,     9,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    18,    19,    20,    -1,    74,    23,    24,    25,    26,
      -1,    28,    29,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    40,    -1,    -1,    -1,    -1,    -1,    46,
      47,    48,    49,    50,    51,    52,    53,    54,    55,    56,
      57,    58,    59,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,     9,    -1,    -1,    -1,    -1,    -1,    74,    -1,    -1,
      18,    19,    20,    80,    81,    23,    24,    25,    26,     9,
      28,    29,    -1,    -1,    -1,    -1,    -1,    -1,    18,    19,
      20,     9,    -1,    23,    24,    25,    26,    -1,    28,    29,
      18,    19,    20,     9,    -1,    23,    24,    25,    26,    -1,
      28,    29,    18,    19,    20,    -1,    -1,    23,    24,    25,
      26,    -1,    28,    29,    -1,    -1,    74,    -1,    -1,    77,
      -1,    -1,    80,    81,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    74,    -1,    -1,    77,    -1,    -1,
      80,    81,    -1,    -1,    -1,    -1,    74,    75,    -1,    -1,
      -1,    -1,    80,    81,    -1,    -1,    -1,     9,    74,    -1,
      -1,    77,    -1,    -1,    80,    81,    18,    19,    20,     9,
      -1,    23,    24,    25,    26,    -1,    28,    29,    18,    19,
      20,     9,    -1,    23,    24,    25,    26,    -1,    28,    29,
      18,    19,    20,    -1,    -1,    23,    24,    25,    26,    40,
      28,    29,    -1,    -1,    -1,    46,    47,    48,    49,    50,
      51,    52,    53,    54,    55,    56,    57,    58,    59,    -1,
      -1,    -1,    74,    -1,    -1,    -1,    -1,    -1,    80,    81,
      -1,    -1,    -1,    -1,    74,    20,    -1,    -1,    23,    -1,
      80,    81,    -1,    -1,    -1,    86,    74,    -1,    -1,    -1,
      -1,    -1,    80,    81,    -1,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    20,    10,    11,    12,    13,
      14,    15,    16,    17,    18,    19,    20,    21,    22,    74,
      75,    76,    -1,    -1,    -1,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    20,    -1,    -1,    23,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    74,
      75,    76,    -1,    -1,    -1,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    23,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,    -1,    -1,    74,
      -1,    -1,    40,    41,    42,    43,    44,    45,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    55,    56,    57,
      58,    59,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    40,    -1,    -1,    -1,    -1,    75,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    55,    56,    57,
      58,    59,    40,    -1,    -1,    -1,    -1,    -1,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    55,    56,    57,
      58,    59,    -1,    40,    -1,    -1,    -1,    -1,    86,    46,
      47,    48,    49,    50,    51,    52,    53,    54,    55,    56,
      57,    58,    59,    -1,    -1,    -1,    -1,    -1,    86,    40,
      41,    42,    43,    44,    45,    46,    47,    48,    49,    50,
      51,    52,    53,    54,    55,    56,    57,    58,    59,    86,
      40,    41,    42,    43,    44,    45,    46,    47,    48,    49,
      50,    51,    52,    53,    54,    55,    56,    57,    58,    59,
      -1,    -1,    83,    -1,    85,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    75,    40,    41,    42,    43,
      44,    45,    46,    47,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    40,    41,    42,
      43,    44,    45,    46,    47,    48,    49,    50,    51,    52,
      53,    54,    55,    56,    57,    58,    59,     3,    -1,     5,
       6,     7,     8,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,    40,    -1,    -1,
      -1,    -1,    -1,    46,    47,    48,    49,    50,    51,    52,
      53,    54,    55,    56,    57,    58,    59,     5,     6,     7,
       8,     9,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    21,    22,     6,     7,     8,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      21,    22,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,     9,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static const yytype_uint8 yystos[] =
{
       0,    20,    23,    40,    41,    42,    43,    44,    45,    46,
      47,    48,    49,    50,    51,    52,    53,    54,    55,    56,
      57,    58,    59,    74,    97,    98,   101,   102,   103,   105,
     111,   114,   115,   116,   133,   134,   135,   136,   103,   104,
     116,    23,    85,    23,    85,    23,    85,   114,    84,    99,
     100,   114,    98,    98,    98,    97,    98,   131,    74,    76,
     115,     0,   134,    85,   130,   137,   103,   116,    85,   102,
     103,   106,   107,   108,    85,   106,    85,    23,   112,   113,
      75,    79,    84,    83,   131,   114,    97,    23,    75,    98,
     117,   118,   119,   120,     9,    18,    19,    20,    23,    24,
      25,    26,    28,    29,    74,    77,    80,    81,    88,    89,
      91,    92,    93,    96,     1,    23,    61,    62,    63,    65,
      66,    67,    68,    69,    70,    71,    72,    84,    86,    91,
      93,    94,    95,   126,   130,   131,   132,   106,   108,   108,
      86,   107,    82,   109,   110,   114,   106,    86,   112,    83,
      79,    86,   100,    85,    94,   124,    74,    76,   114,   116,
     122,   123,    75,    79,    75,    79,    92,    92,    92,    92,
      74,    91,    74,    91,    91,    95,   108,   121,    92,    92,
      27,    28,    29,    74,    76,    78,     3,     5,     6,     7,
       8,     9,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    21,    22,    77,    84,    82,    96,    82,
      74,    74,    74,   126,    74,    23,    84,    84,    84,    95,
      30,    31,    32,    33,    34,    35,    36,    37,    38,    39,
      83,    79,    84,    86,   132,    86,   126,    86,    96,    79,
      84,    82,    86,    86,    96,   113,   124,   125,    75,   117,
     122,    77,    96,   123,    74,    76,    60,   119,    23,   121,
      75,    74,   116,   122,    75,    23,    75,    90,    94,    95,
      23,    95,    93,    93,    93,    93,    93,    93,    93,    93,
      93,    93,    93,    93,    93,    93,    93,    93,    93,    93,
     126,    82,   126,    95,    95,    95,    66,    95,   127,    84,
      84,    94,    94,    94,    94,    94,    94,    94,    94,    94,
      94,    94,    94,    86,   110,    96,    79,    86,    75,    75,
      77,    75,   117,    77,    96,    75,    92,    75,    79,    77,
      82,   126,    75,    75,    75,    74,    84,    86,   124,    75,
      77,    94,    93,   126,   126,   126,    95,    95,   128,    64,
     126,    75,    84,   126,    84,    95,   129,    75,   126
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
#line 70 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 3:

/* Line 1455 of yacc.c  */
#line 71 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 4:

/* Line 1455 of yacc.c  */
#line 72 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 5:

/* Line 1455 of yacc.c  */
#line 73 "cgrammar-new.y"
    { (yyval.node) = link(exp_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 6:

/* Line 1455 of yacc.c  */
#line 77 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 7:

/* Line 1455 of yacc.c  */
#line 78 "cgrammar-new.y"
    { (yyval.node) = link(array_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 8:

/* Line 1455 of yacc.c  */
#line 79 "cgrammar-new.y"
    { (yyval.node) = link(funccall_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 9:

/* Line 1455 of yacc.c  */
#line 80 "cgrammar-new.y"
    { (yyval.node) = link(funccall_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 10:

/* Line 1455 of yacc.c  */
#line 81 "cgrammar-new.y"
    { (yyval.node) = link(member_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 11:

/* Line 1455 of yacc.c  */
#line 82 "cgrammar-new.y"
    { (yyval.node) = link(ptrto_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 12:

/* Line 1455 of yacc.c  */
#line 83 "cgrammar-new.y"
    { (yyval.node) = link(postinc_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 13:

/* Line 1455 of yacc.c  */
#line 84 "cgrammar-new.y"
    { (yyval.node) = link(postdec_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 14:

/* Line 1455 of yacc.c  */
#line 88 "cgrammar-new.y"
    { (yyval.node) = link(arguments_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 15:

/* Line 1455 of yacc.c  */
#line 89 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 16:

/* Line 1455 of yacc.c  */
#line 93 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 17:

/* Line 1455 of yacc.c  */
#line 94 "cgrammar-new.y"
    { (yyval.node) = link(preinc_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 18:

/* Line 1455 of yacc.c  */
#line 95 "cgrammar-new.y"
    { (yyval.node) = link(predec_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 19:

/* Line 1455 of yacc.c  */
#line 96 "cgrammar-new.y"
    { (yyval.node) = link(addressof_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 20:

/* Line 1455 of yacc.c  */
#line 97 "cgrammar-new.y"
    { (yyval.node) = link(contentsof_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 21:

/* Line 1455 of yacc.c  */
#line 98 "cgrammar-new.y"
    { (yyval.node) = link(positive_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 22:

/* Line 1455 of yacc.c  */
#line 99 "cgrammar-new.y"
    { (yyval.node) = link(negative_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 23:

/* Line 1455 of yacc.c  */
#line 100 "cgrammar-new.y"
    { (yyval.node) = link(complement_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 24:

/* Line 1455 of yacc.c  */
#line 101 "cgrammar-new.y"
    { (yyval.node) = link(not_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 25:

/* Line 1455 of yacc.c  */
#line 102 "cgrammar-new.y"
    { (yyval.node) = link(sizeof_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 26:

/* Line 1455 of yacc.c  */
#line 103 "cgrammar-new.y"
    { (yyval.node) = link(sizeof_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 27:

/* Line 1455 of yacc.c  */
#line 107 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 28:

/* Line 1455 of yacc.c  */
#line 108 "cgrammar-new.y"
    { (yyval.node) = link(cast_, (yyvsp[(2) - (4)].node), (yyvsp[(4) - (4)].node), 0); ;}
    break;

  case 29:

/* Line 1455 of yacc.c  */
#line 112 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 30:

/* Line 1455 of yacc.c  */
#line 113 "cgrammar-new.y"
    { (yyval.node) = link(question_, (yyvsp[(1) - (5)].node), (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0); ;}
    break;

  case 31:

/* Line 1455 of yacc.c  */
#line 114 "cgrammar-new.y"
    { (yyval.node) = link(or_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 32:

/* Line 1455 of yacc.c  */
#line 115 "cgrammar-new.y"
    { (yyval.node) = link(and_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 33:

/* Line 1455 of yacc.c  */
#line 116 "cgrammar-new.y"
    { (yyval.node) = link(bitor_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 34:

/* Line 1455 of yacc.c  */
#line 117 "cgrammar-new.y"
    { (yyval.node) = link(bitxor_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 35:

/* Line 1455 of yacc.c  */
#line 118 "cgrammar-new.y"
    { (yyval.node) = link(bitand_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 36:

/* Line 1455 of yacc.c  */
#line 119 "cgrammar-new.y"
    { (yyval.node) = link(eq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 37:

/* Line 1455 of yacc.c  */
#line 120 "cgrammar-new.y"
    { (yyval.node) = link(ne_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 38:

/* Line 1455 of yacc.c  */
#line 121 "cgrammar-new.y"
    { (yyval.node) = link(lt_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 39:

/* Line 1455 of yacc.c  */
#line 122 "cgrammar-new.y"
    { (yyval.node) = link(gt_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 40:

/* Line 1455 of yacc.c  */
#line 123 "cgrammar-new.y"
    { (yyval.node) = link(le_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 41:

/* Line 1455 of yacc.c  */
#line 124 "cgrammar-new.y"
    { (yyval.node) = link(ge_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 42:

/* Line 1455 of yacc.c  */
#line 125 "cgrammar-new.y"
    { (yyval.node) = link(shl_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 43:

/* Line 1455 of yacc.c  */
#line 126 "cgrammar-new.y"
    { (yyval.node) = link(shr_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 44:

/* Line 1455 of yacc.c  */
#line 127 "cgrammar-new.y"
    { (yyval.node) = link(add_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 45:

/* Line 1455 of yacc.c  */
#line 128 "cgrammar-new.y"
    { (yyval.node) = link(sub_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 46:

/* Line 1455 of yacc.c  */
#line 129 "cgrammar-new.y"
    { (yyval.node) = link(mul_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 47:

/* Line 1455 of yacc.c  */
#line 130 "cgrammar-new.y"
    { (yyval.node) = link(div_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 48:

/* Line 1455 of yacc.c  */
#line 131 "cgrammar-new.y"
    { (yyval.node) = link(mod_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0);;}
    break;

  case 49:

/* Line 1455 of yacc.c  */
#line 135 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 50:

/* Line 1455 of yacc.c  */
#line 136 "cgrammar-new.y"
    { (yyval.node) = link(equals_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 51:

/* Line 1455 of yacc.c  */
#line 137 "cgrammar-new.y"
    { (yyval.node) = link(muleq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 52:

/* Line 1455 of yacc.c  */
#line 138 "cgrammar-new.y"
    { (yyval.node) = link(diveq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 53:

/* Line 1455 of yacc.c  */
#line 139 "cgrammar-new.y"
    { (yyval.node) = link(modeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 54:

/* Line 1455 of yacc.c  */
#line 140 "cgrammar-new.y"
    { (yyval.node) = link(addeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 55:

/* Line 1455 of yacc.c  */
#line 141 "cgrammar-new.y"
    { (yyval.node) = link(subeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 56:

/* Line 1455 of yacc.c  */
#line 142 "cgrammar-new.y"
    { (yyval.node) = link(shleq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 57:

/* Line 1455 of yacc.c  */
#line 143 "cgrammar-new.y"
    { (yyval.node) = link(shreq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 58:

/* Line 1455 of yacc.c  */
#line 144 "cgrammar-new.y"
    { (yyval.node) = link(andeq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 59:

/* Line 1455 of yacc.c  */
#line 145 "cgrammar-new.y"
    { (yyval.node) = link(xoreq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 60:

/* Line 1455 of yacc.c  */
#line 146 "cgrammar-new.y"
    { (yyval.node) = link(oreq_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 61:

/* Line 1455 of yacc.c  */
#line 150 "cgrammar-new.y"
    { (yyval.node) = link(assignment_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 62:

/* Line 1455 of yacc.c  */
#line 151 "cgrammar-new.y"
    { (yyval.node) = link(comma_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 63:

/* Line 1455 of yacc.c  */
#line 155 "cgrammar-new.y"
    { (yyval.node) = link(condexp_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 64:

/* Line 1455 of yacc.c  */
#line 159 "cgrammar-new.y"
    { (yyval.node) = link(decl_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 65:

/* Line 1455 of yacc.c  */
#line 160 "cgrammar-new.y"
    { (yyval.node) = link(decl_init_, (yyvsp[(1) - (3)].node), (yyvsp[(2) - (3)].node), 0); adjust_term((yyval.node), 4) ;}
    break;

  case 66:

/* Line 1455 of yacc.c  */
#line 164 "cgrammar-new.y"
    { (yyval.node) = link(decl_spec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 67:

/* Line 1455 of yacc.c  */
#line 165 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 68:

/* Line 1455 of yacc.c  */
#line 166 "cgrammar-new.y"
    { (yyval.node) = link(decl_spec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 69:

/* Line 1455 of yacc.c  */
#line 167 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 70:

/* Line 1455 of yacc.c  */
#line 168 "cgrammar-new.y"
    { (yyval.node) = link(decl_spec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 71:

/* Line 1455 of yacc.c  */
#line 169 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 72:

/* Line 1455 of yacc.c  */
#line 173 "cgrammar-new.y"
    { (yyval.node) = link(init_declarators_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 73:

/* Line 1455 of yacc.c  */
#line 174 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 74:

/* Line 1455 of yacc.c  */
#line 178 "cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 75:

/* Line 1455 of yacc.c  */
#line 179 "cgrammar-new.y"
    { (yyval.node) = link(declaratorinit_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 76:

/* Line 1455 of yacc.c  */
#line 183 "cgrammar-new.y"
    { (yyval.node) = link(typedef_, 0); ;}
    break;

  case 77:

/* Line 1455 of yacc.c  */
#line 184 "cgrammar-new.y"
    { (yyval.node) = link(extern_, 0); ;}
    break;

  case 78:

/* Line 1455 of yacc.c  */
#line 185 "cgrammar-new.y"
    { (yyval.node) = link(static_, 0); ;}
    break;

  case 79:

/* Line 1455 of yacc.c  */
#line 186 "cgrammar-new.y"
    { (yyval.node) = link(auto_, 0); ;}
    break;

  case 80:

/* Line 1455 of yacc.c  */
#line 187 "cgrammar-new.y"
    { (yyval.node) = link(register_, 0); ;}
    break;

  case 81:

/* Line 1455 of yacc.c  */
#line 191 "cgrammar-new.y"
    { (yyval.node) = link(void_, 0); ;}
    break;

  case 82:

/* Line 1455 of yacc.c  */
#line 192 "cgrammar-new.y"
    { (yyval.node) = link(char_, 0); ;}
    break;

  case 83:

/* Line 1455 of yacc.c  */
#line 193 "cgrammar-new.y"
    { (yyval.node) = link(short_, 0); ;}
    break;

  case 84:

/* Line 1455 of yacc.c  */
#line 194 "cgrammar-new.y"
    { (yyval.node) = link(int_, 0); ;}
    break;

  case 85:

/* Line 1455 of yacc.c  */
#line 195 "cgrammar-new.y"
    { (yyval.node) = link(long_, 0); ;}
    break;

  case 86:

/* Line 1455 of yacc.c  */
#line 196 "cgrammar-new.y"
    { (yyval.node) = link(float_, 0); ;}
    break;

  case 87:

/* Line 1455 of yacc.c  */
#line 197 "cgrammar-new.y"
    { (yyval.node) = link(double_, 0); ;}
    break;

  case 88:

/* Line 1455 of yacc.c  */
#line 198 "cgrammar-new.y"
    { (yyval.node) = link(signed_, 0); ;}
    break;

  case 89:

/* Line 1455 of yacc.c  */
#line 199 "cgrammar-new.y"
    { (yyval.node) = link(unsigned_, 0); ;}
    break;

  case 90:

/* Line 1455 of yacc.c  */
#line 200 "cgrammar-new.y"
    { (yyval.node) = link(struct_or_union_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 91:

/* Line 1455 of yacc.c  */
#line 201 "cgrammar-new.y"
    { (yyval.node) = link(enum_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 92:

/* Line 1455 of yacc.c  */
#line 202 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (1)].node); ;}
    break;

  case 93:

/* Line 1455 of yacc.c  */
#line 206 "cgrammar-new.y"
    { (yyval.node) = link(const_, 0); ;}
    break;

  case 94:

/* Line 1455 of yacc.c  */
#line 207 "cgrammar-new.y"
    { (yyval.node) = link(volatile_, 0); ;}
    break;

  case 95:

/* Line 1455 of yacc.c  */
#line 211 "cgrammar-new.y"
    { (yyval.node) = link(type_qualifiers_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 96:

/* Line 1455 of yacc.c  */
#line 212 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 97:

/* Line 1455 of yacc.c  */
#line 216 "cgrammar-new.y"
    { (yyval.node) = link(struct_, (yyvsp[(2) - (5)].node), (yyvsp[(4) - (5)].node), 0); ;}
    break;

  case 98:

/* Line 1455 of yacc.c  */
#line 217 "cgrammar-new.y"
    { (yyval.node) = link(struct_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 99:

/* Line 1455 of yacc.c  */
#line 218 "cgrammar-new.y"
    { (yyval.node) = link(struct_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 100:

/* Line 1455 of yacc.c  */
#line 219 "cgrammar-new.y"
    { (yyval.node) = link(union_, (yyvsp[(2) - (5)].node), (yyvsp[(4) - (5)].node), 0); ;}
    break;

  case 101:

/* Line 1455 of yacc.c  */
#line 220 "cgrammar-new.y"
    { (yyval.node) = link(union_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 102:

/* Line 1455 of yacc.c  */
#line 221 "cgrammar-new.y"
    { (yyval.node) = link(union_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 103:

/* Line 1455 of yacc.c  */
#line 226 "cgrammar-new.y"
    { (yyval.node) = link(struct_declarations_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 104:

/* Line 1455 of yacc.c  */
#line 227 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 105:

/* Line 1455 of yacc.c  */
#line 231 "cgrammar-new.y"
    { (yyval.node) = link(struct_declaration_, (yyvsp[(1) - (3)].node), (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 106:

/* Line 1455 of yacc.c  */
#line 235 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 107:

/* Line 1455 of yacc.c  */
#line 236 "cgrammar-new.y"
    { (yyval.node) = link(spec_qua_s_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 108:

/* Line 1455 of yacc.c  */
#line 237 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 109:

/* Line 1455 of yacc.c  */
#line 238 "cgrammar-new.y"
    { (yyval.node) = link(spec_qua_s_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 110:

/* Line 1455 of yacc.c  */
#line 242 "cgrammar-new.y"
    { (yyval.node) = link(struct_declarators_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 111:

/* Line 1455 of yacc.c  */
#line 243 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 112:

/* Line 1455 of yacc.c  */
#line 247 "cgrammar-new.y"
    { (yyval.node) = link(struct_declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 113:

/* Line 1455 of yacc.c  */
#line 248 "cgrammar-new.y"
    { (yyval.node) = link(struct_declarator_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 114:

/* Line 1455 of yacc.c  */
#line 249 "cgrammar-new.y"
    { (yyval.node) = link(struct_declarator_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 115:

/* Line 1455 of yacc.c  */
#line 253 "cgrammar-new.y"
    { (yyval.node) = link(enum_spec_, (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 116:

/* Line 1455 of yacc.c  */
#line 254 "cgrammar-new.y"
    { (yyval.node) = link(enum_spec_, (yyvsp[(2) - (5)].node), (yyvsp[(4) - (5)].node), 0); ;}
    break;

  case 117:

/* Line 1455 of yacc.c  */
#line 255 "cgrammar-new.y"
    { (yyval.node) = link(enum_spec_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 118:

/* Line 1455 of yacc.c  */
#line 259 "cgrammar-new.y"
    { (yyval.node) = link(enumerators_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 119:

/* Line 1455 of yacc.c  */
#line 260 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 120:

/* Line 1455 of yacc.c  */
#line 264 "cgrammar-new.y"
    { (yyval.node) = link(enumident_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 121:

/* Line 1455 of yacc.c  */
#line 265 "cgrammar-new.y"
    { (yyval.node) = link(enumequals_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 122:

/* Line 1455 of yacc.c  */
#line 269 "cgrammar-new.y"
    { (yyval.node) = link(direct_decl_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 123:

/* Line 1455 of yacc.c  */
#line 270 "cgrammar-new.y"
    { (yyval.node) = link(direct_decl_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 124:

/* Line 1455 of yacc.c  */
#line 274 "cgrammar-new.y"
    { (yyval.node) = link(ident_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 125:

/* Line 1455 of yacc.c  */
#line 275 "cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 126:

/* Line 1455 of yacc.c  */
#line 276 "cgrammar-new.y"
    { (yyval.node) = link(arraydecl_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 127:

/* Line 1455 of yacc.c  */
#line 277 "cgrammar-new.y"
    { (yyval.node) = link(arraydecl_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 128:

/* Line 1455 of yacc.c  */
#line 278 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 129:

/* Line 1455 of yacc.c  */
#line 279 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 130:

/* Line 1455 of yacc.c  */
#line 280 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 131:

/* Line 1455 of yacc.c  */
#line 284 "cgrammar-new.y"
    {(yyval.node) = link(pointer_, 0); ;}
    break;

  case 132:

/* Line 1455 of yacc.c  */
#line 285 "cgrammar-new.y"
    { (yyval.node) = link(pointer_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 133:

/* Line 1455 of yacc.c  */
#line 286 "cgrammar-new.y"
    { (yyval.node) = link(pointer_, (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 134:

/* Line 1455 of yacc.c  */
#line 287 "cgrammar-new.y"
    { (yyval.node) = link(pointer_, (yyvsp[(2) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 135:

/* Line 1455 of yacc.c  */
#line 291 "cgrammar-new.y"
    { (yyval.node) = link(param_types_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 136:

/* Line 1455 of yacc.c  */
#line 292 "cgrammar-new.y"
    { (yyval.node) = link(param_types_ellipsis_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 137:

/* Line 1455 of yacc.c  */
#line 296 "cgrammar-new.y"
    { (yyval.node) = link(param_declarations_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 138:

/* Line 1455 of yacc.c  */
#line 297 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 139:

/* Line 1455 of yacc.c  */
#line 301 "cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 140:

/* Line 1455 of yacc.c  */
#line 302 "cgrammar-new.y"
    { (yyval.node) = link(absarg_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 141:

/* Line 1455 of yacc.c  */
#line 303 "cgrammar-new.y"
    { (yyval.node) = link(declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 142:

/* Line 1455 of yacc.c  */
#line 307 "cgrammar-new.y"
    { (yyval.node) = link(idents_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 143:

/* Line 1455 of yacc.c  */
#line 308 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 144:

/* Line 1455 of yacc.c  */
#line 312 "cgrammar-new.y"
    { (yyval.node) = link(typespec_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 145:

/* Line 1455 of yacc.c  */
#line 313 "cgrammar-new.y"
    { (yyval.node) = link(typespec_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 146:

/* Line 1455 of yacc.c  */
#line 317 "cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 147:

/* Line 1455 of yacc.c  */
#line 318 "cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 148:

/* Line 1455 of yacc.c  */
#line 319 "cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 149:

/* Line 1455 of yacc.c  */
#line 323 "cgrammar-new.y"
    { (yyval.node) = link(abstract_declarator_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 150:

/* Line 1455 of yacc.c  */
#line 324 "cgrammar-new.y"
    { (yyval.node) = link(constexp_, 0); ;}
    break;

  case 151:

/* Line 1455 of yacc.c  */
#line 325 "cgrammar-new.y"
    { (yyval.node) = link(constexp_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 152:

/* Line 1455 of yacc.c  */
#line 326 "cgrammar-new.y"
    { (yyval.node) = link(absarray_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 153:

/* Line 1455 of yacc.c  */
#line 327 "cgrammar-new.y"
    { (yyval.node) = link(absarray_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 154:

/* Line 1455 of yacc.c  */
#line 328 "cgrammar-new.y"
    { (yyval.node) = link(absfunc_, 0); ;}
    break;

  case 155:

/* Line 1455 of yacc.c  */
#line 329 "cgrammar-new.y"
    { (yyval.node) = link(absfunc_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 156:

/* Line 1455 of yacc.c  */
#line 330 "cgrammar-new.y"
    { (yyval.node) = link(absfunc_, (yyvsp[(1) - (3)].node), 0); ;}
    break;

  case 157:

/* Line 1455 of yacc.c  */
#line 331 "cgrammar-new.y"
    { (yyval.node) = link(absfunc_, (yyvsp[(1) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 158:

/* Line 1455 of yacc.c  */
#line 335 "cgrammar-new.y"
    { (yyval.node) = link(assign_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 159:

/* Line 1455 of yacc.c  */
#line 336 "cgrammar-new.y"
    { (yyval.node) = link(Init_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 160:

/* Line 1455 of yacc.c  */
#line 337 "cgrammar-new.y"
    { (yyval.node) = link(Init_comma_, (yyvsp[(2) - (4)].node), 0); ;}
    break;

  case 161:

/* Line 1455 of yacc.c  */
#line 341 "cgrammar-new.y"
    { (yyval.node) = link(init_s_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 162:

/* Line 1455 of yacc.c  */
#line 342 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (3)].node); addchild((yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node)); ;}
    break;

  case 163:

/* Line 1455 of yacc.c  */
#line 346 "cgrammar-new.y"
    { (yyval.node) = link(labeledstmt_, (yyvsp[(1) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 164:

/* Line 1455 of yacc.c  */
#line 347 "cgrammar-new.y"
    { (yyval.node) = link(case_, (yyvsp[(2) - (4)].node), (yyvsp[(4) - (4)].node), 0); ;}
    break;

  case 165:

/* Line 1455 of yacc.c  */
#line 348 "cgrammar-new.y"
    { (yyval.node) = link(default_, (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 166:

/* Line 1455 of yacc.c  */
#line 350 "cgrammar-new.y"
    { (yyval.node) = link(block_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 167:

/* Line 1455 of yacc.c  */
#line 351 "cgrammar-new.y"
    { (yyval.node) = link(empty_stmt_, 0); ;}
    break;

  case 168:

/* Line 1455 of yacc.c  */
#line 352 "cgrammar-new.y"
    { (yyval.node) = link(exp_, (yyvsp[(1) - (2)].node), 0); ;}
    break;

  case 169:

/* Line 1455 of yacc.c  */
#line 354 "cgrammar-new.y"
    { (yyval.node) = link(if_, (yyvsp[(3) - (6)].node), (yyvsp[(5) - (6)].node), 0); ;}
    break;

  case 170:

/* Line 1455 of yacc.c  */
#line 355 "cgrammar-new.y"
    { (yyval.node) = link(ifelse_, (yyvsp[(3) - (7)].node), (yyvsp[(5) - (7)].node), (yyvsp[(7) - (7)].node), 0); ;}
    break;

  case 171:

/* Line 1455 of yacc.c  */
#line 356 "cgrammar-new.y"
    { (yyval.node) = link(switch_, (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0);;}
    break;

  case 172:

/* Line 1455 of yacc.c  */
#line 358 "cgrammar-new.y"
    { (yyval.node) = link(while_, (yyvsp[(3) - (5)].node), (yyvsp[(5) - (5)].node), 0); ;}
    break;

  case 173:

/* Line 1455 of yacc.c  */
#line 359 "cgrammar-new.y"
    { (yyval.node) = link(do_, (yyvsp[(2) - (7)].node), (yyvsp[(5) - (7)].node), 0); ;}
    break;

  case 174:

/* Line 1455 of yacc.c  */
#line 360 "cgrammar-new.y"
    { (yyval.node) = link(for_, (yyvsp[(3) - (9)].node), (yyvsp[(5) - (9)].node), (yyvsp[(7) - (9)].node), (yyvsp[(9) - (9)].node), 0); ;}
    break;

  case 175:

/* Line 1455 of yacc.c  */
#line 362 "cgrammar-new.y"
    { (yyval.node) = link(goto_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 176:

/* Line 1455 of yacc.c  */
#line 363 "cgrammar-new.y"
    { (yyval.node) = link(continue_, 0); ;}
    break;

  case 177:

/* Line 1455 of yacc.c  */
#line 364 "cgrammar-new.y"
    { (yyval.node) = link(break_, 0); ;}
    break;

  case 178:

/* Line 1455 of yacc.c  */
#line 365 "cgrammar-new.y"
    { (yyval.node) = link(return_, 0); ;}
    break;

  case 179:

/* Line 1455 of yacc.c  */
#line 366 "cgrammar-new.y"
    { (yyval.node) = link(return_exp_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 180:

/* Line 1455 of yacc.c  */
#line 367 "cgrammar-new.y"
    {yyerrok;;}
    break;

  case 181:

/* Line 1455 of yacc.c  */
#line 371 "cgrammar-new.y"
    { (yyval.node) = link(no_stmt_, 0); ;}
    break;

  case 182:

/* Line 1455 of yacc.c  */
#line 372 "cgrammar-new.y"
    { (yyval.node) = link(exp1_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 183:

/* Line 1455 of yacc.c  */
#line 376 "cgrammar-new.y"
    { (yyval.node) = link(no_stmt_, 0); ;}
    break;

  case 184:

/* Line 1455 of yacc.c  */
#line 377 "cgrammar-new.y"
    { (yyval.node) = link(exp2_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 185:

/* Line 1455 of yacc.c  */
#line 381 "cgrammar-new.y"
    { (yyval.node) = link(no_stmt_, 0); ;}
    break;

  case 186:

/* Line 1455 of yacc.c  */
#line 382 "cgrammar-new.y"
    { (yyval.node) = link(exp3_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 187:

/* Line 1455 of yacc.c  */
#line 386 "cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, 0); ;}
    break;

  case 188:

/* Line 1455 of yacc.c  */
#line 387 "cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 189:

/* Line 1455 of yacc.c  */
#line 388 "cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, (yyvsp[(2) - (3)].node), 0); ;}
    break;

  case 190:

/* Line 1455 of yacc.c  */
#line 389 "cgrammar-new.y"
    { (yyval.node) = link(compound_stmt_, (yyvsp[(2) - (4)].node), (yyvsp[(3) - (4)].node), 0); ;}
    break;

  case 191:

/* Line 1455 of yacc.c  */
#line 393 "cgrammar-new.y"
    { (yyval.node) = link(declarations_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 192:

/* Line 1455 of yacc.c  */
#line 394 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 193:

/* Line 1455 of yacc.c  */
#line 398 "cgrammar-new.y"
    { (yyval.node) = link(statements_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 194:

/* Line 1455 of yacc.c  */
#line 399 "cgrammar-new.y"
    {(yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); ;}
    break;

  case 195:

/* Line 1455 of yacc.c  */
#line 403 "cgrammar-new.y"
    { (yyval.node) = link(goal_, (yyvsp[(1) - (1)].node), 0); parse_tree = (yyval.node); root = (yyval.node)->node_index; ;}
    break;

  case 196:

/* Line 1455 of yacc.c  */
#line 404 "cgrammar-new.y"
    { (yyval.node) = (yyvsp[(1) - (2)].node); addchild((yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node)); parse_tree = (yyval.node); root = (yyval.node)->node_index; ;}
    break;

  case 197:

/* Line 1455 of yacc.c  */
#line 408 "cgrammar-new.y"
    { (yyval.node) = link(extdef_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 198:

/* Line 1455 of yacc.c  */
#line 409 "cgrammar-new.y"
    { (yyval.node) = link(extdef_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 199:

/* Line 1455 of yacc.c  */
#line 413 "cgrammar-new.y"
    { (yyval.node) = link(funcdef_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 200:

/* Line 1455 of yacc.c  */
#line 417 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (3)].node), (yyvsp[(2) - (3)].node), (yyvsp[(3) - (3)].node), 0); ;}
    break;

  case 201:

/* Line 1455 of yacc.c  */
#line 418 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 202:

/* Line 1455 of yacc.c  */
#line 419 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (2)].node), (yyvsp[(2) - (2)].node), 0); ;}
    break;

  case 203:

/* Line 1455 of yacc.c  */
#line 420 "cgrammar-new.y"
    { (yyval.node) = link(funcdecl_, (yyvsp[(1) - (1)].node), 0); ;}
    break;

  case 204:

/* Line 1455 of yacc.c  */
#line 424 "cgrammar-new.y"
    { (yyval.node) = link(funcbody_, (yyvsp[(1) - (1)].node), 0); ;}
    break;



/* Line 1455 of yacc.c  */
#line 3401 "cgrammar-new.tab.c"
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
#if ! YYERROR_VERBOSE
      yyerror (YY_("syntax error"));
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
#line 427 "cgrammar-new.y"

#include <stdio.h>

extern char yytext[];
extern int column;

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


