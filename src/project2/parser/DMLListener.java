// Generated from C:/Users/garre/source/repos/csce315-project2/src/project2/parser\DML.g4 by ANTLR 4.7
package project2.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DMLParser}.
 */
public interface DMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DMLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DMLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DMLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#relation_name}.
	 * @param ctx the parse tree
	 */
	void enterRelation_name(DMLParser.Relation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#relation_name}.
	 * @param ctx the parse tree
	 */
	void exitRelation_name(DMLParser.Relation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DMLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DMLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#atomic_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_expr(DMLParser.Atomic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#atomic_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_expr(DMLParser.Atomic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(DMLParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(DMLParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DMLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DMLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(DMLParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(DMLParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DMLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DMLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(DMLParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(DMLParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(DMLParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(DMLParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DMLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DMLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(DMLParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(DMLParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(DMLParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(DMLParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#renaming}.
	 * @param ctx the parse tree
	 */
	void enterRenaming(DMLParser.RenamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#renaming}.
	 * @param ctx the parse tree
	 */
	void exitRenaming(DMLParser.RenamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(DMLParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(DMLParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#difference}.
	 * @param ctx the parse tree
	 */
	void enterDifference(DMLParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#difference}.
	 * @param ctx the parse tree
	 */
	void exitDifference(DMLParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(DMLParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(DMLParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#natural_join}.
	 * @param ctx the parse tree
	 */
	void enterNatural_join(DMLParser.Natural_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#natural_join}.
	 * @param ctx the parse tree
	 */
	void exitNatural_join(DMLParser.Natural_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(DMLParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(DMLParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#open_cmd}.
	 * @param ctx the parse tree
	 */
	void enterOpen_cmd(DMLParser.Open_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#open_cmd}.
	 * @param ctx the parse tree
	 */
	void exitOpen_cmd(DMLParser.Open_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#close_cmd}.
	 * @param ctx the parse tree
	 */
	void enterClose_cmd(DMLParser.Close_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#close_cmd}.
	 * @param ctx the parse tree
	 */
	void exitClose_cmd(DMLParser.Close_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#write_cmd}.
	 * @param ctx the parse tree
	 */
	void enterWrite_cmd(DMLParser.Write_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#write_cmd}.
	 * @param ctx the parse tree
	 */
	void exitWrite_cmd(DMLParser.Write_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#exit_cmd}.
	 * @param ctx the parse tree
	 */
	void enterExit_cmd(DMLParser.Exit_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#exit_cmd}.
	 * @param ctx the parse tree
	 */
	void exitExit_cmd(DMLParser.Exit_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#show_cmd}.
	 * @param ctx the parse tree
	 */
	void enterShow_cmd(DMLParser.Show_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#show_cmd}.
	 * @param ctx the parse tree
	 */
	void exitShow_cmd(DMLParser.Show_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#create_cmd}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cmd(DMLParser.Create_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#create_cmd}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cmd(DMLParser.Create_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#update_cmd}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_cmd(DMLParser.Update_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#update_cmd}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_cmd(DMLParser.Update_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#insert_cmd}.
	 * @param ctx the parse tree
	 */
	void enterInsert_cmd(DMLParser.Insert_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#insert_cmd}.
	 * @param ctx the parse tree
	 */
	void exitInsert_cmd(DMLParser.Insert_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#delete_cmd}.
	 * @param ctx the parse tree
	 */
	void enterDelete_cmd(DMLParser.Delete_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#delete_cmd}.
	 * @param ctx the parse tree
	 */
	void exitDelete_cmd(DMLParser.Delete_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#typed_attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterTyped_attribute_list(DMLParser.Typed_attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#typed_attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitTyped_attribute_list(DMLParser.Typed_attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DMLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DMLParser.TypeContext ctx);
}