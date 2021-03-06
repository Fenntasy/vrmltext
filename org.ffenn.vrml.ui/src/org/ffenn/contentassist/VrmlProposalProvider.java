/*
 * generated by Xtext
 */
package org.ffenn.contentassist;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;
import org.ffenn.vrml.DefStatement;
import org.ffenn.vrml.ExposedField;
import org.ffenn.vrml.ExposedFieldDeclaration;
import org.ffenn.vrml.Field;
import org.ffenn.vrml.FieldDeclaration;
import org.ffenn.vrml.FieldList;
import org.ffenn.vrml.Node;
import org.ffenn.vrml.NodeBodyElement;
import org.ffenn.vrml.RouteStatement;
import org.ffenn.vrml.Script;
import org.ffenn.validation.FType;
import org.ffenn.validation.FieldDef;
import org.ffenn.validation.FieldValidator;
import org.ffenn.validation.ProtoDef;
import org.ffenn.validation.VrmlProtoDef;

/**
 * @see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class VrmlProposalProvider extends AbstractVrmlProposalProvider {
	@Override
	public void complete_DefStatement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_EventIn(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_EventOut(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ExposedField(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ExposedFieldDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ExternInterfaceDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ExternProto(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_Field(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_FieldDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_FieldList(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_FieldType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_FLOAT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_InterfaceDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFBool(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFColor(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFFloat(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFInt32(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFNode(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFRotation(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFString(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFTime(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFVec2f(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_MFVec3f(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_Model(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_Node(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_NodeBody(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_NodeBodyElement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_NodeStatement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_Proto(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ProtoBody(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ProtoStatement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_RouteStatement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_Script(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ScriptBody(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ScriptBodyElement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFBool(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeNodeBodyElement_FieldRef(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScriptBodyElement_FieldName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScriptBodyElement_FieldRef(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFColor(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFFloat(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFImage(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFInt32(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFNode(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFRotation(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFString(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFTime(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFVec2f(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SFVec3f(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_SL_COMMENT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_Statement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeDefStatement_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeDefStatement_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeEventIn_FType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeEventIn_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeEventIn_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeEventOut_FType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeEventOut_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeEventOut_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}

	@Override
	public void completeExposedField_FType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal;
		ICompletionProposal completionProposal;
		
		for (FType ftype : FType.values()) {
			proposal = ftype.toString();
			proposal = getValueConverter().toString(proposal, "FielType");
			completionProposal = createCompletionProposal(proposal, context);
			acceptor.accept(completionProposal);
		}
	}

	@Override
	public void completeExposedField_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeExposedField_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeExposedFieldDeclaration_Field(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}

	@Override
	public void completeExposedFieldDeclaration_Values(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof NodeBodyElement) {
			NodeBodyElement nbe = (NodeBodyElement) model;
			if (nbe.getFieldName() != null) {
				EObject obj = nbe;
				do {
					if (obj instanceof Node) break;
					if (obj instanceof DefStatement) break;
					obj = obj.eContainer();
				} while (obj != null);
				Node node = (Node) obj;
				ProtoDef proto;
				FType ftype = null;
				if (VrmlProtoDef.getGrammarProtoList().containsKey(node.getName())) {
					proto = VrmlProtoDef.getGrammarProtoList().get(node.getName());
					ftype = proto.getFieldType(nbe.getFieldName());
				} else if (VrmlProtoDef.getAllFilesProtoList().containsKey(node.getName())) {
					proto = VrmlProtoDef.getAllFilesProtoList().get(node.getName());
					ftype = proto.getFieldType(nbe.getFieldName());
				}
				getProposalForFType(context, acceptor, ftype);
			}
		} else if (model instanceof FieldDeclaration) {
			ExposedFieldDeclaration fieldDcl = (ExposedFieldDeclaration) model;
			FType ftype = null;
			for (EObject o : fieldDcl.eContents()) {
				if (o instanceof ExposedField) {
					ftype = FType.valueOf(((ExposedField)o).getFType());
				}
			}
			getProposalForFType(context, acceptor, ftype);
		}
	}

	@Override
	public void completeExternProto_Interfaces(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal;
		ICompletionProposal completionProposal;
		proposal = "field";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);
		
		proposal = "exposedField";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);

		proposal = "eventIn";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);

		proposal = "eventOut";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);
	}

	@Override
	public void completeExternProto_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeExternProto_ProtoType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeExternProto_URLList(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	
	@Override
	public void completeField_FType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal;
		ICompletionProposal completionProposal;
		
		for (FType ftype : FType.values()) {
			proposal = ftype.toString();
			proposal = getValueConverter().toString(proposal, "FielType");
			completionProposal = createCompletionProposal(proposal, context);
			acceptor.accept(completionProposal);
		}
	}

	@Override
	public void completeField_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeField_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeFieldDeclaration_Field(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeFieldDeclaration_Values(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}

	@Override
	public void completeFieldList_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof NodeBodyElement) {
			NodeBodyElement nbe = (NodeBodyElement) model;
			if (nbe.getFieldName() != null) {
				EObject obj = nbe;
				do {
					if (obj instanceof Node) break;
					if (obj instanceof DefStatement) break;
					obj = obj.eContainer();
				} while (obj != null);
				Node node = (Node) obj;
				ProtoDef proto;
				FType ftype = null;
				if (VrmlProtoDef.getGrammarProtoList().containsKey(node.getName())) {
					proto = VrmlProtoDef.getGrammarProtoList().get(node.getName());
					ftype = proto.getFieldType(nbe.getFieldName());
				} else if (VrmlProtoDef.getAllFilesProtoList().containsKey(node.getName())) {
					proto = VrmlProtoDef.getAllFilesProtoList().get(node.getName());
					ftype = proto.getFieldType(nbe.getFieldName());
				}
				String currentValue = ((FieldList)nbe.eContents().get(0)).getValue();
				if (!FieldValidator.validate(ftype, currentValue)) {
					getProposalForFType(context, acceptor, ftype);
				}
			}
		} else if (model instanceof FieldDeclaration) {
			FieldDeclaration fieldDcl = (FieldDeclaration) model;
			FType ftype = null;
			String currentValue = null;
			for (EObject o : fieldDcl.eContents()) {
				if (o instanceof Field) {
					ftype = FType.valueOf(((Field)o).getFType());
				} else if (o instanceof FieldList) {
					currentValue = ((FieldList)o).getValue();
				}
			}
			if (!FieldValidator.validate(ftype, currentValue)) {
				getProposalForFType(context, acceptor, ftype);
			}
		}
	}

	private void getProposalForFType(ContentAssistContext context, ICompletionProposalAcceptor acceptor, FType ftype) {
		String proposal;
		ICompletionProposal completionProposal;
		switch(ftype) {
			case MFBool:
			case MFColor:
			case MFFloat:
			case MFInt32:
			case MFNode:
			case MFRotation:
			case MFString:
			case MFTime:
			case MFVec2f:
			case MFVec3f:
				proposal = "[]";
				proposal = getValueConverter().toString(proposal, "FieldList");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFBool:
				proposal = "TRUE";
				proposal = getValueConverter().toString(proposal, "SFBool");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				proposal = "FALSE";
				proposal = getValueConverter().toString(proposal, "SFBool");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFColor:
				proposal = "0 0 0";
				proposal = getValueConverter().toString(proposal, "SFColor");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFFloat:
				proposal = "0";
				proposal = getValueConverter().toString(proposal, "SFFloat");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFImage:
				proposal = "0";
				proposal = getValueConverter().toString(proposal, "SFImage");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFInt32:
				proposal = "0";
				proposal = getValueConverter().toString(proposal, "SFInt32");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFNode:
				proposal = "NULL";
				proposal = getValueConverter().toString(proposal, "SFNode");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFRotation:
				proposal = "0 0 0 0";
				proposal = getValueConverter().toString(proposal, "SFRotation");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFString:
				proposal = "\"\"";
				proposal = getValueConverter().toString(proposal, "String");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFTime:
				proposal = "0";
				proposal = getValueConverter().toString(proposal, "SFTime");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFVec2f:
				proposal = "0 0";
				proposal = getValueConverter().toString(proposal, "SFVec2f");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			case SFVec3f:
				proposal = "0 0 0";
				proposal = getValueConverter().toString(proposal, "SFVec3f");
				completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
				break;
			default:
				break;
		}
	}

	@Override
	public void completeMFNode_Nodes(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeMFTime_Times(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeModel_Elements(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeNode_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeNode_NodeBody(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeNodeBody_NodeBody(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeNodeBodyElement_FieldName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		EObject obj = model;
		do {
			if (obj instanceof Node) {
				break;
			} else if (obj instanceof DefStatement) {
				break;
			}
			obj = obj.eContainer();
		} while(obj != null);
		if (obj instanceof Node) {
			Node node = (Node) obj;
			getProposalForNode(context, acceptor, node);
		} else if (obj instanceof DefStatement) {
			if (((DefStatement)obj).getNode() instanceof Node) {
				Node node = (Node) ((DefStatement)obj).getNode();
				getProposalForNode(context, acceptor, node);
			} else if (((DefStatement)obj).getNode() instanceof Script) {
				System.out.println("script");
			}
		}
	}

	private void getProposalForNode(ContentAssistContext context, ICompletionProposalAcceptor acceptor, Node node) {
		List<String> alreadyUsed = new LinkedList<String>();
		for (EObject o : node.eContents()) {
			for (EObject o2 : o.eContents()) {
				if (o2 instanceof NodeBodyElement && !(o2 instanceof RouteStatement)) {
					NodeBodyElement el = (NodeBodyElement) o2;
					if (el.getFieldName() != null) {
						alreadyUsed.add(el.getFieldName());
					}
				}
			}
		}
		if (VrmlProtoDef.getGrammarProtoList().containsKey(node.getName())) {
			ProtoDef proto = VrmlProtoDef.getGrammarProtoList().get(node.getName());
			for (FieldDef field : proto.getFieldsName()) {
				if (!alreadyUsed.contains(field.getName())) {
					String proposal = field.getName();
					proposal = getValueConverter().toString(proposal, "ID");
					ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
					acceptor.accept(completionProposal);
				}
			}
		} else if (VrmlProtoDef.getAllFilesProtoList().containsKey(node.getName())) {
			ProtoDef proto = VrmlProtoDef.getAllFilesProtoList().get(node.getName());
			for (FieldDef field : proto.getFieldsName()) {
				if (!alreadyUsed.contains(field.getName())) {
					String proposal = field.getName();
					proposal = getValueConverter().toString(proposal, "ID");
					ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
					acceptor.accept(completionProposal);
				}
			}
		}
	}

	@Override
	public void completeNodeBodyElement_FieldValue(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}

	@Override
	public void completeProto_Interfaces(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String proposal;
		ICompletionProposal completionProposal;
		proposal = "field";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);
		
		proposal = "exposedField";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);

		proposal = "eventIn";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);

		proposal = "eventOut";
		proposal = getValueConverter().toString(proposal, "interface");
		completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);
	}

	@Override
	public void completeProto_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeProto_ProtoBody(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeProto_ProtoType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeProtoBody_Statement(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeRouteStatement_EventIn(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeRouteStatement_EventOut(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeRouteStatement_Source(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeRouteStatement_Target(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScript_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScript_ScriptBody(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScriptBody_ScriptBody(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScriptBodyElement_FieldValue(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeScriptBodyElement_NodeBodyElement(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeSFNode_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeSFNode_Use(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ID(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_INT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ANY_OTHER(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_ML_COMMENT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void complete_WS(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeAssignment(Assignment assignment, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		super.completeAssignment(assignment, contentAssistContext, acceptor);
	}
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {}
	@Override
	public void completeRuleCall(RuleCall ruleCall, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		super.completeRuleCall(ruleCall, contentAssistContext, acceptor);
	}
}
