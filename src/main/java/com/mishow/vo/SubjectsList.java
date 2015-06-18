package com.mishow.vo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.mishow.constants.Subjects;

public class SubjectsList {
	public Map<String, String> getSubjects() {
		Map<String, String> subjects = new HashMap<String, String>();
		subjects.put("哲学", "哲学");
		subjects.put("经济学 ", "经济学");
		subjects.put("法学", "法学");
		subjects.put("教育学", "教育学");
		subjects.put("文学", "文学");
		subjects.put("历史学", "历史学");
		subjects.put("理学", "理学");
		subjects.put("工学", "工学");
		subjects.put("农学", "农学");
		subjects.put("医学", "医学");
		subjects.put("军事学", "军事学");
		subjects.put("管理学", "管理学");
		return subjects;
	}
	
	public  Map<String, String> getZheXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("科学技术哲学","科学技术哲学");
		subjects.put("外国哲学","外国哲学");
		subjects.put("美学","美学");
		subjects.put("逻辑学","逻辑学");
		subjects.put("宗教学","宗教学");
		subjects.put("伦理学","伦理学");
		subjects.put("中国哲学","中国哲学");
		subjects.put("马克思主义哲学","马克思主义哲学");
		return subjects;
	}
	
	public  Map<String, String> getJingjiXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("政治经济学","政治经济学");
		subjects.put("国民经济学","国民经济学");
		subjects.put("产业经济学","产业经济学");
		subjects.put("劳动经济学","劳动经济学");
		subjects.put("金融学","金融学");
		subjects.put("经济思想史","经济思想史");
		subjects.put("世界经济","世界经济");
		subjects.put("人口、资源与环境经济学","人口、资源与环境经济学");
		subjects.put("统计学","统计学");
		subjects.put("财政学","财政学");
		subjects.put("国防经济","国防经济");
		subjects.put("西方经济学","西方经济学");
		subjects.put("数量经济学","数量经济学");
		subjects.put("国际贸易学","国际贸易学");
		subjects.put("经济史","经济史");
		subjects.put("区域经济学","区域经济学");
		return subjects;
	}
	public  Map<String, String> getFaXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("经济法学","经济法学");
		subjects.put("中国少数民族经济","中国少数民族经济");
		subjects.put("环境与资源保护法学","环境与资源保护法学");
		subjects.put("民俗学","民俗学");
		subjects.put("宪法学与行政法学","宪法学与行政法学");
		subjects.put("国际政治","国际政治");
		subjects.put("国际关系","国际关系");
		subjects.put("中共党史","中共党史");
		subjects.put("社会学","社会学");
		subjects.put("中外政治制度","中外政治制度");
		subjects.put("诉讼法学","诉讼法学");
		subjects.put("军事法学","军事法学");
		subjects.put("刑法学","刑法学");
		subjects.put("政治学理论","政治学理论");
		subjects.put("马克思主义理论与思想政治教育","马克思主义理论与思想政治教育");
		subjects.put("人口学","人口学");
		subjects.put("民族学","民族学");
		subjects.put("法律史","法律史");
		subjects.put("科学社会主义与国际共产主义运动","科学社会主义与国际共产主义运动");
		subjects.put("国际法学","国际法学");
		subjects.put("人类学","人类学");
		subjects.put("外交学","外交学");
		subjects.put("民商法学","民商法学");
		subjects.put("法学理论","法学理论");
		subjects.put("中国少数民族艺术","中国少数民族艺术");
		return subjects;
	}
	public  Map<String, String> getJiaoyuXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("艺术学","艺术学");
		subjects.put("广播电视艺术学","广播电视艺术学");
		subjects.put("法语语言文学","法语语言文学");
		subjects.put("西班牙语语言文学","西班牙语语言文学");
		subjects.put("欧洲语言文学","欧洲语言文学");
		subjects.put("汉语言文字学","汉语言文字学");
		subjects.put("新闻学","新闻学");
		subjects.put("中国现当代文学","中国现当代文学");
		subjects.put("印度语言文学","印度语言文学");
		subjects.put("俄语语言文学","俄语语言文学");
		subjects.put("阿拉伯语语言文学","阿拉伯语语言文学");
		subjects.put("语言学及应用语言学","语言学及应用语言学");
		subjects.put("美术学","美术学");
		subjects.put("戏剧戏曲学","戏剧戏曲学");
		subjects.put("英语语言文学","英语语言文学");
		subjects.put("中国古代文学","中国古代文学");
		subjects.put("德语语言文学","德语语言文学");
		subjects.put("日语语言文学","日语语言文学");
		subjects.put("传播学","传播学");
		subjects.put("设计艺术学","设计艺术学");
		subjects.put("文艺学","文艺学");
		subjects.put("中国少数民族语言文学","中国少数民族语言文学");
		subjects.put("亚非语言文学","亚非语言文学");
		subjects.put("音乐学","音乐学");
		subjects.put("比较文学与世界文学","比较文学与世界文学");
		subjects.put("中国古典文献学","中国古典文献学");
		subjects.put("外国语言学及应用语言学","外国语言学及应用语言学");

		return subjects;
	}
	public  Map<String, String> getWenXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("艺术学","艺术学");
		subjects.put("广播电视艺术学","广播电视艺术学");
		subjects.put("法语语言文学","法语语言文学");
		subjects.put("西班牙语语言文学","西班牙语语言文学");
		subjects.put("欧洲语言文学","欧洲语言文学");
		subjects.put("汉语言文字学","汉语言文字学");
		subjects.put("新闻学","新闻学");
		subjects.put("中国现当代文学","中国现当代文学");
		subjects.put("印度语言文学","印度语言文学");
		subjects.put("俄语语言文学","俄语语言文学");
		subjects.put("阿拉伯语语言文学","阿拉伯语语言文学");
		subjects.put("语言学及应用语言学","语言学及应用语言学");
		subjects.put("美术学","美术学");
		subjects.put("戏剧戏曲学","戏剧戏曲学");
		subjects.put("英语语言文学","英语语言文学");
		subjects.put("中国古代文学","中国古代文学");
		subjects.put("德语语言文学","德语语言文学");
		subjects.put("日语语言文学","日语语言文学");
		subjects.put("传播学","传播学");
		subjects.put("设计艺术学","设计艺术学");
		subjects.put("文艺学","文艺学");
		subjects.put("中国少数民族语言文学","中国少数民族语言文学");
		subjects.put("亚非语言文学","亚非语言文学");
		subjects.put("音乐学","音乐学");
		subjects.put("比较文学与世界文学","比较文学与世界文学");
		subjects.put("中国古典文献学","中国古典文献学");
		subjects.put("外国语言学及应用语言学","外国语言学及应用语言学");
		return subjects;
	}
	public  Map<String, String> getLishiXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("中国古代史","中国古代史");
		subjects.put("专门史","专门史");
		subjects.put("考古学及博物馆学","考古学及博物馆学");
		subjects.put("史学理论及史学史","史学理论及史学史");
		subjects.put("中国近现代史","中国近现代史");
		subjects.put("世界史","世界史");
		subjects.put("历史文献学","历史文献学");
		subjects.put("历史地理学","历史地理学");
		return subjects;
	}
	public  Map<String, String> getLiXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("光学","光学");
		subjects.put("有机化学","有机化学");
		subjects.put("天体测量与天体力学","天体测量与天体力学");
		subjects.put("海洋生物学","海洋生物学");
		subjects.put("遗传学","遗传学");
		subjects.put("古生物学与地层学","古生物学与地层学");
		subjects.put("生物物理学","生物物理学");
		subjects.put("等离子体物理","等离子体物理");
		subjects.put("天体物理","天体物理");
		subjects.put("物理化学","物理化学");
		subjects.put("气象学","气象学");
		subjects.put("生理学","生理学");
		subjects.put("声学","声学");
		subjects.put("基础数学","基础数学");
		subjects.put("地球化学","地球化学");
		subjects.put("粒子物理与原子核物理","粒子物理与原子核物理");
		subjects.put("水生生物学","水生生物学");
		subjects.put("第四纪地质学","第四纪地质学");
		subjects.put("分析化学","分析化学");
		subjects.put("固体地球物理学","固体地球物理学");
		subjects.put("系统理论","系统理论");
		subjects.put("神经生物学","神经生物学");
		subjects.put("人文地理学","人文地理学");
		subjects.put("细胞生物学","细胞生物学");
		subjects.put("构造地质学","构造地质学");
		subjects.put("物理海洋学","物理海洋学");
		subjects.put("高分子化学与物理","高分子化学与物理");
		subjects.put("自然地理学","自然地理学");
		subjects.put("原子与分子物理","原子与分子物理");
		subjects.put("大气物理学与大气环境","大气物理学与大气环境");
		subjects.put("无机化学","无机化学");
		subjects.put("海洋地质","海洋地质");
		subjects.put("计算数学","计算数学");
		subjects.put("系统分析与集成","系统分析与集成");
		subjects.put("动物学","动物学");
		subjects.put("地图学与地理信息系统","地图学与地理信息系统");
		subjects.put("应用数学","应用数学");
		subjects.put("空间物理学","空间物理学");
		subjects.put("运筹学与控制论","运筹学与控制论");
		subjects.put("植物学","植物学");
		subjects.put("凝聚态物理","凝聚态物理");
		subjects.put("理论物理","理论物理");
		subjects.put("矿物学、岩石学、矿床学","矿物学、岩石学、矿床学");
		subjects.put("概率论与数理统计","概率论与数理统计");
		subjects.put("发育生物学","发育生物学");
		subjects.put("无线电学","无线电学");
		subjects.put("海洋化学","海洋化学");
		subjects.put("生态学","生态学");
		subjects.put("生物化学与分子生物学","生物化学与分子生物学");
		subjects.put("微生物学","微生物学");

		return subjects;
	}
	public  Map<String, String> getGongXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("仪器科学与技术","仪器科学与技术");
		subjects.put("控制科学与工程","控制科学与工程");
		subjects.put("模式识别与智能系统","模式识别与智能系统");
		subjects.put("电磁场与微波技术","电磁场与微波技术");
		subjects.put("供热、供燃气、通风及空调工程","供热、供燃气、通风及空调工程");
		subjects.put("石油与天然气工程","石油与天然气工程");
		subjects.put("冶金工程","冶金工程");
		subjects.put("防灾减灾工程及防护工程","防灾减灾工程及防护工程");
		subjects.put("航空宇航科学与技术","航空宇航科学与技术");
		subjects.put("动力机械及工程","动力机械及工程");
		subjects.put("系统工程","系统工程");
		subjects.put("载运工具运用工程","载运工具运用工程");
		subjects.put("生物医学工程","生物医学工程");
		subjects.put("交通信息工程及控制","交通信息工程及控制");
		subjects.put("光学工程","光学工程");
		subjects.put("电力电子与电力传动","电力电子与电力传动");
		subjects.put("食品科学与工程","食品科学与工程");
		subjects.put("电路与系统","电路与系统");
		subjects.put("桥梁与遂道工程","桥梁与遂道工程");
		subjects.put("兵器科学与技术","兵器科学与技术");
		subjects.put("市政工程","市政工程");
		subjects.put("固体力学","固体力学");
		subjects.put("矿业工程","矿业工程");
		subjects.put("计算机软件与理论","计算机软件与理论");
		subjects.put("测绘科学与技术","测绘科学与技术");
		subjects.put("道路与铁道工程","道路与铁道工程");
		subjects.put("交通运输工程","交通运输工程");
		subjects.put("机械工程","机械工程");
		subjects.put("机械电子工程","机械电子工程");
		subjects.put("工程力学","工程力学");
		subjects.put("结构工程","结构工程");
		subjects.put("农业工程","农业工程");
		subjects.put("计算机应用技术","计算机应用技术");
		subjects.put("电力系统及其自动化","电力系统及其自动化");
		subjects.put("核科学与技术","核科学与技术");
		subjects.put("土木工程","土木工程");
		subjects.put("动力工程及工程热物理","动力工程及工程热物理");
		subjects.put("信息与通信工程","信息与通信工程");
		subjects.put("材料科学与工程","材料科学与工程");
		subjects.put("摄影测量与遥感","摄影测量与遥感");
		subjects.put("车辆工程","车辆工程");
		subjects.put("地质资源与地质工程","地质资源与地质工程");
		subjects.put("船舶与海洋工程","船舶与海洋工程");
		subjects.put("化学工程与技术","化学工程与技术");
		subjects.put("纺织科学与工程","纺织科学与工程");
		subjects.put("安全技术及工程","安全技术及工程");
		subjects.put("环境科学与工程","环境科学与工程");
		subjects.put("机械设计及理论","机械设计及理论");
		subjects.put("信号与信息处理","信号与信息处理");
		subjects.put("建筑学","建筑学");
		subjects.put("轻工技术与工程","轻工技术与工程");
		subjects.put("岩土工程","岩土工程");
		subjects.put("通信与信息系统","通信与信息系统");
		subjects.put("交通运输规划与管理","交通运输规划与管理");
		subjects.put("环境工程","环境工程");
		subjects.put("电气工程","电气工程");
		subjects.put("材料物理与化学","材料物理与化学");
		subjects.put("林业工程","林业工程");
		subjects.put("电机与电器","电机与电器");
		subjects.put("计算机科学与技术","计算机科学与技术");
		subjects.put("水利工程","水利工程");
		subjects.put("流体力学","流体力学");
		subjects.put("电子科学与技术","电子科学与技术");
		subjects.put("力学","力学");
		return subjects;
	}
	public  Map<String, String> getNongXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("植物保护","植物保护");
		subjects.put("兽医学","兽医学");
		subjects.put("园艺学","园艺学");
		subjects.put("水产","水产");
		subjects.put("农业资源利用","农业资源利用");
		subjects.put("林学","林学");
		subjects.put("作物学","作物学");
		subjects.put("畜牧学","畜牧学");
		return subjects;
	}
	public  Map<String, String> getYiXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("中医学","中医学");
		subjects.put("药学","药学");
		subjects.put("中西医结合","中西医结合");
		subjects.put("公共卫生与预防医学","公共卫生与预防医学");
		subjects.put("临床医学","临床医学");
		subjects.put("中药学","中药学");
		subjects.put("基础医学","基础医学");
		subjects.put("口腔医学","口腔医学");
		return subjects;
	}
	public  Map<String, String> getJunshiXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("战术学","战术学");
		subjects.put("战略学","战略学");
		subjects.put("军事后勤学与军事装备学","军事后勤学与军事装备学");
		subjects.put("军制学","军制学");
		subjects.put("军队指挥学","军队指挥学");
		subjects.put("军事思想及军事历史","军事思想及军事历史");
		subjects.put("战役学","战役学");
		subjects.put("军队政治工作","军队政治工作");
		return subjects;
	}
	public  Map<String, String> getGuanliXueSubjects() {
		Map<String, String> subjects=new HashMap<String, String>();
		subjects.put("企业管理","企业管理");
		subjects.put("管理科学与工程","管理科学与工程");
		subjects.put("技术经济及管理","技术经济及管理");
		subjects.put("工商管理","工商管理");
		subjects.put("会计学","会计学");
		return subjects;
	}
	
	public  void main(String[] args) {
		Map<String, String> subjects=new HashMap<String, String>();
		Iterator<String> it=Subjects.subjects.get("哲学").keySet().iterator();
		while(it.hasNext()){
			String x=it.next();
			System.out.println("subjects.put(\""+x+"\",\""+x+"\");");
			subjects.put(x, x);
			
		}
		
	}
	
}
