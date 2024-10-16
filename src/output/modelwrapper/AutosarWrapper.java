package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class AutosarWrapper {

    
    private Autosar autosar;

    public AutosarWrapper(Autosar autosar) {
        this.autosar = autosar;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosar.getS())) {
            
            return autosar.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosar.getT())) {
            
            return autosar.getT();
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(autosar.getAdminData())) {
            
            return new AdminDataWrapper(autosar.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(autosar.getIntroduction())) {
            
            return new DocumentationBlockWrapper(autosar.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ArPackageWrapper> getArPackages() {
        
        if (CollUtil.isNotEmpty(autosar.getArPackages())) {
            ArrayList<ArPackage> originalList = autosar.getArPackages();
            ArrayList<ArPackageWrapper> wrapperList = (ArrayList<ArPackageWrapper>)originalList.stream()
                .map(item -> new ArPackageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}