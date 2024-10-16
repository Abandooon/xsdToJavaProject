package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EntitysWrapper {

    
    private Entitys entitys;

    public EntitysWrapper(Entitys entitys) {
        this.entitys = entitys;
    }

   
    public ArrayList<BswCalledEntityWrapper> getBswCalledEntity() {
        
        if (CollUtil.isNotEmpty(entitys.getBswCalledEntity())) {
            ArrayList<BswCalledEntity> originalList = entitys.getBswCalledEntity();
            ArrayList<BswCalledEntityWrapper> wrapperList = (ArrayList<BswCalledEntityWrapper>)originalList.stream()
                .map(item -> new BswCalledEntityWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInterruptEntityWrapper> getBswInterruptEntity() {
        
        if (CollUtil.isNotEmpty(entitys.getBswInterruptEntity())) {
            ArrayList<BswInterruptEntity> originalList = entitys.getBswInterruptEntity();
            ArrayList<BswInterruptEntityWrapper> wrapperList = (ArrayList<BswInterruptEntityWrapper>)originalList.stream()
                .map(item -> new BswInterruptEntityWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswSchedulableEntityWrapper> getBswSchedulableEntity() {
        
        if (CollUtil.isNotEmpty(entitys.getBswSchedulableEntity())) {
            ArrayList<BswSchedulableEntity> originalList = entitys.getBswSchedulableEntity();
            ArrayList<BswSchedulableEntityWrapper> wrapperList = (ArrayList<BswSchedulableEntityWrapper>)originalList.stream()
                .map(item -> new BswSchedulableEntityWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}