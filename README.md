# DesignPattern
从0开始深入理解设计模式的原理及应用

![1564624505513](C:\Users\kevin\AppData\Roaming\Typora\typora-user-images\1564624505513.png)

类图说明：

第一行：GeelyClass 类名，斜体表示抽象类

第二行：

+name：String  +代表public，类型String

-age：-代表private

#weight：#代表protected

~height：~代表默认

+sex：下划线表示static属性

第三行：

+study()：斜体代表抽象方法

+openMac()：boolean  :boolean表示方法返回值为boolean

![1564624596020](C:\Users\kevin\AppData\Roaming\Typora\typora-user-images\1564624596020.png)

# 1.设计原则

## [1.1.开闭原则](https://github.com/bydjxc/DesignPattern/blob/master/src/main/java/com/jack/design/principle/openclose/%E5%BC%80%E9%97%AD%E5%8E%9F%E5%88%99.md)

## [1.2.依赖倒置原则](https://github.com/bydjxc/DesignPattern/blob/master/src/main/java/com/jack/design/principle/dependenceinversion/%E4%BE%9D%E8%B5%96%E5%80%92%E7%BD%AE%E5%8E%9F%E5%88%99.md)

## [1.3.单一职责原则](https://github.com/bydjxc/DesignPattern/blob/master/src/main/java/com/jack/design/principle/singleresponsibility/%E5%8D%95%E4%B8%80%E8%81%8C%E8%B4%A3.md)

## 1.4.接口隔离原则

## 1.5.迪米特法则(最少知道原则)

## 1.6.里氏替换原则

## 1.7.合成/复用原则(组合/复用原则)

## 1.8.设计原则总结

​		学习设计原则是学习设计模式的基础。在实际开发过程中， 并不要求所有代码都遵循设计原则，我们要考虑人力、时间、成本、质量，不能刻意追求完美，但要在适当的场景遵循设计原则，这体现的是一种平衡取舍，可以帮助我们设计出更加优雅的代码结构。