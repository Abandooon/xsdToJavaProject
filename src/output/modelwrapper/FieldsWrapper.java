package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FieldsWrapper {

    
    private Fields fields;

    public FieldsWrapper(Fields fields) {
        this.fields = fields;
    }

   
    public ArrayList<ApplicationRuleBasedValueSpecificationWrapper> getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getApplicationRuleBasedValueSpecification())) {
            ArrayList<ApplicationRuleBasedValueSpecification> originalList = fields.getApplicationRuleBasedValueSpecification();
            ArrayList<ApplicationRuleBasedValueSpecificationWrapper> wrapperList = (ArrayList<ApplicationRuleBasedValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ApplicationRuleBasedValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationValueSpecificationWrapper> getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getApplicationValueSpecification())) {
            ArrayList<ApplicationValueSpecification> originalList = fields.getApplicationValueSpecification();
            ArrayList<ApplicationValueSpecificationWrapper> wrapperList = (ArrayList<ApplicationValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ApplicationValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ArrayValueSpecificationWrapper> getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getArrayValueSpecification())) {
            ArrayList<ArrayValueSpecification> originalList = fields.getArrayValueSpecification();
            ArrayList<ArrayValueSpecificationWrapper> wrapperList = (ArrayList<ArrayValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ArrayValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantReferenceWrapper> getConstantReference() {
        
        if (CollUtil.isNotEmpty(fields.getConstantReference())) {
            ArrayList<ConstantReference> originalList = fields.getConstantReference();
            ArrayList<ConstantReferenceWrapper> wrapperList = (ArrayList<ConstantReferenceWrapper>)originalList.stream()
                .map(item -> new ConstantReferenceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalRuleBasedValueSpecificationWrapper> getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getNumericalRuleBasedValueSpecification())) {
            ArrayList<NumericalRuleBasedValueSpecification> originalList = fields.getNumericalRuleBasedValueSpecification();
            ArrayList<NumericalRuleBasedValueSpecificationWrapper> wrapperList = (ArrayList<NumericalRuleBasedValueSpecificationWrapper>)originalList.stream()
                .map(item -> new NumericalRuleBasedValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueSpecificationWrapper> getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getNumericalValueSpecification())) {
            ArrayList<NumericalValueSpecification> originalList = fields.getNumericalValueSpecification();
            ArrayList<NumericalValueSpecificationWrapper> wrapperList = (ArrayList<NumericalValueSpecificationWrapper>)originalList.stream()
                .map(item -> new NumericalValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RecordValueSpecificationWrapper> getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getRecordValueSpecification())) {
            ArrayList<RecordValueSpecification> originalList = fields.getRecordValueSpecification();
            ArrayList<RecordValueSpecificationWrapper> wrapperList = (ArrayList<RecordValueSpecificationWrapper>)originalList.stream()
                .map(item -> new RecordValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferenceValueSpecificationWrapper> getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getReferenceValueSpecification())) {
            ArrayList<ReferenceValueSpecification> originalList = fields.getReferenceValueSpecification();
            ArrayList<ReferenceValueSpecificationWrapper> wrapperList = (ArrayList<ReferenceValueSpecificationWrapper>)originalList.stream()
                .map(item -> new ReferenceValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TextValueSpecificationWrapper> getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(fields.getTextValueSpecification())) {
            ArrayList<TextValueSpecification> originalList = fields.getTextValueSpecification();
            ArrayList<TextValueSpecificationWrapper> wrapperList = (ArrayList<TextValueSpecificationWrapper>)originalList.stream()
                .map(item -> new TextValueSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}