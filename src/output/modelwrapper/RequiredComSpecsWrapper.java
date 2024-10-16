package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class RequiredComSpecsWrapper {

    
    private RequiredComSpecs requiredComSpecs;

    public RequiredComSpecsWrapper(RequiredComSpecs requiredComSpecs) {
        this.requiredComSpecs = requiredComSpecs;
    }

   
    public ArrayList<ClientComSpecWrapper> getClientComSpec() {
        
        if (CollUtil.isNotEmpty(requiredComSpecs.getClientComSpec())) {
            ArrayList<ClientComSpec> originalList = requiredComSpecs.getClientComSpec();
            ArrayList<ClientComSpecWrapper> wrapperList = (ArrayList<ClientComSpecWrapper>)originalList.stream()
                .map(item -> new ClientComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeSwitchReceiverComSpecWrapper> getModeSwitchReceiverComSpec() {
        
        if (CollUtil.isNotEmpty(requiredComSpecs.getModeSwitchReceiverComSpec())) {
            ArrayList<ModeSwitchReceiverComSpec> originalList = requiredComSpecs.getModeSwitchReceiverComSpec();
            ArrayList<ModeSwitchReceiverComSpecWrapper> wrapperList = (ArrayList<ModeSwitchReceiverComSpecWrapper>)originalList.stream()
                .map(item -> new ModeSwitchReceiverComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NonqueuedReceiverComSpecWrapper> getNonqueuedReceiverComSpec() {
        
        if (CollUtil.isNotEmpty(requiredComSpecs.getNonqueuedReceiverComSpec())) {
            ArrayList<NonqueuedReceiverComSpec> originalList = requiredComSpecs.getNonqueuedReceiverComSpec();
            ArrayList<NonqueuedReceiverComSpecWrapper> wrapperList = (ArrayList<NonqueuedReceiverComSpecWrapper>)originalList.stream()
                .map(item -> new NonqueuedReceiverComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvRequireComSpecWrapper> getNvRequireComSpec() {
        
        if (CollUtil.isNotEmpty(requiredComSpecs.getNvRequireComSpec())) {
            ArrayList<NvRequireComSpec> originalList = requiredComSpecs.getNvRequireComSpec();
            ArrayList<NvRequireComSpecWrapper> wrapperList = (ArrayList<NvRequireComSpecWrapper>)originalList.stream()
                .map(item -> new NvRequireComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterRequireComSpecWrapper> getParameterRequireComSpec() {
        
        if (CollUtil.isNotEmpty(requiredComSpecs.getParameterRequireComSpec())) {
            ArrayList<ParameterRequireComSpec> originalList = requiredComSpecs.getParameterRequireComSpec();
            ArrayList<ParameterRequireComSpecWrapper> wrapperList = (ArrayList<ParameterRequireComSpecWrapper>)originalList.stream()
                .map(item -> new ParameterRequireComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<QueuedReceiverComSpecWrapper> getQueuedReceiverComSpec() {
        
        if (CollUtil.isNotEmpty(requiredComSpecs.getQueuedReceiverComSpec())) {
            ArrayList<QueuedReceiverComSpec> originalList = requiredComSpecs.getQueuedReceiverComSpec();
            ArrayList<QueuedReceiverComSpecWrapper> wrapperList = (ArrayList<QueuedReceiverComSpecWrapper>)originalList.stream()
                .map(item -> new QueuedReceiverComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}