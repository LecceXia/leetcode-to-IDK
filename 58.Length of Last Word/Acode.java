public int lengthOfLastWord(String s) {
    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
}

//trim 删除字符串首尾空白符
//lastIndexOf 返回指定字符在此字符串中最后一次出现处的索引
