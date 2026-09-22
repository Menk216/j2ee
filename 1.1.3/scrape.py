import urllib.request
import re
from bs4 import BeautifulSoup

urls = [
    'https://www.javaguides.net/2018/10/spring-ioc-container-overview.html',
    'https://www.javaguides.net/2018/10/spring-scope-annotation-with-prototype.html'
]

for url in urls:
    req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
    html = urllib.request.urlopen(req).read().decode('utf-8')
    soup = BeautifulSoup(html, 'html.parser')
    print(f'--- {url} ---')
    for pre in soup.find_all('pre'):
        print(pre.get_text())
