package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class ReferenceBaseWrapper {

    
    private ReferenceBase referenceBase;

    public ReferenceBaseWrapper(ReferenceBase referenceBase) {
        this.referenceBase = referenceBase;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(referenceBase.getS())) {
            
            return referenceBase.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(referenceBase.getT())) {
            
            return referenceBase.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(referenceBase.getShortLabel())) {
            
            return new IdentifierWrapper(referenceBase.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsDefault() {
        
        if (CollUtil.isNotEmpty(referenceBase.getIsDefault())) {
            
            return new BooleanWrapper(referenceBase.getIsDefault());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsGlobal() {
        
        if (CollUtil.isNotEmpty(referenceBase.getIsGlobal())) {
            
            return new BooleanWrapper(referenceBase.getIsGlobal());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getBaseIsThisPackage() {
        
        if (CollUtil.isNotEmpty(referenceBase.getBaseIsThisPackage())) {
            
            return new BooleanWrapper(referenceBase.getBaseIsThisPackage());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<GlobalInPackageRefWrapper> getGlobalInPackageRefs() {
        
        if (CollUtil.isNotEmpty(referenceBase.getGlobalInPackageRefs())) {
            ArrayList<GlobalInPackageRef> originalList = referenceBase.getGlobalInPackageRefs();
            ArrayList<GlobalInPackageRefWrapper> wrapperList = (ArrayList<GlobalInPackageRefWrapper>)originalList.stream()
                .map(item -> new GlobalInPackageRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferrableSubtypesEnum> getGlobalElements() {
        
        if (CollUtil.isNotEmpty(referenceBase.getGlobalElements())) {
            
            return referenceBase.getGlobalElements();
            
        } else {
            return null;
        }
        
    }

    public PackageRefWrapper getPackageRef() {
        
        if (CollUtil.isNotEmpty(referenceBase.getPackageRef())) {
            
            return new PackageRefWrapper(referenceBase.getPackageRef());
            
        } else {
            return null;
        }
        
    }




    


    
}