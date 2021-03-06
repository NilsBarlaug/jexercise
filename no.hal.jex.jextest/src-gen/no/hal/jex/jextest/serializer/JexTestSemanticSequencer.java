/*
 * generated by Xtext
 */
package no.hal.jex.jextest.serializer;

import com.google.inject.Inject;
import java.util.Set;
import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.JexTestSuite;
import no.hal.jex.jextest.jexTest.JvmOperationRef;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.ObjectTest;
import no.hal.jex.jextest.jexTest.PropertiesTest;
import no.hal.jex.jextest.jexTest.State;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.jexTest.TestedClass;
import no.hal.jex.jextest.jexTest.TestedConstructor;
import no.hal.jex.jextest.jexTest.TestedMethod;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionExceptionEffect;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;
import no.hal.jex.jextest.jexTest.TransitionInputAction;
import no.hal.jex.jextest.jexTest.TransitionOutputEffect;
import no.hal.jex.jextest.jexTest.TransitionSource;
import no.hal.jex.jextest.jexTest.TransitionTargetEffect;
import no.hal.jex.jextest.services.JexTestGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class JexTestSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private JexTestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JexTestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JexTestPackage.INSTANCE:
				if (rule == grammarAccess.getInstanceRule()) {
					sequence_Instance(context, (Instance) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSuiteInstanceRule()) {
					sequence_SuiteInstance(context, (Instance) semanticObject); 
					return; 
				}
				else break;
			case JexTestPackage.JEX_TEST_CASE:
				sequence_JexTestCase(context, (JexTestCase) semanticObject); 
				return; 
			case JexTestPackage.JEX_TEST_SEQUENCE:
				sequence_JexTestSequence(context, (JexTestSequence) semanticObject); 
				return; 
			case JexTestPackage.JEX_TEST_SUITE:
				sequence_JexTestSuite(context, (JexTestSuite) semanticObject); 
				return; 
			case JexTestPackage.JVM_OPERATION_REF:
				sequence_JvmOperationRef(context, (JvmOperationRef) semanticObject); 
				return; 
			case JexTestPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case JexTestPackage.OBJECT_TEST:
				sequence_ObjectTest(context, (ObjectTest) semanticObject); 
				return; 
			case JexTestPackage.PARAMETER:
				if (rule == grammarAccess.getParameterTypeRule()) {
					sequence_ParameterType(context, (no.hal.jex.jextest.jexTest.Parameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (no.hal.jex.jextest.jexTest.Parameter) semanticObject); 
					return; 
				}
				else break;
			case JexTestPackage.PROPERTIES_TEST:
				sequence_PropertiesTest(context, (PropertiesTest) semanticObject); 
				return; 
			case JexTestPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case JexTestPackage.STATE_FUNCTION:
				sequence_StateFunction(context, (StateFunction) semanticObject); 
				return; 
			case JexTestPackage.TESTED_CLASS:
				sequence_TestedClass(context, (TestedClass) semanticObject); 
				return; 
			case JexTestPackage.TESTED_CONSTRUCTOR:
				if (rule == grammarAccess.getTestedConstructorRule()) {
					sequence_TestedConstructor(context, (TestedConstructor) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTestedOperationRule()) {
					sequence_TestedConstructor_TestedOperation(context, (TestedConstructor) semanticObject); 
					return; 
				}
				else break;
			case JexTestPackage.TESTED_METHOD:
				if (rule == grammarAccess.getTestedMethodRule()) {
					sequence_TestedMethod(context, (TestedMethod) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTestedOperationRule()) {
					sequence_TestedMethod_TestedOperation(context, (TestedMethod) semanticObject); 
					return; 
				}
				else break;
			case JexTestPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case JexTestPackage.TRANSITION_EXCEPTION_EFFECT:
				sequence_TransitionExceptionEffect(context, (TransitionExceptionEffect) semanticObject); 
				return; 
			case JexTestPackage.TRANSITION_EXPRESSION_ACTION:
				sequence_TransitionExpressionAction(context, (TransitionExpressionAction) semanticObject); 
				return; 
			case JexTestPackage.TRANSITION_INPUT_ACTION:
				sequence_TransitionInputAction(context, (TransitionInputAction) semanticObject); 
				return; 
			case JexTestPackage.TRANSITION_OUTPUT_EFFECT:
				sequence_TransitionOutputEffect(context, (TransitionOutputEffect) semanticObject); 
				return; 
			case JexTestPackage.TRANSITION_SOURCE:
				sequence_TransitionSource(context, (TransitionSource) semanticObject); 
				return; 
			case JexTestPackage.TRANSITION_TARGET_EFFECT:
				sequence_TransitionTargetEffect(context, (TransitionTargetEffect) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				sequence_XListLiteral(context, (XListLiteral) semanticObject); 
				return; 
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (type=JvmTypeReference? name=ID expr=XExpression?)
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JexTestCase returns JexTestCase
	 *     TestMemberContext returns JexTestCase
	 *
	 * Constraint:
	 *     (
	 *         (testedClasses+=TestedClass+ | testedClassRef=JvmParameterizedTypeReference)? 
	 *         testClassName=QName? 
	 *         description=STRING? 
	 *         url=STRING? 
	 *         importSection=XImportSection? 
	 *         ((stateFunctions+=StateFunction | testSequences+=JexTestSequence | methods+=Method)? (instances+=SuiteInstance instances+=SuiteInstance*)?)+
	 *     )
	 */
	protected void sequence_JexTestCase(ISerializationContext context, JexTestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateTestContext returns JexTestSequence
	 *     JexTestSequence returns JexTestSequence
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         (tested+=JvmOperationRef tested+=JvmOperationRef*)? 
	 *         (instances+=Instance instances+=Instance*)* 
	 *         transitions+=Transition*
	 *     )
	 */
	protected void sequence_JexTestSequence(ISerializationContext context, JexTestSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JexTestSuite returns JexTestSuite
	 *     TestMemberContext returns JexTestSuite
	 *
	 * Constraint:
	 *     (
	 *         suiteClassName=QName? 
	 *         importSection=XImportSection? 
	 *         ((stateFunctions+=StateFunction | methods+=Method)? (instances+=Instance instances+=Instance*)?)+ 
	 *         testCases+=JexTestCase*
	 *     )
	 */
	protected void sequence_JexTestSuite(ISerializationContext context, JexTestSuite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JvmOperationRef returns JvmOperationRef
	 *
	 * Constraint:
	 *     (methodName=ID (parameterTypes+=JvmParameterizedTypeReference parameterTypes+=JvmParameterizedTypeReference*)?)
	 */
	protected void sequence_JvmOperationRef(ISerializationContext context, JvmOperationRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (returnType=JvmTypeReference? (name=ID | name=OpEquality | name=OpCompare) (parameters+=Parameter parameters+=Parameter*)? body=XExpression)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertiesTestOwner returns ObjectTest
	 *     ObjectTest returns ObjectTest
	 *
	 * Constraint:
	 *     (instance=[Instance|ID]? test=PropertiesTest)
	 */
	protected void sequence_ObjectTest(ISerializationContext context, ObjectTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns Parameter
	 *
	 * Constraint:
	 *     (type=JvmTypeReference vararg?='...'?)
	 */
	protected void sequence_ParameterType(ISerializationContext context, no.hal.jex.jextest.jexTest.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (type=JvmTypeReference vararg?='...'? name=ID)
	 */
	protected void sequence_Parameter(ISerializationContext context, no.hal.jex.jextest.jexTest.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertiesTest returns PropertiesTest
	 *
	 * Constraint:
	 *     expressions+=XExpression*
	 */
	protected void sequence_PropertiesTest(ISerializationContext context, PropertiesTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateTestContext returns StateFunction
	 *     PropertiesTestOwner returns StateFunction
	 *     StateFunction returns StateFunction
	 *
	 * Constraint:
	 *     (type=JvmParameterizedTypeReference? name=ID description=STRING? (parameters+=Parameter parameters+=Parameter*)? test=PropertiesTest)
	 */
	protected void sequence_StateFunction(ISerializationContext context, StateFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID? description=STRING? objectTests+=ObjectTest+)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuiteInstance returns Instance
	 *
	 * Constraint:
	 *     (type=JvmTypeReference name=ID expr=XExpression?)
	 */
	protected void sequence_SuiteInstance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestedClass returns TestedClass
	 *
	 * Constraint:
	 *     (
	 *         (interface?='interface' | abstract?='abstract')? 
	 *         name=QName 
	 *         superClass=JvmParameterizedTypeReference? 
	 *         (superInterfaces+=JvmParameterizedTypeReference superInterfaces+=JvmParameterizedTypeReference*)? 
	 *         description=STRING? 
	 *         invariant=XExpression? 
	 *         methods+=TestedOperation*
	 *     )
	 */
	protected void sequence_TestedClass(ISerializationContext context, TestedClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestedConstructor returns TestedConstructor
	 *
	 * Constraint:
	 *     {TestedConstructor}
	 */
	protected void sequence_TestedConstructor(ISerializationContext context, TestedConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestedOperation returns TestedConstructor
	 *
	 * Constraint:
	 *     ((parameterTypes+=ParameterType parameterTypes+=ParameterType*)? description=STRING? preExpression=XExpression? postExpression=XExpression?)
	 */
	protected void sequence_TestedConstructor_TestedOperation(ISerializationContext context, TestedConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestedMethod returns TestedMethod
	 *
	 * Constraint:
	 *     (abstract?='abstract'? returnType=JvmParameterizedTypeReference name=ID)
	 */
	protected void sequence_TestedMethod(ISerializationContext context, TestedMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestedOperation returns TestedMethod
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         returnType=JvmParameterizedTypeReference 
	 *         name=ID 
	 *         (parameterTypes+=ParameterType parameterTypes+=ParameterType*)? 
	 *         description=STRING? 
	 *         preExpression=XExpression? 
	 *         postExpression=XExpression?
	 *     )
	 */
	protected void sequence_TestedMethod_TestedOperation(ISerializationContext context, TestedMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionEffect returns TransitionExceptionEffect
	 *     TransitionExceptionEffect returns TransitionExceptionEffect
	 *
	 * Constraint:
	 *     exceptionClass=JvmParameterizedTypeReference
	 */
	protected void sequence_TransitionExceptionEffect(ISerializationContext context, TransitionExceptionEffect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JexTestPackage.Literals.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JexTestPackage.Literals.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionExceptionEffectAccess().getExceptionClassJvmParameterizedTypeReferenceParserRuleCall_1_0(), semanticObject.getExceptionClass());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionAction returns TransitionExpressionAction
	 *     TransitionExpressionAction returns TransitionExpressionAction
	 *
	 * Constraint:
	 *     (expr=XExpression times=XExpression?)
	 */
	protected void sequence_TransitionExpressionAction(ISerializationContext context, TransitionExpressionAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionInputAction returns TransitionInputAction
	 *
	 * Constraint:
	 *     input=STRING
	 */
	protected void sequence_TransitionInputAction(ISerializationContext context, TransitionInputAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JexTestPackage.Literals.TRANSITION_INPUT_ACTION__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JexTestPackage.Literals.TRANSITION_INPUT_ACTION__INPUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionInputActionAccess().getInputSTRINGTerminalRuleCall_1_0(), semanticObject.getInput());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionOutputEffect returns TransitionOutputEffect
	 *
	 * Constraint:
	 *     pattern=STRING
	 */
	protected void sequence_TransitionOutputEffect(ISerializationContext context, TransitionOutputEffect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JexTestPackage.Literals.TRANSITION_OUTPUT_EFFECT__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JexTestPackage.Literals.TRANSITION_OUTPUT_EFFECT__PATTERN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionOutputEffectAccess().getPatternSTRINGTerminalRuleCall_1_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionSource returns TransitionSource
	 *
	 * Constraint:
	 *     (state=State | stateRef=[State|ID])
	 */
	protected void sequence_TransitionSource(ISerializationContext context, TransitionSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionEffect returns TransitionTargetEffect
	 *     TransitionTargetEffect returns TransitionTargetEffect
	 *
	 * Constraint:
	 *     (state=State | stateRef=[State|ID])
	 */
	protected void sequence_TransitionTargetEffect(ISerializationContext context, TransitionTargetEffect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (
	 *         (source=TransitionSource? description=STRING? actions+=TransitionAction actions+=TransitionAction* effect=TransitionEffect) | 
	 *         effect=TransitionTargetEffect
	 *     )
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
