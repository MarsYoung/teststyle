package com.mishow.constants;

import java.util.HashMap;
import java.util.Map;

public class Subjects {
	// 一级学科map
	public static Map<String, Map<String, String>> subjects = new HashMap<String, Map<String, String>>();
	static {
		subjects.put("哲学", new HashMap<String, String>());
		subjects.put("经济学", new HashMap<String, String>());
		subjects.put("法学", new HashMap<String, String>());
		subjects.put("教育学", new HashMap<String, String>());
		subjects.put("文学", new HashMap<String, String>());
		subjects.put("历史学", new HashMap<String, String>());
		subjects.put("理学", new HashMap<String, String>());
		subjects.put("工学", new HashMap<String, String>());
		subjects.put("农学", new HashMap<String, String>());
		subjects.put("医学", new HashMap<String, String>());
		subjects.put("军事学", new HashMap<String, String>());
		subjects.put("管理学", new HashMap<String, String>());
	}
	// 二级学科map(12)
	// 01
	static {
		subjects.get("哲学").put("马克思主义哲学", "马克思主义哲学");
		subjects.get("哲学").put("中国哲学", "中国哲学");
		subjects.get("哲学").put("外国哲学", "外国哲学");
		subjects.get("哲学").put("逻辑学", "逻辑学");
		subjects.get("哲学").put("伦理学", "伦理学");
		subjects.get("哲学").put("美学", "美学");
		subjects.get("哲学").put("宗教学", "宗教学");
		subjects.get("哲学").put("科学技术哲学", "科学技术哲学");
	}
	// 02
	static {
		subjects.get("经济学").put("政治经济学", "政治经济学");
		subjects.get("经济学").put("经济思想史", "经济思想史");
		subjects.get("经济学").put("经济史", "经济史");
		subjects.get("经济学").put("西方经济学", "西方经济学");
		subjects.get("经济学").put("世界经济", "世界经济");
		subjects.get("经济学").put("人口、资源与环境经济学", "人口、资源与环境经济学");
		subjects.get("经济学").put("国民经济学", "国民经济学");
		subjects.get("经济学").put("区域经济学", "区域经济学");
		subjects.get("经济学").put("财政学", "财政学");
		subjects.get("经济学").put("金融学", "金融学");
		subjects.get("经济学").put("产业经济学", "产业经济学");
		subjects.get("经济学").put("国际贸易学", "国际贸易学");
		subjects.get("经济学").put("劳动经济学", "劳动经济学");
		subjects.get("经济学").put("统计学", "统计学");
		subjects.get("经济学").put("数量经济学", "数量经济学");
		subjects.get("经济学").put("国防经济", "国防经济");
	}
	// 03
	static {
		subjects.get("法学").put("法学理论", "法学理论");
		subjects.get("法学").put("法律史", "法律史");
		subjects.get("法学").put("宪法学与行政法学", "宪法学与行政法学");
		subjects.get("法学").put("刑法学", "刑法学");
		subjects.get("法学").put("民商法学", "民商法学");
		subjects.get("法学").put("诉讼法学", "诉讼法学");
		subjects.get("法学").put("经济法学", "经济法学");
		subjects.get("法学").put("环境与资源保护法学", "环境与资源保护法学");
		subjects.get("法学").put("国际法学", "国际法学");
		subjects.get("法学").put("军事法学", "军事法学");
		subjects.get("法学").put("政治学理论", "政治学理论");
		subjects.get("法学").put("中外政治制度", "中外政治制度");
		subjects.get("法学").put("科学社会主义与国际共产主义运动", "科学社会主义与国际共产主义运动");
		subjects.get("法学").put("中共党史", "中共党史");
		subjects.get("法学").put("马克思主义理论与思想政治教育", "马克思主义理论与思想政治教育");
		subjects.get("法学").put("国际政治", "国际政治");
		subjects.get("法学").put("国际关系", "国际关系");
		subjects.get("法学").put("外交学", "外交学");
		subjects.get("法学").put("社会学", "社会学");
		subjects.get("法学").put("人口学", "人口学");
		subjects.get("法学").put("人类学", "人类学");
		subjects.get("法学").put("民俗学", "民俗学");
		subjects.get("法学").put("民族学", "马克思主义民族理论与政策");
		subjects.get("法学").put("中国少数民族经济", "中国少数民族史");
		subjects.get("法学").put("中国少数民族艺术", "中国少数民族艺术");
	}
	// 04
	static {
		subjects.get("教育学").put("教育学原理", "教育学原理");
		subjects.get("教育学").put("课程与教学论", "课程与教学论");
		subjects.get("教育学").put("教育史", "教育史");
		subjects.get("教育学").put("比较教育学", "比较教育学");
		subjects.get("教育学").put("学前教育学", "学前教育学");
		subjects.get("教育学").put("高等教育学", "高等教育学");
		subjects.get("教育学").put("成人教育学", "成人教育学");
		subjects.get("教育学").put("职业技术教育学", "职业技术教育学");
		subjects.get("教育学").put("特殊教育学", "特殊教育学");
		subjects.get("教育学").put("教育技术学", "教育技术学");
		subjects.get("教育学").put("基础心理学", "发展与教育心理学");
		subjects.get("教育学").put("应用心理学", "应用心理学");
		subjects.get("教育学").put("体育人文社会学", "体育人文社会学");
		subjects.get("教育学").put("运动人体科学", "运动人体科学");
		subjects.get("教育学").put("体育教育训练学", "体育教育训练学");
		subjects.get("教育学").put("民族传统体育学", "民族传统体育学");

	}
	// 05
	static {
		subjects.get("文学").put("文艺学", "文艺学");
		subjects.get("文学").put("语言学及应用语言学", "语言学及应用语言学");
		subjects.get("文学").put("汉语言文字学", "汉语言文字学");
		subjects.get("文学").put("中国古典文献学", "中国古典文献学");
		subjects.get("文学").put("中国古代文学", "中国古代文学");
		subjects.get("文学").put("中国现当代文学", "中国现当代文学");
		subjects.get("文学").put("中国少数民族语言文学", "中国少数民族语言文学");
		subjects.get("文学").put("比较文学与世界文学", "比较文学与世界文学");
		subjects.get("文学").put("英语语言文学", "英语语言文学");
		subjects.get("文学").put("俄语语言文学", "俄语语言文学");
		subjects.get("文学").put("法语语言文学", "法语语言文学");
		subjects.get("文学").put("德语语言文学", "德语语言文学");
		subjects.get("文学").put("日语语言文学", "日语语言文学");
		subjects.get("文学").put("印度语言文学", "印度语言文学");
		subjects.get("文学").put("西班牙语语言文学", "西班牙语语言文学");
		subjects.get("文学").put("阿拉伯语语言文学", "阿拉伯语语言文学");
		subjects.get("文学").put("欧洲语言文学", "欧洲语言文学");
		subjects.get("文学").put("亚非语言文学", "亚非语言文学");
		subjects.get("文学").put("外国语言学及应用语言学", "外国语言学及应用语言学");
		subjects.get("文学").put("新闻学", "新闻学");
		subjects.get("文学").put("传播学", "传播学");
		subjects.get("文学").put("艺术学", "艺术学");
		subjects.get("文学").put("音乐学", "音乐学");
		subjects.get("文学").put("美术学", "美术学");
		subjects.get("文学").put("设计艺术学", "设计艺术学");
		subjects.get("文学").put("戏剧戏曲学", "电影学");
		subjects.get("文学").put("广播电视艺术学", "舞蹈学");
	}
	// 06
	static {
		subjects.get("历史学").put("史学理论及史学史", "史学理论及史学史");
		subjects.get("历史学").put("考古学及博物馆学", "考古学及博物馆学");
		subjects.get("历史学").put("历史地理学", "历史地理学");
		subjects.get("历史学").put("历史文献学", "历史文献学");
		subjects.get("历史学").put("专门史", "专门史");
		subjects.get("历史学").put("中国古代史", "中国古代史");
		subjects.get("历史学").put("中国近现代史", "中国近现代史");
		subjects.get("历史学").put("世界史", "世界史");
		
	}
	// 07
	static {
		subjects.get("理学").put("基础数学", "基础数学");
		subjects.get("理学").put("计算数学", "计算数学");
		subjects.get("理学").put("概率论与数理统计", "概率论与数理统计");
		subjects.get("理学").put("应用数学", "应用数学");
		subjects.get("理学").put("运筹学与控制论", "运筹学与控制论");
		subjects.get("理学").put("理论物理", "理论物理");
		subjects.get("理学").put("粒子物理与原子核物理", "粒子物理与原子核物理");
		subjects.get("理学").put("原子与分子物理", "原子与分子物理");
		subjects.get("理学").put("等离子体物理", "等离子体物理");
		subjects.get("理学").put("凝聚态物理", "凝聚态物理");
		subjects.get("理学").put("声学", "声学");
		subjects.get("理学").put("光学", "光学");
		subjects.get("理学").put("无线电学", "无线电学");
		subjects.get("理学").put("无机化学", "无机化学");
		subjects.get("理学").put("分析化学", "分析化学");
		subjects.get("理学").put("有机化学", "有机化学");
		subjects.get("理学").put("物理化学", "物理化学");
		subjects.get("理学").put("高分子化学与物理", "高分子化学与物理");
		subjects.get("理学").put("天体物理", "天体物理");
		subjects.get("理学").put("天体测量与天体力学", "天体测量与天体力学");
		subjects.get("理学").put("自然地理学", "自然地理学");
		subjects.get("理学").put("人文地理学", "人文地理学");
		subjects.get("理学").put("地图学与地理信息系统", "地图学与地理信息系统");
		subjects.get("理学").put("气象学", "气象学");
		subjects.get("理学").put("大气物理学与大气环境", "大气物理学与大气环境");
		subjects.get("理学").put("物理海洋学", "物理海洋学");
		subjects.get("理学").put("海洋化学", "海洋化学");
		subjects.get("理学").put("海洋生物学", "海洋生物学");
		subjects.get("理学").put("海洋地质", "海洋地质");
		subjects.get("理学").put("固体地球物理学", "固体地球物理学");
		subjects.get("理学").put("空间物理学", "空间物理学");
		subjects.get("理学").put("矿物学、岩石学、矿床学", "矿物学、岩石学、矿床学");
		subjects.get("理学").put("地球化学", "地球化学");
		subjects.get("理学").put("古生物学与地层学", "古生物学与地层学");
		subjects.get("理学").put("构造地质学", "构造地质学");
		subjects.get("理学").put("第四纪地质学", "第四纪地质学");
		subjects.get("理学").put("植物学", "植物学");
		subjects.get("理学").put("动物学", "动物学");
		subjects.get("理学").put("生理学", "生理学");
		subjects.get("理学").put("水生生物学", "水生生物学");
		subjects.get("理学").put("微生物学", "微生物学");
		subjects.get("理学").put("神经生物学", "神经生物学");
		subjects.get("理学").put("遗传学", "遗传学");
		subjects.get("理学").put("发育生物学", "发育生物学");
		subjects.get("理学").put("细胞生物学", "细胞生物学");
		subjects.get("理学").put("生物化学与分子生物学", "生物化学与分子生物学");
		subjects.get("理学").put("生物物理学", "生物物理学");
		subjects.get("理学").put("生态学", "生态学");
		subjects.get("理学").put("系统理论", "系统理论");
		subjects.get("理学").put("系统分析与集成", "系统分析与集成");
	}
	// 08
	static {
		subjects.get("工学").put("力学", "力学");
		subjects.get("工学").put("固体力学", "固体力学");
		subjects.get("工学").put("流体力学", "流体力学");
		subjects.get("工学").put("工程力学", "工程力学");
		subjects.get("工学").put("机械工程", "机械工程");
		subjects.get("工学").put("机械电子工程", "机械电子工程");
		subjects.get("工学").put("车辆工程", "车辆工程");
		subjects.get("工学").put("机械设计及理论", "机械设计及理论");
		subjects.get("工学").put("光学工程", "光学工程");
		subjects.get("工学").put("仪器科学与技术", "仪器科学与技术");
		subjects.get("工学").put("材料科学与工程", "材料科学与工程");
		subjects.get("工学").put("材料物理与化学", "材料物理与化学");
		subjects.get("工学").put("冶金工程", "冶金工程");
		subjects.get("工学").put("动力工程及工程热物理", "动力工程及工程热物理");
		subjects.get("工学").put("动力机械及工程", "动力机械及工程");
		subjects.get("工学").put("电气工程", "电气工程");
		subjects.get("工学").put("电机与电器", "电机与电器");
		subjects.get("工学").put("电力系统及其自动化", "电力系统及其自动化");
		subjects.get("工学").put("电力电子与电力传动", "电力电子与电力传动");
		subjects.get("工学").put("电子科学与技术", "电子科学与技术");
		subjects.get("工学").put("电路与系统", "电路与系统");
		subjects.get("工学").put("电磁场与微波技术", "电磁场与微波技术");
		subjects.get("工学").put("信息与通信工程", "信息与通信工程");
		subjects.get("工学").put("通信与信息系统", "通信与信息系统");
		subjects.get("工学").put("信号与信息处理", "信号与信息处理");
		subjects.get("工学").put("控制科学与工程", "控制科学与工程");
		subjects.get("工学").put("系统工程", "系统工程");
		subjects.get("工学").put("模式识别与智能系统", "模式识别与智能系统");
		subjects.get("工学").put("计算机科学与技术", "计算机科学与技术");
		subjects.get("工学").put("计算机软件与理论", "计算机软件与理论");
		subjects.get("工学").put("计算机应用技术", "计算机应用技术");
		subjects.get("工学").put("建筑学", "建筑学");
		subjects.get("工学").put("土木工程", "土木工程");
		subjects.get("工学").put("岩土工程", "岩土工程");
		subjects.get("工学").put("结构工程", "结构工程");
		subjects.get("工学").put("市政工程", "市政工程");
		subjects.get("工学").put("供热、供燃气、通风及空调工程", "供热、供燃气、通风及空调工程");
		subjects.get("工学").put("防灾减灾工程及防护工程", "防灾减灾工程及防护工程");
		subjects.get("工学").put("桥梁与遂道工程", "桥梁与遂道工程");
		subjects.get("工学").put("水利工程", "水利工程");
		subjects.get("工学").put("测绘科学与技术", "测绘科学与技术");
		subjects.get("工学").put("摄影测量与遥感", "摄影测量与遥感");
		subjects.get("工学").put("化学工程与技术", "化学工程与技术");
		subjects.get("工学").put("地质资源与地质工程", "地质资源与地质工程");
		subjects.get("工学").put("矿业工程", "矿业工程");
		subjects.get("工学").put("安全技术及工程", "安全技术及工程");
		subjects.get("工学").put("石油与天然气工程", "石油与天然气工程");
		subjects.get("工学").put("纺织科学与工程", "纺织科学与工程");
		subjects.get("工学").put("轻工技术与工程", "轻工技术与工程");
		subjects.get("工学").put("交通运输工程", "交通运输工程");
		subjects.get("工学").put("道路与铁道工程", "道路与铁道工程");
		subjects.get("工学").put("交通信息工程及控制", "交通信息工程及控制");
		subjects.get("工学").put("交通运输规划与管理", "交通运输规划与管理");
		subjects.get("工学").put("载运工具运用工程", "载运工具运用工程");
		subjects.get("工学").put("船舶与海洋工程", "船舶与海洋工程");
		subjects.get("工学").put("航空宇航科学与技术", "航空宇航科学与技术");
		subjects.get("工学").put("兵器科学与技术", "兵器科学与技术");
		subjects.get("工学").put("核科学与技术", "核科学与技术");
		subjects.get("工学").put("农业工程", "农业工程");
		subjects.get("工学").put("林业工程", "林业工程");
		subjects.get("工学").put("环境科学与工程", "环境科学与工程");
		subjects.get("工学").put("环境工程", "环境工程");
		subjects.get("工学").put("生物医学工程", "生物医学工程");
		subjects.get("工学").put("食品科学与工程", "食品科学与工程");
	}
	// 09
	static {
		subjects.get("农学").put("作物学", "作物学");
		subjects.get("农学").put("园艺学", "园艺学");
		subjects.get("农学").put("农业资源利用", "农业资源利用");
		subjects.get("农学").put("植物保护", "植物保护");
		subjects.get("农学").put("畜牧学", "畜牧学");
		subjects.get("农学").put("兽医学", "兽医学");
		subjects.get("农学").put("林学", "林学");
		subjects.get("农学").put("水产", "水产");
	}
	// 10
	static {
		subjects.get("医学").put("基础医学", "基础医学");
		subjects.get("医学").put("临床医学", "临床医学");
		subjects.get("医学").put("口腔医学", "口腔医学");
		subjects.get("医学").put("公共卫生与预防医学", "公共卫生与预防医学");
		subjects.get("医学").put("中医学", "中医学");
		subjects.get("医学").put("中西医结合", "中西医结合");
		subjects.get("医学").put("药学", "药学");
		subjects.get("医学").put("中药学", "中药学");
	}
	// 11
	static {
		subjects.get("军事学").put("军事思想及军事历史", "军事思想及军事历史");
		subjects.get("军事学").put("战略学", "战略学");
		subjects.get("军事学").put("战役学", "战役学");
		subjects.get("军事学").put("战术学", "战术学");
		subjects.get("军事学").put("军队指挥学", "军队指挥学");
		subjects.get("军事学").put("军制学", "军制学");
		subjects.get("军事学").put("军队政治工作", "军队政治工作");
		subjects.get("军事学").put("军事后勤学与军事装备学", "军事后勤学与军事装备学");
	}
	// 12
	static {
		subjects.get("管理学").put("管理科学与工程", "管理科学与工程");
		subjects.get("管理学").put("工商管理", "工商管理");
		subjects.get("管理学").put("会计学", "会计学");
		subjects.get("管理学").put("企业管理", "企业管理");
		subjects.get("管理学").put("技术经济及管理", "技术经济及管理");
	}
	

}
