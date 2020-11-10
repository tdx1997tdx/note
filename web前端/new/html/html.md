[TOC]

# vscode开发插件



- open in browser：可以右键打开浏览器。
- js-css-html formatter：每次保存自动格式化代码。
- auto rename tag：自动重命名配对的html标签。

# html骨架



```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>
    <textarea>sdsdsd</textarea>
</body>

</html>
```



## !DOCTYPE：

DOCTYPE标签是一种标准通用标记语言的文档类型声明，它的目的是要告诉标准通用标记语言解析器，它应该使用什么样的文档类型定义（DTD）来解析文档。



**HTML 5：** 

<!DOCTYPE html>

**HTML 4.01 Strict**

该 DTD 包含所有 HTML 元素和属性，但不包括展示性的和弃用的元素（比如 font）。不允许框架集（Framesets）。

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

**HTML 4.01 Transitional**

该 DTD 包含所有 HTML 元素和属性，包括展示性的和弃用的元素（比如 font）。不允许框架集（Framesets）。

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

**HTML 4.01 Frameset**

该 DTD 等同于 HTML 4.01 Transitional，但允许框架集内容。

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">

**XHTML 1.0 Strict**

该 DTD 包含所有 HTML 元素和属性，但不包括展示性的和弃用的元素（比如 font）。不允许框架集（Framesets）。必须以格式正确的 XML 来编写标记。

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

**XHTML 1.0 Transitional**

该 DTD 包含所有 HTML 元素和属性，包括展示性的和弃用的元素（比如 font）。不允许框架集（Framesets）。必须以格式正确的 XML 来编写标记。

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" " http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

**XHTML 1.0 Frameset**

该 DTD 等同于 XHTML 1.0 Transitional，但允许框架集内容。

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">

**XHTML 1.1**

该 DTD 等同于 XHTML 1.0 Strict，但允许添加模型（例如提供对东亚语系的 ruby 支持）。

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

## lang

- en：英文
- zh-CN：中文

# 特殊字符

![表格](..\image\表格.png)

# html常用标签

## 标题标签

h1--h6分别代表1级标题到6级标题

```html
<h1>
    一级标题
</h1>
```

## 段落和换行标签

- p是分段标签一个p一个段落

```html
<p>
    我是一个段落标签。
</p>
```

- br标签强制换行

```html
换行咯<br />
```

## 文本格式化标签

- 加粗：strong标签。
- 倾斜：em标签。
- 删除线：del标签。
- 下划线：ins标签。

```html
<strong>加粗</strong>
<em>em</em>
<del>del</del>
<ins>ins</ins>
```

## 盒子标签

div和span用来装内容的。

- div用来布局的，一行只能放一个div，大盒子。
- span标签用来布局，一行可以多个span，小盒子。

## 图像标签

```html
<img src="图像url" />
```



标签属性

| 属性   | 属性值  | 说明                           |
| ------ | ------- | ------------------------------ |
| src    | 图像url | 必须值                         |
| alt    | 文本    | 如果图像不显示，则替换文本内容 |
| title  | 文本    | 提示文本，鼠标放上去显示的内容 |
| width  | 像素    | 设置图像宽度                   |
| height | 像素    | 设置图像宽度                   |
| border | 像素    | 设置图像边框粗细               |

### src相对路径

- 同一级路径

```html
<img src="image.jpg" />
```

- 下一级路径

```html
<img src="image/image.jpg" />
```

- 上一级路径

```html
<img src="../image.jpg" />
```

### src绝对路径

网页url就是绝对路径。



## 超链接标签

文本、图像、视频、音频、表格都可以添加超链接。

```html
<a herf="跳转目标" target="目标窗口弹出方式">文本或图像</a>
```

- herf：跳转的目标。
- target：\_self代表本页跳转，\_blank代表新建页面跳转。



### 内部链接

```html
<a herf="index.html" target="_blank">文本或图像</a>
```

### 空链接

```html
<a herf="#">文本或图像</a>
```

### 下载文件链接

```html
<a herf="image.zip">文本或图像</a>
```



### 锚点链接

点了之后可以跳转到本页的某一位置。

1. 在链接文本的herf属性中，设置属性为**#名字**的形式。

```html
<a herf="#two">第二季</a>
```

2. 找到目标位置，在id属性为**名字**。

```html
<h1 id="two">第二季</h1>
```



## 表格标签

```html
<table>
    <thead>
    <tr>
    	<th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    	<td>唐德轩</td>
        <td>23</td>
        <td>男</td>
    </tr>
    </tbody>
</table>
```

- table标签：定义一个表格。
- tr标签：代表表格的一行。
- th标签：代表表头单元格，会被加粗居中。
- td标签：代表表格的一列。
- thead标签：代表表格的头部。
- tbody标签：代表表格的主体。

### 表格属性

| 属性名      | 属性值              | 描述                   |
| ----------- | ------------------- | ---------------------- |
| align       | left、center、right | 表格周围元素的对其方式 |
| border      | 1或“”               | 规定表格单元是否有边框 |
| cellpading  | 像素值              | 规定边缘与内容的空白   |
| cellspacing | 像素值              | 规定单元格之间的空白   |
| width       | 像素值或百分比      | 规定表格的宽度         |

### 合并单元格

1. 确定跨行合并还是跨列合并。
2. 找到目标单元格，写上合并单元格=合并数量。

- 跨行合并：rowspan，例子：<td rowspan="2"></td>
- 跨列合并：colspan，例子：<td colspan="2"></td>

3. 删除多余单元格。

## 列表标签

### 无序列表

```html
<ul>
    <li>列表项1</li>
    <li>列表项2</li>
    <li>列表项3</li>
    <li>列表项4</li>
</ul>
```

### 有序列表

```html
<ol>
    <li>列表项1</li>
    <li>列表项2</li>
    <li>列表项3</li>
    <li>列表项4</li>
</ol>
```

### 自定义列表

dt代表一个列表中大标题，dd代表小标题

```html
<dl>
    <dt>名词1</dt>
    <dd>名词1解释1</dd>
    <dd>名词1解释2</dd>
    <dt>名词2</dt>
    <dd>名词2解释1</dd>
    <dd>名词2解释2</dd>
</dl>
```



## 表单标签

表单组成：

- 表单域：包含表单控件的区域。
- 表单控件：可以定义各种表单元素，允许用户输入输出。
- 提示信息：

![表单](..\image\表单.png)



### 表单控件

#### input表单元素

```html
<form>
    <input type="xxxx"></input>
</form>
```

属性：

- type：定义input类型。
- name：定义命名空间，比如单选框相同命名空间不会重复选择。
- value：规定了默认值。
- checked：checked=“checked”用于复选框和单选框默认选中。
- maxlength：输入字段中最大长度。

type类型如下

| 属性值   | 描述                                       |
| -------- | ------------------------------------------ |
| button   | 定义一个按钮                               |
| checkbox | 复选框                                     |
| file     | 浏览，供文件上传                           |
| hidden   | 定义隐藏输入字段                           |
| image    | 图像形式提交                               |
| password | 定义密码字段                               |
| radio    | 定义单选按钮                               |
| reset    | 定义重置按钮                               |
| submit   | 定义提交按钮                               |
| text     | 定义单行输入字段，可以输入文本，默认20字符 |

#### label标签

label为input提供标注。

label标签用于绑定一个表单元素，当点击<label>标签内的文本时，浏览器会自动将焦点转到对应表单的元素上增加用户体验。label的for属性的value应当与id相同。

```html
<label for="sex">男</label>
<input type="redio" name="sex" id="sex" />
```



#### select下拉表单元素

```html
<select>
	<option>选项1</option>
    <option>选项2</option>
    <option>选项3</option>
    <option>选项4</option>
    ....
</select>
```

当option标签中有selected="selected"时，当前项即为默认选中项。



#### textarea文本域元素

textarea用于定义多行文本输入控件。

使用多行文本输入控件，可以输入更多文字，该控件常用于留言板，评论。

```html
<form>
    今日反馈：
    <textarea>
        
    </textarea>
</form>
```

属性：cols="每行中的字数" rows="显示行数"，实际开发中不会使用，一般用css来改变大小。



