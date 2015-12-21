/*
 * generated by Xtext
 */
package org.istic.idm.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.istic.idm.xtext.services.VideoGenGrammarAccess;
import org.istic.idm.xtext.videoGen.Alternatives;
import org.istic.idm.xtext.videoGen.Mandatory;
import org.istic.idm.xtext.videoGen.Optional;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.istic.idm.xtext.videoGen.VideoGenPackage;

@SuppressWarnings("all")
public class VideoGenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VideoGenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VideoGenPackage.ALTERNATIVES:
				sequence_Alternatives(context, (Alternatives) semanticObject); 
				return; 
			case VideoGenPackage.MANDATORY:
				sequence_Mandatory(context, (Mandatory) semanticObject); 
				return; 
			case VideoGenPackage.OPTIONAL:
				sequence_Optional(context, (Optional) semanticObject); 
				return; 
			case VideoGenPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			case VideoGenPackage.VIDEO_GEN:
				sequence_VideoGen(context, (VideoGen) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID options+=Optional+)
	 */
	protected void sequence_Alternatives(EObject context, Alternatives semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sequence=Sequence
	 */
	protected void sequence_Mandatory(EObject context, Mandatory semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VideoGenPackage.Literals.MANDATORY__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VideoGenPackage.Literals.MANDATORY__SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0(), semanticObject.getSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (probability=INT? sequence=Sequence)
	 */
	protected void sequence_Optional(EObject context, Optional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID url=STRING description=STRING? length=INT? mimetype=Mimetypes_Enum?)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_VideoGen(EObject context, VideoGen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
