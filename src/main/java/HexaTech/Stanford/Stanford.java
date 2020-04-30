package HexaTech.Stanford;

import HexaTech.entities.DoubleToken;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.parser.nndep.DependencyParser;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.util.CoreMap;
import java.util.*;

public class Stanford implements iStanford {

    private final StanfordCoreNLP pipeline;
    private final DependencyParser depparser;

    public Stanford() {
        Properties props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma");
        this.pipeline = new StanfordCoreNLP(props);
        this.depparser = DependencyParser.loadFromModelFile("edu/stanford/nlp/models/parser/nndep/english_UD.gz");
    }

    @Override
    public List<DoubleToken> extract(String prova) {
        List<DoubleToken> toRit = new ArrayList<>();
        Annotation document = new Annotation(prova);
        this.pipeline.annotate(document);
        List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);
        for (CoreMap sentence : sentences) {
                GrammaticalStructure gStruct = depparser.predict(sentence);
                Collection<TypedDependency> dependencies = gStruct.typedDependencies();
                for (TypedDependency dep : dependencies) {
                    if (dep.reln().getShortName().equalsIgnoreCase("obj"))
                    toRit.add(new DoubleToken("obj",dep.gov().lemma()+ " "+ dep.dep().lemma()));
                }
                for (CoreLabel token : sentence.get(CoreAnnotations.TokensAnnotation.class)) {
                    if (token.tag().contains("VB") || token.tag().contains("NN"))
                    toRit.add(new DoubleToken(token.tag(), token.lemma()));
              }

        }
        return toRit;
    }
}
