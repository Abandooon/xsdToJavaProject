package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.List;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DocumentationBlockWrapper {

    
    private DocumentationBlock documentationBlock;

    public DocumentationBlockWrapper(DocumentationBlock documentationBlock) {
        this.documentationBlock = documentationBlock;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getS())) {
            
            return documentationBlock.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getT())) {
            
            return documentationBlock.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP2Wrapper> getMsrQueryP2() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getMsrQueryP2())) {
            ArrayList<MsrQueryP2> originalList = documentationBlock.getMsrQueryP2();
            ArrayList<MsrQueryP2Wrapper> wrapperList = (ArrayList<MsrQueryP2Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP2Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageParagraphWrapper> getP() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getP())) {
            ArrayList<MultiLanguageParagraph> originalList = documentationBlock.getP();
            ArrayList<MultiLanguageParagraphWrapper> wrapperList = (ArrayList<MultiLanguageParagraphWrapper>)originalList.stream()
                .map(item -> new MultiLanguageParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiLanguageVerbatimWrapper> getVerbatim() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getVerbatim())) {
            ArrayList<MultiLanguageVerbatim> originalList = documentationBlock.getVerbatim();
            ArrayList<MultiLanguageVerbatimWrapper> wrapperList = (ArrayList<MultiLanguageVerbatimWrapper>)originalList.stream()
                .map(item -> new MultiLanguageVerbatimWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ListWrapper> getList() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getList())) {
            ArrayList<List> originalList = documentationBlock.getList();
            ArrayList<ListWrapper> wrapperList = (ArrayList<ListWrapper>)originalList.stream()
                .map(item -> new ListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DefListWrapper> getDefList() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getDefList())) {
            ArrayList<DefList> originalList = documentationBlock.getDefList();
            ArrayList<DefListWrapper> wrapperList = (ArrayList<DefListWrapper>)originalList.stream()
                .map(item -> new DefListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LabeledListWrapper> getLabeledList() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getLabeledList())) {
            ArrayList<LabeledList> originalList = documentationBlock.getLabeledList();
            ArrayList<LabeledListWrapper> wrapperList = (ArrayList<LabeledListWrapper>)originalList.stream()
                .map(item -> new LabeledListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFormulaWrapper> getFormula() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getFormula())) {
            ArrayList<MlFormula> originalList = documentationBlock.getFormula();
            ArrayList<MlFormulaWrapper> wrapperList = (ArrayList<MlFormulaWrapper>)originalList.stream()
                .map(item -> new MlFormulaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MlFigureWrapper> getFigure() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getFigure())) {
            ArrayList<MlFigure> originalList = documentationBlock.getFigure();
            ArrayList<MlFigureWrapper> wrapperList = (ArrayList<MlFigureWrapper>)originalList.stream()
                .map(item -> new MlFigureWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NoteWrapper> getNote() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getNote())) {
            ArrayList<Note> originalList = documentationBlock.getNote();
            ArrayList<NoteWrapper> wrapperList = (ArrayList<NoteWrapper>)originalList.stream()
                .map(item -> new NoteWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceableTextWrapper> getTrace() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getTrace())) {
            ArrayList<TraceableText> originalList = documentationBlock.getTrace();
            ArrayList<TraceableTextWrapper> wrapperList = (ArrayList<TraceableTextWrapper>)originalList.stream()
                .map(item -> new TraceableTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<StructuredReqWrapper> getStructuredReq() {
        
        if (CollUtil.isNotEmpty(documentationBlock.getStructuredReq())) {
            ArrayList<StructuredReq> originalList = documentationBlock.getStructuredReq();
            ArrayList<StructuredReqWrapper> wrapperList = (ArrayList<StructuredReqWrapper>)originalList.stream()
                .map(item -> new StructuredReqWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}