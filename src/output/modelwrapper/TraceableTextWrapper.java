package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.List;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TraceableTextWrapper {

    
    private TraceableText traceableText;

    public TraceableTextWrapper(TraceableText traceableText) {
        this.traceableText = traceableText;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(traceableText.getS())) {
            
            return traceableText.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(traceableText.getT())) {
            
            return traceableText.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(traceableText.getUuid())) {
            
            return traceableText.getUuid();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(traceableText.getSi())) {
            
            return traceableText.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(traceableText.getView())) {
            
            return traceableText.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(traceableText.getBreak())) {
            
            return traceableText.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(traceableText.getKeepWithPrevious())) {
            
            return traceableText.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(traceableText.getShortName())) {
            
            return new IdentifierWrapper(traceableText.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(traceableText.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = traceableText.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(traceableText.getLongName())) {
            
            return new MultilanguageLongNameWrapper(traceableText.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(traceableText.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(traceableText.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(traceableText.getCategory())) {
            
            return new CategoryStringWrapper(traceableText.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(traceableText.getAdminData())) {
            
            return new AdminDataWrapper(traceableText.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(traceableText.getIntroduction())) {
            
            return new DocumentationBlockWrapper(traceableText.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(traceableText.getAnnotations())) {
            ArrayList<Annotation> originalList = traceableText.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(traceableText.getTraceRefs())) {
            ArrayList<TraceRef> originalList = traceableText.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(traceableText.getVariationPoint())) {
            
            return new VariationPointWrapper(traceableText.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP2Wrapper> getMsrQueryP2() {
        
        if (CollUtil.isNotEmpty(traceableText.getMsrQueryP2())) {
            ArrayList<MsrQueryP2> originalList = traceableText.getMsrQueryP2();
            ArrayList<MsrQueryP2Wrapper> wrapperList = (ArrayList<MsrQueryP2Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP2Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageParagraphWrapper> getP() {
        
        if (CollUtil.isNotEmpty(traceableText.getP())) {
            ArrayList<MultiLanguageParagraph> originalList = traceableText.getP();
            ArrayList<MultiLanguageParagraphWrapper> wrapperList = (ArrayList<MultiLanguageParagraphWrapper>)originalList.stream()
                .map(item -> new MultiLanguageParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageVerbatimWrapper> getVerbatim() {
        
        if (CollUtil.isNotEmpty(traceableText.getVerbatim())) {
            ArrayList<MultiLanguageVerbatim> originalList = traceableText.getVerbatim();
            ArrayList<MultiLanguageVerbatimWrapper> wrapperList = (ArrayList<MultiLanguageVerbatimWrapper>)originalList.stream()
                .map(item -> new MultiLanguageVerbatimWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ListWrapper> getList() {
        
        if (CollUtil.isNotEmpty(traceableText.getList())) {
            ArrayList<List> originalList = traceableText.getList();
            ArrayList<ListWrapper> wrapperList = (ArrayList<ListWrapper>)originalList.stream()
                .map(item -> new ListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DefListWrapper> getDefList() {
        
        if (CollUtil.isNotEmpty(traceableText.getDefList())) {
            ArrayList<DefList> originalList = traceableText.getDefList();
            ArrayList<DefListWrapper> wrapperList = (ArrayList<DefListWrapper>)originalList.stream()
                .map(item -> new DefListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LabeledListWrapper> getLabeledList() {
        
        if (CollUtil.isNotEmpty(traceableText.getLabeledList())) {
            ArrayList<LabeledList> originalList = traceableText.getLabeledList();
            ArrayList<LabeledListWrapper> wrapperList = (ArrayList<LabeledListWrapper>)originalList.stream()
                .map(item -> new LabeledListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFormulaWrapper> getFormula() {
        
        if (CollUtil.isNotEmpty(traceableText.getFormula())) {
            ArrayList<MlFormula> originalList = traceableText.getFormula();
            ArrayList<MlFormulaWrapper> wrapperList = (ArrayList<MlFormulaWrapper>)originalList.stream()
                .map(item -> new MlFormulaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFigureWrapper> getFigure() {
        
        if (CollUtil.isNotEmpty(traceableText.getFigure())) {
            ArrayList<MlFigure> originalList = traceableText.getFigure();
            ArrayList<MlFigureWrapper> wrapperList = (ArrayList<MlFigureWrapper>)originalList.stream()
                .map(item -> new MlFigureWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NoteWrapper> getNote() {
        
        if (CollUtil.isNotEmpty(traceableText.getNote())) {
            ArrayList<Note> originalList = traceableText.getNote();
            ArrayList<NoteWrapper> wrapperList = (ArrayList<NoteWrapper>)originalList.stream()
                .map(item -> new NoteWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceableTextWrapper> getTrace() {
        
        if (CollUtil.isNotEmpty(traceableText.getTrace())) {
            ArrayList<TraceableText> originalList = traceableText.getTrace();
            ArrayList<TraceableTextWrapper> wrapperList = (ArrayList<TraceableTextWrapper>)originalList.stream()
                .map(item -> new TraceableTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<StructuredReqWrapper> getStructuredReq() {
        
        if (CollUtil.isNotEmpty(traceableText.getStructuredReq())) {
            ArrayList<StructuredReq> originalList = traceableText.getStructuredReq();
            ArrayList<StructuredReqWrapper> wrapperList = (ArrayList<StructuredReqWrapper>)originalList.stream()
                .map(item -> new StructuredReqWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}