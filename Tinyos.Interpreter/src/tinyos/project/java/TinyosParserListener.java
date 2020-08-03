package tinyos.project.java;

// Generated from TinyosParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyosParser}.
 */
public interface TinyosParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyosParser#other_stat}.
	 * @param ctx the parse tree
	 */
	void enterOther_stat(@NotNull TinyosParser.Other_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#other_stat}.
	 * @param ctx the parse tree
	 */
	void exitOther_stat(@NotNull TinyosParser.Other_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull TinyosParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull TinyosParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#anystatement}.
	 * @param ctx the parse tree
	 */
	void enterAnystatement(@NotNull TinyosParser.AnystatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#anystatement}.
	 * @param ctx the parse tree
	 */
	void exitAnystatement(@NotNull TinyosParser.AnystatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#task_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterTask_condition_block(@NotNull TinyosParser.Task_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#task_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitTask_condition_block(@NotNull TinyosParser.Task_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#if_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition_block(@NotNull TinyosParser.If_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#if_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition_block(@NotNull TinyosParser.If_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(@NotNull TinyosParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(@NotNull TinyosParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#platformDefinitionDescription}.
	 * @param ctx the parse tree
	 */
	void enterPlatformDefinitionDescription(@NotNull TinyosParser.PlatformDefinitionDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#platformDefinitionDescription}.
	 * @param ctx the parse tree
	 */
	void exitPlatformDefinitionDescription(@NotNull TinyosParser.PlatformDefinitionDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#task_stat}.
	 * @param ctx the parse tree
	 */
	void enterTask_stat(@NotNull TinyosParser.Task_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#task_stat}.
	 * @param ctx the parse tree
	 */
	void exitTask_stat(@NotNull TinyosParser.Task_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#moduleImplementationBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleImplementationBody(@NotNull TinyosParser.ModuleImplementationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#moduleImplementationBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleImplementationBody(@NotNull TinyosParser.ModuleImplementationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(@NotNull TinyosParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(@NotNull TinyosParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull TinyosParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull TinyosParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#name_with_char}.
	 * @param ctx the parse tree
	 */
	void enterName_with_char(@NotNull TinyosParser.Name_with_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#name_with_char}.
	 * @param ctx the parse tree
	 */
	void exitName_with_char(@NotNull TinyosParser.Name_with_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(@NotNull TinyosParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(@NotNull TinyosParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#wiring}.
	 * @param ctx the parse tree
	 */
	void enterWiring(@NotNull TinyosParser.WiringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#wiring}.
	 * @param ctx the parse tree
	 */
	void exitWiring(@NotNull TinyosParser.WiringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#call_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCall_condition_block(@NotNull TinyosParser.Call_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#call_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCall_condition_block(@NotNull TinyosParser.Call_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationSignature}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationSignature(@NotNull TinyosParser.ConfigurationSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationSignature}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationSignature(@NotNull TinyosParser.ConfigurationSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#event_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterEvent_stat_block(@NotNull TinyosParser.Event_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#event_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitEvent_stat_block(@NotNull TinyosParser.Event_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat(@NotNull TinyosParser.Switch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat(@NotNull TinyosParser.Switch_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull TinyosParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull TinyosParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#platformDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPlatformDefinition(@NotNull TinyosParser.PlatformDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#platformDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPlatformDefinition(@NotNull TinyosParser.PlatformDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#task_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterTask_stat_block(@NotNull TinyosParser.Task_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#task_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitTask_stat_block(@NotNull TinyosParser.Task_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull TinyosParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull TinyosParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#for_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat_block(@NotNull TinyosParser.For_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#for_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat_block(@NotNull TinyosParser.For_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull TinyosParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull TinyosParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#componentsDefinitionDetails}.
	 * @param ctx the parse tree
	 */
	void enterComponentsDefinitionDetails(@NotNull TinyosParser.ComponentsDefinitionDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#componentsDefinitionDetails}.
	 * @param ctx the parse tree
	 */
	void exitComponentsDefinitionDetails(@NotNull TinyosParser.ComponentsDefinitionDetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#chars_no_comma}.
	 * @param ctx the parse tree
	 */
	void enterChars_no_comma(@NotNull TinyosParser.Chars_no_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#chars_no_comma}.
	 * @param ctx the parse tree
	 */
	void exitChars_no_comma(@NotNull TinyosParser.Chars_no_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#common_name}.
	 * @param ctx the parse tree
	 */
	void enterCommon_name(@NotNull TinyosParser.Common_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#common_name}.
	 * @param ctx the parse tree
	 */
	void exitCommon_name(@NotNull TinyosParser.Common_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#moduleImplementation}.
	 * @param ctx the parse tree
	 */
	void enterModuleImplementation(@NotNull TinyosParser.ModuleImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#moduleImplementation}.
	 * @param ctx the parse tree
	 */
	void exitModuleImplementation(@NotNull TinyosParser.ModuleImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#atomic_stat}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_stat(@NotNull TinyosParser.Atomic_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#atomic_stat}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_stat(@NotNull TinyosParser.Atomic_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#reservedwords}.
	 * @param ctx the parse tree
	 */
	void enterReservedwords(@NotNull TinyosParser.ReservedwordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#reservedwords}.
	 * @param ctx the parse tree
	 */
	void exitReservedwords(@NotNull TinyosParser.ReservedwordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull TinyosParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull TinyosParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#static_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterStatic_condition_block(@NotNull TinyosParser.Static_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#static_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitStatic_condition_block(@NotNull TinyosParser.Static_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull TinyosParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull TinyosParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationName}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationName(@NotNull TinyosParser.ConfigurationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationName}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationName(@NotNull TinyosParser.ConfigurationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull TinyosParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull TinyosParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull TinyosParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull TinyosParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#singleLine}.
	 * @param ctx the parse tree
	 */
	void enterSingleLine(@NotNull TinyosParser.SingleLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#singleLine}.
	 * @param ctx the parse tree
	 */
	void exitSingleLine(@NotNull TinyosParser.SingleLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#switch_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_condition_block(@NotNull TinyosParser.Switch_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#switch_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_condition_block(@NotNull TinyosParser.Switch_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull TinyosParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull TinyosParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#call_stat}.
	 * @param ctx the parse tree
	 */
	void enterCall_stat(@NotNull TinyosParser.Call_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#call_stat}.
	 * @param ctx the parse tree
	 */
	void exitCall_stat(@NotNull TinyosParser.Call_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull TinyosParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull TinyosParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull TinyosParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull TinyosParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationDeclaration(@NotNull TinyosParser.ConfigurationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationDeclaration(@NotNull TinyosParser.ConfigurationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#other_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterOther_stat_block(@NotNull TinyosParser.Other_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#other_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitOther_stat_block(@NotNull TinyosParser.Other_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull TinyosParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull TinyosParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#enum_stat}.
	 * @param ctx the parse tree
	 */
	void enterEnum_stat(@NotNull TinyosParser.Enum_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#enum_stat}.
	 * @param ctx the parse tree
	 */
	void exitEnum_stat(@NotNull TinyosParser.Enum_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationImplementationBody}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationImplementationBody(@NotNull TinyosParser.ConfigurationImplementationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationImplementationBody}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationImplementationBody(@NotNull TinyosParser.ConfigurationImplementationBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull TinyosParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull TinyosParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull TinyosParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull TinyosParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull TinyosParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull TinyosParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexadecimalAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalAtom(@NotNull TinyosParser.HexadecimalAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexadecimalAtom}
	 * labeled alternative in {@link TinyosParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalAtom(@NotNull TinyosParser.HexadecimalAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#wiringName}.
	 * @param ctx the parse tree
	 */
	void enterWiringName(@NotNull TinyosParser.WiringNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#wiringName}.
	 * @param ctx the parse tree
	 */
	void exitWiringName(@NotNull TinyosParser.WiringNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationImplementation}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationImplementation(@NotNull TinyosParser.ConfigurationImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationImplementation}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationImplementation(@NotNull TinyosParser.ConfigurationImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#componentsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentsDefinition(@NotNull TinyosParser.ComponentsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#componentsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentsDefinition(@NotNull TinyosParser.ComponentsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#componentsDefinitionName}.
	 * @param ctx the parse tree
	 */
	void enterComponentsDefinitionName(@NotNull TinyosParser.ComponentsDefinitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#componentsDefinitionName}.
	 * @param ctx the parse tree
	 */
	void exitComponentsDefinitionName(@NotNull TinyosParser.ComponentsDefinitionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull TinyosParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull TinyosParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#usesOrProvides}.
	 * @param ctx the parse tree
	 */
	void enterUsesOrProvides(@NotNull TinyosParser.UsesOrProvidesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#usesOrProvides}.
	 * @param ctx the parse tree
	 */
	void exitUsesOrProvides(@NotNull TinyosParser.UsesOrProvidesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#static_stat}.
	 * @param ctx the parse tree
	 */
	void enterStatic_stat(@NotNull TinyosParser.Static_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#static_stat}.
	 * @param ctx the parse tree
	 */
	void exitStatic_stat(@NotNull TinyosParser.Static_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#while_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat_block(@NotNull TinyosParser.While_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#while_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat_block(@NotNull TinyosParser.While_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#usesInterfaceDescription}.
	 * @param ctx the parse tree
	 */
	void enterUsesInterfaceDescription(@NotNull TinyosParser.UsesInterfaceDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#usesInterfaceDescription}.
	 * @param ctx the parse tree
	 */
	void exitUsesInterfaceDescription(@NotNull TinyosParser.UsesInterfaceDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#event_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterEvent_condition_block(@NotNull TinyosParser.Event_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#event_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitEvent_condition_block(@NotNull TinyosParser.Event_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlelineExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSinglelineExpr(@NotNull TinyosParser.SinglelineExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlelineExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSinglelineExpr(@NotNull TinyosParser.SinglelineExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TinyosParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TinyosParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#atomic_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_stat_block(@NotNull TinyosParser.Atomic_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#atomic_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_stat_block(@NotNull TinyosParser.Atomic_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#moduleSignatureBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleSignatureBody(@NotNull TinyosParser.ModuleSignatureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#moduleSignatureBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleSignatureBody(@NotNull TinyosParser.ModuleSignatureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#componentsWiring}.
	 * @param ctx the parse tree
	 */
	void enterComponentsWiring(@NotNull TinyosParser.ComponentsWiringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#componentsWiring}.
	 * @param ctx the parse tree
	 */
	void exitComponentsWiring(@NotNull TinyosParser.ComponentsWiringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#providesInterfaceDescription}.
	 * @param ctx the parse tree
	 */
	void enterProvidesInterfaceDescription(@NotNull TinyosParser.ProvidesInterfaceDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#providesInterfaceDescription}.
	 * @param ctx the parse tree
	 */
	void exitProvidesInterfaceDescription(@NotNull TinyosParser.ProvidesInterfaceDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(@NotNull TinyosParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(@NotNull TinyosParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull TinyosParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull TinyosParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationImplementationDescription}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationImplementationDescription(@NotNull TinyosParser.ConfigurationImplementationDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationImplementationDescription}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationImplementationDescription(@NotNull TinyosParser.ConfigurationImplementationDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#configurationSignatureBody}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationSignatureBody(@NotNull TinyosParser.ConfigurationSignatureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#configurationSignatureBody}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationSignatureBody(@NotNull TinyosParser.ConfigurationSignatureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#includeDeclarationModule}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclarationModule(@NotNull TinyosParser.IncludeDeclarationModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#includeDeclarationModule}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclarationModule(@NotNull TinyosParser.IncludeDeclarationModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#interfaceNameAs}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceNameAs(@NotNull TinyosParser.InterfaceNameAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#interfaceNameAs}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceNameAs(@NotNull TinyosParser.InterfaceNameAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull TinyosParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull TinyosParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#static_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStatic_stat_block(@NotNull TinyosParser.Static_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#static_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStatic_stat_block(@NotNull TinyosParser.Static_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#includeDeclarationConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclarationConfiguration(@NotNull TinyosParser.IncludeDeclarationConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#includeDeclarationConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclarationConfiguration(@NotNull TinyosParser.IncludeDeclarationConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#switch_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat_block(@NotNull TinyosParser.Switch_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#switch_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat_block(@NotNull TinyosParser.Switch_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#other_condition_block}.
	 * @param ctx the parse tree
	 */
	void enterOther_condition_block(@NotNull TinyosParser.Other_condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#other_condition_block}.
	 * @param ctx the parse tree
	 */
	void exitOther_condition_block(@NotNull TinyosParser.Other_condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#providesState}.
	 * @param ctx the parse tree
	 */
	void enterProvidesState(@NotNull TinyosParser.ProvidesStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#providesState}.
	 * @param ctx the parse tree
	 */
	void exitProvidesState(@NotNull TinyosParser.ProvidesStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(@NotNull TinyosParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(@NotNull TinyosParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#usesState}.
	 * @param ctx the parse tree
	 */
	void enterUsesState(@NotNull TinyosParser.UsesStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#usesState}.
	 * @param ctx the parse tree
	 */
	void exitUsesState(@NotNull TinyosParser.UsesStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherchar}
	 * labeled alternative in {@link TinyosParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterOtherchar(@NotNull TinyosParser.OthercharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherchar}
	 * labeled alternative in {@link TinyosParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitOtherchar(@NotNull TinyosParser.OthercharContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#name_or_reserved}.
	 * @param ctx the parse tree
	 */
	void enterName_or_reserved(@NotNull TinyosParser.Name_or_reservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#name_or_reserved}.
	 * @param ctx the parse tree
	 */
	void exitName_or_reserved(@NotNull TinyosParser.Name_or_reservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#event_stat}.
	 * @param ctx the parse tree
	 */
	void enterEvent_stat(@NotNull TinyosParser.Event_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#event_stat}.
	 * @param ctx the parse tree
	 */
	void exitEvent_stat(@NotNull TinyosParser.Event_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#componentsName}.
	 * @param ctx the parse tree
	 */
	void enterComponentsName(@NotNull TinyosParser.ComponentsNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#componentsName}.
	 * @param ctx the parse tree
	 */
	void exitComponentsName(@NotNull TinyosParser.ComponentsNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#moduleSignature}.
	 * @param ctx the parse tree
	 */
	void enterModuleSignature(@NotNull TinyosParser.ModuleSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#moduleSignature}.
	 * @param ctx the parse tree
	 */
	void exitModuleSignature(@NotNull TinyosParser.ModuleSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#if_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat_block(@NotNull TinyosParser.If_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#if_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat_block(@NotNull TinyosParser.If_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#define_stat}.
	 * @param ctx the parse tree
	 */
	void enterDefine_stat(@NotNull TinyosParser.Define_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#define_stat}.
	 * @param ctx the parse tree
	 */
	void exitDefine_stat(@NotNull TinyosParser.Define_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyosParser#chars}.
	 * @param ctx the parse tree
	 */
	void enterChars(@NotNull TinyosParser.CharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyosParser#chars}.
	 * @param ctx the parse tree
	 */
	void exitChars(@NotNull TinyosParser.CharsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull TinyosParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TinyosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull TinyosParser.AndExprContext ctx);
}