package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class LinScheduleTableWrapper {

    
    private LinScheduleTable linScheduleTable;

    public LinScheduleTableWrapper(LinScheduleTable linScheduleTable) {
        this.linScheduleTable = linScheduleTable;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getS())) {
            
            return linScheduleTable.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getT())) {
            
            return linScheduleTable.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getUuid())) {
            
            return linScheduleTable.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getShortName())) {
            
            return new IdentifierWrapper(linScheduleTable.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linScheduleTable.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linScheduleTable.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linScheduleTable.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getCategory())) {
            
            return new CategoryStringWrapper(linScheduleTable.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getAdminData())) {
            
            return new AdminDataWrapper(linScheduleTable.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linScheduleTable.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getAnnotations())) {
            ArrayList<Annotation> originalList = linScheduleTable.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ResumePositionWrapper getResumePosition() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getResumePosition())) {
            
            return new ResumePositionWrapper(linScheduleTable.getResumePosition());
            
        } else {
            return null;
        }
        
    }

    public RunModeWrapper getRunMode() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getRunMode())) {
            
            return new RunModeWrapper(linScheduleTable.getRunMode());
            
        } else {
            return null;
        }
        
    }

    public TableEntrysWrapper getTableEntrys() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getTableEntrys())) {
            
            return new TableEntrysWrapper(linScheduleTable.getTableEntrys());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linScheduleTable.getVariationPoint())) {
            
            return new VariationPointWrapper(linScheduleTable.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}