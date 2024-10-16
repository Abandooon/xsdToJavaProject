package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class McDataInstanceWrapper {

    
    private McDataInstance mcDataInstance;

    public McDataInstanceWrapper(McDataInstance mcDataInstance) {
        this.mcDataInstance = mcDataInstance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getS())) {
            
            return mcDataInstance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getT())) {
            
            return mcDataInstance.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getUuid())) {
            
            return mcDataInstance.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getShortName())) {
            
            return new IdentifierWrapper(mcDataInstance.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = mcDataInstance.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getLongName())) {
            
            return new MultilanguageLongNameWrapper(mcDataInstance.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(mcDataInstance.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getCategory())) {
            
            return new CategoryStringWrapper(mcDataInstance.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getAdminData())) {
            
            return new AdminDataWrapper(mcDataInstance.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getIntroduction())) {
            
            return new DocumentationBlockWrapper(mcDataInstance.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getAnnotations())) {
            ArrayList<Annotation> originalList = mcDataInstance.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getArraySize() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getArraySize())) {
            
            return new PositiveIntegerWrapper(mcDataInstance.getArraySize());
            
        } else {
            return null;
        }
        
    }

    public McdIdentifierWrapper getDisplayIdentifier() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getDisplayIdentifier())) {
            
            return new McdIdentifierWrapper(mcDataInstance.getDisplayIdentifier());
            
        } else {
            return null;
        }
        
    }

    public FlatMapEntryRefWrapper getFlatMapEntryRef() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getFlatMapEntryRef())) {
            
            return new FlatMapEntryRefWrapper(mcDataInstance.getFlatMapEntryRef());
            
        } else {
            return null;
        }
        
    }

    public ImplementationElementInParameterInstanceRefWrapper getInstanceInMemory() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getInstanceInMemory())) {
            
            return new ImplementationElementInParameterInstanceRefWrapper(mcDataInstance.getInstanceInMemory());
            
        } else {
            return null;
        }
        
    }

    public McDataAccessDetailsWrapper getMcDataAccessDetails() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getMcDataAccessDetails())) {
            
            return new McDataAccessDetailsWrapper(mcDataInstance.getMcDataAccessDetails());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedMcDataAssignmentWrapper> getMcDataAssignments() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getMcDataAssignments())) {
            ArrayList<RoleBasedMcDataAssignment> originalList = mcDataInstance.getMcDataAssignments();
            ArrayList<RoleBasedMcDataAssignmentWrapper> wrapperList = (ArrayList<RoleBasedMcDataAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedMcDataAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getResultingProperties() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getResultingProperties())) {
            
            return new SwDataDefPropsWrapper(mcDataInstance.getResultingProperties());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getRole())) {
            
            return new IdentifierWrapper(mcDataInstance.getRole());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceWrapper> getSubElements() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getSubElements())) {
            ArrayList<McDataInstance> originalList = mcDataInstance.getSubElements();
            ArrayList<McDataInstanceWrapper> wrapperList = (ArrayList<McDataInstanceWrapper>)originalList.stream()
                .map(item -> new McDataInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolStringWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getSymbol())) {
            
            return new SymbolStringWrapper(mcDataInstance.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(mcDataInstance.getVariationPoint())) {
            
            return new VariationPointWrapper(mcDataInstance.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}