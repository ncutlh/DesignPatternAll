# DesignPattern_beifeng

## 北风网讲义源码

     Adapter模式也叫适配器模式，是构造型模式之一，通过Adapter模式可以改变已有类（或外部类）的接口形式。
>  在大规模的系统开发过程中，我们常常碰到诸如以下这些情况：我们需要实现某些功能，这些功能已有还不太成熟的一个或多个外部组件，如果我们自己重新开发这些功能会花费大量时间；所以很
>多情况下会选择先暂时使用外部组件，以后再考虑随时替换。但这样一来，会带来一个问题，随着对外部组件库的替换，可能需要对
>引用该外部组件的源代码进行大面积的修改，因此也极可能引入新的问题等等。如何最大限度的降低修改面呢？
>Adapter模式就是针对这种类似需求而提出来的。
>Adapter模式通过定义一个新的接口（对要实现的功能加以抽象），和一个实现该接口的Adapter（适配器）类来透明地调用外部组件。
>这样替换外部组件时，最多只要修改几个Adapter类就可以了，其他源代码都不会受到影响。 

     Bridge 模式又叫做桥接模式，是构造型的设
>计模式之一。Bridge模式基于类的最小设计原则，通过使用封装，聚合以及继承等行为来让不同的类承担不同的责任。它的主要特点是把抽象（abstraction）与行为
>实现（implementation）分离开来，从而可以保持各部分的独立性以及应对它们的功能扩展。

    Command-模式也叫命令模式 ，是行为设计模式的一种。
>Command模式通过被称为Command的类封装了对目标对象的调用行为以及调用参数。

    Composite模式也叫组合模式，是构造型的设计模式之一。
>通过递归手段来构造树形的对象结构，并可以通过一个对象来访问整个对象树。


    Chain of Responsibility（CoR）模式也叫职责链模式或者职责连锁模式，是行为模式之一，
>该模式构造一系列分别担当不同的职责的类的对象来共同完成一个任务，这些类的对象之间像链条一样紧密相连，所以被称作职责链模式

    DIP-依赖倒转(Dependence Inversion Principle )：
>传统的过程式设计倾向于使高层次的模块依赖于低层次的模块，抽象层依赖于具体的层次。
>1.抽象不应该依赖于细节，细节应该依赖于抽象。
>2.高层模块不依赖底层模块，两者都依赖抽象

    装饰（ Decorator ）模式又叫做包装模式。
>通过一种对客户端透明的方式来扩展对象的功能，是继承关系的一个替换方案。


      Facade模式也叫外观模式，是由GoF提出的23种设计模式中的一种。
>Facade模式为一组具有类似功能的类群，比如类库，子系统等等，提供一个一致的简单的界面。这个一致的简单的界面被称作facade。  

    Flyweight模式也叫享元模式，是构造型模式之一，它通过与其他类似对象共享数据来减小内存占用。
>抽象享元角色： 所有具体享元类的父类，规定一些需要实现的公共接口。 
>具体享元角色：  抽象享元角色的具体实现类，并实现了抽象享元角色规定的方法。 
> 享元工厂角色： 负责创建和管理享元角色。



    Interpreter模式也叫解释器模式，是行为模式之一，
>它是一种特殊的设计模式，它建立一个解释器，对于特定的计算机程序设计语言，用来解释预先定义的文法。简单地说，Interpreter模式是一种简单的语法解释器构架。

    Iterator-

    LOD-迪米特法则(Law of Demeter )又叫做最少知识原则:
>一个对象应当对其他对象尽可能少的了解。


    LSP-里氏代换原则(Liskov Substitution Principle)：
>一个软件实体如果使用的是一个父类的话，那么一定适用于其子类，而且它察觉不出父类和子类对象的区别。也就是说，在软件里面，把父类替换成它的子类，程序的行为没有变化.
>一个软件实体如果使用的是一个子类的话，那么它不能适用于其父类。


    OCP-开放封闭原则(Open-Closed Principle)：
>一个软件实体应当对扩展开放，则修改关闭。
>在设计一个模块时，应当使得这个模块可以在不被修改的前提下被扩展。也就是说，应当可以在不必修改源代码的情况下修改这个模块的行为。
>设计的目的便在于面对需求的改变而保持系统的相对稳定，从而使得系统可以很容易的从一个版本升级到另一个版本。

    Proxy模式又叫做代理模式，是构造型的设计模式之一，它可以为其他对象提供一种代理（Proxy）以控制对这个对象的访问。 
>所谓代理，是指具有与代理元（被代理的对象）具有相同的接口的类，客户端必须通过代理与被代理的目标类交互，而代理一般在交互的过程中（交互前后），进行某些特别的处理。 


    SRP-单一职责原则(Single Responsibility Principle )：
>就一个类而言，应该仅有一个引起它变化的原因。

    State-模式也叫状态模式，是行为设计模式的一种。
>State模式允许通过改变对象的内部状态而改变对象的行为，这个对象表现得就好像修改了它的类一样

    Strategy模式也叫策略模式是行为模式之一，
>它对一系列的算法加以封装，为所有算法定义一个抽象的算法接口，并通过继承该抽象算法接口对所有的算法加以封装和实现，具体的算法选择交由客户端决定（策略）。Strategy模式主要用来平滑地处理算法的切换 。

    Template Method模式也叫模板方法模式，是行为模式之一，
>它把具有特定步骤算法中的某些必要的处理委让给抽象方法，通过子类继承对抽象方法的不同实现改变整个算法的行为。
>Template Method模式一般应用在具有以下条件的应用中：
 - 具有统一的操作步骤或操作过程
 - 具有不同的操作细节
 - 存在多个具有同样操作步骤的应用场景，但某些具体的操作细节却各不相同
 


    Visitor模式也叫访问者模式:
>是行为模式之一，它分离对象的数据和行为，使用Visitor模式，可以不修改已有类的情况下，增加新的操作


    Mediator模式也叫中介者模式，是由GoF提出的23种软件设计模式的一种。
>Mediator模式是行为模式之一，在Mediator模式中，类之间的交互行为被统一放在
>Mediator的对象中，对象通过Mediator对象同其他对象交互，Mediator对象起着控制器的作用。


    Memento模式也叫备忘录模式，是行为模式之一:
>它的作用是保存对象的内部状态，并在需要的时候（undo/rollback）恢复对象以前的状态。








