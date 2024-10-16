package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class AdminDataWrapper {

    
    private AdminData adminData;

    public AdminDataWrapper(AdminData adminData) {
        this.adminData = adminData;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(adminData.getS())) {
            
            return adminData.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(adminData.getT())) {
            
            return adminData.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumWrapper getLanguage() {
        
        if (CollUtil.isNotEmpty(adminData.getLanguage())) {
            
            return new LEnumWrapper(adminData.getLanguage());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguagePlainTextWrapper getUsedLanguages() {
        
        if (CollUtil.isNotEmpty(adminData.getUsedLanguages())) {
            
            return new MultiLanguagePlainTextWrapper(adminData.getUsedLanguages());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DocRevisionWrapper> getDocRevisions() {
        
        if (CollUtil.isNotEmpty(adminData.getDocRevisions())) {
            ArrayList<DocRevision> originalList = adminData.getDocRevisions();
            ArrayList<DocRevisionWrapper> wrapperList = (ArrayList<DocRevisionWrapper>)originalList.stream()
                .map(item -> new DocRevisionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdgs() {
        
        if (CollUtil.isNotEmpty(adminData.getSdgs())) {
            ArrayList<Sdg> originalList = adminData.getSdgs();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}