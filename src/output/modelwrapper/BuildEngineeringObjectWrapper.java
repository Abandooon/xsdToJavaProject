package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BuildEngineeringObjectWrapper {

    
    private BuildEngineeringObject buildEngineeringObject;

    public BuildEngineeringObjectWrapper(BuildEngineeringObject buildEngineeringObject) {
        this.buildEngineeringObject = buildEngineeringObject;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getS())) {
            
            return buildEngineeringObject.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getT())) {
            
            return buildEngineeringObject.getT();
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getShortLabel())) {
            
            return new NmtokenStringWrapper(buildEngineeringObject.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getCategory())) {
            
            return new NmtokenStringWrapper(buildEngineeringObject.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RevisionLabelStringWrapper> getRevisionLabels() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getRevisionLabels())) {
            ArrayList<RevisionLabelString> originalList = buildEngineeringObject.getRevisionLabels();
            ArrayList<RevisionLabelStringWrapper> wrapperList = (ArrayList<RevisionLabelStringWrapper>)originalList.stream()
                .map(item -> new RevisionLabelStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getDomain() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getDomain())) {
            
            return new NmtokenStringWrapper(buildEngineeringObject.getDomain());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getFileType() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getFileType())) {
            
            return new NmtokenStringWrapper(buildEngineeringObject.getFileType());
            
        } else {
            return null;
        }
        
    }

    public UriStringWrapper getIntendedFilename() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getIntendedFilename())) {
            
            return new UriStringWrapper(buildEngineeringObject.getIntendedFilename());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getParentCategory() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getParentCategory())) {
            
            return new NmtokenStringWrapper(buildEngineeringObject.getParentCategory());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getParentShortLabel() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getParentShortLabel())) {
            
            return new NmtokenStringWrapper(buildEngineeringObject.getParentShortLabel());
            
        } else {
            return null;
        }
        
    }

    public RegularExpressionWrapper getShortLabelPattern() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getShortLabelPattern())) {
            
            return new RegularExpressionWrapper(buildEngineeringObject.getShortLabelPattern());
            
        } else {
            return null;
        }
        
    }

    public RegularExpressionWrapper getFileTypePattern() {
        
        if (CollUtil.isNotEmpty(buildEngineeringObject.getFileTypePattern())) {
            
            return new RegularExpressionWrapper(buildEngineeringObject.getFileTypePattern());
            
        } else {
            return null;
        }
        
    }




    


    
}