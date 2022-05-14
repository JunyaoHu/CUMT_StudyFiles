


#ifndef NCONST_H
#define NCONST_H

//默认值，存放在对应的数组的第一个位置(index 0)
#define  not_type_  0   

//for input.lex
#define  IDENT_  1
#define  CONST_  2
#define  STRING_  3

//primary_expression
#define  ident_  4
#define  constant_  5
#define  string_  6
#define  exp_     7

//postfix_expression
#define  array_  8
#define  funccall_  9
#define  member_  10
#define  ptrto_  11
#define  postinc_  12
#define  postdec_  13

//argument_expression_list
#define  arguments_  14

//unary_expression
#define  preinc_  15
#define  predec_  16
#define  addressof_  17
#define  contentsof_  18
#define  positive_  19
#define  negative_  20
#define  complement_  21
#define  not_  22
#define  sizeof_  23

//cast_expression
#define  cast_  24

//logical_expression
#define  or_  25
#define  and_  26
#define  bitor_  27
#define  bitxor_  28
#define  bitand_  29
#define  eq_  30
#define  ne_  31
#define  lt_  32
#define  gt_  33
#define  le_  34
#define  ge_  35
#define  shl_  36
#define  shr_  37
#define  add_  38
#define  sub_  39
#define  mul_  40
#define  div_  41
#define  mod_  42

//conditional_expression
#define  question_  43

//assignment_expression
#define  equals_  44
#define  muleq_  45
#define  diveq_  46
#define  modeq_  47
#define  addeq_  48
#define  subeq_  49
#define  shleq_  50
#define  shreq_  51
#define  andeq_  52
#define  xoreq_  53
#define  oreq_  54

//expression
#define  assignment_  55
#define  comma_  56

//constant_expression
#define  condexp_  57

//declaration
#define  decl_  58
#define  decl_init_  59

//declaration_specifiers
#define  decl_spec_  60

//init_declarator_list
#define  init_declarators_  61

//init_declarator
#define  declarator_  62
#define  declaratorinit_  63

//storage_class_specifier
#define  typedef_  64
#define  extern_  65
#define  static_  66
#define  auto_  67
#define  register_  68

//type_specifier
#define  void_  69
#define  char_  70
#define  short_  71
#define  int_  72
#define  long_  73
#define  float_  74
#define  double_  75
#define  signed_  76
#define  unsigned_  77

#define  struct_or_union_  78
#define  enum_  79
#define  type_name_  80

//TypeQua
#define  const_  81
#define  volatile_  82

//type_qualifier_list
#define  type_qualifiers_   83

//struct_or_union_specifier
#define  struct_  84
#define  union_  85

//struct_declaration_list
#define  struct_declarations_  86

//struct_declaration
#define  struct_declaration_  87

//specifier_qualifier_list
#define  spec_qua_s_  88

//struct_declarator_list
#define  struct_declarators_  89

//struct_declarator
#define  struct_declarator_  90

//enum_specifier
#define  enum_spec_  91

//enumerator_list
#define  enumerators_  92

//enumerator
#define  enumident_  93
#define  enumequals_  94

//declarator
#define  direct_decl_  95

//direct_declarator
#define  arraydecl_  96
#define  funcdecl_  97

//pointer
#define  pointer_  98

//parameter_type_list
#define  param_types_  99
#define  param_types_ellipsis_  100

//parameter_list
#define  param_declarations_  101

//parameter_declaration
#define  absarg_  102

//identifier_list
#define  idents_  103

//type_name
#define  typespec_  104

//abstract_declarator
#define  abstract_declarator_  105

//direct_abstract_declarator
#define  constexp_  106
#define  absarray_  107
#define  absfunc_      108

//initializer
#define  assign_  109
#define  Init_  110
#define  Init_comma_  111

//initializer_list
#define  init_s_  112

//statement
#define  labeledstmt_  113
#define  case_  114
#define  default_  115

//compound_stmt
#define  block_  116

//expression_stmt
#define  empty_stmt_  117

#define  if_  118
#define  ifelse_  119

#define  switch_  120

#define  while_  121
#define  do_  122
#define  for_  123

#define  goto_  124
#define  continue_  125
#define  break_  126
#define  return_  127
#define  return_exp_  128

#define  no_stmt_     129
#define  exp1_  130
#define  exp2_  131
#define  exp3_  132

//compound_statement
#define  compound_stmt_  133

//declaration_list
#define  declarations_    134

//statement_list
#define  statements_    135


//translation_unit
#define  goal_       136

//external_declaration
#define  extdef_      137

//function_definition
#define  funcdef_      138
#define  funcbody_    139


#endif

