// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.abestanis.vhdl.psi.VHDLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VHDLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABSTRACT_LITERAL) {
      r = abstract_literal(b, 0);
    }
    else if (t == ACCESS_TYPE_DEFINITION) {
      r = access_type_definition(b, 0);
    }
    else if (t == ACTUAL_DESIGNATOR) {
      r = actual_designator(b, 0);
    }
    else if (t == ACTUAL_PARAMETER_PART) {
      r = actual_parameter_part(b, 0);
    }
    else if (t == ACTUAL_PART) {
      r = actual_part(b, 0);
    }
    else if (t == ADDING_OPERATOR) {
      r = adding_operator(b, 0);
    }
    else if (t == AGGREGATE) {
      r = aggregate(b, 0);
    }
    else if (t == ALIAS_DECLARATION) {
      r = alias_declaration(b, 0);
    }
    else if (t == ALIAS_DESIGNATOR) {
      r = alias_designator(b, 0);
    }
    else if (t == ALLOCATOR) {
      r = allocator(b, 0);
    }
    else if (t == ARCHITECTURE_BODY) {
      r = architecture_body(b, 0);
    }
    else if (t == ARCHITECTURE_DECLARATIVE_PART) {
      r = architecture_declarative_part(b, 0);
    }
    else if (t == ARCHITECTURE_STATEMENT_PART) {
      r = architecture_statement_part(b, 0);
    }
    else if (t == ARRAY_TYPE_DEFINITION) {
      r = array_type_definition(b, 0);
    }
    else if (t == ASSERTION) {
      r = assertion(b, 0);
    }
    else if (t == ASSERTION_STATEMENT) {
      r = assertion_statement(b, 0);
    }
    else if (t == ASSOCIATION_ELEMENT) {
      r = association_element(b, 0);
    }
    else if (t == ASSOCIATION_LIST) {
      r = association_list(b, 0);
    }
    else if (t == ATTRIBUTE_DECLARATION) {
      r = attribute_declaration(b, 0);
    }
    else if (t == ATTRIBUTE_DESIGNATOR) {
      r = attribute_designator(b, 0);
    }
    else if (t == ATTRIBUTE_NAME) {
      r = attribute_name(b, 0);
    }
    else if (t == ATTRIBUTE_SPECIFICATION) {
      r = attribute_specification(b, 0);
    }
    else if (t == BINDING_INDICATION) {
      r = binding_indication(b, 0);
    }
    else if (t == BLOCK_CONFIGURATION) {
      r = block_configuration(b, 0);
    }
    else if (t == BLOCK_DECLARATIVE_ITEM) {
      r = block_declarative_item(b, 0);
    }
    else if (t == BLOCK_DECLARATIVE_PART) {
      r = block_declarative_part(b, 0);
    }
    else if (t == BLOCK_HEADER) {
      r = block_header(b, 0);
    }
    else if (t == BLOCK_SPECIFICATION) {
      r = block_specification(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = block_statement(b, 0);
    }
    else if (t == BLOCK_STATEMENT_PART) {
      r = block_statement_part(b, 0);
    }
    else if (t == CASE_STATEMENT) {
      r = case_statement(b, 0);
    }
    else if (t == CASE_STATEMENT_ALTERNATIVE) {
      r = case_statement_alternative(b, 0);
    }
    else if (t == CHOICE) {
      r = choice(b, 0);
    }
    else if (t == CHOICES) {
      r = choices(b, 0);
    }
    else if (t == COMPONENT_CONFIGURATION) {
      r = component_configuration(b, 0);
    }
    else if (t == COMPONENT_DECLARATION) {
      r = component_declaration(b, 0);
    }
    else if (t == COMPONENT_INSTANTIATION_STATEMENT) {
      r = component_instantiation_statement(b, 0);
    }
    else if (t == COMPONENT_SPECIFICATION) {
      r = component_specification(b, 0);
    }
    else if (t == COMPOSITE_TYPE_DEFINITION) {
      r = composite_type_definition(b, 0);
    }
    else if (t == CONCURRENT_ASSERTION_STATEMENT) {
      r = concurrent_assertion_statement(b, 0);
    }
    else if (t == CONCURRENT_PROCEDURE_CALL_STATEMENT) {
      r = concurrent_procedure_call_statement(b, 0);
    }
    else if (t == CONCURRENT_SIGNAL_ASSIGNMENT_STATEMENT) {
      r = concurrent_signal_assignment_statement(b, 0);
    }
    else if (t == CONCURRENT_STATEMENT) {
      r = concurrent_statement(b, 0);
    }
    else if (t == CONDITION) {
      r = condition(b, 0);
    }
    else if (t == CONDITION_CLAUSE) {
      r = condition_clause(b, 0);
    }
    else if (t == CONDITIONAL_SIGNAL_ASSIGNMENT) {
      r = conditional_signal_assignment(b, 0);
    }
    else if (t == CONDITIONAL_WAVEFORMS) {
      r = conditional_waveforms(b, 0);
    }
    else if (t == CONFIGURATION_DECLARATION) {
      r = configuration_declaration(b, 0);
    }
    else if (t == CONFIGURATION_DECLARATIVE_ITEM) {
      r = configuration_declarative_item(b, 0);
    }
    else if (t == CONFIGURATION_DECLARATIVE_PART) {
      r = configuration_declarative_part(b, 0);
    }
    else if (t == CONFIGURATION_ITEM) {
      r = configuration_item(b, 0);
    }
    else if (t == CONFIGURATION_SPECIFICATION) {
      r = configuration_specification(b, 0);
    }
    else if (t == CONSTANT_DECLARATION) {
      r = constant_declaration(b, 0);
    }
    else if (t == CONSTRAINED_ARRAY_DEFINITION) {
      r = constrained_array_definition(b, 0);
    }
    else if (t == CONSTRAINT) {
      r = constraint(b, 0);
    }
    else if (t == CONTEXT_CLAUSE) {
      r = context_clause(b, 0);
    }
    else if (t == CONTEXT_ITEM) {
      r = context_item(b, 0);
    }
    else if (t == DELAY_MECHANISM) {
      r = delay_mechanism(b, 0);
    }
    else if (t == DESIGN_UNIT) {
      r = design_unit(b, 0);
    }
    else if (t == DESIGNATOR) {
      r = designator(b, 0);
    }
    else if (t == DIRECTION) {
      r = direction(b, 0);
    }
    else if (t == DISCONNECTION_SPECIFICATION) {
      r = disconnection_specification(b, 0);
    }
    else if (t == DISCRETE_RANGE) {
      r = discrete_range(b, 0);
    }
    else if (t == ELEMENT_ASSOCIATION) {
      r = element_association(b, 0);
    }
    else if (t == ELEMENT_DECLARATION) {
      r = element_declaration(b, 0);
    }
    else if (t == ELEMENT_SUBTYPE_DEFINITION) {
      r = element_subtype_definition(b, 0);
    }
    else if (t == ENCODED_STRING_LITERAL) {
      r = encoded_string_literal(b, 0);
    }
    else if (t == ENTITY_ASPECT) {
      r = entity_aspect(b, 0);
    }
    else if (t == ENTITY_CLASS) {
      r = entity_class(b, 0);
    }
    else if (t == ENTITY_CLASS_ENTRY) {
      r = entity_class_entry(b, 0);
    }
    else if (t == ENTITY_CLASS_ENTRY_LIST) {
      r = entity_class_entry_list(b, 0);
    }
    else if (t == ENTITY_DECLARATION) {
      r = entity_declaration(b, 0);
    }
    else if (t == ENTITY_DECLARATIVE_ITEM) {
      r = entity_declarative_item(b, 0);
    }
    else if (t == ENTITY_DECLARATIVE_PART) {
      r = entity_declarative_part(b, 0);
    }
    else if (t == ENTITY_DESIGNATOR) {
      r = entity_designator(b, 0);
    }
    else if (t == ENTITY_HEADER) {
      r = entity_header(b, 0);
    }
    else if (t == ENTITY_NAME_LIST) {
      r = entity_name_list(b, 0);
    }
    else if (t == ENTITY_SPECIFICATION) {
      r = entity_specification(b, 0);
    }
    else if (t == ENTITY_STATEMENT) {
      r = entity_statement(b, 0);
    }
    else if (t == ENTITY_STATEMENT_PART) {
      r = entity_statement_part(b, 0);
    }
    else if (t == ENTITY_TAG) {
      r = entity_tag(b, 0);
    }
    else if (t == ENUMERATION_LITERAL) {
      r = enumeration_literal(b, 0);
    }
    else if (t == ENUMERATION_TYPE_DEFINITION) {
      r = enumeration_type_definition(b, 0);
    }
    else if (t == EXIT_STATEMENT) {
      r = exit_statement(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == FACTOR) {
      r = factor(b, 0);
    }
    else if (t == FILE_DECLARATION) {
      r = file_declaration(b, 0);
    }
    else if (t == FILE_LOGICAL_NAME) {
      r = file_logical_name(b, 0);
    }
    else if (t == FILE_OPEN_INFORMATION) {
      r = file_open_information(b, 0);
    }
    else if (t == FILE_TYPE_DEFINITION) {
      r = file_type_definition(b, 0);
    }
    else if (t == FLOATING_TYPE_DEFINITION) {
      r = floating_type_definition(b, 0);
    }
    else if (t == FORMAL_DESIGNATOR) {
      r = formal_designator(b, 0);
    }
    else if (t == FORMAL_PARAMETER_LIST) {
      r = formal_parameter_list(b, 0);
    }
    else if (t == FORMAL_PART) {
      r = formal_part(b, 0);
    }
    else if (t == FULL_TYPE_DECLARATION) {
      r = full_type_declaration(b, 0);
    }
    else if (t == FUNCTION_CALL) {
      r = function_call(b, 0);
    }
    else if (t == FUNCTION_CALL_PARAMETER) {
      r = function_call_parameter(b, 0);
    }
    else if (t == GENERATE_STATEMENT) {
      r = generate_statement(b, 0);
    }
    else if (t == GENERATION_SCHEME) {
      r = generation_scheme(b, 0);
    }
    else if (t == GENERIC_CLAUSE) {
      r = generic_clause(b, 0);
    }
    else if (t == GENERIC_LIST) {
      r = generic_list(b, 0);
    }
    else if (t == GENERIC_MAP_ASPECT) {
      r = generic_map_aspect(b, 0);
    }
    else if (t == GROUP_CONSTITUENT) {
      r = group_constituent(b, 0);
    }
    else if (t == GROUP_CONSTITUENT_LIST) {
      r = group_constituent_list(b, 0);
    }
    else if (t == GROUP_DECLARATION) {
      r = group_declaration(b, 0);
    }
    else if (t == GROUP_TEMPLATE_DECLARATION) {
      r = group_template_declaration(b, 0);
    }
    else if (t == GUARDED_SIGNAL_SPECIFICATION) {
      r = guarded_signal_specification(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == IDENTIFIER_LIST) {
      r = identifier_list(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = if_statement(b, 0);
    }
    else if (t == INCOMPLETE_TYPE_DECLARATION) {
      r = incomplete_type_declaration(b, 0);
    }
    else if (t == INDEX_CONSTRAINT) {
      r = index_constraint(b, 0);
    }
    else if (t == INDEX_SPECIFICATION) {
      r = index_specification(b, 0);
    }
    else if (t == INDEX_SUBTYPE_DEFINITION) {
      r = index_subtype_definition(b, 0);
    }
    else if (t == INSTANTIATED_UNIT) {
      r = instantiated_unit(b, 0);
    }
    else if (t == INSTANTIATION_LIST) {
      r = instantiation_list(b, 0);
    }
    else if (t == INTEGER_TYPE_DEFINITION) {
      r = integer_type_definition(b, 0);
    }
    else if (t == INTERFACE_CONSTANT_DECLARATION) {
      r = interface_constant_declaration(b, 0);
    }
    else if (t == INTERFACE_DECLARATION) {
      r = interface_declaration(b, 0);
    }
    else if (t == INTERFACE_ELEMENT) {
      r = interface_element(b, 0);
    }
    else if (t == INTERFACE_FILE_DECLARATION) {
      r = interface_file_declaration(b, 0);
    }
    else if (t == INTERFACE_LIST) {
      r = interface_list(b, 0);
    }
    else if (t == INTERFACE_SIGNAL_DECLARATION) {
      r = interface_signal_declaration(b, 0);
    }
    else if (t == INTERFACE_VARIABLE_DECLARATION) {
      r = interface_variable_declaration(b, 0);
    }
    else if (t == ITERATION_SCHEME) {
      r = iteration_scheme(b, 0);
    }
    else if (t == LABEL_) {
      r = label_(b, 0);
    }
    else if (t == LIBRARY_CLAUSE) {
      r = library_clause(b, 0);
    }
    else if (t == LIBRARY_UNIT) {
      r = library_unit(b, 0);
    }
    else if (t == LITERAL_) {
      r = literal_(b, 0);
    }
    else if (t == LOGICAL_NAME) {
      r = logical_name(b, 0);
    }
    else if (t == LOGICAL_NAME_LIST) {
      r = logical_name_list(b, 0);
    }
    else if (t == LOOP_STATEMENT) {
      r = loop_statement(b, 0);
    }
    else if (t == MODE) {
      r = mode(b, 0);
    }
    else if (t == MULTIPLYING_OPERATOR) {
      r = multiplying_operator(b, 0);
    }
    else if (t == NAME_) {
      r = name_(b, 0, -1);
    }
    else if (t == NEXT_STATEMENT) {
      r = next_statement(b, 0);
    }
    else if (t == NULL_STATEMENT) {
      r = null_statement(b, 0);
    }
    else if (t == NUMERIC_LITERAL) {
      r = numeric_literal(b, 0);
    }
    else if (t == OPTIONS) {
      r = options(b, 0);
    }
    else if (t == PACKAGE_BODY) {
      r = package_body(b, 0);
    }
    else if (t == PACKAGE_BODY_DECLARATIVE_ITEM) {
      r = package_body_declarative_item(b, 0);
    }
    else if (t == PACKAGE_BODY_DECLARATIVE_PART) {
      r = package_body_declarative_part(b, 0);
    }
    else if (t == PACKAGE_DECLARATION) {
      r = package_declaration(b, 0);
    }
    else if (t == PACKAGE_DECLARATIVE_ITEM) {
      r = package_declarative_item(b, 0);
    }
    else if (t == PACKAGE_DECLARATIVE_PART) {
      r = package_declarative_part(b, 0);
    }
    else if (t == PARAMETER_SPECIFICATION) {
      r = parameter_specification(b, 0);
    }
    else if (t == PHYSICAL_LITERAL) {
      r = physical_literal(b, 0);
    }
    else if (t == PHYSICAL_TYPE_DEFINITION) {
      r = physical_type_definition(b, 0);
    }
    else if (t == PORT_CLAUSE) {
      r = port_clause(b, 0);
    }
    else if (t == PORT_LIST) {
      r = port_list(b, 0);
    }
    else if (t == PORT_MAP_ASPECT) {
      r = port_map_aspect(b, 0);
    }
    else if (t == PRIMARY) {
      r = primary(b, 0);
    }
    else if (t == PRIMARY_UNIT) {
      r = primary_unit(b, 0);
    }
    else if (t == PRIMARY_UNIT_DECLARATION) {
      r = primary_unit_declaration(b, 0);
    }
    else if (t == PROCEDURE_CALL) {
      r = procedure_call(b, 0);
    }
    else if (t == PROCEDURE_CALL_STATEMENT) {
      r = procedure_call_statement(b, 0);
    }
    else if (t == PROCESS_DECLARATIVE_ITEM) {
      r = process_declarative_item(b, 0);
    }
    else if (t == PROCESS_DECLARATIVE_PART) {
      r = process_declarative_part(b, 0);
    }
    else if (t == PROCESS_STATEMENT) {
      r = process_statement(b, 0);
    }
    else if (t == PROCESS_STATEMENT_PART) {
      r = process_statement_part(b, 0);
    }
    else if (t == QUALIFIED_EXPRESSION) {
      r = qualified_expression(b, 0);
    }
    else if (t == RANGE_) {
      r = range_(b, 0);
    }
    else if (t == RANGE_CONSTRAINT) {
      r = range_constraint(b, 0);
    }
    else if (t == RECORD_TYPE_DEFINITION) {
      r = record_type_definition(b, 0);
    }
    else if (t == RELATION) {
      r = relation(b, 0);
    }
    else if (t == RELATIONAL_OPERATOR) {
      r = relational_operator(b, 0);
    }
    else if (t == REPORT_STATEMENT) {
      r = report_statement(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = return_statement(b, 0);
    }
    else if (t == SCALAR_TYPE_DEFINITION) {
      r = scalar_type_definition(b, 0);
    }
    else if (t == SECONDARY_UNIT) {
      r = secondary_unit(b, 0);
    }
    else if (t == SECONDARY_UNIT_DECLARATION) {
      r = secondary_unit_declaration(b, 0);
    }
    else if (t == SELECTED_SIGNAL_ASSIGNMENT) {
      r = selected_signal_assignment(b, 0);
    }
    else if (t == SELECTED_WAVEFORMS) {
      r = selected_waveforms(b, 0);
    }
    else if (t == SENSITIVITY_CLAUSE) {
      r = sensitivity_clause(b, 0);
    }
    else if (t == SENSITIVITY_LIST) {
      r = sensitivity_list(b, 0);
    }
    else if (t == SEQUENCE_OF_STATEMENTS) {
      r = sequence_of_statements(b, 0);
    }
    else if (t == SEQUENTIAL_STATEMENT) {
      r = sequential_statement(b, 0);
    }
    else if (t == SHIFT_EXPRESSION) {
      r = shift_expression(b, 0);
    }
    else if (t == SHIFT_OPERATOR) {
      r = shift_operator(b, 0);
    }
    else if (t == SIGN) {
      r = sign(b, 0);
    }
    else if (t == SIGNAL_ASSIGNMENT_STATEMENT) {
      r = signal_assignment_statement(b, 0);
    }
    else if (t == SIGNAL_DECLARATION) {
      r = signal_declaration(b, 0);
    }
    else if (t == SIGNAL_KIND) {
      r = signal_kind(b, 0);
    }
    else if (t == SIGNAL_LIST) {
      r = signal_list(b, 0);
    }
    else if (t == SIGNATURE) {
      r = signature(b, 0);
    }
    else if (t == SIMPLE_EXPRESSION) {
      r = simple_expression(b, 0);
    }
    else if (t == SUBPROGRAM_BODY) {
      r = subprogram_body(b, 0);
    }
    else if (t == SUBPROGRAM_DECLARATION) {
      r = subprogram_declaration(b, 0);
    }
    else if (t == SUBPROGRAM_DECLARATIVE_ITEM) {
      r = subprogram_declarative_item(b, 0);
    }
    else if (t == SUBPROGRAM_DECLARATIVE_PART) {
      r = subprogram_declarative_part(b, 0);
    }
    else if (t == SUBPROGRAM_KIND) {
      r = subprogram_kind(b, 0);
    }
    else if (t == SUBPROGRAM_SPECIFICATION) {
      r = subprogram_specification(b, 0);
    }
    else if (t == SUBPROGRAM_STATEMENT_PART) {
      r = subprogram_statement_part(b, 0);
    }
    else if (t == SUBTYPE_DECLARATION) {
      r = subtype_declaration(b, 0);
    }
    else if (t == SUBTYPE_INDICATION) {
      r = subtype_indication(b, 0);
    }
    else if (t == SUFFIX) {
      r = suffix(b, 0);
    }
    else if (t == TARGET) {
      r = target(b, 0);
    }
    else if (t == TERM) {
      r = term(b, 0);
    }
    else if (t == TIMEOUT_CLAUSE) {
      r = timeout_clause(b, 0);
    }
    else if (t == TYPE_CONVERSION) {
      r = type_conversion(b, 0);
    }
    else if (t == TYPE_DECLARATION) {
      r = type_declaration(b, 0);
    }
    else if (t == TYPE_DEFINITION) {
      r = type_definition(b, 0);
    }
    else if (t == TYPE_MARK) {
      r = type_mark(b, 0);
    }
    else if (t == UNCONSTRAINED_ARRAY_DEFINITION) {
      r = unconstrained_array_definition(b, 0);
    }
    else if (t == USE_CLAUSE) {
      r = use_clause(b, 0);
    }
    else if (t == VARIABLE_ASSIGNMENT_STATEMENT) {
      r = variable_assignment_statement(b, 0);
    }
    else if (t == VARIABLE_DECLARATION) {
      r = variable_declaration(b, 0);
    }
    else if (t == WAIT_STATEMENT) {
      r = wait_statement(b, 0);
    }
    else if (t == WAVEFORM) {
      r = waveform(b, 0);
    }
    else if (t == WAVEFORM_ELEMENT) {
      r = waveform_element(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return vhdlFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ATTRIBUTE_NAME_, INDEXED_NAME, INDEXED_NAME_FUNCTION_CALL, NAME_,
      OPERATOR_SYMBOL, SELECTED_NAME, SIMPLE_NAME, SLICE_NAME,
      SLICE_NAME_FUNCTION_CALL),
    create_token_set_(ALIAS_DECLARATION, ATTRIBUTE_DECLARATION, COMPONENT_DECLARATION, CONFIGURATION_DECLARATION,
      ENTITY_DECLARATION, GROUP_DECLARATION, GROUP_TEMPLATE_DECLARATION, INTERFACE_DECLARATION,
      PACKAGE_DECLARATION, SUBPROGRAM_DECLARATION, SUBTYPE_DECLARATION, TYPE_DECLARATION),
  };

  /* ********************************************************** */
  // DECIMAL_LITERAL | BASED_LITERAL
  public static boolean abstract_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_literal")) return false;
    if (!nextTokenIs(b, "<abstract literal>", BASED_LITERAL, DECIMAL_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_LITERAL, "<abstract literal>");
    r = consumeToken(b, DECIMAL_LITERAL);
    if (!r) r = consumeToken(b, BASED_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'access' subtype_indication
  public static boolean access_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_type_definition")) return false;
    if (!nextTokenIs(b, ACCESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCESS);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, ACCESS_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // expression | name_ | 'open'
  public static boolean actual_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_DESIGNATOR, "<actual designator>");
    r = expression(b, l + 1);
    if (!r) r = name_(b, l + 1, -1);
    if (!r) r = consumeToken(b, OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // association_list
  public static boolean actual_parameter_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameter_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_PARAMETER_PART, "<actual parameter part>");
    r = association_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // actual_designator | name_ '(' actual_designator ')' | type_mark '(' actual_designator ')'
  public static boolean actual_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_PART, "<actual part>");
    r = actual_designator(b, l + 1);
    if (!r) r = actual_part_1(b, l + 1);
    if (!r) r = actual_part_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name_ '(' actual_designator ')'
  private static boolean actual_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1, -1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && actual_designator(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark '(' actual_designator ')'
  private static boolean actual_part_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && actual_designator(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-' | '&'
  public static boolean adding_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adding_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDING_OPERATOR, "<adding operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, CONCAT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' element_association ( ',' element_association )* ')'
  public static boolean aggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && element_association(b, l + 1);
    r = r && aggregate_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, AGGREGATE, r);
    return r;
  }

  // ( ',' element_association )*
  private static boolean aggregate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!aggregate_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aggregate_2", c)) break;
    }
    return true;
  }

  // ',' element_association
  private static boolean aggregate_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && element_association(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'alias' alias_designator [ ':' subtype_indication ] 'is' name_ [ signature ] ';'
  public static boolean alias_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration")) return false;
    if (!nextTokenIs(b, ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS);
    r = r && alias_designator(b, l + 1);
    r = r && alias_declaration_2(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && name_(b, l + 1, -1);
    r = r && alias_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ALIAS_DECLARATION, r);
    return r;
  }

  // [ ':' subtype_indication ]
  private static boolean alias_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_2")) return false;
    alias_declaration_2_0(b, l + 1);
    return true;
  }

  // ':' subtype_indication
  private static boolean alias_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ signature ]
  private static boolean alias_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_5")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier | CHARACTER_LITERAL | operator_symbol
  public static boolean alias_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_DESIGNATOR, "<alias designator>");
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'new' subtype_indication | 'new' qualified_expression
  public static boolean allocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allocator_0(b, l + 1);
    if (!r) r = allocator_1(b, l + 1);
    exit_section_(b, m, ALLOCATOR, r);
    return r;
  }

  // 'new' subtype_indication
  private static boolean allocator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'new' qualified_expression
  private static boolean allocator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && qualified_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'architecture' identifier 'of' name_ 'is' architecture_declarative_part
  //     'begin' architecture_statement_part 'end' [ 'architecture' ] [ simple_name ] ';'
  public static boolean architecture_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body")) return false;
    if (!nextTokenIs(b, ARCHITECTURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARCHITECTURE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && name_(b, l + 1, -1);
    r = r && consumeToken(b, IS);
    r = r && architecture_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && architecture_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && architecture_body_9(b, l + 1);
    r = r && architecture_body_10(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ARCHITECTURE_BODY, r);
    return r;
  }

  // [ 'architecture' ]
  private static boolean architecture_body_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body_9")) return false;
    consumeToken(b, ARCHITECTURE);
    return true;
  }

  // [ simple_name ]
  private static boolean architecture_body_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body_10")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( block_declarative_item )*
  public static boolean architecture_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARCHITECTURE_DECLARATIVE_PART, "<architecture declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!architecture_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "architecture_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( block_declarative_item )
  private static boolean architecture_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( concurrent_statement )*
  public static boolean architecture_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARCHITECTURE_STATEMENT_PART, "<architecture statement part>");
    while (true) {
      int c = current_position_(b);
      if (!architecture_statement_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "architecture_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( concurrent_statement )
  private static boolean architecture_statement_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_statement_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unconstrained_array_definition | constrained_array_definition
  public static boolean array_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unconstrained_array_definition(b, l + 1);
    if (!r) r = constrained_array_definition(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // 'assert' condition [ 'report' expression ] [ 'severity' expression ]
  public static boolean assertion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSERT);
    r = r && condition(b, l + 1);
    r = r && assertion_2(b, l + 1);
    r = r && assertion_3(b, l + 1);
    exit_section_(b, m, ASSERTION, r);
    return r;
  }

  // [ 'report' expression ]
  private static boolean assertion_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_2")) return false;
    assertion_2_0(b, l + 1);
    return true;
  }

  // 'report' expression
  private static boolean assertion_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPORT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'severity' expression ]
  private static boolean assertion_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_3")) return false;
    assertion_3_0(b, l + 1);
    return true;
  }

  // 'severity' expression
  private static boolean assertion_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEVERITY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] assertion ';'
  public static boolean assertion_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERTION_STATEMENT, "<assertion statement>");
    r = assertion_statement_0(b, l + 1);
    r = r && assertion(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean assertion_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement_0")) return false;
    assertion_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean assertion_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ formal_part '=>' ] actual_part
  public static boolean association_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_ELEMENT, "<association element>");
    r = association_element_0(b, l + 1);
    r = r && actual_part(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ formal_part '=>' ]
  private static boolean association_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element_0")) return false;
    association_element_0_0(b, l + 1);
    return true;
  }

  // formal_part '=>'
  private static boolean association_element_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_part(b, l + 1);
    r = r && consumeToken(b, CASE_THEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // association_element ( ',' association_element )*
  public static boolean association_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_LIST, "<association list>");
    r = association_element(b, l + 1);
    r = r && association_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' association_element )*
  private static boolean association_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!association_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "association_list_1", c)) break;
    }
    return true;
  }

  // ',' association_element
  private static boolean association_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && association_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'attribute' identifier ':' type_mark ';'
  public static boolean attribute_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_declaration")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_mark(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name | 'range'
  public static boolean attribute_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_DESIGNATOR, "<attribute designator>");
    r = simple_name(b, l + 1);
    if (!r) r = consumeToken(b, RANGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_ function_call_parameter? "'" attribute_designator [ '(' expression ')' ]
  public static boolean attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_NAME, "<attribute name>");
    r = name_(b, l + 1, -1);
    r = r && attribute_name_1(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && attribute_designator(b, l + 1);
    r = r && attribute_name_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // function_call_parameter?
  private static boolean attribute_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_1")) return false;
    function_call_parameter(b, l + 1);
    return true;
  }

  // [ '(' expression ')' ]
  private static boolean attribute_name_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_4")) return false;
    attribute_name_4_0(b, l + 1);
    return true;
  }

  // '(' expression ')'
  private static boolean attribute_name_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'attribute' attribute_designator 'of' entity_specification 'is' expression ';'
  public static boolean attribute_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_specification")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE);
    r = r && attribute_designator(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && entity_specification(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'use' entity_aspect [ generic_map_aspect ] [ port_map_aspect ]
  public static boolean binding_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && entity_aspect(b, l + 1);
    r = r && binding_indication_2(b, l + 1);
    r = r && binding_indication_3(b, l + 1);
    exit_section_(b, m, BINDING_INDICATION, r);
    return r;
  }

  // [ generic_map_aspect ]
  private static boolean binding_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_2")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // [ port_map_aspect ]
  private static boolean binding_indication_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_3")) return false;
    port_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'for' block_specification ( use_clause )*
  //     ( configuration_item )* 'end' 'for' ';'
  public static boolean block_configuration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && block_specification(b, l + 1);
    r = r && block_configuration_2(b, l + 1);
    r = r && block_configuration_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, BLOCK_CONFIGURATION, r);
    return r;
  }

  // ( use_clause )*
  private static boolean block_configuration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_configuration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_configuration_2", c)) break;
    }
    return true;
  }

  // ( use_clause )
  private static boolean block_configuration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( configuration_item )*
  private static boolean block_configuration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_configuration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_configuration_3", c)) break;
    }
    return true;
  }

  // ( configuration_item )
  private static boolean block_configuration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configuration_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration | subprogram_body | type_declaration
  //     | subtype_declaration | constant_declaration | signal_declaration | file_declaration
  //     | alias_declaration | component_declaration | attribute_declaration | attribute_specification
  //     | configuration_specification | disconnection_specification | use_clause | variable_declaration
  //     | group_template_declaration | group_declaration
  public static boolean block_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_DECLARATIVE_ITEM, "<block declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = configuration_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( block_declarative_item )*
  public static boolean block_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_DECLARATIVE_PART, "<block declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!block_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( block_declarative_item )
  private static boolean block_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ generic_clause [ generic_map_aspect ';' ] ]
  //     [ port_clause [ port_map_aspect ';' ] ]
  public static boolean block_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_HEADER, "<block header>");
    r = block_header_0(b, l + 1);
    r = r && block_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ generic_clause [ generic_map_aspect ';' ] ]
  private static boolean block_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0")) return false;
    block_header_0_0(b, l + 1);
    return true;
  }

  // generic_clause [ generic_map_aspect ';' ]
  private static boolean block_header_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    r = r && block_header_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ generic_map_aspect ';' ]
  private static boolean block_header_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0_1")) return false;
    block_header_0_0_1_0(b, l + 1);
    return true;
  }

  // generic_map_aspect ';'
  private static boolean block_header_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ port_clause [ port_map_aspect ';' ] ]
  private static boolean block_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1")) return false;
    block_header_1_0(b, l + 1);
    return true;
  }

  // port_clause [ port_map_aspect ';' ]
  private static boolean block_header_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_clause(b, l + 1);
    r = r && block_header_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ port_map_aspect ';' ]
  private static boolean block_header_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0_1")) return false;
    block_header_1_0_1_0(b, l + 1);
    return true;
  }

  // port_map_aspect ';'
  private static boolean block_header_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name_ | label_ [ '(' index_specification ')' ]
  public static boolean block_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_SPECIFICATION, "<block specification>");
    r = name_(b, l + 1, -1);
    if (!r) r = block_specification_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // label_ [ '(' index_specification ')' ]
  private static boolean block_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && block_specification_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '(' index_specification ')' ]
  private static boolean block_specification_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification_1_1")) return false;
    block_specification_1_1_0(b, l + 1);
    return true;
  }

  // '(' index_specification ')'
  private static boolean block_specification_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && index_specification(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // label_ ':' 'block' [ '(' expression ')' ] [ 'is' ]
  //     block_header block_declarative_part 'begin' block_statement_part 'end' 'block' [ label_ ] ';'
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    if (!nextTokenIs(b, "<block statement>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT, "<block statement>");
    r = label_(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, BLOCK);
    r = r && block_statement_3(b, l + 1);
    r = r && block_statement_4(b, l + 1);
    r = r && block_header(b, l + 1);
    r = r && block_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && block_statement_part(b, l + 1);
    r = r && consumeTokens(b, 0, END, BLOCK);
    r = r && block_statement_11(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '(' expression ')' ]
  private static boolean block_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_3")) return false;
    block_statement_3_0(b, l + 1);
    return true;
  }

  // '(' expression ')'
  private static boolean block_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'is' ]
  private static boolean block_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_4")) return false;
    consumeToken(b, IS);
    return true;
  }

  // [ label_ ]
  private static boolean block_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_11")) return false;
    label_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( concurrent_statement )*
  public static boolean block_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT_PART, "<block statement part>");
    while (true) {
      int c = current_position_(b);
      if (!block_statement_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( concurrent_statement )
  private static boolean block_statement_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'case' expression 'is' case_statement_alternative
  //     ( case_statement_alternative )* 'end' 'case' [ label_ ] ';'
  public static boolean case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STATEMENT, "<case statement>");
    r = case_statement_0(b, l + 1);
    r = r && consumeToken(b, CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && case_statement_alternative(b, l + 1);
    r = r && case_statement_5(b, l + 1);
    r = r && consumeTokens(b, 0, END, CASE);
    r = r && case_statement_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean case_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_0")) return false;
    case_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean case_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( case_statement_alternative )*
  private static boolean case_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_statement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_statement_5", c)) break;
    }
    return true;
  }

  // ( case_statement_alternative )
  private static boolean case_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_statement_alternative(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ]
  private static boolean case_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_8")) return false;
    label_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'when' choices '=>' sequence_of_statements
  public static boolean case_statement_alternative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_alternative")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, CASE_THEN);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT_ALTERNATIVE, r);
    return r;
  }

  /* ********************************************************** */
  // 'others' | discrete_range | simple_expression | simple_name
  public static boolean choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICE, "<choice>");
    r = consumeToken(b, OTHERS);
    if (!r) r = discrete_range(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    if (!r) r = simple_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // choice ( '|' choice )*
  public static boolean choices(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICES, "<choices>");
    r = choice(b, l + 1);
    r = r && choices_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '|' choice )*
  private static boolean choices_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choices_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choices_1", c)) break;
    }
    return true;
  }

  // '|' choice
  private static boolean choices_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERTICAL_BAR);
    r = r && choice(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'for' component_specification [ binding_indication ';' ]
  //     [ block_configuration ] 'end' 'for' ';'
  public static boolean component_configuration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && component_configuration_2(b, l + 1);
    r = r && component_configuration_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, COMPONENT_CONFIGURATION, r);
    return r;
  }

  // [ binding_indication ';' ]
  private static boolean component_configuration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_2")) return false;
    component_configuration_2_0(b, l + 1);
    return true;
  }

  // binding_indication ';'
  private static boolean component_configuration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ block_configuration ]
  private static boolean component_configuration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_3")) return false;
    block_configuration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'component' identifier [ 'is' ] [ generic_clause ]
  //     [ port_clause ] 'end' 'component' [ simple_name ] ';'
  public static boolean component_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPONENT);
    r = r && identifier(b, l + 1);
    r = r && component_declaration_2(b, l + 1);
    r = r && component_declaration_3(b, l + 1);
    r = r && component_declaration_4(b, l + 1);
    r = r && consumeTokens(b, 0, END, COMPONENT);
    r = r && component_declaration_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, COMPONENT_DECLARATION, r);
    return r;
  }

  // [ 'is' ]
  private static boolean component_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // [ generic_clause ]
  private static boolean component_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_3")) return false;
    generic_clause(b, l + 1);
    return true;
  }

  // [ port_clause ]
  private static boolean component_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_4")) return false;
    port_clause(b, l + 1);
    return true;
  }

  // [ simple_name ]
  private static boolean component_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_7")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // label_ ':' instantiated_unit
  //     [ generic_map_aspect ] [ port_map_aspect ] ';'
  public static boolean component_instantiation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement")) return false;
    if (!nextTokenIs(b, "<component instantiation statement>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_INSTANTIATION_STATEMENT, "<component instantiation statement>");
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && instantiated_unit(b, l + 1);
    r = r && component_instantiation_statement_3(b, l + 1);
    r = r && component_instantiation_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ generic_map_aspect ]
  private static boolean component_instantiation_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement_3")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // [ port_map_aspect ]
  private static boolean component_instantiation_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement_4")) return false;
    port_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // instantiation_list ':' name_
  public static boolean component_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_SPECIFICATION, "<component specification>");
    r = instantiation_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_type_definition | record_type_definition
  public static boolean composite_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "composite_type_definition")) return false;
    if (!nextTokenIs(b, "<composite type definition>", ARRAY, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOSITE_TYPE_DEFINITION, "<composite type definition>");
    r = array_type_definition(b, l + 1);
    if (!r) r = record_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] [ 'postponed' ] assertion
  public static boolean concurrent_assertion_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_ASSERTION_STATEMENT, "<concurrent assertion statement>");
    r = concurrent_assertion_statement_0(b, l + 1);
    r = r && concurrent_assertion_statement_1(b, l + 1);
    r = r && assertion(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean concurrent_assertion_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_0")) return false;
    concurrent_assertion_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean concurrent_assertion_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'postponed' ]
  private static boolean concurrent_assertion_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // [ label_ ':' ] [ 'postponed' ] procedure_call
  public static boolean concurrent_procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_PROCEDURE_CALL_STATEMENT, "<concurrent procedure call statement>");
    r = concurrent_procedure_call_statement_0(b, l + 1);
    r = r && concurrent_procedure_call_statement_1(b, l + 1);
    r = r && procedure_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean concurrent_procedure_call_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_0")) return false;
    concurrent_procedure_call_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean concurrent_procedure_call_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'postponed' ]
  private static boolean concurrent_procedure_call_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // [ label_ ':' ] [ 'postponed' ] conditional_signal_assignment
  //     | [ label_ ':' ] [ 'postponed' ] selected_signal_assignment
  public static boolean concurrent_signal_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_SIGNAL_ASSIGNMENT_STATEMENT, "<concurrent signal assignment statement>");
    r = concurrent_signal_assignment_statement_0(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ] [ 'postponed' ] conditional_signal_assignment
  private static boolean concurrent_signal_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_0_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_0_1(b, l + 1);
    r = r && conditional_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ':' ]
  private static boolean concurrent_signal_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_0")) return false;
    concurrent_signal_assignment_statement_0_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean concurrent_signal_assignment_statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'postponed' ]
  private static boolean concurrent_signal_assignment_statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // [ label_ ':' ] [ 'postponed' ] selected_signal_assignment
  private static boolean concurrent_signal_assignment_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_1_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_1_1(b, l + 1);
    r = r && selected_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ':' ]
  private static boolean concurrent_signal_assignment_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_0")) return false;
    concurrent_signal_assignment_statement_1_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean concurrent_signal_assignment_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'postponed' ]
  private static boolean concurrent_signal_assignment_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // block_statement | process_statement | concurrent_assertion_statement
  //     | concurrent_signal_assignment_statement | generate_statement
  //     | component_instantiation_statement | concurrent_procedure_call_statement
  public static boolean concurrent_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_STATEMENT, "<concurrent statement>");
    r = block_statement(b, l + 1);
    if (!r) r = process_statement(b, l + 1);
    if (!r) r = concurrent_assertion_statement(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement(b, l + 1);
    if (!r) r = generate_statement(b, l + 1);
    if (!r) r = component_instantiation_statement(b, l + 1);
    if (!r) r = concurrent_procedure_call_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'until' condition
  public static boolean condition_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_clause")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, CONDITION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // target '<=' options conditional_waveforms ';'
  public static boolean conditional_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_signal_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_SIGNAL_ASSIGNMENT, "<conditional signal assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, EQUAL_LESS_THAN);
    r = r && options(b, l + 1);
    r = r && conditional_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( waveform 'when' condition 'else' )* waveform [ 'when' condition ]
  public static boolean conditional_waveforms(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_WAVEFORMS, "<conditional waveforms>");
    r = conditional_waveforms_0(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && conditional_waveforms_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( waveform 'when' condition 'else' )*
  private static boolean conditional_waveforms_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_waveforms_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_waveforms_0", c)) break;
    }
    return true;
  }

  // waveform 'when' condition 'else'
  private static boolean conditional_waveforms_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, ELSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'when' condition ]
  private static boolean conditional_waveforms_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_2")) return false;
    conditional_waveforms_2_0(b, l + 1);
    return true;
  }

  // 'when' condition
  private static boolean conditional_waveforms_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'configuration' identifier 'of' name_ 'is'
  //     configuration_declarative_part block_configuration 'end' [ 'configuration' ] [ simple_name ] ';'
  public static boolean configuration_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration")) return false;
    if (!nextTokenIs(b, CONFIGURATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && name_(b, l + 1, -1);
    r = r && consumeToken(b, IS);
    r = r && configuration_declarative_part(b, l + 1);
    r = r && block_configuration(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && configuration_declaration_8(b, l + 1);
    r = r && configuration_declaration_9(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONFIGURATION_DECLARATION, r);
    return r;
  }

  // [ 'configuration' ]
  private static boolean configuration_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_8")) return false;
    consumeToken(b, CONFIGURATION);
    return true;
  }

  // [ simple_name ]
  private static boolean configuration_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_9")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // use_clause | attribute_specification | group_declaration
  public static boolean configuration_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_DECLARATIVE_ITEM, "<configuration declarative item>");
    r = use_clause(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( configuration_declarative_item )*
  public static boolean configuration_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_DECLARATIVE_PART, "<configuration declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!configuration_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "configuration_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( configuration_declarative_item )
  private static boolean configuration_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configuration_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block_configuration | component_configuration
  public static boolean configuration_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_item")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_configuration(b, l + 1);
    if (!r) r = component_configuration(b, l + 1);
    exit_section_(b, m, CONFIGURATION_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // 'for' component_specification binding_indication ';'
  public static boolean configuration_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_specification")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONFIGURATION_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'constant' identifier_list ':' subtype_indication [ ':=' expression ] ';'
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    if (!nextTokenIs(b, CONSTANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTANT);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && constant_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONSTANT_DECLARATION, r);
    return r;
  }

  // [ ':=' expression ]
  private static boolean constant_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4")) return false;
    constant_declaration_4_0(b, l + 1);
    return true;
  }

  // ':=' expression
  private static boolean constant_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'array' index_constraint 'of' subtype_indication
  public static boolean constrained_array_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constrained_array_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && index_constraint(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, CONSTRAINED_ARRAY_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint | index_constraint
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    if (!nextTokenIs(b, "<constraint>", LEFT_PAREN, RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = range_constraint(b, l + 1);
    if (!r) r = index_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // context_item*
  public static boolean context_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_clause")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_CLAUSE, "<context clause>");
    while (true) {
      int c = current_position_(b);
      if (!context_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "context_clause", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // library_clause | use_clause
  public static boolean context_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_item")) return false;
    if (!nextTokenIs(b, "<context item>", LIBRARY, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_ITEM, "<context item>");
    r = library_clause(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'transport' | [ 'reject' expression ] 'inertial'
  public static boolean delay_mechanism(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELAY_MECHANISM, "<delay mechanism>");
    r = consumeToken(b, TRANSPORT);
    if (!r) r = delay_mechanism_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'reject' expression ] 'inertial'
  private static boolean delay_mechanism_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delay_mechanism_1_0(b, l + 1);
    r = r && consumeToken(b, INERTIAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'reject' expression ]
  private static boolean delay_mechanism_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1_0")) return false;
    delay_mechanism_1_0_0(b, l + 1);
    return true;
  }

  // 'reject' expression
  private static boolean delay_mechanism_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REJECT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // context_clause library_unit
  public static boolean design_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "design_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGN_UNIT, "<design unit>");
    r = context_clause(b, l + 1);
    r = r && library_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | operator_symbol
  public static boolean designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGNATOR, "<designator>");
    r = identifier(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'to' | 'downto'
  public static boolean direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direction")) return false;
    if (!nextTokenIs(b, "<direction>", DOWNTO, TO)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTION, "<direction>");
    r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, DOWNTO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'disconnect' guarded_signal_specification 'after' expression ';'
  public static boolean disconnection_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disconnection_specification")) return false;
    if (!nextTokenIs(b, DISCONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISCONNECT);
    r = r && guarded_signal_specification(b, l + 1);
    r = r && consumeToken(b, AFTER);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, DISCONNECTION_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // range_ | subtype_indication
  public static boolean discrete_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discrete_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCRETE_RANGE, "<discrete range>");
    r = range_(b, l + 1);
    if (!r) r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ choices '=>' ] expression
  public static boolean element_association(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_ASSOCIATION, "<element association>");
    r = element_association_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ choices '=>' ]
  private static boolean element_association_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association_0")) return false;
    element_association_0_0(b, l + 1);
    return true;
  }

  // choices '=>'
  private static boolean element_association_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choices(b, l + 1);
    r = r && consumeToken(b, CASE_THEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_list ':' element_subtype_definition ';'
  public static boolean element_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_declaration")) return false;
    if (!nextTokenIs(b, "<element declaration>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_DECLARATION, "<element declaration>");
    r = identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && element_subtype_definition(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean element_subtype_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_subtype_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_SUBTYPE_DEFINITION, "<element subtype definition>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BIT_STRING_LITERAL | OCT_STRING_LITERAL | HEX_STRING_LITERAL
  public static boolean encoded_string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encoded_string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENCODED_STRING_LITERAL, "<encoded string literal>");
    r = consumeToken(b, BIT_STRING_LITERAL);
    if (!r) r = consumeToken(b, OCT_STRING_LITERAL);
    if (!r) r = consumeToken(b, HEX_STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'entity' name_ [ '(' identifier ')' ] | 'configuration' name_ | 'open'
  public static boolean entity_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_ASPECT, "<entity aspect>");
    r = entity_aspect_0(b, l + 1);
    if (!r) r = entity_aspect_1(b, l + 1);
    if (!r) r = consumeToken(b, OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'entity' name_ [ '(' identifier ')' ]
  private static boolean entity_aspect_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && name_(b, l + 1, -1);
    r = r && entity_aspect_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '(' identifier ')' ]
  private static boolean entity_aspect_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0_2")) return false;
    entity_aspect_0_2_0(b, l + 1);
    return true;
  }

  // '(' identifier ')'
  private static boolean entity_aspect_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'configuration' name_
  private static boolean entity_aspect_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'entity' | 'architecture' | 'configuration' | 'procedure' | 'function' | 'package' | 'type' | 'subtype' | 'constant' | 'signal' | 'variable' | 'component' | 'label' | 'literal' | 'units' | 'group' | 'file'
  public static boolean entity_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS, "<entity class>");
    r = consumeToken(b, ENTITY);
    if (!r) r = consumeToken(b, ARCHITECTURE);
    if (!r) r = consumeToken(b, CONFIGURATION);
    if (!r) r = consumeToken(b, PROCEDURE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, PACKAGE);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, SUBTYPE);
    if (!r) r = consumeToken(b, CONSTANT);
    if (!r) r = consumeToken(b, SIGNAL);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, COMPONENT);
    if (!r) r = consumeToken(b, LABEL);
    if (!r) r = consumeToken(b, LITERAL);
    if (!r) r = consumeToken(b, UNITS);
    if (!r) r = consumeToken(b, GROUP);
    if (!r) r = consumeToken(b, FILE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_class [ '<>' ]
  public static boolean entity_class_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS_ENTRY, "<entity class entry>");
    r = entity_class(b, l + 1);
    r = r && entity_class_entry_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '<>' ]
  private static boolean entity_class_entry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_1")) return false;
    consumeToken(b, DIAMOND);
    return true;
  }

  /* ********************************************************** */
  // entity_class_entry ( ',' entity_class_entry )*
  public static boolean entity_class_entry_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS_ENTRY_LIST, "<entity class entry list>");
    r = entity_class_entry(b, l + 1);
    r = r && entity_class_entry_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' entity_class_entry )*
  private static boolean entity_class_entry_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_class_entry_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_class_entry_list_1", c)) break;
    }
    return true;
  }

  // ',' entity_class_entry
  private static boolean entity_class_entry_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && entity_class_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'entity' identifier 'is' entity_header entity_declarative_part
  //     [ 'begin' entity_statement_part ] 'end' [ 'entity' ] [ simple_name ] ';'
  public static boolean entity_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && entity_header(b, l + 1);
    r = r && entity_declarative_part(b, l + 1);
    r = r && entity_declaration_5(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && entity_declaration_7(b, l + 1);
    r = r && entity_declaration_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ENTITY_DECLARATION, r);
    return r;
  }

  // [ 'begin' entity_statement_part ]
  private static boolean entity_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_5")) return false;
    entity_declaration_5_0(b, l + 1);
    return true;
  }

  // 'begin' entity_statement_part
  private static boolean entity_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && entity_statement_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'entity' ]
  private static boolean entity_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_7")) return false;
    consumeToken(b, ENTITY);
    return true;
  }

  // [ simple_name ]
  private static boolean entity_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_8")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration | subprogram_body | type_declaration
  //     | subtype_declaration | constant_declaration | signal_declaration | variable_declaration
  //     | file_declaration | alias_declaration | attribute_declaration | attribute_specification
  //     | disconnection_specification | use_clause | group_template_declaration | group_declaration
  public static boolean entity_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DECLARATIVE_ITEM, "<entity declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( entity_declarative_item )*
  public static boolean entity_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DECLARATIVE_PART, "<entity declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!entity_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( entity_declarative_item )
  private static boolean entity_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_tag [ signature ]
  public static boolean entity_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DESIGNATOR, "<entity designator>");
    r = entity_tag(b, l + 1);
    r = r && entity_designator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ signature ]
  private static boolean entity_designator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_designator_1")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ generic_clause ] [ port_clause ]
  public static boolean entity_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_HEADER, "<entity header>");
    r = entity_header_0(b, l + 1);
    r = r && entity_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ generic_clause ]
  private static boolean entity_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_0")) return false;
    generic_clause(b, l + 1);
    return true;
  }

  // [ port_clause ]
  private static boolean entity_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_1")) return false;
    port_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // entity_designator ( ',' entity_designator )* | 'others' | 'all'
  public static boolean entity_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_NAME_LIST, "<entity name list>");
    r = entity_name_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // entity_designator ( ',' entity_designator )*
  private static boolean entity_name_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_designator(b, l + 1);
    r = r && entity_name_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' entity_designator )*
  private static boolean entity_name_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_name_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_name_list_0_1", c)) break;
    }
    return true;
  }

  // ',' entity_designator
  private static boolean entity_name_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && entity_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_name_list ':' entity_class
  public static boolean entity_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_SPECIFICATION, "<entity specification>");
    r = entity_name_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && entity_class(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // concurrent_assertion_statement | concurrent_procedure_call_statement
  //     | process_statement
  public static boolean entity_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_STATEMENT, "<entity statement>");
    r = concurrent_assertion_statement(b, l + 1);
    if (!r) r = concurrent_procedure_call_statement(b, l + 1);
    if (!r) r = process_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( entity_statement )*
  public static boolean entity_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_STATEMENT_PART, "<entity statement part>");
    while (true) {
      int c = current_position_(b);
      if (!entity_statement_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( entity_statement )
  private static boolean entity_statement_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name | CHARACTER_LITERAL | operator_symbol
  public static boolean entity_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_TAG, "<entity tag>");
    r = simple_name(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | CHARACTER_LITERAL
  public static boolean enumeration_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMERATION_LITERAL, "<enumeration literal>");
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' enumeration_literal ( ',' enumeration_literal )* ')'
  public static boolean enumeration_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && enumeration_literal(b, l + 1);
    r = r && enumeration_type_definition_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, ENUMERATION_TYPE_DEFINITION, r);
    return r;
  }

  // ( ',' enumeration_literal )*
  private static boolean enumeration_type_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumeration_type_definition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumeration_type_definition_2", c)) break;
    }
    return true;
  }

  // ',' enumeration_literal
  private static boolean enumeration_type_definition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumeration_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'exit' [ label_ ] [ 'when' condition ] ';'
  public static boolean exit_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXIT_STATEMENT, "<exit statement>");
    r = exit_statement_0(b, l + 1);
    r = r && consumeToken(b, EXIT);
    r = r && exit_statement_2(b, l + 1);
    r = r && exit_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean exit_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_0")) return false;
    exit_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean exit_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ]
  private static boolean exit_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_2")) return false;
    label_(b, l + 1);
    return true;
  }

  // [ 'when' condition ]
  private static boolean exit_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_3")) return false;
    exit_statement_3_0(b, l + 1);
    return true;
  }

  // 'when' condition
  private static boolean exit_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // relation (( 'and' relation )+ | ( 'or' relation )+ | ( 'xor' relation )+
  //     | ( 'nand' relation) | ( 'nor' relation ) | ( 'xnor' relation )*)
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = relation(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( 'and' relation )+ | ( 'or' relation )+ | ( 'xor' relation )+
  //     | ( 'nand' relation) | ( 'nor' relation ) | ( 'xnor' relation )*
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_1_0(b, l + 1);
    if (!r) r = expression_1_1(b, l + 1);
    if (!r) r = expression_1_2(b, l + 1);
    if (!r) r = expression_1_3(b, l + 1);
    if (!r) r = expression_1_4(b, l + 1);
    if (!r) r = expression_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'and' relation )+
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'and' relation
  private static boolean expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'or' relation )+
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'or' relation
  private static boolean expression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'xor' relation )+
  private static boolean expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_1_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'xor' relation
  private static boolean expression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'nand' relation
  private static boolean expression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAND);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'nor' relation
  private static boolean expression_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'xnor' relation )*
  private static boolean expression_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_1_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1_5", c)) break;
    }
    return true;
  }

  // 'xnor' relation
  private static boolean expression_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XNOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'abs' primary | 'not' primary | primary [ '**' primary ]
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = factor_0(b, l + 1);
    if (!r) r = factor_1(b, l + 1);
    if (!r) r = factor_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'abs' primary
  private static boolean factor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ABS);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'not' primary
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primary [ '**' primary ]
  private static boolean factor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && factor_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '**' primary ]
  private static boolean factor_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_2_1")) return false;
    factor_2_1_0(b, l + 1);
    return true;
  }

  // '**' primary
  private static boolean factor_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POW);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'file' identifier ':' subtype_indication [ file_open_information ] ';'
  public static boolean file_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_declaration")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && file_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FILE_DECLARATION, r);
    return r;
  }

  // [ file_open_information ]
  private static boolean file_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_declaration_4")) return false;
    file_open_information(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression
  public static boolean file_logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_logical_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_LOGICAL_NAME, "<file logical name>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ 'open' expression ] 'is' file_logical_name
  public static boolean file_open_information(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information")) return false;
    if (!nextTokenIs(b, "<file open information>", IS, OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_OPEN_INFORMATION, "<file open information>");
    r = file_open_information_0(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && file_logical_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'open' expression ]
  private static boolean file_open_information_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information_0")) return false;
    file_open_information_0_0(b, l + 1);
    return true;
  }

  // 'open' expression
  private static boolean file_open_information_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'file' 'of' type_mark
  public static boolean file_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_type_definition")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE, OF);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, FILE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint
  public static boolean floating_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_type_definition")) return false;
    if (!nextTokenIs(b, RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_constraint(b, l + 1);
    exit_section_(b, m, FLOATING_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // name_
  public static boolean formal_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_DESIGNATOR, "<formal designator>");
    r = name_(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_list
  public static boolean formal_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // formal_designator | name_ '(' formal_designator ')' | type_mark '(' formal_designator ')'
  public static boolean formal_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PART, "<formal part>");
    r = formal_designator(b, l + 1);
    if (!r) r = formal_part_1(b, l + 1);
    if (!r) r = formal_part_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name_ '(' formal_designator ')'
  private static boolean formal_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1, -1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && formal_designator(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark '(' formal_designator ')'
  private static boolean formal_part_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && formal_designator(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'type' identifier 'is' type_definition ';'
  public static boolean full_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && type_definition(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FULL_TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // name_ function_call_parameter
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, "<function call>");
    r = name_(b, l + 1, -1);
    r = r && function_call_parameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ '(' actual_parameter_part ')' ]
  public static boolean function_call_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_PARAMETER, "<function call parameter>");
    function_call_parameter_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // '(' actual_parameter_part ')'
  private static boolean function_call_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && actual_parameter_part(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // label_ ':' generation_scheme 'generate'
  //     [ ( block_declarative_item )* 'begin' ] ( concurrent_statement )* 'end' 'generate'
  //     [ label_ ] ';'
  public static boolean generate_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement")) return false;
    if (!nextTokenIs(b, "<generate statement>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERATE_STATEMENT, "<generate statement>");
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && generation_scheme(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && generate_statement_4(b, l + 1);
    r = r && generate_statement_5(b, l + 1);
    r = r && consumeTokens(b, 0, END, GENERATE);
    r = r && generate_statement_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( block_declarative_item )* 'begin' ]
  private static boolean generate_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4")) return false;
    generate_statement_4_0(b, l + 1);
    return true;
  }

  // ( block_declarative_item )* 'begin'
  private static boolean generate_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generate_statement_4_0_0(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( block_declarative_item )*
  private static boolean generate_statement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generate_statement_4_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generate_statement_4_0_0", c)) break;
    }
    return true;
  }

  // ( block_declarative_item )
  private static boolean generate_statement_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( concurrent_statement )*
  private static boolean generate_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generate_statement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generate_statement_5", c)) break;
    }
    return true;
  }

  // ( concurrent_statement )
  private static boolean generate_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ]
  private static boolean generate_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_8")) return false;
    label_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'for' parameter_specification | 'if' condition
  public static boolean generation_scheme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generation_scheme")) return false;
    if (!nextTokenIs(b, "<generation scheme>", FOR, IF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERATION_SCHEME, "<generation scheme>");
    r = generation_scheme_0(b, l + 1);
    if (!r) r = generation_scheme_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'for' parameter_specification
  private static boolean generation_scheme_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generation_scheme_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && parameter_specification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'if' condition
  private static boolean generation_scheme_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generation_scheme_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'generic' '(' generic_list ')' ';'
  public static boolean generic_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_clause")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERIC, LEFT_PAREN);
    r = r && generic_list(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PAREN, SEMICOLON);
    exit_section_(b, m, GENERIC_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // interface_list
  public static boolean generic_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_LIST, "<generic list>");
    r = interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'generic' 'map' '(' association_list ')'
  public static boolean generic_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_map_aspect")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERIC, MAP, LEFT_PAREN);
    r = r && association_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, GENERIC_MAP_ASPECT, r);
    return r;
  }

  /* ********************************************************** */
  // name_ | CHARACTER_LITERAL
  public static boolean group_constituent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONSTITUENT, "<group constituent>");
    r = name_(b, l + 1, -1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // group_constituent ( ',' group_constituent )*
  public static boolean group_constituent_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONSTITUENT_LIST, "<group constituent list>");
    r = group_constituent(b, l + 1);
    r = r && group_constituent_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' group_constituent )*
  private static boolean group_constituent_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_constituent_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_constituent_list_1", c)) break;
    }
    return true;
  }

  // ',' group_constituent
  private static boolean group_constituent_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && group_constituent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'group' identifier ':' name_ '(' group_constituent_list ')' ';'
  public static boolean group_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_declaration")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && name_(b, l + 1, -1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && group_constituent_list(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PAREN, SEMICOLON);
    exit_section_(b, m, GROUP_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'group' identifier 'is' '(' entity_class_entry_list ')' ';'
  public static boolean group_template_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_template_declaration")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, IS, LEFT_PAREN);
    r = r && entity_class_entry_list(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PAREN, SEMICOLON);
    exit_section_(b, m, GROUP_TEMPLATE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // signal_list ':' type_mark
  public static boolean guarded_signal_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guarded_signal_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GUARDED_SIGNAL_SPECIFICATION, "<guarded signal specification>");
    r = signal_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_mark(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BASIC_IDENTIFIER | EXTENDED_IDENTIFIER
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, BASIC_IDENTIFIER);
    if (!r) r = consumeToken(b, EXTENDED_IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ( ',' identifier )*
  public static boolean identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list")) return false;
    if (!nextTokenIs(b, "<identifier list>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_LIST, "<identifier list>");
    r = identifier(b, l + 1);
    r = r && identifier_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' identifier )*
  private static boolean identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_list_1", c)) break;
    }
    return true;
  }

  // ',' identifier
  private static boolean identifier_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'if' condition 'then' sequence_of_statements
  //     ( 'elsif' condition 'then' sequence_of_statements )* [ 'else' sequence_of_statements ]
  //     'end' 'if' [ label_ ] ';'
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = if_statement_0(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && sequence_of_statements(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    r = r && if_statement_6(b, l + 1);
    r = r && consumeTokens(b, 0, END, IF);
    r = r && if_statement_9(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean if_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_0")) return false;
    if_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean if_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'elsif' condition 'then' sequence_of_statements )*
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_statement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_5", c)) break;
    }
    return true;
  }

  // 'elsif' condition 'then' sequence_of_statements
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'else' sequence_of_statements ]
  private static boolean if_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6")) return false;
    if_statement_6_0(b, l + 1);
    return true;
  }

  // 'else' sequence_of_statements
  private static boolean if_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ]
  private static boolean if_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_9")) return false;
    label_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'type' identifier ';'
  public static boolean incomplete_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "incomplete_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, INCOMPLETE_TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' discrete_range ( ',' discrete_range )* ')'
  public static boolean index_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && discrete_range(b, l + 1);
    r = r && index_constraint_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, INDEX_CONSTRAINT, r);
    return r;
  }

  // ( ',' discrete_range )*
  private static boolean index_constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!index_constraint_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "index_constraint_2", c)) break;
    }
    return true;
  }

  // ',' discrete_range
  private static boolean index_constraint_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && discrete_range(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // discrete_range | expression
  public static boolean index_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_SPECIFICATION, "<index specification>");
    r = discrete_range(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_mark 'range' '<>'
  public static boolean index_subtype_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_subtype_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_SUBTYPE_DEFINITION, "<index subtype definition>");
    r = type_mark(b, l + 1);
    r = r && consumeTokens(b, 0, RANGE, DIAMOND);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'entity' name_ [ '(' identifier ')' ]
  //     | 'configuration' name_ | [ 'component' ] name_
  public static boolean instantiated_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANTIATED_UNIT, "<instantiated unit>");
    r = instantiated_unit_0(b, l + 1);
    if (!r) r = instantiated_unit_1(b, l + 1);
    if (!r) r = instantiated_unit_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'entity' name_ [ '(' identifier ')' ]
  private static boolean instantiated_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && name_(b, l + 1, -1);
    r = r && instantiated_unit_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '(' identifier ')' ]
  private static boolean instantiated_unit_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0_2")) return false;
    instantiated_unit_0_2_0(b, l + 1);
    return true;
  }

  // '(' identifier ')'
  private static boolean instantiated_unit_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'configuration' name_
  private static boolean instantiated_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'component' ] name_
  private static boolean instantiated_unit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instantiated_unit_2_0(b, l + 1);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'component' ]
  private static boolean instantiated_unit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_2_0")) return false;
    consumeToken(b, COMPONENT);
    return true;
  }

  /* ********************************************************** */
  // label_ ( ',' label_ )* | 'others' | 'all'
  public static boolean instantiation_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANTIATION_LIST, "<instantiation list>");
    r = instantiation_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // label_ ( ',' label_ )*
  private static boolean instantiation_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && instantiation_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' label_ )*
  private static boolean instantiation_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instantiation_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instantiation_list_0_1", c)) break;
    }
    return true;
  }

  // ',' label_
  private static boolean instantiation_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && label_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint
  public static boolean integer_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_type_definition")) return false;
    if (!nextTokenIs(b, RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_constraint(b, l + 1);
    exit_section_(b, m, INTEGER_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // [ 'constant' ] identifier_list ':' [ 'in' ] subtype_indication
  //     [ ':=' expression ]
  public static boolean interface_constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_CONSTANT_DECLARATION, "<interface constant declaration>");
    r = interface_constant_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && interface_constant_declaration_3(b, l + 1);
    r = r && subtype_indication(b, l + 1);
    r = r && interface_constant_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'constant' ]
  private static boolean interface_constant_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_0")) return false;
    consumeToken(b, CONSTANT);
    return true;
  }

  // [ 'in' ]
  private static boolean interface_constant_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_3")) return false;
    consumeToken(b, IN);
    return true;
  }

  // [ ':=' expression ]
  private static boolean interface_constant_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_5")) return false;
    interface_constant_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' expression
  private static boolean interface_constant_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // interface_constant_declaration | interface_signal_declaration
  //     | interface_variable_declaration | interface_file_declaration
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_constant_declaration(b, l + 1);
    if (!r) r = interface_signal_declaration(b, l + 1);
    if (!r) r = interface_variable_declaration(b, l + 1);
    if (!r) r = interface_file_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_declaration
  public static boolean interface_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_ELEMENT, "<interface element>");
    r = interface_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'file' identifier_list ':' subtype_indication
  public static boolean interface_file_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_file_declaration")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, INTERFACE_FILE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // interface_element ( ';' interface_element )*
  public static boolean interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_LIST, "<interface list>");
    r = interface_element(b, l + 1);
    r = r && interface_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ';' interface_element )*
  private static boolean interface_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_list_1", c)) break;
    }
    return true;
  }

  // ';' interface_element
  private static boolean interface_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && interface_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ 'signal' ] identifier_list ':' [ mode ] subtype_indication
  //     [ 'bus' ] [ ':=' expression ]
  public static boolean interface_signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_SIGNAL_DECLARATION, "<interface signal declaration>");
    r = interface_signal_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && interface_signal_declaration_3(b, l + 1);
    r = r && subtype_indication(b, l + 1);
    r = r && interface_signal_declaration_5(b, l + 1);
    r = r && interface_signal_declaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'signal' ]
  private static boolean interface_signal_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_0")) return false;
    consumeToken(b, SIGNAL);
    return true;
  }

  // [ mode ]
  private static boolean interface_signal_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_3")) return false;
    mode(b, l + 1);
    return true;
  }

  // [ 'bus' ]
  private static boolean interface_signal_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_5")) return false;
    consumeToken(b, BUS);
    return true;
  }

  // [ ':=' expression ]
  private static boolean interface_signal_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_6")) return false;
    interface_signal_declaration_6_0(b, l + 1);
    return true;
  }

  // ':=' expression
  private static boolean interface_signal_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ 'variable' ] identifier_list ':' [ mode ] subtype_indication
  //     [ ':=' expression ]
  public static boolean interface_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_VARIABLE_DECLARATION, "<interface variable declaration>");
    r = interface_variable_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && interface_variable_declaration_3(b, l + 1);
    r = r && subtype_indication(b, l + 1);
    r = r && interface_variable_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'variable' ]
  private static boolean interface_variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_0")) return false;
    consumeToken(b, VARIABLE);
    return true;
  }

  // [ mode ]
  private static boolean interface_variable_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_3")) return false;
    mode(b, l + 1);
    return true;
  }

  // [ ':=' expression ]
  private static boolean interface_variable_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_5")) return false;
    interface_variable_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' expression
  private static boolean interface_variable_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'while' condition | 'for' parameter_specification
  public static boolean iteration_scheme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme")) return false;
    if (!nextTokenIs(b, "<iteration scheme>", FOR, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATION_SCHEME, "<iteration scheme>");
    r = iteration_scheme_0(b, l + 1);
    if (!r) r = iteration_scheme_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'while' condition
  private static boolean iteration_scheme_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' parameter_specification
  private static boolean iteration_scheme_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && parameter_specification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean label_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_")) return false;
    if (!nextTokenIs(b, "<label>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL_, "<label>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'library' logical_name_list ';'
  public static boolean library_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "library_clause")) return false;
    if (!nextTokenIs(b, LIBRARY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIBRARY);
    r = r && logical_name_list(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, LIBRARY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // primary_unit | secondary_unit
  public static boolean library_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "library_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIBRARY_UNIT, "<library unit>");
    r = primary_unit(b, l + 1);
    if (!r) r = secondary_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // numeric_literal | enumeration_literal
  //     | STRING_LITERAL | encoded_string_literal | 'null'
  public static boolean literal_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_, "<literal>");
    r = numeric_literal(b, l + 1);
    if (!r) r = enumeration_literal(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = encoded_string_literal(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name")) return false;
    if (!nextTokenIs(b, "<logical name>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_NAME, "<logical name>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logical_name ( ',' logical_name )*
  public static boolean logical_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list")) return false;
    if (!nextTokenIs(b, "<logical name list>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_NAME_LIST, "<logical name list>");
    r = logical_name(b, l + 1);
    r = r && logical_name_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' logical_name )*
  private static boolean logical_name_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_name_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_name_list_1", c)) break;
    }
    return true;
  }

  // ',' logical_name
  private static boolean logical_name_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && logical_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] [ iteration_scheme ] 'loop' sequence_of_statements
  //     'end' 'loop' [ label_ ] ';'
  public static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_STATEMENT, "<loop statement>");
    r = loop_statement_0(b, l + 1);
    r = r && loop_statement_1(b, l + 1);
    r = r && consumeToken(b, LOOP);
    r = r && sequence_of_statements(b, l + 1);
    r = r && consumeTokens(b, 0, END, LOOP);
    r = r && loop_statement_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean loop_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_0")) return false;
    loop_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean loop_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ iteration_scheme ]
  private static boolean loop_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_1")) return false;
    iteration_scheme(b, l + 1);
    return true;
  }

  // [ label_ ]
  private static boolean loop_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_6")) return false;
    label_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'in' | 'out' | 'inout' | 'buffer' | 'linkage'
  public static boolean mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODE, "<mode>");
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, INOUT);
    if (!r) r = consumeToken(b, BUFFER);
    if (!r) r = consumeToken(b, LINKAGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*' | '/' | 'mod' | 'rem'
  public static boolean multiplying_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplying_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLYING_OPERATOR, "<multiplying operator>");
    r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, MODULO);
    if (!r) r = consumeToken(b, REMAINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'next' [ label_ ] [ 'when' condition ] ';'
  public static boolean next_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEXT_STATEMENT, "<next statement>");
    r = next_statement_0(b, l + 1);
    r = r && consumeToken(b, NEXT);
    r = r && next_statement_2(b, l + 1);
    r = r && next_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean next_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_0")) return false;
    next_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean next_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label_ ]
  private static boolean next_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_2")) return false;
    label_(b, l + 1);
    return true;
  }

  // [ 'when' condition ]
  private static boolean next_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_3")) return false;
    next_statement_3_0(b, l + 1);
    return true;
  }

  // 'when' condition
  private static boolean next_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'null' ';'
  public static boolean null_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULL_STATEMENT, "<null statement>");
    r = null_statement_0(b, l + 1);
    r = r && consumeTokens(b, 0, NULL, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean null_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement_0")) return false;
    null_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean null_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // physical_literal | abstract_literal
  public static boolean numeric_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_LITERAL, "<numeric literal>");
    r = physical_literal(b, l + 1);
    if (!r) r = abstract_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ 'guarded' ] [ delay_mechanism ]
  public static boolean options(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "options")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPTIONS, "<options>");
    r = options_0(b, l + 1);
    r = r && options_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'guarded' ]
  private static boolean options_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "options_0")) return false;
    consumeToken(b, GUARDED);
    return true;
  }

  // [ delay_mechanism ]
  private static boolean options_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "options_1")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'package' 'body' simple_name 'is' package_body_declarative_part
  //     'end' [ 'package' 'body' ] [ simple_name ] ';'
  public static boolean package_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, BODY);
    r = r && simple_name(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && package_body_declarative_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && package_body_6(b, l + 1);
    r = r && package_body_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_BODY, r);
    return r;
  }

  // [ 'package' 'body' ]
  private static boolean package_body_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_6")) return false;
    parseTokens(b, 0, PACKAGE, BODY);
    return true;
  }

  // [ simple_name ]
  private static boolean package_body_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_7")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration | subprogram_body | type_declaration
  //     | subtype_declaration | constant_declaration | variable_declaration | file_declaration
  //     | alias_declaration | use_clause | group_template_declaration | group_declaration
  public static boolean package_body_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_BODY_DECLARATIVE_ITEM, "<package body declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( package_body_declarative_item )*
  public static boolean package_body_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_BODY_DECLARATIVE_PART, "<package body declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!package_body_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_body_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( package_body_declarative_item )
  private static boolean package_body_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_body_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'package' identifier 'is' package_declarative_part 'end'
  //     [ 'package' ] [ simple_name ] ';'
  public static boolean package_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && package_declarative_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && package_declaration_5(b, l + 1);
    r = r && package_declaration_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

  // [ 'package' ]
  private static boolean package_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration_5")) return false;
    consumeToken(b, PACKAGE);
    return true;
  }

  // [ simple_name ]
  private static boolean package_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration_6")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration | type_declaration | subtype_declaration
  //     | constant_declaration | signal_declaration | file_declaration | alias_declaration
  //     | component_declaration | attribute_declaration | attribute_specification
  //     | disconnection_specification | use_clause | variable_declaration
  //     | group_template_declaration | group_declaration
  public static boolean package_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATIVE_ITEM, "<package declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( package_declarative_item )*
  public static boolean package_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATIVE_PART, "<package declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!package_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( package_declarative_item )
  private static boolean package_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier 'in' discrete_range
  public static boolean parameter_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_specification")) return false;
    if (!nextTokenIs(b, "<parameter specification>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_SPECIFICATION, "<parameter specification>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && discrete_range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ abstract_literal ] name_
  public static boolean physical_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PHYSICAL_LITERAL, "<physical literal>");
    r = physical_literal_0(b, l + 1);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ abstract_literal ]
  private static boolean physical_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_literal_0")) return false;
    abstract_literal(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // range_constraint 'units' primary_unit_declaration
  //     ( secondary_unit_declaration )* 'end' 'units' [ simple_name ]
  public static boolean physical_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition")) return false;
    if (!nextTokenIs(b, RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_constraint(b, l + 1);
    r = r && consumeToken(b, UNITS);
    r = r && primary_unit_declaration(b, l + 1);
    r = r && physical_type_definition_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, UNITS);
    r = r && physical_type_definition_6(b, l + 1);
    exit_section_(b, m, PHYSICAL_TYPE_DEFINITION, r);
    return r;
  }

  // ( secondary_unit_declaration )*
  private static boolean physical_type_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!physical_type_definition_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "physical_type_definition_3", c)) break;
    }
    return true;
  }

  // ( secondary_unit_declaration )
  private static boolean physical_type_definition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondary_unit_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ simple_name ]
  private static boolean physical_type_definition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_6")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'port' '(' port_list ')' ';'
  public static boolean port_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_clause")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PORT, LEFT_PAREN);
    r = r && port_list(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PAREN, SEMICOLON);
    exit_section_(b, m, PORT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // interface_list
  public static boolean port_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_LIST, "<port list>");
    r = interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'port' 'map' '(' association_list ')'
  public static boolean port_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_map_aspect")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PORT, MAP, LEFT_PAREN);
    r = r && association_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, PORT_MAP_ASPECT, r);
    return r;
  }

  /* ********************************************************** */
  // aggregate | qualified_expression
  //     | type_conversion | allocator | '(' expression ')' | function_call | name_ | literal_
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = aggregate(b, l + 1);
    if (!r) r = qualified_expression(b, l + 1);
    if (!r) r = type_conversion(b, l + 1);
    if (!r) r = allocator(b, l + 1);
    if (!r) r = primary_4(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = name_(b, l + 1, -1);
    if (!r) r = literal_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' expression ')'
  private static boolean primary_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_declaration | configuration_declaration | package_declaration
  public static boolean primary_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_UNIT, "<primary unit>");
    r = entity_declaration(b, l + 1);
    if (!r) r = configuration_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean primary_unit_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_unit_declaration")) return false;
    if (!nextTokenIs(b, "<primary unit declaration>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_UNIT_DECLARATION, "<primary unit declaration>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_ [ '(' actual_parameter_part ')' ]
  public static boolean procedure_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_CALL, "<procedure call>");
    r = name_(b, l + 1, -1);
    r = r && procedure_call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '(' actual_parameter_part ')' ]
  private static boolean procedure_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1")) return false;
    procedure_call_1_0(b, l + 1);
    return true;
  }

  // '(' actual_parameter_part ')'
  private static boolean procedure_call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && actual_parameter_part(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] procedure_call ';'
  public static boolean procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_CALL_STATEMENT, "<procedure call statement>");
    r = procedure_call_statement_0(b, l + 1);
    r = r && procedure_call(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean procedure_call_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement_0")) return false;
    procedure_call_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean procedure_call_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration | subprogram_body | type_declaration
  //     | subtype_declaration | constant_declaration | variable_declaration | file_declaration
  //     | alias_declaration | attribute_declaration | attribute_specification | use_clause
  //     | group_template_declaration | group_declaration
  public static boolean process_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_DECLARATIVE_ITEM, "<process declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( process_declarative_item )*
  public static boolean process_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_DECLARATIVE_PART, "<process declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!process_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "process_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( process_declarative_item )
  private static boolean process_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = process_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] [ 'postponed' ] 'process' [ '(' sensitivity_list ')' ]
  //     [ 'is' ] process_declarative_part 'begin' process_statement_part 'end' [ 'postponed' ]
  //     'process' [ label_ ] ';'
  public static boolean process_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_STATEMENT, "<process statement>");
    r = process_statement_0(b, l + 1);
    r = r && process_statement_1(b, l + 1);
    r = r && consumeToken(b, PROCESS);
    r = r && process_statement_3(b, l + 1);
    r = r && process_statement_4(b, l + 1);
    r = r && process_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && process_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && process_statement_9(b, l + 1);
    r = r && consumeToken(b, PROCESS);
    r = r && process_statement_11(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean process_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_0")) return false;
    process_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean process_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'postponed' ]
  private static boolean process_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // [ '(' sensitivity_list ')' ]
  private static boolean process_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_3")) return false;
    process_statement_3_0(b, l + 1);
    return true;
  }

  // '(' sensitivity_list ')'
  private static boolean process_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && sensitivity_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'is' ]
  private static boolean process_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_4")) return false;
    consumeToken(b, IS);
    return true;
  }

  // [ 'postponed' ]
  private static boolean process_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_9")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // [ label_ ]
  private static boolean process_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_11")) return false;
    label_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( sequential_statement )*
  public static boolean process_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_STATEMENT_PART, "<process statement part>");
    while (true) {
      int c = current_position_(b);
      if (!process_statement_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "process_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( sequential_statement )
  private static boolean process_statement_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sequential_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_mark "'" '(' expression ')' | type_mark "'" aggregate
  public static boolean qualified_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_EXPRESSION, "<qualified expression>");
    r = qualified_expression_0(b, l + 1);
    if (!r) r = qualified_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_mark "'" '(' expression ')'
  private static boolean qualified_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeTokens(b, 0, SINGLE_QUOTE, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark "'" aggregate
  private static boolean qualified_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && aggregate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (attribute_name | simple_expression) direction simple_expression
  public static boolean range_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_, "<range>");
    r = range__0(b, l + 1);
    r = r && direction(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_name | simple_expression
  private static boolean range__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range__0")) return false;
    boolean r;
    r = attribute_name(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'range' range_
  public static boolean range_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_constraint")) return false;
    if (!nextTokenIs(b, RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANGE);
    r = r && range_(b, l + 1);
    exit_section_(b, m, RANGE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // 'record' element_declaration ( element_declaration )*
  //     'end' 'record' [ simple_name ]
  public static boolean record_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && element_declaration(b, l + 1);
    r = r && record_type_definition_2(b, l + 1);
    r = r && consumeTokens(b, 0, END, RECORD);
    r = r && record_type_definition_5(b, l + 1);
    exit_section_(b, m, RECORD_TYPE_DEFINITION, r);
    return r;
  }

  // ( element_declaration )*
  private static boolean record_type_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_type_definition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_type_definition_2", c)) break;
    }
    return true;
  }

  // ( element_declaration )
  private static boolean record_type_definition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ simple_name ]
  private static boolean record_type_definition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_5")) return false;
    simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // shift_expression [ relational_operator shift_expression ]
  public static boolean relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION, "<relation>");
    r = shift_expression(b, l + 1);
    r = r && relation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ relational_operator shift_expression ]
  private static boolean relation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1")) return false;
    relation_1_0(b, l + 1);
    return true;
  }

  // relational_operator shift_expression
  private static boolean relation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_operator(b, l + 1);
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' | '/=' | '<' | '<=' | '>' | '>='
  public static boolean relational_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, EQUAL_LESS_THAN);
    if (!r) r = consumeToken(b, MORE_THAN);
    if (!r) r = consumeToken(b, EQUAL_MORE_THAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'report' expression [ 'severity' expression ] ';'
  public static boolean report_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPORT_STATEMENT, "<report statement>");
    r = report_statement_0(b, l + 1);
    r = r && consumeToken(b, REPORT);
    r = r && expression(b, l + 1);
    r = r && report_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean report_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_0")) return false;
    report_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean report_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'severity' expression ]
  private static boolean report_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_3")) return false;
    report_statement_3_0(b, l + 1);
    return true;
  }

  // 'severity' expression
  private static boolean report_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEVERITY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'return' [ expression ] ';'
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = return_statement_0(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && return_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean return_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_0")) return false;
    return_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean return_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression ]
  private static boolean return_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_2")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // enumeration_type_definition | integer_type_definition
  //     | floating_type_definition | physical_type_definition
  public static boolean scalar_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_type_definition")) return false;
    if (!nextTokenIs(b, "<scalar type definition>", LEFT_PAREN, RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCALAR_TYPE_DEFINITION, "<scalar type definition>");
    r = enumeration_type_definition(b, l + 1);
    if (!r) r = integer_type_definition(b, l + 1);
    if (!r) r = floating_type_definition(b, l + 1);
    if (!r) r = physical_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // architecture_body | package_body
  public static boolean secondary_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_unit")) return false;
    if (!nextTokenIs(b, "<secondary unit>", ARCHITECTURE, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SECONDARY_UNIT, "<secondary unit>");
    r = architecture_body(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier '=' physical_literal ';'
  public static boolean secondary_unit_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_unit_declaration")) return false;
    if (!nextTokenIs(b, "<secondary unit declaration>", BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SECONDARY_UNIT_DECLARATION, "<secondary unit declaration>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && physical_literal(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'with' expression 'select' target '<=' options selected_waveforms ';'
  public static boolean selected_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_signal_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, EQUAL_LESS_THAN);
    r = r && options(b, l + 1);
    r = r && selected_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SELECTED_SIGNAL_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ( waveform 'when' choices ',' )* waveform 'when' choices
  public static boolean selected_waveforms(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTED_WAVEFORMS, "<selected waveforms>");
    r = selected_waveforms_0(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( waveform 'when' choices ',' )*
  private static boolean selected_waveforms_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selected_waveforms_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "selected_waveforms_0", c)) break;
    }
    return true;
  }

  // waveform 'when' choices ','
  private static boolean selected_waveforms_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'on' sensitivity_list
  public static boolean sensitivity_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_clause")) return false;
    if (!nextTokenIs(b, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && sensitivity_list(b, l + 1);
    exit_section_(b, m, SENSITIVITY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // name_ ( ',' name_ )*
  public static boolean sensitivity_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SENSITIVITY_LIST, "<sensitivity list>");
    r = name_(b, l + 1, -1);
    r = r && sensitivity_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' name_ )*
  private static boolean sensitivity_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sensitivity_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sensitivity_list_1", c)) break;
    }
    return true;
  }

  // ',' name_
  private static boolean sensitivity_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( sequential_statement )*
  public static boolean sequence_of_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_of_statements")) return false;
    Marker m = enter_section_(b, l, _NONE_, SEQUENCE_OF_STATEMENTS, "<sequence of statements>");
    while (true) {
      int c = current_position_(b);
      if (!sequence_of_statements_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sequence_of_statements", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( sequential_statement )
  private static boolean sequence_of_statements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_of_statements_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sequential_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // wait_statement | assertion_statement | signal_assignment_statement
  //     | variable_assignment_statement | procedure_call_statement | if_statement | case_statement
  //     | loop_statement | next_statement | exit_statement | return_statement | null_statement
  //     | report_statement
  public static boolean sequential_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_STATEMENT, "<sequential statement>");
    r = wait_statement(b, l + 1);
    if (!r) r = assertion_statement(b, l + 1);
    if (!r) r = signal_assignment_statement(b, l + 1);
    if (!r) r = variable_assignment_statement(b, l + 1);
    if (!r) r = procedure_call_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = case_statement(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = next_statement(b, l + 1);
    if (!r) r = exit_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = null_statement(b, l + 1);
    if (!r) r = report_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_expression [ shift_operator simple_expression ]
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    r = simple_expression(b, l + 1);
    r = r && shift_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ shift_operator simple_expression ]
  private static boolean shift_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1")) return false;
    shift_expression_1_0(b, l + 1);
    return true;
  }

  // shift_operator simple_expression
  private static boolean shift_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_operator(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'sll' | 'srl' | 'sla' | 'sra' | 'rol' | 'ror'
  public static boolean shift_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_OPERATOR, "<shift operator>");
    r = consumeToken(b, SHIFT_LEFT);
    if (!r) r = consumeToken(b, SHIFT_RIGHT);
    if (!r) r = consumeToken(b, SHIFT_LEFT_A);
    if (!r) r = consumeToken(b, SHIFT_RIGHT_A);
    if (!r) r = consumeToken(b, ROTATE_LEFT);
    if (!r) r = consumeToken(b, ROTATE_RIGHT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-'
  public static boolean sign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign")) return false;
    if (!nextTokenIs(b, "<sign>", MINUS, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGN, "<sign>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] target '<=' [ delay_mechanism ] waveform ';'
  public static boolean signal_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_ASSIGNMENT_STATEMENT, "<signal assignment statement>");
    r = signal_assignment_statement_0(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, EQUAL_LESS_THAN);
    r = r && signal_assignment_statement_3(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean signal_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0")) return false;
    signal_assignment_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean signal_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ delay_mechanism ]
  private static boolean signal_assignment_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_3")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'signal' identifier_list ':'
  //     subtype_indication [ signal_kind ] [ ':=' expression ] ';'
  public static boolean signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration")) return false;
    if (!nextTokenIs(b, SIGNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNAL);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && signal_declaration_4(b, l + 1);
    r = r && signal_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SIGNAL_DECLARATION, r);
    return r;
  }

  // [ signal_kind ]
  private static boolean signal_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_4")) return false;
    signal_kind(b, l + 1);
    return true;
  }

  // [ ':=' expression ]
  private static boolean signal_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_5")) return false;
    signal_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' expression
  private static boolean signal_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'register' | 'bus'
  public static boolean signal_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_kind")) return false;
    if (!nextTokenIs(b, "<signal kind>", BUS, REGISTER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_KIND, "<signal kind>");
    r = consumeToken(b, REGISTER);
    if (!r) r = consumeToken(b, BUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_ ( ',' name_ )* | 'others' | 'all'
  public static boolean signal_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_LIST, "<signal list>");
    r = signal_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name_ ( ',' name_ )*
  private static boolean signal_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1, -1);
    r = r && signal_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' name_ )*
  private static boolean signal_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signal_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signal_list_0_1", c)) break;
    }
    return true;
  }

  // ',' name_
  private static boolean signal_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' [ type_mark ( ',' type_mark )* ] [ 'return' type_mark ] ']'
  public static boolean signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature")) return false;
    if (!nextTokenIs(b, LEFT_BRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACK);
    r = r && signature_1(b, l + 1);
    r = r && signature_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACK);
    exit_section_(b, m, SIGNATURE, r);
    return r;
  }

  // [ type_mark ( ',' type_mark )* ]
  private static boolean signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1")) return false;
    signature_1_0(b, l + 1);
    return true;
  }

  // type_mark ( ',' type_mark )*
  private static boolean signature_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && signature_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' type_mark )*
  private static boolean signature_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signature_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signature_1_0_1", c)) break;
    }
    return true;
  }

  // ',' type_mark
  private static boolean signature_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'return' type_mark ]
  private static boolean signature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_2")) return false;
    signature_2_0(b, l + 1);
    return true;
  }

  // 'return' type_mark
  private static boolean signature_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ sign ] term ( adding_operator term )*
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPRESSION, "<simple expression>");
    r = simple_expression_0(b, l + 1);
    r = r && term(b, l + 1);
    r = r && simple_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ sign ]
  private static boolean simple_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_0")) return false;
    sign(b, l + 1);
    return true;
  }

  // ( adding_operator term )*
  private static boolean simple_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simple_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_expression_2", c)) break;
    }
    return true;
  }

  // adding_operator term
  private static boolean simple_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = adding_operator(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_specification 'is' subprogram_declarative_part 'begin'
  //     subprogram_statement_part 'end' [ subprogram_kind ] [ designator ] ';'
  public static boolean subprogram_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_BODY, "<subprogram body>");
    r = subprogram_specification(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && subprogram_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && subprogram_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && subprogram_body_6(b, l + 1);
    r = r && subprogram_body_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ subprogram_kind ]
  private static boolean subprogram_body_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body_6")) return false;
    subprogram_kind(b, l + 1);
    return true;
  }

  // [ designator ]
  private static boolean subprogram_body_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body_7")) return false;
    designator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_specification ';'
  public static boolean subprogram_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATION, "<subprogram declaration>");
    r = subprogram_specification(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration | subprogram_body | type_declaration
  //     | subtype_declaration | constant_declaration | variable_declaration | file_declaration
  //     | alias_declaration | attribute_declaration | attribute_specification | use_clause
  //     | group_template_declaration | group_declaration
  public static boolean subprogram_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATIVE_ITEM, "<subprogram declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( subprogram_declarative_item )*
  public static boolean subprogram_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATIVE_PART, "<subprogram declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!subprogram_declarative_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subprogram_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( subprogram_declarative_item )
  private static boolean subprogram_declarative_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subprogram_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'procedure' | 'function'
  public static boolean subprogram_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_kind")) return false;
    if (!nextTokenIs(b, "<subprogram kind>", FUNCTION, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_KIND, "<subprogram kind>");
    r = consumeToken(b, PROCEDURE);
    if (!r) r = consumeToken(b, FUNCTION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'procedure' designator [ '(' formal_parameter_list ')' ]
  //     | [ 'pure' ] 'function' designator [ '(' formal_parameter_list ')' ] 'return' type_mark
  //     | 'impure' 'function' designator [ '(' formal_parameter_list ')' ] 'return' type_mark
  public static boolean subprogram_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_SPECIFICATION, "<subprogram specification>");
    r = subprogram_specification_0(b, l + 1);
    if (!r) r = subprogram_specification_1(b, l + 1);
    if (!r) r = subprogram_specification_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'procedure' designator [ '(' formal_parameter_list ')' ]
  private static boolean subprogram_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROCEDURE);
    r = r && designator(b, l + 1);
    r = r && subprogram_specification_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '(' formal_parameter_list ')' ]
  private static boolean subprogram_specification_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_0_2")) return false;
    subprogram_specification_0_2_0(b, l + 1);
    return true;
  }

  // '(' formal_parameter_list ')'
  private static boolean subprogram_specification_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'pure' ] 'function' designator [ '(' formal_parameter_list ')' ] 'return' type_mark
  private static boolean subprogram_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subprogram_specification_1_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    r = r && designator(b, l + 1);
    r = r && subprogram_specification_1_3(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'pure' ]
  private static boolean subprogram_specification_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_0")) return false;
    consumeToken(b, PURE);
    return true;
  }

  // [ '(' formal_parameter_list ')' ]
  private static boolean subprogram_specification_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_3")) return false;
    subprogram_specification_1_3_0(b, l + 1);
    return true;
  }

  // '(' formal_parameter_list ')'
  private static boolean subprogram_specification_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'impure' 'function' designator [ '(' formal_parameter_list ')' ] 'return' type_mark
  private static boolean subprogram_specification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPURE, FUNCTION);
    r = r && designator(b, l + 1);
    r = r && subprogram_specification_2_3(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '(' formal_parameter_list ')' ]
  private static boolean subprogram_specification_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_2_3")) return false;
    subprogram_specification_2_3_0(b, l + 1);
    return true;
  }

  // '(' formal_parameter_list ')'
  private static boolean subprogram_specification_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( sequential_statement )*
  public static boolean subprogram_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_STATEMENT_PART, "<subprogram statement part>");
    while (true) {
      int c = current_position_(b);
      if (!subprogram_statement_part_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subprogram_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ( sequential_statement )
  private static boolean subprogram_statement_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_statement_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sequential_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'subtype' identifier 'is' subtype_indication ';'
  public static boolean subtype_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_declaration")) return false;
    if (!nextTokenIs(b, SUBTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUBTYPE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && subtype_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SUBTYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // (([name_] type_mark) | type_mark) [ constraint ]
  public static boolean subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBTYPE_INDICATION, "<subtype indication>");
    r = subtype_indication_0(b, l + 1);
    r = r && subtype_indication_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ([name_] type_mark) | type_mark
  private static boolean subtype_indication_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subtype_indication_0_0(b, l + 1);
    if (!r) r = type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [name_] type_mark
  private static boolean subtype_indication_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subtype_indication_0_0_0(b, l + 1);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [name_]
  private static boolean subtype_indication_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_0_0_0")) return false;
    name_(b, l + 1, -1);
    return true;
  }

  // [ constraint ]
  private static boolean subtype_indication_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_1")) return false;
    constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_name | CHARACTER_LITERAL | operator_symbol | 'all'
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = simple_name(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = operator_symbol(b, l + 1);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_ | aggregate
  public static boolean target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TARGET, "<target>");
    r = name_(b, l + 1, -1);
    if (!r) r = aggregate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // factor ( multiplying_operator factor )*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( multiplying_operator factor )*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // multiplying_operator factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplying_operator(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'for' expression
  public static boolean timeout_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "timeout_clause")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && expression(b, l + 1);
    exit_section_(b, m, TIMEOUT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // type_mark '(' expression ')'
  public static boolean type_conversion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_conversion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CONVERSION, "<type conversion>");
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // full_type_declaration | incomplete_type_declaration
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = full_type_declaration(b, l + 1);
    if (!r) r = incomplete_type_declaration(b, l + 1);
    exit_section_(b, m, TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // scalar_type_definition | composite_type_definition
  //     | access_type_definition | file_type_definition
  public static boolean type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEFINITION, "<type definition>");
    r = scalar_type_definition(b, l + 1);
    if (!r) r = composite_type_definition(b, l + 1);
    if (!r) r = access_type_definition(b, l + 1);
    if (!r) r = file_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_
  public static boolean type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_MARK, "<type mark>");
    r = name_(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'array' '(' index_subtype_definition
  //     ( ',' index_subtype_definition )* ')' 'of' subtype_indication
  public static boolean unconstrained_array_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unconstrained_array_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ARRAY, LEFT_PAREN);
    r = r && index_subtype_definition(b, l + 1);
    r = r && unconstrained_array_definition_3(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PAREN, OF);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, UNCONSTRAINED_ARRAY_DEFINITION, r);
    return r;
  }

  // ( ',' index_subtype_definition )*
  private static boolean unconstrained_array_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unconstrained_array_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unconstrained_array_definition_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unconstrained_array_definition_3", c)) break;
    }
    return true;
  }

  // ',' index_subtype_definition
  private static boolean unconstrained_array_definition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unconstrained_array_definition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && index_subtype_definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'use' selected_name (',' selected_name)* ';'
  public static boolean use_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && name_(b, l + 1, -1);
    r = r && use_clause_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, USE_CLAUSE, r);
    return r;
  }

  // (',' selected_name)*
  private static boolean use_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_clause_2", c)) break;
    }
    return true;
  }

  // ',' selected_name
  private static boolean use_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && name_(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label_ ':' ] target ':=' expression ';'
  public static boolean variable_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_ASSIGNMENT_STATEMENT, "<variable assignment statement>");
    r = variable_assignment_statement_0(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean variable_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0")) return false;
    variable_assignment_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean variable_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ 'shared' ] 'variable' identifier_list ':'
  //     subtype_indication [ ':=' expression ] ';'
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    if (!nextTokenIs(b, "<variable declaration>", SHARED, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_0(b, l + 1);
    r = r && consumeToken(b, VARIABLE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && variable_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'shared' ]
  private static boolean variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_0")) return false;
    consumeToken(b, SHARED);
    return true;
  }

  // [ ':=' expression ]
  private static boolean variable_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_5")) return false;
    variable_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' expression
  private static boolean variable_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // design_unit design_unit*
  static boolean vhdlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vhdlFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = design_unit(b, l + 1);
    r = r && vhdlFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // design_unit*
  private static boolean vhdlFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vhdlFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!design_unit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vhdlFile_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ label_ ':' ] 'wait' [ sensitivity_clause ]
  //     [ condition_clause ] [ timeout_clause ] ';'
  public static boolean wait_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAIT_STATEMENT, "<wait statement>");
    r = wait_statement_0(b, l + 1);
    r = r && consumeToken(b, WAIT);
    r = r && wait_statement_2(b, l + 1);
    r = r && wait_statement_3(b, l + 1);
    r = r && wait_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label_ ':' ]
  private static boolean wait_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_0")) return false;
    wait_statement_0_0(b, l + 1);
    return true;
  }

  // label_ ':'
  private static boolean wait_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ sensitivity_clause ]
  private static boolean wait_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_2")) return false;
    sensitivity_clause(b, l + 1);
    return true;
  }

  // [ condition_clause ]
  private static boolean wait_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_3")) return false;
    condition_clause(b, l + 1);
    return true;
  }

  // [ timeout_clause ]
  private static boolean wait_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_4")) return false;
    timeout_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // waveform_element ( ',' waveform_element )* | 'unaffected'
  public static boolean waveform(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAVEFORM, "<waveform>");
    r = waveform_0(b, l + 1);
    if (!r) r = consumeToken(b, UNAFFECTED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // waveform_element ( ',' waveform_element )*
  private static boolean waveform_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform_element(b, l + 1);
    r = r && waveform_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' waveform_element )*
  private static boolean waveform_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!waveform_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "waveform_0_1", c)) break;
    }
    return true;
  }

  // ',' waveform_element
  private static boolean waveform_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && waveform_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression [ 'after' expression ] | 'null' [ 'after' expression ]
  public static boolean waveform_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAVEFORM_ELEMENT, "<waveform element>");
    r = waveform_element_0(b, l + 1);
    if (!r) r = waveform_element_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression [ 'after' expression ]
  private static boolean waveform_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && waveform_element_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'after' expression ]
  private static boolean waveform_element_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0_1")) return false;
    waveform_element_0_1_0(b, l + 1);
    return true;
  }

  // 'after' expression
  private static boolean waveform_element_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AFTER);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'null' [ 'after' expression ]
  private static boolean waveform_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    r = r && waveform_element_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'after' expression ]
  private static boolean waveform_element_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1_1")) return false;
    waveform_element_1_1_0(b, l + 1);
    return true;
  }

  // 'after' expression
  private static boolean waveform_element_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AFTER);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: name_
  // Operator priority table:
  // 0: POSTFIX(selected_name)
  // 1: POSTFIX(indexed_name)
  // 2: POSTFIX(indexed_name_function_call)
  // 3: POSTFIX(slice_name)
  // 4: POSTFIX(slice_name_function_call)
  // 5: POSTFIX(attribute_name_)
  // 6: ATOM(operator_symbol)
  // 7: ATOM(simple_name)
  public static boolean name_(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "name_")) return false;
    addVariant(b, "<name>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<name>");
    r = operator_symbol(b, l + 1);
    if (!r) r = simple_name(b, l + 1);
    p = r;
    r = r && name__0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean name__0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "name__0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && selected_name_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SELECTED_NAME, r, true, null);
      }
      else if (g < 1 && indexed_name_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEXED_NAME, r, true, null);
      }
      else if (g < 2 && indexed_name_function_call_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEXED_NAME_FUNCTION_CALL, r, true, null);
      }
      else if (g < 3 && slice_name_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SLICE_NAME, r, true, null);
      }
      else if (g < 4 && slice_name_function_call_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SLICE_NAME_FUNCTION_CALL, r, true, null);
      }
      else if (g < 5 && attribute_name__0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ATTRIBUTE_NAME_, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // function_call_parameter? '.' suffix
  private static boolean selected_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selected_name_0_0(b, l + 1);
    r = r && consumeToken(b, POINT);
    r = r && suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_parameter?
  private static boolean selected_name_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_name_0_0")) return false;
    function_call_parameter(b, l + 1);
    return true;
  }

  // '(' expression ( ',' expression )* ')'
  private static boolean indexed_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && indexed_name_0_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expression )*
  private static boolean indexed_name_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indexed_name_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "indexed_name_0_2", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean indexed_name_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_parameter '(' expression ( ',' expression )* ')'
  private static boolean indexed_name_function_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_function_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_parameter(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && indexed_name_function_call_0_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expression )*
  private static boolean indexed_name_function_call_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_function_call_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indexed_name_function_call_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "indexed_name_function_call_0_3", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean indexed_name_function_call_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_function_call_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' discrete_range ')'
  private static boolean slice_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PAREN);
    r = r && discrete_range(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_parameter '(' discrete_range ')'
  private static boolean slice_name_function_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_name_function_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_parameter(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && discrete_range(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_parameter? "'" attribute_designator [ '(' expression ')' ]
  private static boolean attribute_name__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_name__0_0(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && attribute_designator(b, l + 1);
    r = r && attribute_name__0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_parameter?
  private static boolean attribute_name__0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name__0_0")) return false;
    function_call_parameter(b, l + 1);
    return true;
  }

  // [ '(' expression ')' ]
  private static boolean attribute_name__0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name__0_3")) return false;
    attribute_name__0_3_0(b, l + 1);
    return true;
  }

  // '(' expression ')'
  private static boolean attribute_name__0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name__0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_LITERAL
  public static boolean operator_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_symbol")) return false;
    if (!nextTokenIsSmart(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, STRING_LITERAL);
    exit_section_(b, m, OPERATOR_SYMBOL, r);
    return r;
  }

  // identifier
  public static boolean simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name")) return false;
    if (!nextTokenIsSmart(b, BASIC_IDENTIFIER, EXTENDED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_NAME, "<simple name>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
