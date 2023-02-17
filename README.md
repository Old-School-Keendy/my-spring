# my-spring

## step-04

### solution

- 目前还是通过在test类中手动操作 Bean 对象的定义、注册和属性填充，以及最终获取对象调用方法。

### task

- 实现**资源加载类**

- 实现**资源解析和注册**

### action

- 在 Resource 的资源加载器的实现中包括了，ClassPath、系统文件、云配置文件，这三部分与 Spring 源码中的设计和实现保持一致，最终在 DefaultResourceLoader 中做具体的调用。

- 接口：BeanDefinitionReader、抽象类：AbstractBeanDefinitionReader、实现类：XmlBeanDefinitionReader，这三部分内容主要是合理清晰的处理了资源读取后的注册 Bean 容器操作。*接口管定义，抽象类处理非接口功能外的注册Bean组件填充，最终实现类即可只关心具体的业务实现*

### result

本章涉及到的解析xml知识较为冷门，暂时不做过多关注，有一些和之前有联系的点倒是值得记录。

- XmlBeanDefinitionReader#doLoadBeanDefinitions()方法，此次又看到了一处doXxx()的方法，联想到了AbstractBeanFactory#doCreateBean()方法，这种doXxx()的方法的好处在于，只关心核心逻辑的实现，而外部调用中只需要调用xxx()方法即可，这样可以保证见名知意，不会因为大段的逻辑细节而影响了代码的可读性，避免了一个方法几百上千行的"坏味道"

- 接口：BeanDefinitionReader、抽象类：AbstractBeanDefinitionReader、实现类：XmlBeanDefinitionReader这三者的结构看起来也非常熟悉，联想到了接口：BeanFactory、抽象类：AbstractBeanFactory、抽象类：AbstractAutowireBeanFactory、实体类：DefaultListableBeanFactory的这个组合，
  
  有些相似，前者是抽象类继承接口的方式完成方法的划分，后者是利用抽象类继承抽象类完成方法的划分，最后用实现类去做具体的业务实现。但是都实现了不同功能方法的划分，做到了职责单一，值得注意。

### extra

Q：

> 接口 + 抽象类 + 实现类 的组合为什么可以做到职责单一？

A：

> 抽象类继承规则:
> 
> 1. 抽象类继承普通类的属性和方法
> 2. 具体类继承抽象类, 要重写抽象类的抽象方法
> 3. 抽象类继承抽象类, 可以重写也可以选择不重写其中的抽象方法

> 接口实现规则:
> 
> 1. 抽象类继承/实现接口
>    抽象类可以实现多个接口，但是抽象类不能继承接口，同时在抽象类中，可以不用重写接口的方法。
> 2. 接口继承/实现接口
>    接口不可以实现接口，但是接口可以继承多个接口。
> 3. 接口继承/实现抽象类
>    接口只可以继承接口，不能实现接口，接口不可以继承抽象类。 