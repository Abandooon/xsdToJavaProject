package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class ChapterWrapper {

    
    private Chapter chapter;

    public ChapterWrapper(Chapter chapter) {
        this.chapter = chapter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(chapter.getS())) {
            
            return chapter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(chapter.getT())) {
            
            return chapter.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(chapter.getUuid())) {
            
            return chapter.getUuid();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(chapter.getSi())) {
            
            return chapter.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(chapter.getView())) {
            
            return chapter.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(chapter.getBreak())) {
            
            return chapter.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(chapter.getKeepWithPrevious())) {
            
            return chapter.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(chapter.getHelpEntry())) {
            
            return chapter.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(chapter.getShortName())) {
            
            return new IdentifierWrapper(chapter.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(chapter.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = chapter.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(chapter.getLongName())) {
            
            return new MultilanguageLongNameWrapper(chapter.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(chapter.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(chapter.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(chapter.getCategory())) {
            
            return new CategoryStringWrapper(chapter.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(chapter.getAdminData())) {
            
            return new AdminDataWrapper(chapter.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(chapter.getIntroduction())) {
            
            return new DocumentationBlockWrapper(chapter.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(chapter.getAnnotations())) {
            ArrayList<Annotation> originalList = chapter.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(chapter.getVariationPoint())) {
            
            return new VariationPointWrapper(chapter.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PrmsWrapper> getPrms() {
        
        if (CollUtil.isNotEmpty(chapter.getPrms())) {
            ArrayList<Prms> originalList = chapter.getPrms();
            ArrayList<PrmsWrapper> wrapperList = (ArrayList<PrmsWrapper>)originalList.stream()
                .map(item -> new PrmsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP1Wrapper> getMsrQueryP1() {
        
        if (CollUtil.isNotEmpty(chapter.getMsrQueryP1())) {
            ArrayList<MsrQueryP1> originalList = chapter.getMsrQueryP1();
            ArrayList<MsrQueryP1Wrapper> wrapperList = (ArrayList<MsrQueryP1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}