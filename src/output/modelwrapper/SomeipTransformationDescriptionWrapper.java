package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SomeipTransformationDescriptionWrapper {

    
    private SomeipTransformationDescription someipTransformationDescription;

    public SomeipTransformationDescriptionWrapper(SomeipTransformationDescription someipTransformationDescription) {
        this.someipTransformationDescription = someipTransformationDescription;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getS())) {
            
            return someipTransformationDescription.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getT())) {
            
            return someipTransformationDescription.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(someipTransformationDescription.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getCategory())) {
            
            return new CategoryStringWrapper(someipTransformationDescription.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getIntroduction())) {
            
            return new DocumentationBlockWrapper(someipTransformationDescription.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getAdminData())) {
            
            return new AdminDataWrapper(someipTransformationDescription.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getVariationPoint())) {
            
            return new VariationPointWrapper(someipTransformationDescription.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAlignment() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getAlignment())) {
            
            return new PositiveIntegerWrapper(someipTransformationDescription.getAlignment());
            
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getByteOrder() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getByteOrder())) {
            
            return new ByteOrderEnumWrapper(someipTransformationDescription.getByteOrder());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getInterfaceVersion() {
        
        if (CollUtil.isNotEmpty(someipTransformationDescription.getInterfaceVersion())) {
            
            return new PositiveIntegerWrapper(someipTransformationDescription.getInterfaceVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}