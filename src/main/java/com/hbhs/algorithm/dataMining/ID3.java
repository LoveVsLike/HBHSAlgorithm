package com.hbhs.algorithm.dataMining;

/**
 * ID3算法<BR>
 * 该算法是由J. Ross Quinlan在1975提出的分类预测算法。该算法的核心思想为“信息熵”(数学问题)<BR>
 * 信息熵就是一组数据包含的信息，概率的度量。一组数据越有序信息熵也就越低，
 * 极端时如果一组数据中只有一个非0，其它都是0，那么熵等于0，因为只有可能是这个非0的情况发生，
 * 它给人们的信息已经确定了，或者说不含有任何信息了，因为信息熵含量为0。<BR>
 * 一组数据越无序信息熵也就越高，极端时如果一组数据均匀分布，那么它的熵最大，因为我们不知道那种情况发生的概率大些。<BR>
 * 分类预测算法属于有指导学习，方法是通过训练数据，按照参考属性对目标属性的依赖程度对参考属性分级别处理，
 * 这种分级别处理体现在创建决策树，目的是通过生成的判别树，产生规则，用来判断以后的数据<br>
 * 
 * @author walter.xu
 *
 */
public class ID3 {

}