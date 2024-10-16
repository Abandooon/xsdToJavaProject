package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class Elements_ArrayValueSpecificationWrapper {

    
    private Elements_ArrayValueSpecification elements_ArrayValueSpecification;

    public Elements_ArrayValueSpecificationWrapper(Elements_ArrayValueSpecification elements_ArrayValueSpecification) {
        this.elements_ArrayValueSpecification = elements_ArrayValueSpecification;
    }

   
    public ArrayList<ApplicationRuleBasedValueSpecificationWrapper> getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getApplicationRuleBasedValueSpecification())) {
            ArrayList<ApplicationRuleBasedValueSpecification> originalList = elements_ArrayValueSpecification.getApplicationRuleBasedValueSpecification();
            ArrayList<ApplicationRuleBasedValueSpecificationWrapper> wrapperList = (ArrayList<ApplicationRuleBasedValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ApplicationRuleBasedValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationValueSpecificationWrapper> getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getApplicationValueSpecification())) {
            ArrayList<ApplicationValueSpecification> originalList = elements_ArrayValueSpecification.getApplicationValueSpecification();
            ArrayList<ApplicationValueSpecificationWrapper> wrapperList = (ArrayList<ApplicationValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ApplicationValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ArrayValueSpecificationWrapper> getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getArrayValueSpecification())) {
            ArrayList<ArrayValueSpecification> originalList = elements_ArrayValueSpecification.getArrayValueSpecification();
            ArrayList<ArrayValueSpecificationWrapper> wrapperList = (ArrayList<ArrayValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ArrayValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantReferenceWrapper> getConstantReference() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getConstantReference())) {
            ArrayList<ConstantReference> originalList = elements_ArrayValueSpecification.getConstantReference();
            ArrayList<ConstantReferenceWrapper> wrapperList = (ArrayList<ConstantReferenceWrapper>)originalList.stream()
                .map(item -> new ConstantReferenceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalRuleBasedValueSpecificationWrapper> getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getNumericalRuleBasedValueSpecification())) {
            ArrayList<NumericalRuleBasedValueSpecification> originalList = elements_ArrayValueSpecification.getNumericalRuleBasedValueSpecification();
            ArrayList<NumericalRuleBasedValueSpecificationWrapper> wrapperList = (ArrayList<NumericalRuleBasedValueSpecificationWrapper>)originalList.stream()
                .map(item -> new NumericalRuleBasedValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueSpecificationWrapper> getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getNumericalValueSpecification())) {
            ArrayList<NumericalValueSpecification> originalList = elements_ArrayValueSpecification.getNumericalValueSpecification();
            ArrayList<NumericalValueSpecificationWrapper> wrapperList = (ArrayList<NumericalValueSpecificationWrapper>)originalList.stream()
                .map(item -> new NumericalValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RecordValueSpecificationWrapper> getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getRecordValueSpecification())) {
            ArrayList<RecordValueSpecification> originalList = elements_ArrayValueSpecification.getRecordValueSpecification();
            ArrayList<RecordValueSpecificationWrapper> wrapperList = (ArrayList<RecordValueSpecificationWrapper>)originalList.stream()
                .map(item -> new RecordValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferenceValueSpecificationWrapper> getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getReferenceValueSpecification())) {
            ArrayList<ReferenceValueSpecification> originalList = elements_ArrayValueSpecification.getReferenceValueSpecification();
            ArrayList<ReferenceValueSpecificationWrapper> wrapperList = (ArrayList<ReferenceValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ReferenceValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TextValueSpecificationWrapper> getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(elements_ArrayValueSpecification.getTextValueSpecification())) {
            ArrayList<TextValueSpecification> originalList = elements_ArrayValueSpecification.getTextValueSpecification();
            ArrayList<TextValueSpecificationWrapper> wrapperList = (ArrayList<TextValueSpecificationWrapper>)originalList.stream()
                .map(item -> new TextValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}