package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.List;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class NoteWrapper {

    
    private Note note;

    public NoteWrapper(Note note) {
        this.note = note;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(note.getS())) {
            
            return note.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(note.getT())) {
            
            return note.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(note.getSi())) {
            
            return note.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(note.getView())) {
            
            return note.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(note.getBreak())) {
            
            return note.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(note.getKeepWithPrevious())) {
            
            return note.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public NoteTypeEnumSimple getNoteType() {
        
        if (CollUtil.isNotEmpty(note.getNoteType())) {
            
            return note.getNoteType();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(note.getLabel())) {
            
            return new MultilanguageLongNameWrapper(note.getLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(note.getVariationPoint())) {
            
            return new VariationPointWrapper(note.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP2Wrapper> getMsrQueryP2() {
        
        if (CollUtil.isNotEmpty(note.getMsrQueryP2())) {
            ArrayList<MsrQueryP2> originalList = note.getMsrQueryP2();
            ArrayList<MsrQueryP2Wrapper> wrapperList = (ArrayList<MsrQueryP2Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP2Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageParagraphWrapper> getP() {
        
        if (CollUtil.isNotEmpty(note.getP())) {
            ArrayList<MultiLanguageParagraph> originalList = note.getP();
            ArrayList<MultiLanguageParagraphWrapper> wrapperList = (ArrayList<MultiLanguageParagraphWrapper>)originalList.stream()
                .map(item -> new MultiLanguageParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageVerbatimWrapper> getVerbatim() {
        
        if (CollUtil.isNotEmpty(note.getVerbatim())) {
            ArrayList<MultiLanguageVerbatim> originalList = note.getVerbatim();
            ArrayList<MultiLanguageVerbatimWrapper> wrapperList = (ArrayList<MultiLanguageVerbatimWrapper>)originalList.stream()
                .map(item -> new MultiLanguageVerbatimWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ListWrapper> getList() {
        
        if (CollUtil.isNotEmpty(note.getList())) {
            ArrayList<List> originalList = note.getList();
            ArrayList<ListWrapper> wrapperList = (ArrayList<ListWrapper>)originalList.stream()
                .map(item -> new ListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DefListWrapper> getDefList() {
        
        if (CollUtil.isNotEmpty(note.getDefList())) {
            ArrayList<DefList> originalList = note.getDefList();
            ArrayList<DefListWrapper> wrapperList = (ArrayList<DefListWrapper>)originalList.stream()
                .map(item -> new DefListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LabeledListWrapper> getLabeledList() {
        
        if (CollUtil.isNotEmpty(note.getLabeledList())) {
            ArrayList<LabeledList> originalList = note.getLabeledList();
            ArrayList<LabeledListWrapper> wrapperList = (ArrayList<LabeledListWrapper>)originalList.stream()
                .map(item -> new LabeledListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFormulaWrapper> getFormula() {
        
        if (CollUtil.isNotEmpty(note.getFormula())) {
            ArrayList<MlFormula> originalList = note.getFormula();
            ArrayList<MlFormulaWrapper> wrapperList = (ArrayList<MlFormulaWrapper>)originalList.stream()
                .map(item -> new MlFormulaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFigureWrapper> getFigure() {
        
        if (CollUtil.isNotEmpty(note.getFigure())) {
            ArrayList<MlFigure> originalList = note.getFigure();
            ArrayList<MlFigureWrapper> wrapperList = (ArrayList<MlFigureWrapper>)originalList.stream()
                .map(item -> new MlFigureWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NoteWrapper> getNote() {
        
        if (CollUtil.isNotEmpty(note.getNote())) {
            ArrayList<Note> originalList = note.getNote();
            ArrayList<NoteWrapper> wrapperList = (ArrayList<NoteWrapper>)originalList.stream()
                .map(item -> new NoteWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceableTextWrapper> getTrace() {
        
        if (CollUtil.isNotEmpty(note.getTrace())) {
            ArrayList<TraceableText> originalList = note.getTrace();
            ArrayList<TraceableTextWrapper> wrapperList = (ArrayList<TraceableTextWrapper>)originalList.stream()
                .map(item -> new TraceableTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<StructuredReqWrapper> getStructuredReq() {
        
        if (CollUtil.isNotEmpty(note.getStructuredReq())) {
            ArrayList<StructuredReq> originalList = note.getStructuredReq();
            ArrayList<StructuredReqWrapper> wrapperList = (ArrayList<StructuredReqWrapper>)originalList.stream()
                .map(item -> new StructuredReqWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}