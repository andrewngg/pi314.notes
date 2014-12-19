=========
= Ports =
=========

FreeBSD Ports
-------------

簡介
~~~~

FreeBSD 的 Ports 系統維護一個 Ports Tree，位置在 ``/usr/ports/`` ，每個軟體各自佔一個目錄，裡面存放該軟體的安裝資訊

Ports Tree
~~~~~~~~~~

* 第一次下載 port tree（ ``/usr/ports`` 不存在） ::

    # portsnap fetch extract update

* 指定主機 ::

    # portsnap -s portsnap.freebsd.org fetch extract

* 更新 port tree ::

    # portsnap fetch update

使用 Make 指令
~~~~~~~~~~~~~~

* 搜尋某個 Ports ::

    $ make search name="{name}"
    $ make quicksearch key="{keyword}"

  - 可以列出 Build Dependency、Run Dependency 以及簡介和網頁

Portmaster
~~~~~~~~~~

* 務必檢查 ``/usr/ports/UPDATING`` 裡面的資訊

* 檢查已安裝的 ports 中有沒有新版本 ::

    $ portmaster -L | grep avail

* 更新一個或多個 ports ::

    # portmaster -dBw editors/vim lang/python

* 直接更新所有已安裝的 ports ::

    # portmaster -dBaw --no-confirm

  - ``-d``: 不要保留 dist file
  - ``-B``: 不要備份舊的 ports
  - ``-a``: 全部更新
  - ``-w``: 保留舊的 Share Library
  - ``--no-confirm``: 不要問

pkg
~~~

* 列出所有已安裝的 ports ::

    $ pkg info

* 搜尋 ports ::

    $ pkg search <package-name>

* Dependency

  - 列出 ``vim`` 的 dependency ports ::

      $ pkg info -d vim

  - 列出 depend on ``python`` 的 ports ::

      $ pkg info -r python

  - 用一個 port 取代另一個 port ::

      $ pkg set -o lang/perl5.12:lang/perl5.14
      $ pkg install -Rf lang/perl5.14

* 安裝新的 ports ::

    # pkg install <package-name>

* 直接更新所有已安裝的 ports ::

    # pkg upgrade

* 刪除沒有用的 ports (沒有被用到) ::

    # pkg autoremove

* 刪除distfiles ::

    # pkg clean

Mac OS X Ports
--------------

- 參數格式 ::

    port <action> <option>

  + ``action`` 可以是安裝、刪除、更新等動作
  + ``option`` 可以是某特定的 ports，也可以是一群 ports 的集合如 ``installed``, ``requested``, ``leave`` 等等

- 刪除沒被 reference 到的 ports ::

    # port uninstall leaves

  + 需要手動重覆執行，因為每清理一次就會有別的 port 變成 leaf
  + 建議在更新前先清理乾淨，避免卡在一些其實沒有用到的軟體

- 更新 port tree ::

    # port selfupdate

- 列出已安裝的 ports ::

    $ port list installed
    $ port list requested

- 更新 ports ::

    # port upgrade outdated

- 搜尋 ::

    $ port search <package-name>

- 安裝 ::

    # port install <package-name>

