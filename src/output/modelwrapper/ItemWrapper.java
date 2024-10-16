package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.List;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ItemWrapper {

    
    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(item.getS())) {
            
            return item.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(item.getT())) {
            
            return item.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(item.getSi())) {
            
            return item.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(item.getView())) {
            
            return item.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(item.getBreak())) {
            
            return item.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(item.getKeepWithPrevious())) {
            
            return item.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(item.getVariationPoint())) {
            
            return new VariationPointWrapper(item.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP2Wrapper> getMsrQueryP2() {
        
        if (CollUtil.isNotEmpty(item.getMsrQueryP2())) {
            ArrayList<MsrQueryP2> originalList = item.getMsrQueryP2();
            ArrayList<MsrQueryP2Wrapper> wrapperList = (ArrayList<MsrQueryP2Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP2Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageParagraphWrapper> getP() {
        
        if (CollUtil.isNotEmpty(item.getP())) {
            ArrayList<MultiLanguageParagraph> originalList = item.getP();
            ArrayList<MultiLanguageParagraphWrapper> wrapperList = (ArrayList<MultiLanguageParagraphWrapper>)originalList.stream()
                .map(item -> new MultiLanguageParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageVerbatimWrapper> getVerbatim() {
        
        if (CollUtil.isNotEmpty(item.getVerbatim())) {
            ArrayList<MultiLanguageVerbatim> originalList = item.getVerbatim();
            ArrayList<MultiLanguageVerbatimWrapper> wrapperList = (ArrayList<MultiLanguageVerbatimWrapper>)originalList.stream()
                .map(item -> new MultiLanguageVerbatimWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ListWrapper> getList() {
        
        if (CollUtil.isNotEmpty(item.getList())) {
            ArrayList<List> originalList = item.getList();
            ArrayList<ListWrapper> wrapperList = (ArrayList<ListWrapper>)originalList.stream()
                .map(item -> new ListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DefListWrapper> getDefList() {
        
        if (CollUtil.isNotEmpty(item.getDefList())) {
            ArrayList<DefList> originalList = item.getDefList();
            ArrayList<DefListWrapper> wrapperList = (ArrayList<DefListWrapper>)originalList.stream()
                .map(item -> new DefListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LabeledListWrapper> getLabeledList() {
        
        if (CollUtil.isNotEmpty(item.getLabeledList())) {
            ArrayList<LabeledList> originalList = item.getLabeledList();
            ArrayList<LabeledListWrapper> wrapperList = (ArrayList<LabeledListWrapper>)originalList.stream()
                .map(item -> new LabeledListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFormulaWrapper> getFormula() {
        
        if (CollUtil.isNotEmpty(item.getFormula())) {
            ArrayList<MlFormula> originalList = item.getFormula();
            ArrayList<MlFormulaWrapper> wrapperList = (ArrayList<MlFormulaWrapper>)originalList.stream()
                .map(item -> new MlFormulaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFigureWrapper> getFigure() {
        
        if (CollUtil.isNotEmpty(item.getFigure())) {
            ArrayList<MlFigure> originalList = item.getFigure();
            ArrayList<MlFigureWrapper> wrapperList = (ArrayList<MlFigureWrapper>)originalList.stream()
                .map(item -> new MlFigureWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NoteWrapper> getNote() {
        
        if (CollUtil.isNotEmpty(item.getNote())) {
            ArrayList<Note> originalList = item.getNote();
            ArrayList<NoteWrapper> wrapperList = (ArrayList<NoteWrapper>)originalList.stream()
                .map(item -> new NoteWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceableTextWrapper> getTrace() {
        
        if (CollUtil.isNotEmpty(item.getTrace())) {
            ArrayList<TraceableText> originalList = item.getTrace();
            ArrayList<TraceableTextWrapper> wrapperList = (ArrayList<TraceableTextWrapper>)originalList.stream()
                .map(item -> new TraceableTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<StructuredReqWrapper> getStructuredReq() {
        
        if (CollUtil.isNotEmpty(item.getStructuredReq())) {
            ArrayList<StructuredReq> originalList = item.getStructuredReq();
            ArrayList<StructuredReqWrapper> wrapperList = (ArrayList<StructuredReqWrapper>)originalList.stream()
                .map(item -> new StructuredReqWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}