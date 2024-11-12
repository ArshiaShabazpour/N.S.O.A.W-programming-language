// Generated from target/grammar/PL.g4 by ANTLR 4.13.2

import backend.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLParser}.
 */
public interface PLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(PLParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(PLParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PLParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PLParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(PLParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(PLParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PLParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PLParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(PLParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(PLParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(PLParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(PLParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreation(PLParser.ArrayCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreation(PLParser.ArrayCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(PLParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(PLParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#arrayUpdate}.
	 * @param ctx the parse tree
	 */
	void enterArrayUpdate(PLParser.ArrayUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#arrayUpdate}.
	 * @param ctx the parse tree
	 */
	void exitArrayUpdate(PLParser.ArrayUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(PLParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(PLParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#addToSet}.
	 * @param ctx the parse tree
	 */
	void enterAddToSet(PLParser.AddToSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#addToSet}.
	 * @param ctx the parse tree
	 */
	void exitAddToSet(PLParser.AddToSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#removeFromSet}.
	 * @param ctx the parse tree
	 */
	void enterRemoveFromSet(PLParser.RemoveFromSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#removeFromSet}.
	 * @param ctx the parse tree
	 */
	void exitRemoveFromSet(PLParser.RemoveFromSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#containsInSet}.
	 * @param ctx the parse tree
	 */
	void enterContainsInSet(PLParser.ContainsInSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#containsInSet}.
	 * @param ctx the parse tree
	 */
	void exitContainsInSet(PLParser.ContainsInSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mapCreation}.
	 * @param ctx the parse tree
	 */
	void enterMapCreation(PLParser.MapCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mapCreation}.
	 * @param ctx the parse tree
	 */
	void exitMapCreation(PLParser.MapCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(PLParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(PLParser.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mapPut}.
	 * @param ctx the parse tree
	 */
	void enterMapPut(PLParser.MapPutContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mapPut}.
	 * @param ctx the parse tree
	 */
	void exitMapPut(PLParser.MapPutContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mapRemove}.
	 * @param ctx the parse tree
	 */
	void enterMapRemove(PLParser.MapRemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mapRemove}.
	 * @param ctx the parse tree
	 */
	void exitMapRemove(PLParser.MapRemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mapAccess}.
	 * @param ctx the parse tree
	 */
	void enterMapAccess(PLParser.MapAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mapAccess}.
	 * @param ctx the parse tree
	 */
	void exitMapAccess(PLParser.MapAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#traditionalForLoop}.
	 * @param ctx the parse tree
	 */
	void enterTraditionalForLoop(PLParser.TraditionalForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#traditionalForLoop}.
	 * @param ctx the parse tree
	 */
	void exitTraditionalForLoop(PLParser.TraditionalForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#loopExpr}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpr(PLParser.LoopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#loopExpr}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpr(PLParser.LoopExprContext ctx);
}