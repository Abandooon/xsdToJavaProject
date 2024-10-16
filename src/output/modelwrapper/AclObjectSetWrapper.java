package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class AclObjectSetWrapper {

    
    private AclObjectSet aclObjectSet;

    public AclObjectSetWrapper(AclObjectSet aclObjectSet) {
        this.aclObjectSet = aclObjectSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getS())) {
            
            return aclObjectSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getT())) {
            
            return aclObjectSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getUuid())) {
            
            return aclObjectSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getShortName())) {
            
            return new IdentifierWrapper(aclObjectSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = aclObjectSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(aclObjectSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(aclObjectSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getCategory())) {
            
            return new CategoryStringWrapper(aclObjectSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getAdminData())) {
            
            return new AdminDataWrapper(aclObjectSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(aclObjectSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getAnnotations())) {
            ArrayList<Annotation> originalList = aclObjectSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getVariationPoint())) {
            
            return new VariationPointWrapper(aclObjectSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(aclObjectSet.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getShortNamePattern())) {
            
            return new StringWrapper(aclObjectSet.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferrableSubtypesEnum> getAclObjectClasss() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getAclObjectClasss())) {
            
            return aclObjectSet.getAclObjectClasss();
            
        } else {
            return null;
        }
        
    }

    public AclScopeEnumWrapper getAclScope() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getAclScope())) {
            
            return new AclScopeEnumWrapper(aclObjectSet.getAclScope());
            
        } else {
            return null;
        }
        
    }

    public CollectionRefWrapper getCollectionRef() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getCollectionRef())) {
            
            return new CollectionRefWrapper(aclObjectSet.getCollectionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DerivedFromBlueprintRefWrapper> getDerivedFromBlueprintRefs() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getDerivedFromBlueprintRefs())) {
            ArrayList<DerivedFromBlueprintRef> originalList = aclObjectSet.getDerivedFromBlueprintRefs();
            ArrayList<DerivedFromBlueprintRefWrapper> wrapperList = (ArrayList<DerivedFromBlueprintRefWrapper>)originalList.stream()
                .map(item -> new DerivedFromBlueprintRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarEngineeringObjectWrapper> getEngineeringObjects() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getEngineeringObjects())) {
            ArrayList<AutosarEngineeringObject> originalList = aclObjectSet.getEngineeringObjects();
            ArrayList<AutosarEngineeringObjectWrapper> wrapperList = (ArrayList<AutosarEngineeringObjectWrapper>)originalList.stream()
                .map(item -> new AutosarEngineeringObjectWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObjectDefinitionRefWrapper> getObjectDefinitionRefs() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getObjectDefinitionRefs())) {
            ArrayList<ObjectDefinitionRef> originalList = aclObjectSet.getObjectDefinitionRefs();
            ArrayList<ObjectDefinitionRefWrapper> wrapperList = (ArrayList<ObjectDefinitionRefWrapper>)originalList.stream()
                .map(item -> new ObjectDefinitionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObjectDefintionRefWrapper> getObjectDefintionRefs() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getObjectDefintionRefs())) {
            ArrayList<ObjectDefintionRef> originalList = aclObjectSet.getObjectDefintionRefs();
            ArrayList<ObjectDefintionRefWrapper> wrapperList = (ArrayList<ObjectDefintionRefWrapper>)originalList.stream()
                .map(item -> new ObjectDefintionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObjectRefWrapper> getObjectRefs() {
        
        if (CollUtil.isNotEmpty(aclObjectSet.getObjectRefs())) {
            ArrayList<ObjectRef> originalList = aclObjectSet.getObjectRefs();
            ArrayList<ObjectRefWrapper> wrapperList = (ArrayList<ObjectRefWrapper>)originalList.stream()
                .map(item -> new ObjectRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}