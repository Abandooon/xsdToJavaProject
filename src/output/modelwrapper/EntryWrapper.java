package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Entry;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.List;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EntryWrapper {

    
    private Entry entry;

    public EntryWrapper(Entry entry) {
        this.entry = entry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(entry.getS())) {
            
            return entry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(entry.getT())) {
            
            return entry.getT();
            
        } else {
            return null;
        }
        
    }

    public AlignEnumSimple getAlign() {
        
        if (CollUtil.isNotEmpty(entry.getAlign())) {
            
            return entry.getAlign();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColname() {
        
        if (CollUtil.isNotEmpty(entry.getColname())) {
            
            return entry.getColname();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColsep() {
        
        if (CollUtil.isNotEmpty(entry.getColsep())) {
            
            return entry.getColsep();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getMorerows() {
        
        if (CollUtil.isNotEmpty(entry.getMorerows())) {
            
            return entry.getMorerows();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getNameend() {
        
        if (CollUtil.isNotEmpty(entry.getNameend())) {
            
            return entry.getNameend();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getNamest() {
        
        if (CollUtil.isNotEmpty(entry.getNamest())) {
            
            return entry.getNamest();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getRotate() {
        
        if (CollUtil.isNotEmpty(entry.getRotate())) {
            
            return entry.getRotate();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getRowsep() {
        
        if (CollUtil.isNotEmpty(entry.getRowsep())) {
            
            return entry.getRowsep();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSpanname() {
        
        if (CollUtil.isNotEmpty(entry.getSpanname())) {
            
            return entry.getSpanname();
            
        } else {
            return null;
        }
        
    }

    public ValignEnumSimple getValign() {
        
        if (CollUtil.isNotEmpty(entry.getValign())) {
            
            return entry.getValign();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getBgcolor() {
        
        if (CollUtil.isNotEmpty(entry.getBgcolor())) {
            
            return new StringWrapper(entry.getBgcolor());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP2Wrapper> getMsrQueryP2() {
        
        if (CollUtil.isNotEmpty(entry.getMsrQueryP2())) {
            ArrayList<MsrQueryP2> originalList = entry.getMsrQueryP2();
            ArrayList<MsrQueryP2Wrapper> wrapperList = (ArrayList<MsrQueryP2Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP2Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageParagraphWrapper> getP() {
        
        if (CollUtil.isNotEmpty(entry.getP())) {
            ArrayList<MultiLanguageParagraph> originalList = entry.getP();
            ArrayList<MultiLanguageParagraphWrapper> wrapperList = (ArrayList<MultiLanguageParagraphWrapper>)originalList.stream()
                .map(item -> new MultiLanguageParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageVerbatimWrapper> getVerbatim() {
        
        if (CollUtil.isNotEmpty(entry.getVerbatim())) {
            ArrayList<MultiLanguageVerbatim> originalList = entry.getVerbatim();
            ArrayList<MultiLanguageVerbatimWrapper> wrapperList = (ArrayList<MultiLanguageVerbatimWrapper>)originalList.stream()
                .map(item -> new MultiLanguageVerbatimWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ListWrapper> getList() {
        
        if (CollUtil.isNotEmpty(entry.getList())) {
            ArrayList<List> originalList = entry.getList();
            ArrayList<ListWrapper> wrapperList = (ArrayList<ListWrapper>)originalList.stream()
                .map(item -> new ListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DefListWrapper> getDefList() {
        
        if (CollUtil.isNotEmpty(entry.getDefList())) {
            ArrayList<DefList> originalList = entry.getDefList();
            ArrayList<DefListWrapper> wrapperList = (ArrayList<DefListWrapper>)originalList.stream()
                .map(item -> new DefListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LabeledListWrapper> getLabeledList() {
        
        if (CollUtil.isNotEmpty(entry.getLabeledList())) {
            ArrayList<LabeledList> originalList = entry.getLabeledList();
            ArrayList<LabeledListWrapper> wrapperList = (ArrayList<LabeledListWrapper>)originalList.stream()
                .map(item -> new LabeledListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFormulaWrapper> getFormula() {
        
        if (CollUtil.isNotEmpty(entry.getFormula())) {
            ArrayList<MlFormula> originalList = entry.getFormula();
            ArrayList<MlFormulaWrapper> wrapperList = (ArrayList<MlFormulaWrapper>)originalList.stream()
                .map(item -> new MlFormulaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFigureWrapper> getFigure() {
        
        if (CollUtil.isNotEmpty(entry.getFigure())) {
            ArrayList<MlFigure> originalList = entry.getFigure();
            ArrayList<MlFigureWrapper> wrapperList = (ArrayList<MlFigureWrapper>)originalList.stream()
                .map(item -> new MlFigureWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NoteWrapper> getNote() {
        
        if (CollUtil.isNotEmpty(entry.getNote())) {
            ArrayList<Note> originalList = entry.getNote();
            ArrayList<NoteWrapper> wrapperList = (ArrayList<NoteWrapper>)originalList.stream()
                .map(item -> new NoteWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceableTextWrapper> getTrace() {
        
        if (CollUtil.isNotEmpty(entry.getTrace())) {
            ArrayList<TraceableText> originalList = entry.getTrace();
            ArrayList<TraceableTextWrapper> wrapperList = (ArrayList<TraceableTextWrapper>)originalList.stream()
                .map(item -> new TraceableTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<StructuredReqWrapper> getStructuredReq() {
        
        if (CollUtil.isNotEmpty(entry.getStructuredReq())) {
            ArrayList<StructuredReq> originalList = entry.getStructuredReq();
            ArrayList<StructuredReqWrapper> wrapperList = (ArrayList<StructuredReqWrapper>)originalList.stream()
                .map(item -> new StructuredReqWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}