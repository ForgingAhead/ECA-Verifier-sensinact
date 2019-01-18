/*
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import nii.bigclout.ecaadapter.ide.contentassist.antlr.internal.InternalDslParser;
import nii.bigclout.ecaadapter.services.DslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTriggerAccess().getAlternatives_1(), "rule__Trigger__Alternatives_1");
					put(grammarAccess.getDiffEqualElementAccess().getAlternatives_1(), "rule__DiffEqualElement__Alternatives_1");
					put(grammarAccess.getCompareElementAccess().getAlternatives_1(), "rule__CompareElement__Alternatives_1");
					put(grammarAccess.getPlusMinusElementAccess().getAlternatives_1(), "rule__PlusMinusElement__Alternatives_1");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1(), "rule__MultiplicationDivisionElement__Alternatives_1");
					put(grammarAccess.getUnaryElementAccess().getAlternatives(), "rule__UnaryElement__Alternatives");
					put(grammarAccess.getNUMBERAccess().getAlternatives(), "rule__NUMBER__Alternatives");
					put(grammarAccess.getRunTimeModelAccess().getGroup(), "rule__RunTimeModel__Group__0");
					put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
					put(grammarAccess.getResourceAccess().getGroup_2(), "rule__Resource__Group_2__0");
					put(grammarAccess.getResourceAccess().getGroup_2_3(), "rule__Resource__Group_2_3__0");
					put(grammarAccess.getAppMetaDataAccess().getGroup(), "rule__AppMetaData__Group__0");
					put(grammarAccess.getSpecificationAccess().getGroup(), "rule__Specification__Group__0");
					put(grammarAccess.getSpecificationAccess().getGroup_1(), "rule__Specification__Group_1__0");
					put(grammarAccess.getSpecificationAccess().getGroup_4(), "rule__Specification__Group_4__0");
					put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
					put(grammarAccess.getIfDoSpecAccess().getGroup(), "rule__IfDoSpec__Group__0");
					put(grammarAccess.getIfDoSpecAccess().getGroup_4(), "rule__IfDoSpec__Group_4__0");
					put(grammarAccess.getElseIfDoSpecAccess().getGroup(), "rule__ElseIfDoSpec__Group__0");
					put(grammarAccess.getElseIfDoSpecAccess().getGroup_5(), "rule__ElseIfDoSpec__Group_5__0");
					put(grammarAccess.getElseDoSpecAccess().getGroup(), "rule__ElseDoSpec__Group__0");
					put(grammarAccess.getElseDoSpecAccess().getGroup_3(), "rule__ElseDoSpec__Group_3__0");
					put(grammarAccess.getEnvironmentMetaDataAccess().getGroup(), "rule__EnvironmentMetaData__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getOrElementAccess().getGroup(), "rule__OrElement__Group__0");
					put(grammarAccess.getOrElementAccess().getGroup_1(), "rule__OrElement__Group_1__0");
					put(grammarAccess.getAndElementAccess().getGroup(), "rule__AndElement__Group__0");
					put(grammarAccess.getAndElementAccess().getGroup_1(), "rule__AndElement__Group_1__0");
					put(grammarAccess.getDiffEqualElementAccess().getGroup(), "rule__DiffEqualElement__Group__0");
					put(grammarAccess.getDiffEqualElementAccess().getGroup_1_0(), "rule__DiffEqualElement__Group_1_0__0");
					put(grammarAccess.getDiffEqualElementAccess().getGroup_1_1(), "rule__DiffEqualElement__Group_1_1__0");
					put(grammarAccess.getCompareElementAccess().getGroup(), "rule__CompareElement__Group__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_0(), "rule__CompareElement__Group_1_0__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_1(), "rule__CompareElement__Group_1_1__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_2(), "rule__CompareElement__Group_1_2__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_3(), "rule__CompareElement__Group_1_3__0");
					put(grammarAccess.getPlusMinusElementAccess().getGroup(), "rule__PlusMinusElement__Group__0");
					put(grammarAccess.getPlusMinusElementAccess().getGroup_1_0(), "rule__PlusMinusElement__Group_1_0__0");
					put(grammarAccess.getPlusMinusElementAccess().getGroup_1_1(), "rule__PlusMinusElement__Group_1_1__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup(), "rule__MultiplicationDivisionElement__Group__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0(), "rule__MultiplicationDivisionElement__Group_1_0__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1(), "rule__MultiplicationDivisionElement__Group_1_1__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2(), "rule__MultiplicationDivisionElement__Group_1_2__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_0(), "rule__UnaryElement__Group_0__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_1(), "rule__UnaryElement__Group_1__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_2(), "rule__UnaryElement__Group_2__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_3(), "rule__UnaryElement__Group_3__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_4(), "rule__UnaryElement__Group_4__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_5(), "rule__UnaryElement__Group_5__0");
					put(grammarAccess.getNUMBERAccess().getGroup_1(), "rule__NUMBER__Group_1__0");
					put(grammarAccess.getEXTENDED_IDAccess().getGroup(), "rule__EXTENDED_ID__Group__0");
					put(grammarAccess.getEXTENDED_IDAccess().getGroup_1(), "rule__EXTENDED_ID__Group_1__0");
					put(grammarAccess.getEXTENDED_STRINGAccess().getGroup(), "rule__EXTENDED_STRING__Group__0");
					put(grammarAccess.getEXTENDED_STRINGAccess().getGroup_1(), "rule__EXTENDED_STRING__Group_1__0");
					put(grammarAccess.getEXTENDED_STRINGAccess().getGroup_2(), "rule__EXTENDED_STRING__Group_2__0");
					put(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1(), "rule__RunTimeModel__EnvDataAssignment_1");
					put(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2(), "rule__RunTimeModel__AppDataAssignment_2");
					put(grammarAccess.getStateAccess().getNameAssignment(), "rule__State__NameAssignment");
					put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
					put(grammarAccess.getResourceAccess().getStatesAssignment_2_2(), "rule__Resource__StatesAssignment_2_2");
					put(grammarAccess.getResourceAccess().getStatesAssignment_2_3_1(), "rule__Resource__StatesAssignment_2_3_1");
					put(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1(), "rule__AppMetaData__AppIDAssignment_1");
					put(grammarAccess.getAppMetaDataAccess().getSpecificationAssignment_3(), "rule__AppMetaData__SpecificationAssignment_3");
					put(grammarAccess.getSpecificationAccess().getSpecIDAssignment_0(), "rule__Specification__SpecIDAssignment_0");
					put(grammarAccess.getSpecificationAccess().getPriorityAssignment_1_1(), "rule__Specification__PriorityAssignment_1_1");
					put(grammarAccess.getSpecificationAccess().getTriggerAssignment_3(), "rule__Specification__TriggerAssignment_3");
					put(grammarAccess.getSpecificationAccess().getTriggerAssignment_4_1(), "rule__Specification__TriggerAssignment_4_1");
					put(grammarAccess.getSpecificationAccess().getIfdoAssignment_5(), "rule__Specification__IfdoAssignment_5");
					put(grammarAccess.getSpecificationAccess().getElseIfDoAssignment_6(), "rule__Specification__ElseIfDoAssignment_6");
					put(grammarAccess.getSpecificationAccess().getElseDoAssignment_7(), "rule__Specification__ElseDoAssignment_7");
					put(grammarAccess.getTriggerAccess().getResourceAssignment_0(), "rule__Trigger__ResourceAssignment_0");
					put(grammarAccess.getTriggerAccess().getStateAssignment_2(), "rule__Trigger__StateAssignment_2");
					put(grammarAccess.getIfDoSpecAccess().getConditionAssignment_1(), "rule__IfDoSpec__ConditionAssignment_1");
					put(grammarAccess.getIfDoSpecAccess().getActionAssignment_3(), "rule__IfDoSpec__ActionAssignment_3");
					put(grammarAccess.getIfDoSpecAccess().getActionAssignment_4_1(), "rule__IfDoSpec__ActionAssignment_4_1");
					put(grammarAccess.getElseIfDoSpecAccess().getConditionAssignment_2(), "rule__ElseIfDoSpec__ConditionAssignment_2");
					put(grammarAccess.getElseIfDoSpecAccess().getActionAssignment_4(), "rule__ElseIfDoSpec__ActionAssignment_4");
					put(grammarAccess.getElseIfDoSpecAccess().getActionAssignment_5_1(), "rule__ElseIfDoSpec__ActionAssignment_5_1");
					put(grammarAccess.getElseDoSpecAccess().getActionAssignment_2(), "rule__ElseDoSpec__ActionAssignment_2");
					put(grammarAccess.getElseDoSpecAccess().getActionAssignment_3_1(), "rule__ElseDoSpec__ActionAssignment_3_1");
					put(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3(), "rule__EnvironmentMetaData__ResourcesAssignment_3");
					put(grammarAccess.getActionAccess().getResourceAssignment_0(), "rule__Action__ResourceAssignment_0");
					put(grammarAccess.getActionAccess().getStateAssignment_2(), "rule__Action__StateAssignment_2");
					put(grammarAccess.getOrElementAccess().getRightAssignment_1_2(), "rule__OrElement__RightAssignment_1_2");
					put(grammarAccess.getAndElementAccess().getRightAssignment_1_2(), "rule__AndElement__RightAssignment_1_2");
					put(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2(), "rule__DiffEqualElement__RightAssignment_1_0_2");
					put(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2(), "rule__DiffEqualElement__RightAssignment_1_1_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2(), "rule__CompareElement__RightAssignment_1_0_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2(), "rule__CompareElement__RightAssignment_1_1_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2(), "rule__CompareElement__RightAssignment_1_2_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2(), "rule__CompareElement__RightAssignment_1_3_2");
					put(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2(), "rule__PlusMinusElement__RightAssignment_1_0_2");
					put(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2(), "rule__PlusMinusElement__RightAssignment_1_1_2");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2(), "rule__MultiplicationDivisionElement__RightAssignment_1_0_2");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2(), "rule__MultiplicationDivisionElement__RightAssignment_1_1_2");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2(), "rule__MultiplicationDivisionElement__RightAssignment_1_2_2");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1(), "rule__UnaryElement__ValueAssignment_0_1");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1(), "rule__UnaryElement__ValueAssignment_1_1");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1(), "rule__UnaryElement__ValueAssignment_2_1");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_3_1(), "rule__UnaryElement__ValueAssignment_3_1");
					put(grammarAccess.getUnaryElementAccess().getExpAssignment_5_2(), "rule__UnaryElement__ExpAssignment_5_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
