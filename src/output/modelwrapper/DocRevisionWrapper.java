package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Date;
    

    
    


public class DocRevisionWrapper {

    
    private DocRevision docRevision;

    public DocRevisionWrapper(DocRevision docRevision) {
        this.docRevision = docRevision;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(docRevision.getS())) {
            
            return docRevision.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(docRevision.getT())) {
            
            return docRevision.getT();
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getRevisionLabel() {
        
        if (CollUtil.isNotEmpty(docRevision.getRevisionLabel())) {
            
            return new RevisionLabelStringWrapper(docRevision.getRevisionLabel());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getRevisionLabelP1() {
        
        if (CollUtil.isNotEmpty(docRevision.getRevisionLabelP1())) {
            
            return new RevisionLabelStringWrapper(docRevision.getRevisionLabelP1());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getRevisionLabelP2() {
        
        if (CollUtil.isNotEmpty(docRevision.getRevisionLabelP2())) {
            
            return new RevisionLabelStringWrapper(docRevision.getRevisionLabelP2());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getState() {
        
        if (CollUtil.isNotEmpty(docRevision.getState())) {
            
            return new NmtokenStringWrapper(docRevision.getState());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getIssuedBy() {
        
        if (CollUtil.isNotEmpty(docRevision.getIssuedBy())) {
            
            return new StringWrapper(docRevision.getIssuedBy());
            
        } else {
            return null;
        }
        
    }

    public DateWrapper getDate() {
        
        if (CollUtil.isNotEmpty(docRevision.getDate())) {
            
            return new DateWrapper(docRevision.getDate());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModificationWrapper> getModifications() {
        
        if (CollUtil.isNotEmpty(docRevision.getModifications())) {
            ArrayList<Modification> originalList = docRevision.getModifications();
            ArrayList<ModificationWrapper> wrapperList = (ArrayList<ModificationWrapper>)originalList.stream()
                .map(item -> new ModificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}