package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DocumentationContextWrapper {

    
    private DocumentationContext documentationContext;

    public DocumentationContextWrapper(DocumentationContext documentationContext) {
        this.documentationContext = documentationContext;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(documentationContext.getS())) {
            
            return documentationContext.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(documentationContext.getT())) {
            
            return documentationContext.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(documentationContext.getShortName())) {
            
            return new IdentifierWrapper(documentationContext.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(documentationContext.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = documentationContext.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(documentationContext.getLongName())) {
            
            return new MultilanguageLongNameWrapper(documentationContext.getLongName());
            
        } else {
            return null;
        }
        
    }

    public AnyInstanceRefWrapper getFeatureIref() {
        
        if (CollUtil.isNotEmpty(documentationContext.getFeatureIref())) {
            
            return new AnyInstanceRefWrapper(documentationContext.getFeatureIref());
            
        } else {
            return null;
        }
        
    }

    public IdentifiableRefWrapper getIdentifiableRef() {
        
        if (CollUtil.isNotEmpty(documentationContext.getIdentifiableRef())) {
            
            return new IdentifiableRefWrapper(documentationContext.getIdentifiableRef());
            
        } else {
            return null;
        }
        
    }




    


    
}