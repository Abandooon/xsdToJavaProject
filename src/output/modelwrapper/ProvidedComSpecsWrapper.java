package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ProvidedComSpecsWrapper {

    
    private ProvidedComSpecs providedComSpecs;

    public ProvidedComSpecsWrapper(ProvidedComSpecs providedComSpecs) {
        this.providedComSpecs = providedComSpecs;
    }

   
    public ArrayList<ModeSwitchSenderComSpecWrapper> getModeSwitchSenderComSpec() {
        
        if (CollUtil.isNotEmpty(providedComSpecs.getModeSwitchSenderComSpec())) {
            ArrayList<ModeSwitchSenderComSpec> originalList = providedComSpecs.getModeSwitchSenderComSpec();
            ArrayList<ModeSwitchSenderComSpecWrapper> wrapperList = (ArrayList<ModeSwitchSenderComSpecWrapper>)originalList.stream()
                .map(item -> new ModeSwitchSenderComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NonqueuedSenderComSpecWrapper> getNonqueuedSenderComSpec() {
        
        if (CollUtil.isNotEmpty(providedComSpecs.getNonqueuedSenderComSpec())) {
            ArrayList<NonqueuedSenderComSpec> originalList = providedComSpecs.getNonqueuedSenderComSpec();
            ArrayList<NonqueuedSenderComSpecWrapper> wrapperList = (ArrayList<NonqueuedSenderComSpecWrapper>)originalList.stream()
                .map(item -> new NonqueuedSenderComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvProvideComSpecWrapper> getNvProvideComSpec() {
        
        if (CollUtil.isNotEmpty(providedComSpecs.getNvProvideComSpec())) {
            ArrayList<NvProvideComSpec> originalList = providedComSpecs.getNvProvideComSpec();
            ArrayList<NvProvideComSpecWrapper> wrapperList = (ArrayList<NvProvideComSpecWrapper>)originalList.stream()
                .map(item -> new NvProvideComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterProvideComSpecWrapper> getParameterProvideComSpec() {
        
        if (CollUtil.isNotEmpty(providedComSpecs.getParameterProvideComSpec())) {
            ArrayList<ParameterProvideComSpec> originalList = providedComSpecs.getParameterProvideComSpec();
            ArrayList<ParameterProvideComSpecWrapper> wrapperList = (ArrayList<ParameterProvideComSpecWrapper>)originalList.stream()
                .map(item -> new ParameterProvideComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<QueuedSenderComSpecWrapper> getQueuedSenderComSpec() {
        
        if (CollUtil.isNotEmpty(providedComSpecs.getQueuedSenderComSpec())) {
            ArrayList<QueuedSenderComSpec> originalList = providedComSpecs.getQueuedSenderComSpec();
            ArrayList<QueuedSenderComSpecWrapper> wrapperList = (ArrayList<QueuedSenderComSpecWrapper>)originalList.stream()
                .map(item -> new QueuedSenderComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ServerComSpecWrapper> getServerComSpec() {
        
        if (CollUtil.isNotEmpty(providedComSpecs.getServerComSpec())) {
            ArrayList<ServerComSpec> originalList = providedComSpecs.getServerComSpec();
            ArrayList<ServerComSpecWrapper> wrapperList = (ArrayList<ServerComSpecWrapper>)originalList.stream()
                .map(item -> new ServerComSpecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}