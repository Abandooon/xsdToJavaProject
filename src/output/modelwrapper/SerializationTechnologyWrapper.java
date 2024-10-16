package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class SerializationTechnologyWrapper {

    
    private SerializationTechnology serializationTechnology;

    public SerializationTechnologyWrapper(SerializationTechnology serializationTechnology) {
        this.serializationTechnology = serializationTechnology;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getS())) {
            
            return serializationTechnology.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getT())) {
            
            return serializationTechnology.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getUuid())) {
            
            return serializationTechnology.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getShortName())) {
            
            return new IdentifierWrapper(serializationTechnology.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = serializationTechnology.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getLongName())) {
            
            return new MultilanguageLongNameWrapper(serializationTechnology.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(serializationTechnology.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getCategory())) {
            
            return new CategoryStringWrapper(serializationTechnology.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getAdminData())) {
            
            return new AdminDataWrapper(serializationTechnology.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getIntroduction())) {
            
            return new DocumentationBlockWrapper(serializationTechnology.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getAnnotations())) {
            ArrayList<Annotation> originalList = serializationTechnology.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getVariationPoint())) {
            
            return new VariationPointWrapper(serializationTechnology.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocol() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getProtocol())) {
            
            return new StringWrapper(serializationTechnology.getProtocol());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(serializationTechnology.getVersion())) {
            
            return new StringWrapper(serializationTechnology.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}